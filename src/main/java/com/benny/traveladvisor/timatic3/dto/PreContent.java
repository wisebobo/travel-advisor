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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       pre uses "Inline" excluding big, small, sup or sup
 *       
 * 
 * <p>pre.content complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="pre.content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/beta}a"/&gt;
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05/beta}fontstyle"/&gt;
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05/beta}phrase"/&gt;
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05/beta}special.pre"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre.content", propOrder = {
    "content"
})
@XmlSeeAlso({
    Pre.class
})
public class PreContent {

    @XmlElementRefs({
        @XmlElementRef(name = "a", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = A.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = I.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = B.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = Em.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = Strong.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = Sub.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = Sup.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.opentravel.org/OTA/2003/05/beta", type = Br.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * 
     *       pre uses "Inline" excluding big, small, sup or sup
     *       Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link A }
     * {@link I }
     * {@link B }
     * {@link Em }
     * {@link Strong }
     * {@link Sub }
     * {@link Sup }
     * {@link Br }
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
