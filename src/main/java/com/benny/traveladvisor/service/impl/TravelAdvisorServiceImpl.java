package com.benny.traveladvisor.service.impl;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.common.utils.RedisKeyUtil;
import com.benny.traveladvisor.dto.*;
import com.benny.traveladvisor.service.CacheService;
import com.benny.traveladvisor.service.TravelAdvisorService;
import com.benny.traveladvisor.service.SessionService;
import com.benny.traveladvisor.timatic3.dto.*;
import com.benny.traveladvisor.timatic3.service.Timatic3Client;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Travel Advisor service
 * @author benny.li
 * Date: 2020/5/18
 */
@Service
@Slf4j
public class TravelAdvisorServiceImpl implements TravelAdvisorService {
    @Autowired
    private CacheService cacheService;
    @Autowired
    private Timatic3Client timatic3Client;
    @Autowired
    private SessionService sessionService;

    /**
     * Description: Convert the list of DocumentParagraphSection to list of Message
     * @author benny.li
     * Date: 2020/5/18
     * @param documentParagraphSubSections:
     * @return java.util.List<com.benny.traveladvisor.dto.DocResponse.Message>
     */
    public List<DocResponse.Message> formatMessage(List<DocumentParagraphSection> documentParagraphSubSections) {
        List<DocResponse.Message> messages = new ArrayList<>();

        if (documentParagraphSubSections != null && !documentParagraphSubSections.isEmpty()) {
            for (DocumentParagraphSection documentParagraphSection : documentParagraphSubSections) {
                String messageType = documentParagraphSection.getParagraphType().toString();
                String messageText = paragraphTextToString(documentParagraphSection.getParagraphText().getContent());

                DocResponse.Message message = new DocResponse.Message();

                if (messages.isEmpty()) {
                    List<String> messageList = new ArrayList<>();
                    messageList.add(messageText);

                    message.setMessageType(messageType);
                    message.setMessageContent(messageList);
                    messages.add(message);
                } else {
                    for (DocResponse.Message m : messages) {
                        if (messageType.equals(m.getMessageType())) {
                            List<String> tmpList = m.getMessageContent();
                            tmpList.add(messageText);
                            m.setMessageContent(tmpList);
                            break;
                        }
                    }
                }
            }
            return messages;
        } else {
            return null;
        }
    }

    /**
     * Description: Convert the DocumentSection to Section
     * @author benny.li
     * Date: 2020/5/18
     * @param documentSection:
     * @return com.benny.traveladvisor.dto.DocResponse.Section
     */
    public DocResponse.Section formatSection(DocumentSection documentSection) {
        DocResponse.Section section = new DocResponse.Section();
        String sectionName = documentSection.getSectionName();
        List<DocumentParagraphSection> documentParagraphSections = documentSection.getDocumentParagraph();
        List<DocumentSubSection> documentSubSections = documentSection.getSubsectionInformation();

        if (documentParagraphSections != null && !documentParagraphSections.isEmpty() && documentParagraphSections.get(0) != null) {
            String str = paragraphTextToString(documentParagraphSections.get(0).getParagraphText().getContent());
            section.setRequirement(str);
        }

        if (documentSubSections != null && !documentSubSections.isEmpty()) {
            List<DocResponse.SubSection> subSections = new ArrayList<>();
            for (DocumentSubSection documentSubSection : documentSubSections) {
                String subSectionName = documentSubSection.getSubsectionName();
                List<DocResponse.Message> messages = formatMessage(documentSubSection.getDocumentParagraph());

                DocResponse.SubSection subSection = new DocResponse.SubSection();
                subSection.setSectionName(subSectionName);
                subSection.setSectionMsgs(messages);
                subSections.add(subSection);
            }
            section.setSections(subSections);
        }
        return section;
    }

    /**
     * Description: Convert paragraph text to string
     * @author benny.li
     * Date: 2020/5/18
     * @param contents:
     * @return java.lang.String
     */
    public String paragraphTextToString(List<Object> contents) {
        if (contents != null && !contents.isEmpty()) {
            StringBuilder output = new StringBuilder();
            for (Object content : contents) {
                if (content instanceof String) {
                    output.append(content);
                } else if (content instanceof P) {
                    P tmpObj = (P) content;
                    output.append(paragraphTextToString(tmpObj.getContent()));
                }
            }
            return output.toString();
        } else {
            return "";
        }
    }

    /**
     * Description: Delete all travel advisor cache
     * @author benny.li
     * Date: 2020/5/18
     * @return boolean
     */
    @Override
    public boolean delDocCache() {
        return cacheService.flushDB(CacheEnums.DOC_KEY.getKey() + "*");
    }

    /**
     * Description: Delete specific travel advisor cache by DocRequest
     * @author benny.li
     * Date: 2020/5/18
     * @param request: DocRequest
     * @return boolean
     */
    @Override
    public boolean delDocCache(DocRequest request) {
        String redisKey = RedisKeyUtil.docKey(request);
        return cacheService.remove(redisKey);
    }

