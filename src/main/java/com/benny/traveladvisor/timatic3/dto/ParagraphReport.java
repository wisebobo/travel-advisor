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
 *       &lt;sequence&gt;
 *         &lt;element name="reportDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="countryDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="passportInclusiveRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="visaInclusiveRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="countryRulesUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sectionInfo" type="{http://www.opentravel.org/OTA/2003/05/beta}reportCountrySection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportDate",
    "country"
})
@XmlRootElement(name = "paragraphReport")
public class ParagraphReport {

    @XmlElement(required = true)
    protected String reportDate;
    @XmlElement(required = true)
    protected ParagraphReport.Country country;

    /**
     * 获取reportDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * 设置reportDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDate(String value) {
        this.reportDate = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphReport.Country }
     *     
     */
    public ParagraphReport.Country getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphReport.Country }
     *     
     */
    public void setCountry(ParagraphReport.Country value) {
        this.country = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="countryDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="passportInclusiveRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="visaInclusiveRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="countryRulesUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sectionInfo" type="{http://www.opentravel.org/OTA/2003/05/beta}reportCountrySection" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countryDisplayName",
        "passportInclusiveRule",
        "visaInclusiveRule",
        "countryRulesUsed",
        "sectionInfo"
    })
    public static class Country {

        @XmlElement(required = true)
        protected String countryDisplayName;
        protected boolean passportInclusiveRule;
        protected boolean visaInclusiveRule;
        protected String countryRulesUsed;
        protected List<ReportCountrySection> sectionInfo;

        /**
         * 获取countryDisplayName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryDisplayName() {
            return countryDisplayName;
        }

        /**
         * 设置countryDisplayName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryDisplayName(String value) {
            this.countryDisplayName = value;
        }

        /**
         * 获取passportInclusiveRule属性的值。
         * 
         */
        public boolean isPassportInclusiveRule() {
            return passportInclusiveRule;
        }

        /**
         * 设置passportInclusiveRule属性的值。
         * 
         */
        public void setPassportInclusiveRule(boolean value) {
            this.passportInclusiveRule = value;
        }

        /**
         * 获取visaInclusiveRule属性的值。
         * 
         */
        public boolean isVisaInclusiveRule() {
            return visaInclusiveRule;
        }

        /**
         * 设置visaInclusiveRule属性的值。
         * 
         */
        public void setVisaInclusiveRule(boolean value) {
            this.visaInclusiveRule = value;
        }

        /**
         * 获取countryRulesUsed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryRulesUsed() {
            return countryRulesUsed;
        }

        /**
         * 设置countryRulesUsed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryRulesUsed(String value) {
            this.countryRulesUsed = value;
        }

        /**
         * Gets the value of the sectionInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportCountrySection }
         * 
         * 
         */
        public List<ReportCountrySection> getSectionInfo() {
            if (sectionInfo == null) {
                sectionInfo = new ArrayList<ReportCountrySection>();
            }
            return this.sectionInfo;
        }

    }

}
