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
 * <p>dataSection的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="dataSection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Passport,Visa,Health"/&gt;
 *     &lt;enumeration value="Passport,Visa"/&gt;
 *     &lt;enumeration value="Passport"/&gt;
 *     &lt;enumeration value="Health"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataSection")
@XmlEnum
public enum DataSection {

    @XmlEnumValue("Passport,Visa,Health")
    PASSPORT_VISA_HEALTH("Passport,Visa,Health"),
    @XmlEnumValue("Passport,Visa")
    PASSPORT_VISA("Passport,Visa"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("Health")
    HEALTH("Health"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    DataSection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataSection fromValue(String v) {
        for (DataSection c: DataSection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
