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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}errorResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}documentResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}cliLoggerResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}cliKeywordResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}cliResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}countryInformationResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}countryResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}downloadResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}paramValuesResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}newsResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}notificationResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}paragraphReport"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}paramResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}termsResponse"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}timBookExtract"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}timDownload"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}visaResponse"/&gt;
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
    "errorResponse",
    "documentResponse",
    "cliLoggerResponse",
    "cliKeywordResponse",
    "cliResponse",
    "countryInformationResponse",
    "countryResponse",
    "downloadResponse",
    "paramValuesResponse",
    "newsResponse",
    "notificationResponse",
    "paragraphReport",
    "paramResponse",
    "termsResponse",
    "timBookExtract",
    "timDownload",
    "visaResponse"
})
@XmlRootElement(name = "processRequestResponse")
public class ProcessRequestResponse {

    protected ErrorResponse errorResponse;
    protected DocumentResponse documentResponse;
    protected CliLoggerResponse cliLoggerResponse;
    protected CliKeywordResponse cliKeywordResponse;
    protected CliResponse cliResponse;
    protected CountryInformationResponse countryInformationResponse;
    protected CountryResponse countryResponse;
    protected DownloadResponse downloadResponse;
    protected ParamValuesResponse paramValuesResponse;
    protected NewsResponse newsResponse;
    protected NotificationResponse notificationResponse;
    protected ParagraphReport paragraphReport;
    protected ParamResponse paramResponse;
    protected TermsResponse termsResponse;
    protected TimBookExtract timBookExtract;
    protected TimDownload timDownload;
    protected VisaResponse visaResponse;

    /**
     * 获取errorResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * 设置errorResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setErrorResponse(ErrorResponse value) {
        this.errorResponse = value;
    }

    /**
     * 获取documentResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentResponse }
     *     
     */
    public DocumentResponse getDocumentResponse() {
        return documentResponse;
    }

    /**
     * 设置documentResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentResponse }
     *     
     */
    public void setDocumentResponse(DocumentResponse value) {
        this.documentResponse = value;
    }

    /**
     * 获取cliLoggerResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliLoggerResponse }
     *     
     */
    public CliLoggerResponse getCliLoggerResponse() {
        return cliLoggerResponse;
    }

    /**
     * 设置cliLoggerResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliLoggerResponse }
     *     
     */
    public void setCliLoggerResponse(CliLoggerResponse value) {
        this.cliLoggerResponse = value;
    }

    /**
     * 获取cliKeywordResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliKeywordResponse }
     *     
     */
    public CliKeywordResponse getCliKeywordResponse() {
        return cliKeywordResponse;
    }

    /**
     * 设置cliKeywordResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliKeywordResponse }
     *     
     */
    public void setCliKeywordResponse(CliKeywordResponse value) {
        this.cliKeywordResponse = value;
    }

    /**
     * 获取cliResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliResponse }
     *     
     */
    public CliResponse getCliResponse() {
        return cliResponse;
    }

    /**
     * 设置cliResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliResponse }
     *     
     */
    public void setCliResponse(CliResponse value) {
        this.cliResponse = value;
    }

    /**
     * 获取countryInformationResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryInformationResponse }
     *     
     */
    public CountryInformationResponse getCountryInformationResponse() {
        return countryInformationResponse;
    }

    /**
     * 设置countryInformationResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryInformationResponse }
     *     
     */
    public void setCountryInformationResponse(CountryInformationResponse value) {
        this.countryInformationResponse = value;
    }

    /**
     * 获取countryResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryResponse }
     *     
     */
    public CountryResponse getCountryResponse() {
        return countryResponse;
    }

    /**
     * 设置countryResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryResponse }
     *     
     */
    public void setCountryResponse(CountryResponse value) {
        this.countryResponse = value;
    }

    /**
     * 获取downloadResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DownloadResponse }
     *     
     */
    public DownloadResponse getDownloadResponse() {
        return downloadResponse;
    }

    /**
     * 设置downloadResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadResponse }
     *     
     */
    public void setDownloadResponse(DownloadResponse value) {
        this.downloadResponse = value;
    }

    /**
     * 获取paramValuesResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParamValuesResponse }
     *     
     */
    public ParamValuesResponse getParamValuesResponse() {
        return paramValuesResponse;
    }

    /**
     * 设置paramValuesResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValuesResponse }
     *     
     */
    public void setParamValuesResponse(ParamValuesResponse value) {
        this.paramValuesResponse = value;
    }

    /**
     * 获取newsResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewsResponse }
     *     
     */
    public NewsResponse getNewsResponse() {
        return newsResponse;
    }

    /**
     * 设置newsResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewsResponse }
     *     
     */
    public void setNewsResponse(NewsResponse value) {
        this.newsResponse = value;
    }

    /**
     * 获取notificationResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationResponse }
     *     
     */
    public NotificationResponse getNotificationResponse() {
        return notificationResponse;
    }

    /**
     * 设置notificationResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationResponse }
     *     
     */
    public void setNotificationResponse(NotificationResponse value) {
        this.notificationResponse = value;
    }

    /**
     * 获取paragraphReport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphReport }
     *     
     */
    public ParagraphReport getParagraphReport() {
        return paragraphReport;
    }

    /**
     * 设置paragraphReport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphReport }
     *     
     */
    public void setParagraphReport(ParagraphReport value) {
        this.paragraphReport = value;
    }

    /**
     * 获取paramResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParamResponse }
     *     
     */
    public ParamResponse getParamResponse() {
        return paramResponse;
    }

    /**
     * 设置paramResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParamResponse }
     *     
     */
    public void setParamResponse(ParamResponse value) {
        this.paramResponse = value;
    }

    /**
     * 获取termsResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TermsResponse }
     *     
     */
    public TermsResponse getTermsResponse() {
        return termsResponse;
    }

    /**
     * 设置termsResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TermsResponse }
     *     
     */
    public void setTermsResponse(TermsResponse value) {
        this.termsResponse = value;
    }

    /**
     * 获取timBookExtract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimBookExtract }
     *     
     */
    public TimBookExtract getTimBookExtract() {
        return timBookExtract;
    }

    /**
     * 设置timBookExtract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimBookExtract }
     *     
     */
    public void setTimBookExtract(TimBookExtract value) {
        this.timBookExtract = value;
    }

    /**
     * 获取timDownload属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimDownload }
     *     
     */
    public TimDownload getTimDownload() {
        return timDownload;
    }

    /**
     * 设置timDownload属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimDownload }
     *     
     */
    public void setTimDownload(TimDownload value) {
        this.timDownload = value;
    }

    /**
     * 获取visaResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisaResponse }
     *     
     */
    public VisaResponse getVisaResponse() {
        return visaResponse;
    }

    /**
     * 设置visaResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisaResponse }
     *     
     */
    public void setVisaResponse(VisaResponse value) {
        this.visaResponse = value;
    }

}
