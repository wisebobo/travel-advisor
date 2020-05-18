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
 * <p>reportCountrySection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="reportCountrySection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paragraph" type="{http://www.opentravel.org/OTA/2003/05/beta}reportParagraph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subSectionInfo" type="{http://www.opentravel.org/OTA/2003/05/beta}reportCountrySubSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportCountrySection", propOrder = {
    "sectionDisplayName",
    "paragraph",
    "subSectionInfo"
})
public class ReportCountrySection {

    @XmlElement(required = true)
    protected String sectionDisplayName;
    protected List<ReportParagraph> paragraph;
    protected List<ReportCountrySubSection> subSectionInfo;

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
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportParagraph }
     * 
     * 
     */
    public List<ReportParagraph> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ReportParagraph>();
        }
        return this.paragraph;
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
     * {@link ReportCountrySubSection }
     * 
     * 
     */
    public List<ReportCountrySubSection> getSubSectionInfo() {
        if (subSectionInfo == null) {
            subSectionInfo = new ArrayList<ReportCountrySubSection>();
        }
        return this.subSectionInfo;
    }

}
