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
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="sectionRequest" type="{http://www.opentravel.org/OTA/2003/05/beta}sectionRequest"/&gt;
 *           &lt;element name="allSections" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
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
    "sectionRequest",
    "allSections"
})
@XmlRootElement(name = "termsRequest")
public class TermsRequest
    extends Request
{

    protected SectionRequest sectionRequest;
    protected String allSections;

    /**
     * 获取sectionRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SectionRequest }
     *     
     */
    public SectionRequest getSectionRequest() {
        return sectionRequest;
    }

    /**
     * 设置sectionRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRequest }
     *     
     */
    public void setSectionRequest(SectionRequest value) {
        this.sectionRequest = value;
    }

    /**
     * 获取allSections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllSections() {
        return allSections;
    }

    /**
     * 设置allSections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllSections(String value) {
        this.allSections = value;
    }

}
