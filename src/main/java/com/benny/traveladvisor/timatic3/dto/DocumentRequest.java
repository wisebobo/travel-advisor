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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="section" type="{http://www.opentravel.org/OTA/2003/05/beta}dataSection"/&gt;
 *         &lt;element name="destinationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;minLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nationalityCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;minLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issueCountryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="residentCountryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="departDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="departAirportCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;minLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="carrierCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="([a-zA-Z0-9])*"/&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="countriesVisited" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;minLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentFeature" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ticket" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;minLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthCountryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transitCountry" type="{http://www.opentravel.org/OTA/2003/05/beta}transitCountry" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="stayDuration" type="{http://www.opentravel.org/OTA/2003/05/beta}stayDuration" minOccurs="0"/&gt;
 *         &lt;element name="visa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visaData" type="{http://www.opentravel.org/OTA/2003/05/beta}visaData" minOccurs="0"/&gt;
 *         &lt;element name="documentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residencyDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="secondaryDocumentType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "section",
    "destinationCode",
    "nationalityCode",
    "documentType",
    "issueCountryCode",
    "issueDate",
    "expiryDate",
    "residentCountryCode",
    "arrivalDate",
    "departDate",
    "departAirportCode",
    "carrierCode",
    "countriesVisited",
    "documentFeature",
    "ticket",
    "documentLanguage",
    "stayType",
    "birthCountryCode",
    "birthDate",
    "gender",
    "passportSeries",
    "transitCountry",
    "stayDuration",
    "visa",
    "visaData",
    "documentGroup",
    "residencyDocument",
    "queryDate",
    "secondaryDocumentType"
})
@XmlRootElement(name = "documentRequest")
public class DocumentRequest
    extends Request
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DataSection section;
    protected String destinationCode;
    protected String nationalityCode;
    protected String documentType;
    protected String issueCountryCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    protected String residentCountryCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departDate;
    protected String departAirportCode;
    protected String carrierCode;
    protected List<String> countriesVisited;
    protected String documentFeature;
    protected String ticket;
    protected String documentLanguage;
    protected String stayType;
    protected String birthCountryCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    protected String gender;
    protected String passportSeries;
    protected List<TransitCountry> transitCountry;
    protected StayDuration stayDuration;
    protected String visa;
    protected VisaData visaData;
    protected String documentGroup;
    protected String residencyDocument;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar queryDate;
    protected String secondaryDocumentType;

    /**
     * 获取section属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataSection }
     *     
     */
    public DataSection getSection() {
        return section;
    }

    /**
     * 设置section属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataSection }
     *     
     */
    public void setSection(DataSection value) {
        this.section = value;
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
     * 获取nationalityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * 设置nationalityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * 获取documentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * 设置documentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * 获取issueCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCountryCode() {
        return issueCountryCode;
    }

    /**
     * 设置issueCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCountryCode(String value) {
        this.issueCountryCode = value;
    }

    /**
     * 获取issueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * 设置issueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * 获取residentCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentCountryCode() {
        return residentCountryCode;
    }

    /**
     * 设置residentCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentCountryCode(String value) {
        this.residentCountryCode = value;
    }

    /**
     * 获取arrivalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 设置arrivalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * 获取departDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartDate() {
        return departDate;
    }

    /**
     * 设置departDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartDate(XMLGregorianCalendar value) {
        this.departDate = value;
    }

    /**
     * 获取departAirportCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartAirportCode() {
        return departAirportCode;
    }

    /**
     * 设置departAirportCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartAirportCode(String value) {
        this.departAirportCode = value;
    }

    /**
     * 获取carrierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * 设置carrierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the countriesVisited property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countriesVisited property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountriesVisited().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountriesVisited() {
        if (countriesVisited == null) {
            countriesVisited = new ArrayList<String>();
        }
        return this.countriesVisited;
    }

    /**
     * 获取documentFeature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentFeature() {
        return documentFeature;
    }

    /**
     * 设置documentFeature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentFeature(String value) {
        this.documentFeature = value;
    }

    /**
     * 获取ticket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * 设置ticket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * 获取documentLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLanguage() {
        return documentLanguage;
    }

    /**
     * 设置documentLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLanguage(String value) {
        this.documentLanguage = value;
    }

    /**
     * 获取stayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayType() {
        return stayType;
    }

    /**
     * 设置stayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayType(String value) {
        this.stayType = value;
    }

    /**
     * 获取birthCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    /**
     * 设置birthCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryCode(String value) {
        this.birthCountryCode = value;
    }

    /**
     * 获取birthDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * 设置birthDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * 获取passportSeries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportSeries() {
        return passportSeries;
    }

    /**
     * 设置passportSeries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportSeries(String value) {
        this.passportSeries = value;
    }

    /**
     * Gets the value of the transitCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitCountry }
     * 
     * 
     */
    public List<TransitCountry> getTransitCountry() {
        if (transitCountry == null) {
            transitCountry = new ArrayList<TransitCountry>();
        }
        return this.transitCountry;
    }

    /**
     * 获取stayDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StayDuration }
     *     
     */
    public StayDuration getStayDuration() {
        return stayDuration;
    }

    /**
     * 设置stayDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StayDuration }
     *     
     */
    public void setStayDuration(StayDuration value) {
        this.stayDuration = value;
    }

    /**
     * 获取visa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisa() {
        return visa;
    }

    /**
     * 设置visa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisa(String value) {
        this.visa = value;
    }

    /**
     * 获取visaData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisaData }
     *     
     */
    public VisaData getVisaData() {
        return visaData;
    }

    /**
     * 设置visaData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisaData }
     *     
     */
    public void setVisaData(VisaData value) {
        this.visaData = value;
    }

    /**
     * 获取documentGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGroup() {
        return documentGroup;
    }

    /**
     * 设置documentGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentGroup(String value) {
        this.documentGroup = value;
    }

    /**
     * 获取residencyDocument属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencyDocument() {
        return residencyDocument;
    }

    /**
     * 设置residencyDocument属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencyDocument(String value) {
        this.residencyDocument = value;
    }

    /**
     * 获取queryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueryDate() {
        return queryDate;
    }

    /**
     * 设置queryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueryDate(XMLGregorianCalendar value) {
        this.queryDate = value;
    }

    /**
     * 获取secondaryDocumentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDocumentType() {
        return secondaryDocumentType;
    }

    /**
     * 设置secondaryDocumentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDocumentType(String value) {
        this.secondaryDocumentType = value;
    }

}
