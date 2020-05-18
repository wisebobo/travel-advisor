//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the base xsd for all requests made to the query interface. All request must contain a requestId and an optional customerCode.
 * 
 * <p>request complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}baseMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cliParametersSummarised" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cliInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fromMenu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fromBack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accessMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "cliCommand",
    "cliParametersSummarised",
    "cliInput",
    "fromKeyword",
    "fromMenu",
    "fromBack",
    "accessMethod"
})
@XmlSeeAlso({
    VisaRequest.class,
    TermsRequest.class,
    ParamValuesRequest.class,
    ParamRequest.class,
    NotificationRequest.class,
    NewsRequest.class,
    DownloadRequest.class,
    DocumentRequest.class,
    CountryInformationRequest.class,
    CountryRequest.class,
    CliRequest.class,
    CliKeywordRequest.class,
    CliLoggerRequest.class
})
public class Request
    extends BaseMessage
{

    protected String cliCommand;
    protected String cliParametersSummarised;
    protected String cliInput;
    protected Boolean fromKeyword;
    protected Boolean fromMenu;
    protected Boolean fromBack;
    protected String accessMethod;

    /**
     * 获取cliCommand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliCommand() {
        return cliCommand;
    }

    /**
     * 设置cliCommand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliCommand(String value) {
        this.cliCommand = value;
    }

    /**
     * 获取cliParametersSummarised属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliParametersSummarised() {
        return cliParametersSummarised;
    }

    /**
     * 设置cliParametersSummarised属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliParametersSummarised(String value) {
        this.cliParametersSummarised = value;
    }

    /**
     * 获取cliInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliInput() {
        return cliInput;
    }

    /**
     * 设置cliInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliInput(String value) {
        this.cliInput = value;
    }

    /**
     * 获取fromKeyword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromKeyword() {
        return fromKeyword;
    }

    /**
     * 设置fromKeyword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromKeyword(Boolean value) {
        this.fromKeyword = value;
    }

    /**
     * 获取fromMenu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromMenu() {
        return fromMenu;
    }

    /**
     * 设置fromMenu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromMenu(Boolean value) {
        this.fromMenu = value;
    }

    /**
     * 获取fromBack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromBack() {
        return fromBack;
    }

    /**
     * 设置fromBack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromBack(Boolean value) {
        this.fromBack = value;
    }

    /**
     * 获取accessMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMethod() {
        return accessMethod;
    }

    /**
     * 设置accessMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMethod(String value) {
        this.accessMethod = value;
    }

}
