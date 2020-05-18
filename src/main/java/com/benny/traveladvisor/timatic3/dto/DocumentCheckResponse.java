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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>documentCheckResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="documentCheckResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sufficientDocumentation" type="{http://www.opentravel.org/OTA/2003/05/beta}sufficient"/&gt;
 *         &lt;element name="documentCountryInformation" type="{http://www.opentravel.org/OTA/2003/05/beta}documentCountryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentCheckResponse", propOrder = {
    "sufficientDocumentation",
    "documentCountryInformation"
})
public class DocumentCheckResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Sufficient sufficientDocumentation;
    protected List<DocumentCountryInfo> documentCountryInformation;

    /**
     * 获取sufficientDocumentation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sufficient }
     *     
     */
    public Sufficient getSufficientDocumentation() {
        return sufficientDocumentation;
    }

    /**
     * 设置sufficientDocumentation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sufficient }
     *     
     */
    public void setSufficientDocumentation(Sufficient value) {
        this.sufficientDocumentation = value;
    }

    /**
     * Gets the value of the documentCountryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentCountryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentCountryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentCountryInfo }
     * 
     * 
     */
    public List<DocumentCountryInfo> getDocumentCountryInformation() {
        if (documentCountryInformation == null) {
            documentCountryInformation = new ArrayList<DocumentCountryInfo>();
        }
        return this.documentCountryInformation;
    }

}
