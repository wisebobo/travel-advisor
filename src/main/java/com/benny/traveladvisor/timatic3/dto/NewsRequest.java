//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}request"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="newsDate" type="{http://www.opentravel.org/OTA/2003/05/beta}newsDates"/&gt;
 *         &lt;element name="newsQuery"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Recent"/&gt;
 *               &lt;enumeration value="All"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="newsArticleId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="9999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "newsDate",
    "newsQuery",
    "newsArticleId"
})
@XmlRootElement(name = "newsRequest")
public class NewsRequest
    extends Request
{

    protected NewsDates newsDate;
    protected String newsQuery;
    protected Long newsArticleId;

    /**
     * 获取newsDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewsDates }
     *     
     */
    public NewsDates getNewsDate() {
        return newsDate;
    }

    /**
     * 设置newsDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewsDates }
     *     
     */
    public void setNewsDate(NewsDates value) {
        this.newsDate = value;
    }

    /**
     * 获取newsQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsQuery() {
        return newsQuery;
    }

    /**
     * 设置newsQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsQuery(String value) {
        this.newsQuery = value;
    }

    /**
     * 获取newsArticleId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewsArticleId() {
        return newsArticleId;
    }

    /**
     * 设置newsArticleId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewsArticleId(Long value) {
        this.newsArticleId = value;
    }

}
