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
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cityCode" type="{http://www.opentravel.org/OTA/2003/05/beta}cityCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countryInformationRequestSection" type="{http://www.opentravel.org/OTA/2003/05/beta}sectionWithSectionCodeAndSubSectionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sectionCode" type="{http://www.opentravel.org/OTA/2003/05/beta}sectionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subSectionCode" type="{http://www.opentravel.org/OTA/2003/05/beta}subSectionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="documentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalityCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="residentCountryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="departAirportCode" type="{http://www.opentravel.org/OTA/2003/05/beta}airportCode" minOccurs="0"/&gt;
 *         &lt;element name="countriesVisited" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transitCountry" type="{http://www.opentravel.org/OTA/2003/05/beta}transitCountry" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="paragraphId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fullText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "countryCode",
    "countryName",
    "cityCode",
    "locationName",
    "countryInformationRequestSection",
    "sectionCode",
    "subSectionCode",
    "documentGroup",
    "nationalityCode",
    "residentCountryCode",
    "departAirportCode",
    "countriesVisited",
    "transitCountry",
    "paragraphId",
    "fullText"
})
@XmlRootElement(name = "countryInformationRequest")
public class CountryInformationRequest
    extends Request
{

    protected List<String> countryCode;
    protected List<String> countryName;
    protected List<String> cityCode;
    protected List<String> locationName;
    protected List<SectionWithSectionCodeAndSubSectionCode> countryInformationRequestSection;
    protected List<String> sectionCode;
    protected List<String> subSectionCode;
    protected String documentGroup;
    protected String nationalityCode;
    protected String residentCountryCode;
    protected String departAirportCode;
    protected List<String> countriesVisited;
    protected List<TransitCountry> transitCountry;
    protected Long paragraphId;
    protected Boolean fullText;

    /**
     * Gets the value of the countryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<String>();
        }
        return this.countryCode;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryName() {
        if (countryName == null) {
            countryName = new ArrayList<String>();
        }
        return this.countryName;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityCode() {
        if (cityCode == null) {
            cityCode = new ArrayList<String>();
        }
        return this.cityCode;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocationName() {
        if (locationName == null) {
            locationName = new ArrayList<String>();
        }
        return this.locationName;
    }

    /**
     * Gets the value of the countryInformationRequestSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryInformationRequestSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryInformationRequestSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionWithSectionCodeAndSubSectionCode }
     * 
     * 
     */
    public List<SectionWithSectionCodeAndSubSectionCode> getCountryInformationRequestSection() {
        if (countryInformationRequestSection == null) {
            countryInformationRequestSection = new ArrayList<SectionWithSectionCodeAndSubSectionCode>();
        }
        return this.countryInformationRequestSection;
    }

    /**
     * Gets the value of the sectionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSectionCode() {
        if (sectionCode == null) {
            sectionCode = new ArrayList<String>();
        }
        return this.sectionCode;
    }

    /**
     * Gets the value of the subSectionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSectionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSectionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubSectionCode() {
        if (subSectionCode == null) {
            subSectionCode = new ArrayList<String>();
        }
        return this.subSectionCode;
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
     * 获取paragraphId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParagraphId() {
        return paragraphId;
    }

    /**
     * 设置paragraphId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParagraphId(Long value) {
        this.paragraphId = value;
    }

    /**
     * 获取fullText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullText() {
        return fullText;
    }

    /**
     * 设置fullText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullText(Boolean value) {
        this.fullText = value;
    }

}
