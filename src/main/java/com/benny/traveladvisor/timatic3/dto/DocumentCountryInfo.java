//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>documentCountryInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="documentCountryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="commonTransit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="sufficientDocumentation" type="{http://www.opentravel.org/OTA/2003/05/beta}sufficient" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="visaEvaluation" type="{http://www.opentravel.org/OTA/2003/05/beta}visaEvaluation" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.opentravel.org/OTA/2003/05/beta}messageType" minOccurs="0"/&gt;
 *         &lt;element name="sectionInformation" type="{http://www.opentravel.org/OTA/2003/05/beta}documentSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentCountryInfo", propOrder = {
    "countryCode",
    "countryName",
    "airportCode",
    "destinationCode",
    "commonTransit",
    "sufficientDocumentation",
    "visaEvaluation",
    "message",
    "sectionInformation"
})
public class DocumentCountryInfo {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String countryName;
    protected String airportCode;
    protected String destinationCode;
    protected String commonTransit;
    @XmlSchemaType(name = "string")
    protected Sufficient sufficientDocumentation;
    protected VisaEvaluation visaEvaluation;
    protected MessageType message;
    protected List<DocumentSection> sectionInformation;

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * 获取airportCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * 设置airportCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * 获取destinationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * 设置destinationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * 获取commonTransit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonTransit() {
        return commonTransit;
    }

    /**
     * 设置commonTransit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonTransit(String value) {
        this.commonTransit = value;
    }

    /**
     * 获取sufficientDocumentation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sufficient }
     *     
     */
    public Sufficient getSufficientDocumentation() {
        return sufficientDocumentation;
    }

    /**
     * 设置sufficientDocumentation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sufficient }
     *     
     */
    public void setSufficientDocumentation(Sufficient value) {
        this.sufficientDocumentation = value;
    }

    /**
     * 获取visaEvaluation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisaEvaluation }
     *     
     */
    public VisaEvaluation getVisaEvaluation() {
        return visaEvaluation;
    }

    /**
     * 设置visaEvaluation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisaEvaluation }
     *     
     */
    public void setVisaEvaluation(VisaEvaluation value) {
        this.visaEvaluation = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the sectionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSection }
     * 
     * 
     */
    public List<DocumentSection> getSectionInformation() {
        if (sectionInformation == null) {
            sectionInformation = new ArrayList<DocumentSection>();
        }
        return this.sectionInformation;
    }

}
