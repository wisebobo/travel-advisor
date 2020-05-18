package com.benny.traveladvisor.service;

import com.benny.traveladvisor.dto.DocRequest;
import com.benny.traveladvisor.dto.DocResponse;
import com.benny.traveladvisor.timatic3.dto.DocumentParagraphSection;
import com.benny.traveladvisor.timatic3.dto.DocumentSection;
import com.benny.traveladvisor.timatic3.dto.ParagraphTextType;

import java.util.List;

/**
 * Description: TODO
 * @author benny.li
 * Date: 2020/5/12
 */
public interface TravelAdvisorService {

    DocResponse setDocCache(DocRequest request);

    DocResponse getDocCache(DocRequest request);

    DocResponse getDocCache(String fromCountry, String toCountry, String docType);

    DocResponse getDocCache(String fromCountry, String toCountry, String docType, String docGroup);

    boolean delDocCache();

    boolean delDocCache(DocRequest request);

    boolean delDocCache(String fromCountry, String toCountry, String docType, String docGroup);

    void callDocService(String fromCountryCode, String toCountryCode);

}
