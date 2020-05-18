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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>documentParagraphSection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="documentParagraphSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paragraphType" type="{http://www.opentravel.org/OTA/2003/05/beta}paragraphType"/&gt;
 *         &lt;element name="paragraphText" type="{http://www.opentravel.org/OTA/2003/05/beta}paragraphTextType"/&gt;
 *         &lt;element name="documentChildParagraph" type="{http://www.opentravel.org/OTA/2003/05/beta}documentParagraphSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paragraphId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noteType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentParagraphSection", propOrder = {
    "paragraphType",
    "paragraphText",
    "documentChildParagraph"
})
public class DocumentParagraphSection {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParagraphType paragraphType;
    @XmlElement(required = true)
    protected ParagraphTextType paragraphText;
    protected List<DocumentParagraphSection> documentChildParagraph;
    @XmlAttribute(name = "paragraphId", required = true)
    protected String paragraphId;
    @XmlAttribute(name = "noteType")
    protected String noteType;

    /**
     * 获取paragraphType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getParagraphType() {
        return paragraphType;
    }

    /**
     * 设置paragraphType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setParagraphType(ParagraphType value) {
        this.paragraphType = value;
    }

    /**
     * 获取paragraphText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphTextType }
     *     
     */
    public ParagraphTextType getParagraphText() {
        return paragraphText;
    }

    /**
     * 设置paragraphText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphTextType }
     *     
     */
    public void setParagraphText(ParagraphTextType value) {
        this.paragraphText = value;
    }

    /**
     * Gets the value of the documentChildParagraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentChildParagraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentChildParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentParagraphSection }
     * 
     * 
     */
    public List<DocumentParagraphSection> getDocumentChildParagraph() {
        if (documentChildParagraph == null) {
            documentChildParagraph = new ArrayList<DocumentParagraphSection>();
        }
        return this.documentChildParagraph;
    }

    /**
     * 获取paragraphId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagraphId() {
        return paragraphId;
    }

    /**
     * 设置paragraphId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagraphId(String value) {
        this.paragraphId = value;
    }

    /**
     * 获取noteType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * 设置noteType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
    }

}
