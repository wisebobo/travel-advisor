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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>timCountrySection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="timCountrySection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionDisplayName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="sectionParagraph" type="{http://www.opentravel.org/OTA/2003/05/beta}timParagraph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsectionInfo" type="{http://www.opentravel.org/OTA/2003/05/beta}timCountrySubSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sectionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timCountrySection", propOrder = {
    "sectionDisplayName",
    "sectionParagraph",
    "subsectionInfo"
})
public class TimCountrySection {

    @XmlElement(required = true)
    protected Object sectionDisplayName;
    protected List<TimParagraph> sectionParagraph;
    protected List<TimCountrySubSection> subsectionInfo;
    @XmlAttribute(name = "sectionId", required = true)
    protected String sectionId;

    /**
     * 获取sectionDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSectionDisplayName() {
        return sectionDisplayName;
    }

    /**
     * 设置sectionDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSectionDisplayName(Object value) {
        this.sectionDisplayName = value;
    }

    /**
     * Gets the value of the sectionParagraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionParagraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimParagraph }
     * 
     * 
     */
    public List<TimParagraph> getSectionParagraph() {
        if (sectionParagraph == null) {
            sectionParagraph = new ArrayList<TimParagraph>();
        }
        return this.sectionParagraph;
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
     * {@link TimCountrySubSection }
     * 
     * 
     */
    public List<TimCountrySubSection> getSubsectionInfo() {
        if (subsectionInfo == null) {
            subsectionInfo = new ArrayList<TimCountrySubSection>();
        }
        return this.subsectionInfo;
    }

    /**
     * 获取sectionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * 设置sectionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

}
