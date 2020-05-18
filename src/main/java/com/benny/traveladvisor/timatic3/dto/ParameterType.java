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
 * <p>parameterType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="parameterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="documentType"/&gt;
 *     &lt;enumeration value="gender"/&gt;
 *     &lt;enumeration value="dataSection"/&gt;
 *     &lt;enumeration value="stayType"/&gt;
 *     &lt;enumeration value="country"/&gt;
 *     &lt;enumeration value="section"/&gt;
 *     &lt;enumeration value="documentGroup"/&gt;
 *     &lt;enumeration value="visa"/&gt;
 *     &lt;enumeration value="residencyDocument"/&gt;
 *     &lt;enumeration value="secondaryDocumentType"/&gt;
 *     &lt;enumeration value="ticket"/&gt;
 *     &lt;enumeration value="documentFeature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "parameterType")
@XmlEnum
public enum ParameterType {

    @XmlEnumValue("documentType")
    DOCUMENT_TYPE("documentType"),
    @XmlEnumValue("gender")
    GENDER("gender"),
    @XmlEnumValue("dataSection")
    DATA_SECTION("dataSection"),
    @XmlEnumValue("stayType")
    STAY_TYPE("stayType"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("section")
    SECTION("section"),
    @XmlEnumValue("documentGroup")
    DOCUMENT_GROUP("documentGroup"),
    @XmlEnumValue("visa")
    VISA("visa"),
    @XmlEnumValue("residencyDocument")
    RESIDENCY_DOCUMENT("residencyDocument"),
    @XmlEnumValue("secondaryDocumentType")
    SECONDARY_DOCUMENT_TYPE("secondaryDocumentType"),
    @XmlEnumValue("ticket")
    TICKET("ticket"),
    @XmlEnumValue("documentFeature")
    DOCUMENT_FEATURE("documentFeature");
    private final String value;

    ParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterType fromValue(String v) {
        for (ParameterType c: ParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
