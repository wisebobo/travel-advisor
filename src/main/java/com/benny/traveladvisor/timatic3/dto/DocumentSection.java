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
 * <p>documentSection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="documentSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentParagraph" type="{http://www.opentravel.org/OTA/2003/05/beta}documentParagraphSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsectionInformation" type="{http://www.opentravel.org/OTA/2003/05/beta}documentSubSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentSection", propOrder = {
    "sectionName",
    "documentParagraph",
    "subsectionInformation"
})
public class DocumentSection {

    @XmlElement(required = true)
    protected String sectionName;
    protected List<DocumentParagraphSection> documentParagraph;
    protected List<DocumentSubSection> subsectionInformation;

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
     * Gets the value of the documentParagraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentParagraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentParagraphSection }
     * 
     * 
     */
    public List<DocumentParagraphSection> getDocumentParagraph() {
        if (documentParagraph == null) {
            documentParagraph = new ArrayList<DocumentParagraphSection>();
        }
        return this.documentParagraph;
    }

    /**
     * Gets the value of the subsectionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsectionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsectionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSubSection }
     * 
     * 
     */
    public List<DocumentSubSection> getSubsectionInformation() {
        if (subsectionInformation == null) {
            subsectionInformation = new ArrayList<DocumentSubSection>();
        }
        return this.subsectionInformation;
    }

}
