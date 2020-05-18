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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>timDownloadParagraph complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="timDownloadParagraph"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="addedParagraph" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element name="changedParagraph" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element name="deletedParagraph" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="retireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="paragraphText" type="{http://www.opentravel.org/OTA/2003/05/beta}timDownloadText"/&gt;
 *         &lt;element name="paragraph" type="{http://www.opentravel.org/OTA/2003/05/beta}timDownloadParagraph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paragraphId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timDownloadParagraph", propOrder = {
    "addedParagraph",
    "changedParagraph",
    "deletedParagraph",
    "publishDate",
    "retireDate",
    "startDate",
    "endDate",
    "paragraphText",
    "paragraph"
})
public class TimDownloadParagraph {

    protected Boolean addedParagraph;
    protected Boolean changedParagraph;
    protected Boolean deletedParagraph;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retireDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected TimDownloadText paragraphText;
    protected List<TimDownloadParagraph> paragraph;
    @XmlAttribute(name = "paragraphId", required = true)
    protected long paragraphId;

    /**
     * 获取addedParagraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddedParagraph() {
        return addedParagraph;
    }

    /**
     * 设置addedParagraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddedParagraph(Boolean value) {
        this.addedParagraph = value;
    }

    /**
     * 获取changedParagraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedParagraph() {
        return changedParagraph;
    }

    /**
     * 设置changedParagraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedParagraph(Boolean value) {
        this.changedParagraph = value;
    }

    /**
     * 获取deletedParagraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletedParagraph() {
        return deletedParagraph;
    }

    /**
     * 设置deletedParagraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletedParagraph(Boolean value) {
        this.deletedParagraph = value;
    }

    /**
     * 获取publishDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * 设置publishDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * 获取retireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetireDate() {
        return retireDate;
    }

    /**
     * 设置retireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetireDate(XMLGregorianCalendar value) {
        this.retireDate = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取paragraphText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimDownloadText }
     *     
     */
    public TimDownloadText getParagraphText() {
        return paragraphText;
    }

    /**
     * 设置paragraphText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimDownloadText }
     *     
     */
    public void setParagraphText(TimDownloadText value) {
        this.paragraphText = value;
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
     * {@link TimDownloadParagraph }
     * 
     * 
     */
    public List<TimDownloadParagraph> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<TimDownloadParagraph>();
        }
        return this.paragraph;
    }

    /**
     * 获取paragraphId属性的值。
     * 
     */
    public long getParagraphId() {
        return paragraphId;
    }

    /**
     * 设置paragraphId属性的值。
     * 
     */
    public void setParagraphId(long value) {
        this.paragraphId = value;
    }

}
