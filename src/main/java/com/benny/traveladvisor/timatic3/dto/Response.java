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
 * This is the base xsd for all responses from the query interface. All responses will contain a requestId, customerCode and an optional errorMessage
 * 
 * <p>response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}baseMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.opentravel.org/OTA/2003/05/beta}errorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "error"
})
@XmlSeeAlso({
    VisaResponse.class,
    ErrorResponse.class,
    TermsResponse.class,
    ParamValuesResponse.class,
    ParamResponse.class,
    NotificationResponse.class,
    NewsResponse.class,
    DownloadResponse.class,
    DocumentResponse.class,
    CountryInformationResponse.class,
    CountryResponse.class,
    CliResponse.class,
    CliKeywordResponse.class,
    CliLoggerResponse.class,
    CheckNameResponse.class,
    LoginResponse.class
})
public class Response
    extends BaseMessage
{

    protected ErrorType error;

    /**
     * 获取error属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * 设置error属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}
