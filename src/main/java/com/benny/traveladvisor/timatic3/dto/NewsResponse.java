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
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newsItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="newsItem" type="{http://www.opentravel.org/OTA/2003/05/beta}news" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "newsItems"
})
@XmlRootElement(name = "newsResponse")
public class NewsResponse
    extends Response
{

    protected NewsResponse.NewsItems newsItems;

    /**
     * 获取newsItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewsResponse.NewsItems }
     *     
     */
    public NewsResponse.NewsItems getNewsItems() {
        return newsItems;
    }

    /**
     * 设置newsItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewsResponse.NewsItems }
     *     
     */
    public void setNewsItems(NewsResponse.NewsItems value) {
        this.newsItems = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="newsItem" type="{http://www.opentravel.org/OTA/2003/05/beta}news" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "newsItem"
    })
    public static class NewsItems {

        @XmlElement(required = true)
        protected List<News> newsItem;

        /**
         * Gets the value of the newsItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newsItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewsItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link News }
         * 
         * 
         */
        public List<News> getNewsItem() {
            if (newsItem == null) {
                newsItem = new ArrayList<News>();
            }
            return this.newsItem;
        }

    }

}
