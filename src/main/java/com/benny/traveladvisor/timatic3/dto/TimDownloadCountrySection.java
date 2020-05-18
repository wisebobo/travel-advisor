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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>timDownloadCountrySection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="timDownloadCountrySection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05/beta}paragraphOrLocator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsectionInfo" type="{http://www.opentravel.org/OTA/2003/05/beta}timDownloadCountrySubsection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sectionName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timDownloadCountrySection", propOrder = {
    "sectionDisplayName",
    "paragraphOrLocator",
    "subsectionInfo"
})
public class TimDownloadCountrySection {

    @XmlElement(required = true)
    protected String sectionDisplayName;
    @XmlElements({
        @XmlElement(name = "paragraphLocator", type = TimDownloadCountrySubsection.ParagraphLocator.class),
        @XmlElement(name = "paragraph", type = TimDownloadParagraph.class)
    })
    protected List<Object> paragraphOrLocator;
    protected List<TimDownloadCountrySubsection> subsectionInfo;
    @XmlAttribute(name = "sectionName", required = true)
    protected String sectionName;

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
     * Gets the value of the paragraphOrLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraphOrLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraphOrLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimDownloadCountrySubsection.ParagraphLocator }
     * {@link TimDownloadParagraph }
     * 
     * 
     */
    public List<Object> getParagraphOrLocator() {
        if (paragraphOrLocator == null) {
            paragraphOrLocator = new ArrayList<Object>();
        }
        return this.paragraphOrLocator;
    }

    /**
     * Gets the value of the subsectionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsectionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsectionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimDownloadCountrySubsection }
     * 
     * 
     */
    public List<TimDownloadCountrySubsection> getSubsectionInfo() {
        if (subsectionInfo == null) {
            subsectionInfo = new ArrayList<TimDownloadCountrySubsection>();
        }
        return this.subsectionInfo;
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

}