    /**
     * Description: Delete specific travel advisor cache by given parameters
     * @author benny.li
     * Date: 2020/5/18
     * @param fromCountry: Travel from which country
     * @param toCountry: Travel to which country
     * @param docType: Document Type
     * @param docGroup: Document Group
     * @return boolean
     */
    @Override
    public boolean delDocCache(String fromCountry, String toCountry, String docType, String docGroup) {
        DocRequest request = new DocRequest();
        request.setFromCountryCode(fromCountry);
        request.setToCountryCode(toCountry);
        request.setDocType(docType);
        request.setDocGroup(docGroup);
        return this.delDocCache(request);
    }

    /**
     * Description: Retrieve travel advisor by given DocRequest
     * @author benny.li
     * Date: 2020/5/18
     * @param request: DocRequest
     * @return com.benny.traveladvisor.dto.DocResponse
     */
    @Override
    public DocResponse getDocCache(DocRequest request) {
        String redisKey = RedisKeyUtil.docKey(request);
        String key = CacheEnums.SESSION_ID.getKey();
        if(cacheService.hasKey(redisKey)) {
            return (DocResponse) cacheService.get(redisKey);
        } else {
            return setDocCache(request);
        }
    }

    /**
     * Description: Retrieve travel advisor by given parameters with default Document Group
     * @author benny.li
     * Date: 2020/5/18
     * @param fromCountry: Travel from which country
     * @param toCountry: Travel to which country
     * @param docType: Document Type
     * @return com.benny.traveladvisor.dto.DocResponse
     */
    @Override
    public DocResponse getDocCache(String fromCountry, String toCountry, String docType) {
        return this.getDocCache(fromCountry, toCountry, docType, "N");
    }

    /**
     * Description: Retrieve travel advisor by given parameters
     * @author benny.li
     * Date: 2020/5/18
     * @param fromCountry: Travel from which country
     * @param toCountry: Travel to which country
     * @param docType: Document Type
     * @param docGroup: Document Group
     * @return com.benny.traveladvisor.dto.DocResponse
     */
    @Override
    public DocResponse getDocCache(String fromCountry, String toCountry, String docType, String docGroup) {
        DocRequest request = new DocRequest();
        request.setFromCountryCode(fromCountry);
        request.setToCountryCode(toCountry);
        request.setDocType(docType);
        request.setDocGroup(docGroup);
        return this.getDocCache(request);
    }

    /**
     * Description: Set travel advisor into Redis cache by given DocRequest
     * @author benny.li
     * Date: 2020/5/18
     * @param request: DocRequest
     * @return com.benny.traveladvisor.dto.DocResponse
     */
    @Override
    public DocResponse setDocCache(DocRequest request) {
        String redisKey = RedisKeyUtil.docKey(request);
        String cachedSessionID = sessionService.getSession();

        if(!Strings.isNullOrEmpty(cachedSessionID)) {
            DocumentRequest documentRequest = new DocumentRequest();
            documentRequest.setDestinationCode(request.getToCountryCode());
            documentRequest.setNationalityCode(request.getFromCountryCode());
            documentRequest.setDocumentType(request.getDocType());
            documentRequest.setDocumentGroup(request.getDocGroup());
            documentRequest.setSection(DataSection.ALL);

            DocumentResponse documentResponse = timatic3Client.submitDocumentRequest(documentRequest, cachedSessionID);

            if(documentResponse != null && null == documentResponse.getError()) {
                DocResponse docResponse = new DocResponse();
                docResponse.setFromCountryCode(request.getFromCountryCode());
                docResponse.setToCountryCode(request.getToCountryCode());

                List<DocumentCountryInfo> documentCountryInfos = documentResponse.getDocumentCheckResponse().getDocumentCountryInformation();

                if (documentCountryInfos != null && !documentCountryInfos.isEmpty()) {
                    for (DocumentCountryInfo documentCountryInfo : documentCountryInfos) {
                        List<DocumentSection> documentSections = documentCountryInfo.getSectionInformation();

                        if (documentSections != null && !documentSections.isEmpty()) {
                            for (DocumentSection documentSection : documentSections) {
                                String sectionName = documentSection.getSectionName();

                                switch (sectionName) {
                                    case "Passport":
                                        docResponse.setPassport(formatSection(documentSection));
                                        break;
                                    case "Visa":
                                        docResponse.setVisa(formatSection(documentSection));
                                        break;
                                    case "Health":
                                        docResponse.setHealth(formatSection(documentSection));
                                        break;
                                    case "Customs":
                                        docResponse.setCustoms(formatSection(documentSection));
                                        break;
                                }
                            }
                        }
                    }
                }
                cacheService.set(redisKey, docResponse, CacheEnums.DOC_KEY);
                return docResponse;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Description: Async method to generate travel advisor cache by using default document type and document group
     * @author benny.li
     * Date: 2020/5/18
     * @param fromCountryCode: Travel from which country
     * @param toCountryCode: Travel to which country
     */
    @Async("cacheExecutor")
    public void callDocService(String fromCountryCode, String toCountryCode) {
        DocRequest docRequest = new DocRequest();
        docRequest.setFromCountryCode(fromCountryCode);
        docRequest.setToCountryCode(toCountryCode);
        docRequest.setDocType("passport");
        docRequest.setDocGroup("N");
        getDocCache(docRequest);
    }
}
