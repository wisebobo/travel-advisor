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
 * <p>timDownloadCountrySubsection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="timDownloadCountrySubsection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsectionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05/beta}paragraphOrLocator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="subsectionName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timDownloadCountrySubsection", propOrder = {
    "subsectionDisplayName",
    "paragraphOrLocator"
})
public class TimDownloadCountrySubsection {

    @XmlElement(required = true)
    protected String subsectionDisplayName;
    @XmlElements({
        @XmlElement(name = "paragraphLocator", type = TimDownloadCountrySubsection.ParagraphLocator.class),
        @XmlElement(name = "paragraph", type = TimDownloadParagraph.class)
    })
    protected List<Object> paragraphOrLocator;
    @XmlAttribute(name = "subsectionName", required = true)
    protected String subsectionName;

    /**
     * 获取subsectionDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsectionDisplayName() {
        return subsectionDisplayName;
    }

    /**
     * 设置subsectionDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsectionDisplayName(String value) {
        this.subsectionDisplayName = value;
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
     * 获取subsectionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsectionName() {
        return subsectionName;
    }

    /**
     * 设置subsectionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsectionName(String value) {
        this.subsectionName = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.opentravel.org/OTA/2003/05/beta}paragraphOrLocator" maxOccurs="unbounded"/&gt;
     *       &lt;attribute name="paragraphId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paragraphOrLocator"
    })
    public static class ParagraphLocator {

        @XmlElements({
            @XmlElement(name = "paragraphLocator", type = TimDownloadCountrySubsection.ParagraphLocator.class),
            @XmlElement(name = "paragraph", type = TimDownloadParagraph.class)
        })
        protected List<Object> paragraphOrLocator;
        @XmlAttribute(name = "paragraphId", required = true)
        protected long paragraphId;

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

}
