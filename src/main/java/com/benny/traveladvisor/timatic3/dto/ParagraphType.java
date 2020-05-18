//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>paragraphType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="paragraphType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="Restriction"/&gt;
 *     &lt;enumeration value="Exception"/&gt;
 *     &lt;enumeration value="Requirement"/&gt;
 *     &lt;enumeration value="Recommendation"/&gt;
 *     &lt;enumeration value="Applicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "paragraphType")
@XmlEnum
public enum ParagraphType {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Restriction")
    RESTRICTION("Restriction"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception"),
    @XmlEnumValue("Requirement")
    REQUIREMENT("Requirement"),
    @XmlEnumValue("Recommendation")
    RECOMMENDATION("Recommendation"),
    @XmlEnumValue("Applicable")
    APPLICABLE("Applicable");
    private final String value;

    ParagraphType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParagraphType fromValue(String v) {
        for (ParagraphType c: ParagraphType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
