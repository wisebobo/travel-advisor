//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cliKeywordInformation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="cliKeywordInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.opentravel.org/OTA/2003/05/beta}cliKeywordType"/&gt;
 *         &lt;element name="countryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="alternateCountryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode" minOccurs="0"/&gt;
 *         &lt;element name="groupCode" type="{http://www.opentravel.org/OTA/2003/05/beta}groupCode" minOccurs="0"/&gt;
 *         &lt;element name="cityCode" type="{http://www.opentravel.org/OTA/2003/05/beta}cityCode" minOccurs="0"/&gt;
 *         &lt;element name="sectionCode" type="{http://www.opentravel.org/OTA/2003/05/beta}sectionCode" minOccurs="0"/&gt;
 *         &lt;element name="subSectionCode" type="{http://www.opentravel.org/OTA/2003/05/beta}subSectionCode" minOccurs="0"/&gt;
 *         &lt;element name="helpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliKeywordInformation", propOrder = {
    "keyword",
    "type",
    "countryCode",
    "alternateCountryCode",
    "groupCode",
    "cityCode",
    "sectionCode",
    "subSectionCode",
    "helpName",
    "formName"
})
public class CliKeywordInformation {

    @XmlElement(required = true)
    protected String keyword;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CliKeywordType type;
    protected String countryCode;
    protected String alternateCountryCode;
    protected String groupCode;
    protected String cityCode;
    protected String sectionCode;
    protected String subSectionCode;
    protected String helpName;
    protected String formName;

    /**
     * 获取keyword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置keyword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CliKeywordType }
     *     
     */
    public CliKeywordType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CliKeywordType }
     *     
     */
    public void setType(CliKeywordType value) {
        this.type = value;
    }

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
     * 获取alternateCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateCountryCode() {
        return alternateCountryCode;
    }

    /**
     * 设置alternateCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateCountryCode(String value) {
        this.alternateCountryCode = value;
    }

    /**
     * 获取groupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 设置groupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * 获取cityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置cityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * 获取sectionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * 设置sectionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * 获取subSectionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSectionCode() {
        return subSectionCode;
    }

    /**
     * 设置subSectionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSectionCode(String value) {
        this.subSectionCode = value;
    }

    /**
     * 获取helpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpName() {
        return helpName;
    }

    /**
     * 设置helpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpName(String value) {
        this.helpName = value;
    }

    /**
     * 获取formName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * 设置formName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

}
