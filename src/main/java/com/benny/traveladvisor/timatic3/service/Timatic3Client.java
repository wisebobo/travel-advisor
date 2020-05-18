package com.benny.traveladvisor.timatic3.service;

import com.benny.traveladvisor.timatic3.dto.*;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * TODO
 *
 * @author benny.li
 * @data 2020/5/11
 */
@Slf4j
public class Timatic3Client extends WebServiceGatewaySupport {
    @Value("${timatic3.url}")
    private String timatic3_url;
    @Value("${timatic3.username}")
    private String username;
    @Value("${timatic3.subUsername}")
    private String subUsername;
    @Value("${timatic3.password}")
    private String password;

    public Object callWebService(Object request) {
        try {
            return getWebServiceTemplate().marshalSendAndReceive(timatic3_url, request);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    public Object callWebService(Object request, String sessionID) {
        try {
            return getWebServiceTemplate().marshalSendAndReceive(timatic3_url, request, new Timatic3HeaderCallback(sessionID));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    public ProcessLoginResponse checkName() {
        CheckNameRequest request = new CheckNameRequest();
        request.setUsername(username);
        request.setSubUsername(subUsername);

        ProcessLogin login = new ProcessLogin();
        login.setCheckNameRequest(request);

        return (ProcessLoginResponse) callWebService(login);
    }

    public ProcessLoginResponse loginRequest(String randomNumber, String sessionID) {
        LoginRequest request = new LoginRequest();
        String loginInfo = DigestUtils.md5DigestAsHex((DigestUtils.md5DigestAsHex(password.getBytes()) + randomNumber + sessionID ).getBytes());
        request.setLoginInfo(loginInfo);

        ProcessLogin login = new ProcessLogin();
        login.setLoginRequest(request);

        return (ProcessLoginResponse) callWebService(login, sessionID);
    }

    public DocumentResponse submitDocumentRequest(DocumentRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setDocumentRequest(request);

        ProcessRequestResponse processRequestResponse = (ProcessRequestResponse) callWebService(processRequest, sessionID);
        if (processRequestResponse != null) {
            DocumentResponse documentResponse = processRequestResponse.getDocumentResponse();
            if (null == documentResponse.getError()) {
                return documentResponse;
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

    public ProcessRequestResponse submitParamRequest(ParamRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setParamRequest(request);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }

    public ParamValuesResponse submitParamValuesRequest(ParamValuesRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setParamValuesRequest(request);

        ProcessRequestResponse processRequestResponse = (ProcessRequestResponse) callWebService(processRequest, sessionID);
        if (processRequestResponse != null) {
            ParamValuesResponse paramValuesResponse = processRequestResponse.getParamValuesResponse();
            if (paramValuesResponse != null && null == paramValuesResponse.getError()) {
                return paramValuesResponse;
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

    public ProcessRequestResponse submitTermsRequest(TermsRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setTermsRequest(request);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }

    public ProcessRequestResponse submitCountryRequest(CountryRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setCountryRequest(request);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }

    public ProcessRequestResponse submitCountryInformationRequest(CountryInformationRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setCountryInformationRequest(request);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }

    public ProcessRequestResponse submitNewsRequest(NewsRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setNewsRequest(request);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }

    public ProcessRequestResponse submitNotificationRequest(NotificationRequest request, String sessionID) {

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setNotificationRequest(request);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }

    public ProcessRequestResponse submitVisaRequest(String country, String sessionID) {
        VisaRequest visaRequest = new VisaRequest();
        visaRequest.setCountryCode(country);

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setVisaRequest(visaRequest);

        return (ProcessRequestResponse) callWebService(processRequest, sessionID);
    }
}
