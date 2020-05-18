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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>countrySubSection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="countrySubSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subSectionCode" type="{http://www.opentravel.org/OTA/2003/05/beta}subSectionCode" minOccurs="0"/&gt;
 *         &lt;element name="subSectionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subSectionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryParagraph" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}countryInformationParagraph"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countrySubSection", propOrder = {
    "subSectionCode",
    "subSectionName",
    "subSectionDisplayName",
    "countryParagraph"
})
public class CountrySubSection {

    protected String subSectionCode;
    @XmlElement(required = true)
    protected String subSectionName;
    @XmlElement(required = true)
    protected String subSectionDisplayName;
    protected List<CountrySubSection.CountryParagraph> countryParagraph;

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
     * 获取subSectionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSectionName() {
        return subSectionName;
    }

    /**
     * 设置subSectionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSectionName(String value) {
        this.subSectionName = value;
    }

    /**
     * 获取subSectionDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSectionDisplayName() {
        return subSectionDisplayName;
    }

    /**
     * 设置subSectionDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSectionDisplayName(String value) {
        this.subSectionDisplayName = value;
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
     * {@link CountrySubSection.CountryParagraph }
     * 
     * 
     */
    public List<CountrySubSection.CountryParagraph> getCountryParagraph() {
        if (countryParagraph == null) {
            countryParagraph = new ArrayList<CountrySubSection.CountryParagraph>();
        }
        return this.countryParagraph;
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
