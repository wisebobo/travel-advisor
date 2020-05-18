package com.benny.traveladvisor.timatic3.service;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import java.io.IOException;

/**
 * TODO
 *
 * @author benny.li
 * @data 2020/5/11
 */
public class Timatic3HeaderCallback implements WebServiceMessageCallback {
    private String sessionID;

    public Timatic3HeaderCallback(String sessionID) {
        this.sessionID = sessionID;
    }

    @Override
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {

        try {
            SoapMessage soapMessage = (SoapMessage) message;
            SoapHeader header = soapMessage.getSoapHeader();

            StringSource headerSource = new StringSource("<ns2:sessionID xmlns:ns2=\"http://www.opentravel.org/OTA/2003/05/beta\">" + this.sessionID + "</ns2:sessionID>");

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(headerSource, header.getResult());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
