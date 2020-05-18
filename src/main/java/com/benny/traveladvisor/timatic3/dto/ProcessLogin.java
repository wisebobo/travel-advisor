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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}checkNameRequest"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}loginRequest"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkNameRequest",
    "loginRequest"
})
@XmlRootElement(name = "processLogin")
public class ProcessLogin {

    protected CheckNameRequest checkNameRequest;
    protected LoginRequest loginRequest;

    /**
     * 获取checkNameRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckNameRequest }
     *     
     */
    public CheckNameRequest getCheckNameRequest() {
        return checkNameRequest;
    }

    /**
     * 设置checkNameRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckNameRequest }
     *     
     */
    public void setCheckNameRequest(CheckNameRequest value) {
        this.checkNameRequest = value;
    }

    /**
     * 获取loginRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoginRequest }
     *     
     */
    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    /**
     * 设置loginRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequest }
     *     
     */
    public void setLoginRequest(LoginRequest value) {
        this.loginRequest = value;
    }

}
