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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>visaResults complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="visaResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode"/&gt;
 *         &lt;element name="countryVisaList" type="{http://www.opentravel.org/OTA/2003/05/beta}visaList"/&gt;
 *         &lt;element name="groupVisaList" type="{http://www.opentravel.org/OTA/2003/05/beta}visaList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visaResults", propOrder = {
    "countryName",
    "countryCode",
    "countryVisaList",
    "groupVisaList"
})
public class VisaResults {

    @XmlElement(required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected VisaList countryVisaList;
    protected VisaList groupVisaList;

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取countryVisaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisaList }
     *     
     */
    public VisaList getCountryVisaList() {
        return countryVisaList;
    }

    /**
     * 设置countryVisaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisaList }
     *     
     */
    public void setCountryVisaList(VisaList value) {
        this.countryVisaList = value;
    }

    /**
     * 获取groupVisaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisaList }
     *     
     */
    public VisaList getGroupVisaList() {
        return groupVisaList;
    }

    /**
     * 设置groupVisaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisaList }
     *     
     */
    public void setGroupVisaList(VisaList value) {
        this.groupVisaList = value;
    }

}
