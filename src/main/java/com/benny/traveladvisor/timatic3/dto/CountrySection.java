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
 * <p>countrySection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="countrySection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionCode" type="{http://www.opentravel.org/OTA/2003/05/beta}sectionCode" minOccurs="0"/&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sectionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sufficientDocumentation" type="{http://www.opentravel.org/OTA/2003/05/beta}sufficient" minOccurs="0"/&gt;
 *         &lt;element name="countryParagraph" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}countryInformationParagraph"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subSectionInfo" type="{http://www.opentravel.org/OTA/2003/05/beta}countrySubSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countrySection", propOrder = {
    "sectionCode",
    "sectionName",
    "sectionDisplayName",
    "sufficientDocumentation",
    "countryParagraph",
    "subSectionInfo"
})
public class CountrySection {

    protected String sectionCode;
    @XmlElement(required = true)
    protected String sectionName;
    @XmlElement(required = true)
    protected String sectionDisplayName;
    @XmlSchemaType(name = "string")
    protected Sufficient sufficientDocumentation;
    protected List<CountrySection.CountryParagraph> countryParagraph;
    protected List<CountrySubSection> subSectionInfo;

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
     * 获取sectionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * 设置sectionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * 获取sectionDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionDisplayName() {
        return sectionDisplayName;
    }

    /**
     * 设置sectionDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionDisplayName(String value) {
        this.sectionDisplayName = value;
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
     * Gets the value of the countryParagraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryParagraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySection.CountryParagraph }
     * 
     * 
     */
    public List<CountrySection.CountryParagraph> getCountryParagraph() {
        if (countryParagraph == null) {
            countryParagraph = new ArrayList<CountrySection.CountryParagraph>();
        }
        return this.countryParagraph;
    }

    /**
     * Gets the value of the subSectionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSectionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSectionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubSection }
     * 
     * 
     */
    public List<CountrySubSection> getSubSectionInfo() {
        if (subSectionInfo == null) {
            subSectionInfo = new ArrayList<CountrySubSection>();
        }
        return this.subSectionInfo;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}countryInformationParagraph"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CountryParagraph
        extends CountryInformationParagraph
    {


    }

}
