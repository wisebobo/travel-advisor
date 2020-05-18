//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="downloadType" type="{http://www.opentravel.org/OTA/2003/05/beta}downloadType"/&gt;
 *         &lt;element name="downloadDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    "downloadType",
    "downloadDate"
})
@XmlRootElement(name = "downloadRequest")
public class DownloadRequest
    extends Request
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DownloadType downloadType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar downloadDate;

    /**
     * 获取downloadType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DownloadType }
     *     
     */
    public DownloadType getDownloadType() {
        return downloadType;
    }

    /**
     * 设置downloadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadType }
     *     
     */
    public void setDownloadType(DownloadType value) {
        this.downloadType = value;
    }

    /**
     * 获取downloadDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownloadDate() {
        return downloadDate;
    }

    /**
     * 设置downloadDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownloadDate(XMLGregorianCalendar value) {
        this.downloadDate = value;
    }

}
