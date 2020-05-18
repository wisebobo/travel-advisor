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
 * <p>cliKeywordType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="cliKeywordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Country"/&gt;
 *     &lt;enumeration value="AlternateCountry"/&gt;
 *     &lt;enumeration value="City"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Section"/&gt;
 *     &lt;enumeration value="SubSection"/&gt;
 *     &lt;enumeration value="Help"/&gt;
 *     &lt;enumeration value="Form"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "cliKeywordType")
@XmlEnum
public enum CliKeywordType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("AlternateCountry")
    ALTERNATE_COUNTRY("AlternateCountry"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Section")
    SECTION("Section"),
    @XmlEnumValue("SubSection")
    SUB_SECTION("SubSection"),
    @XmlEnumValue("Help")
    HELP("Help"),
    @XmlEnumValue("Form")
    FORM("Form");
    private final String value;

    CliKeywordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CliKeywordType fromValue(String v) {
        for (CliKeywordType c: CliKeywordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
