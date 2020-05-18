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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>countryDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="countryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryCode" type="{http://www.opentravel.org/OTA/2003/05/beta}countryCode"/&gt;
 *         &lt;element name="alternateCountries" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="alternateCountry" type="{http://www.opentravel.org/OTA/2003/05/beta}alternateDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="city" type="{http://www.opentravel.org/OTA/2003/05/beta}cityDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "countryDetail", propOrder = {
    "countryName",
    "countryCode",
    "alternateCountries",
    "cities"
})
public class CountryDetail {

    @XmlElement(required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String countryCode;
    protected CountryDetail.AlternateCountries alternateCountries;
    protected CountryDetail.Cities cities;

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取alternateCountries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryDetail.AlternateCountries }
     *     
     */
    public CountryDetail.AlternateCountries getAlternateCountries() {
        return alternateCountries;
    }

    /**
     * 设置alternateCountries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDetail.AlternateCountries }
     *     
     */
    public void setAlternateCountries(CountryDetail.AlternateCountries value) {
        this.alternateCountries = value;
    }

    /**
     * 获取cities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryDetail.Cities }
     *     
     */
    public CountryDetail.Cities getCities() {
        return cities;
    }

    /**
     * 设置cities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDetail.Cities }
     *     
     */
    public void setCities(CountryDetail.Cities value) {
        this.cities = value;
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
     *         &lt;element name="alternateCountry" type="{http://www.opentravel.org/OTA/2003/05/beta}alternateDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "alternateCountry"
    })
    public static class AlternateCountries {

        protected List<AlternateDetail> alternateCountry;

        /**
         * Gets the value of the alternateCountry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateCountry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AlternateDetail }
         * 
         * 
         */
        public List<AlternateDetail> getAlternateCountry() {
            if (alternateCountry == null) {
                alternateCountry = new ArrayList<AlternateDetail>();
            }
            return this.alternateCountry;
        }

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
     *         &lt;element name="city" type="{http://www.opentravel.org/OTA/2003/05/beta}cityDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "city"
    })
    public static class Cities {

        protected List<CityDetail> city;

        /**
         * Gets the value of the city property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the city property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CityDetail }
         * 
         * 
         */
        public List<CityDetail> getCity() {
            if (city == null) {
                city = new ArrayList<CityDetail>();
            }
            return this.city;
        }

    }

}
