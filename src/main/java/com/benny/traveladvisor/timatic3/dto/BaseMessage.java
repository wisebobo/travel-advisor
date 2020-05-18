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
 * 
 *                 This is the base xsd for all requests/responses made to the query
 *                 interface. All request must contain a requestId and an
 *                 optional customerCode.
 *             
 * 
 * <p>baseMessage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="baseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionID" type="{http://www.opentravel.org/OTA/2003/05/beta}transactionID" minOccurs="0"/&gt;
 *         &lt;element name="transactionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestID" type="{http://www.opentravel.org/OTA/2003/05/beta}requestID"/&gt;
 *         &lt;element name="subRequestID" type="{http://www.opentravel.org/OTA/2003/05/beta}subRequestID" minOccurs="0"/&gt;
 *         &lt;element name="customerCode" type="{http://www.opentravel.org/OTA/2003/05/beta}customerCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseMessage", propOrder = {
    "transactionID",
    "transactionTime",
    "requestID",
    "subRequestID",
    "customerCode"
})
@XmlSeeAlso({
    Response.class,
    Request.class,
    CheckNameRequest.class,
    LoginRequest.class
})
public class BaseMessage {

    protected String transactionID;
    protected String transactionTime;
    protected long requestID;
    protected String subRequestID;
    protected String customerCode;

    /**
     * 获取transactionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * 设置transactionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * 获取transactionTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * 设置transactionTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTime(String value) {
        this.transactionTime = value;
    }

    /**
     * 获取requestID属性的值。
     * 
     */
    public long getRequestID() {
        return requestID;
    }

    /**
     * 设置requestID属性的值。
     * 
     */
    public void setRequestID(long value) {
        this.requestID = value;
    }

    /**
     * 获取subRequestID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRequestID() {
        return subRequestID;
    }

    /**
     * 设置subRequestID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRequestID(String value) {
        this.subRequestID = value;
    }

    /**
     * 获取customerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * 设置customerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

}
