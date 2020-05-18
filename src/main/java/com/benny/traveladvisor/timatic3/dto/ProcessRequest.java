//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}documentRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}termsRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}paramValuesRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}paramRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}countryRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}newsRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}notificationRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}countryInformationRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}cliRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}cliLoggerRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}cliKeywordRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}downloadRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}visaRequest"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentRequest",
    "termsRequest",
    "paramValuesRequest",
    "paramRequest",
    "countryRequest",
    "newsRequest",
    "notificationRequest",
    "countryInformationRequest",
    "cliRequest",
    "cliLoggerRequest",
    "cliKeywordRequest",
    "downloadRequest",
    "visaRequest"
})
@XmlRootElement(name = "processRequest")
public class ProcessRequest {

    protected DocumentRequest documentRequest;
    protected TermsRequest termsRequest;
    protected ParamValuesRequest paramValuesRequest;
    protected ParamRequest paramRequest;
    protected CountryRequest countryRequest;
    protected NewsRequest newsRequest;
    protected NotificationRequest notificationRequest;
    protected CountryInformationRequest countryInformationRequest;
    protected CliRequest cliRequest;
    protected CliLoggerRequest cliLoggerRequest;
    protected CliKeywordRequest cliKeywordRequest;
    protected DownloadRequest downloadRequest;
    protected VisaRequest visaRequest;

    /**
     * 获取documentRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentRequest }
     *     
     */
    public DocumentRequest getDocumentRequest() {
        return documentRequest;
    }

    /**
     * 设置documentRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRequest }
     *     
     */
    public void setDocumentRequest(DocumentRequest value) {
        this.documentRequest = value;
    }

    /**
     * 获取termsRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TermsRequest }
     *     
     */
    public TermsRequest getTermsRequest() {
        return termsRequest;
    }

    /**
     * 设置termsRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TermsRequest }
     *     
     */
    public void setTermsRequest(TermsRequest value) {
        this.termsRequest = value;
    }

    /**
     * 获取paramValuesRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParamValuesRequest }
     *     
     */
    public ParamValuesRequest getParamValuesRequest() {
        return paramValuesRequest;
    }

    /**
     * 设置paramValuesRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValuesRequest }
     *     
     */
    public void setParamValuesRequest(ParamValuesRequest value) {
        this.paramValuesRequest = value;
    }

    /**
     * 获取paramRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParamRequest }
     *     
     */
    public ParamRequest getParamRequest() {
        return paramRequest;
    }

    /**
     * 设置paramRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParamRequest }
     *     
     */
    public void setParamRequest(ParamRequest value) {
        this.paramRequest = value;
    }

    /**
     * 获取countryRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryRequest }
     *     
     */
    public CountryRequest getCountryRequest() {
        return countryRequest;
    }

    /**
     * 设置countryRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRequest }
     *     
     */
    public void setCountryRequest(CountryRequest value) {
        this.countryRequest = value;
    }

    /**
     * 获取newsRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewsRequest }
     *     
     */
    public NewsRequest getNewsRequest() {
        return newsRequest;
    }

    /**
     * 设置newsRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewsRequest }
     *     
     */
    public void setNewsRequest(NewsRequest value) {
        this.newsRequest = value;
    }

    /**
     * 获取notificationRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationRequest }
     *     
     */
    public NotificationRequest getNotificationRequest() {
        return notificationRequest;
    }

    /**
     * 设置notificationRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationRequest }
     *     
     */
    public void setNotificationRequest(NotificationRequest value) {
        this.notificationRequest = value;
    }

    /**
     * 获取countryInformationRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryInformationRequest }
     *     
     */
    public CountryInformationRequest getCountryInformationRequest() {
        return countryInformationRequest;
    }

    /**
     * 设置countryInformationRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryInformationRequest }
     *     
     */
    public void setCountryInformationRequest(CountryInformationRequest value) {
        this.countryInformationRequest = value;
    }

    /**
     * 获取cliRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliRequest }
     *     
     */
    public CliRequest getCliRequest() {
        return cliRequest;
    }

    /**
     * 设置cliRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliRequest }
     *     
     */
    public void setCliRequest(CliRequest value) {
        this.cliRequest = value;
    }

    /**
     * 获取cliLoggerRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliLoggerRequest }
     *     
     */
    public CliLoggerRequest getCliLoggerRequest() {
        return cliLoggerRequest;
    }

    /**
     * 设置cliLoggerRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliLoggerRequest }
     *     
     */
    public void setCliLoggerRequest(CliLoggerRequest value) {
        this.cliLoggerRequest = value;
    }

    /**
     * 获取cliKeywordRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliKeywordRequest }
     *     
     */
    public CliKeywordRequest getCliKeywordRequest() {
        return cliKeywordRequest;
    }

    /**
     * 设置cliKeywordRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliKeywordRequest }
     *     
     */
    public void setCliKeywordRequest(CliKeywordRequest value) {
        this.cliKeywordRequest = value;
    }

    /**
     * 获取downloadRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DownloadRequest }
     *     
     */
    public DownloadRequest getDownloadRequest() {
        return downloadRequest;
    }

    /**
     * 设置downloadRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadRequest }
     *     
     */
    public void setDownloadRequest(DownloadRequest value) {
        this.downloadRequest = value;
    }

    /**
     * 获取visaRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisaRequest }
     *     
     */
    public VisaRequest getVisaRequest() {
        return visaRequest;
    }

    /**
     * 设置visaRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisaRequest }
     *     
     */
    public void setVisaRequest(VisaRequest value) {
        this.visaRequest = value;
    }

}
