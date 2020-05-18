//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>news complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="news"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newsTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newsDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="newsFlash" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newsDetail" type="{http://www.opentravel.org/OTA/2003/05/beta}text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="newsId" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="9999999999"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "news", propOrder = {
    "newsTitle",
    "newsDate",
    "newsFlash",
    "newsDetail"
})
public class News {

    @XmlElement(required = true)
    protected String newsTitle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newsDate;
    protected boolean newsFlash;
    protected Text newsDetail;
    @XmlAttribute(name = "newsId", required = true)
    protected long newsId;

    /**
     * 获取newsTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * 设置newsTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsTitle(String value) {
        this.newsTitle = value;
    }

    /**
     * 获取newsDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewsDate() {
        return newsDate;
    }

    /**
     * 设置newsDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewsDate(XMLGregorianCalendar value) {
        this.newsDate = value;
    }

    /**
     * 获取newsFlash属性的值。
     * 
     */
    public boolean isNewsFlash() {
        return newsFlash;
    }

    /**
     * 设置newsFlash属性的值。
     * 
     */
    public void setNewsFlash(boolean value) {
        this.newsFlash = value;
    }

    /**
     * 获取newsDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getNewsDetail() {
        return newsDetail;
    }

    /**
     * 设置newsDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setNewsDetail(Text value) {
        this.newsDetail = value;
    }

    /**
     * 获取newsId属性的值。
     * 
     */
    public long getNewsId() {
        return newsId;
    }

    /**
     * 设置newsId属性的值。
     * 
     */
    public void setNewsId(long value) {
        this.newsId = value;
    }

}
