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
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/beta}response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notificationItem" type="{http://www.opentravel.org/OTA/2003/05/beta}notificationItem" minOccurs="0"/&gt;
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
    "notificationItem"
})
@XmlRootElement(name = "notificationResponse")
public class NotificationResponse
    extends Response
{

    protected NotificationItem notificationItem;

    /**
     * 获取notificationItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationItem }
     *     
     */
    public NotificationItem getNotificationItem() {
        return notificationItem;
    }

    /**
     * 设置notificationItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationItem }
     *     
     */
    public void setNotificationItem(NotificationItem value) {
        this.notificationItem = value;
    }

}
