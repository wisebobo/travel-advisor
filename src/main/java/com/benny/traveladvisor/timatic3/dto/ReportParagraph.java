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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>reportParagraph complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="reportParagraph"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="paragraphId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paragraphText" type="{http://www.opentravel.org/OTA/2003/05/beta}paragraphTextType"/&gt;
 *         &lt;element name="ruleText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overrideParentRuleText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnOnMatchRuleText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transitOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transitAndDest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cliTransit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="excludeFromCLIST" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="excludeFromCLIFT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="excludeFromQI" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allTransitPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overrideCarrierCodeRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overrideRestrictionRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overrideVisaEvaluation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="excludeFromTimBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="excludeFromExtract" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cyclicReference" type="{http://www.opentravel.org/OTA/2003/05/beta}cyclicReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paragraph" type="{http://www.opentravel.org/OTA/2003/05/beta}reportParagraph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportParagraph", propOrder = {
    "group",
    "publishDate",
    "retireDate",
    "startDate",
    "endDate",
    "paragraphId",
    "paragraphText",
    "ruleText",
    "overrideParentRuleText",
    "returnOnMatchRuleText",
    "ruleType",
    "partial",
    "transitOnly",
    "transitAndDest",
    "cliTransit",
    "excludeFromCLIST",
    "excludeFromCLIFT",
    "excludeFromQI",
    "allTransitPoints",
    "overrideCarrierCodeRule",
    "overrideRestrictionRule",
    "overrideVisaEvaluation",
    "excludeFromTimBook",
    "excludeFromExtract",
    "cyclicReference",
    "paragraph"
})
public class ReportParagraph {

    protected String group;
    protected String publishDate;
    protected String retireDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected String paragraphId;
    @XmlElement(required = true)
    protected ParagraphTextType paragraphText;
    protected String ruleText;
    protected String overrideParentRuleText;
    protected String returnOnMatchRuleText;
    @XmlElement(required = true)
    protected String ruleType;
    protected boolean partial;
    protected boolean transitOnly;
    protected boolean transitAndDest;
    protected boolean cliTransit;
    protected boolean excludeFromCLIST;
    protected boolean excludeFromCLIFT;
    protected boolean excludeFromQI;
    protected boolean allTransitPoints;
    protected boolean overrideCarrierCodeRule;
    protected boolean overrideRestrictionRule;
    protected boolean overrideVisaEvaluation;
    protected boolean excludeFromTimBook;
    protected boolean excludeFromExtract;
    protected List<CyclicReference> cyclicReference;
    protected List<ReportParagraph> paragraph;

    /**
     * 获取group属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * 设置group属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * 获取publishDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * 设置publishDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishDate(String value) {
        this.publishDate = value;
    }

    /**
     * 获取retireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetireDate() {
        return retireDate;
    }

    /**
     * 设置retireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetireDate(String value) {
        this.retireDate = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取paragraphId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagraphId() {
        return paragraphId;
    }

    /**
     * 设置paragraphId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagraphId(String value) {
        this.paragraphId = value;
    }

    /**
     * 获取paragraphText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphTextType }
     *     
     */
    public ParagraphTextType getParagraphText() {
        return paragraphText;
    }

    /**
     * 设置paragraphText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphTextType }
     *     
     */
    public void setParagraphText(ParagraphTextType value) {
        this.paragraphText = value;
    }

    /**
     * 获取ruleText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleText() {
        return ruleText;
    }

    /**
     * 设置ruleText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleText(String value) {
        this.ruleText = value;
    }

    /**
     * 获取overrideParentRuleText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideParentRuleText() {
        return overrideParentRuleText;
    }

    /**
     * 设置overrideParentRuleText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideParentRuleText(String value) {
        this.overrideParentRuleText = value;
    }

    /**
     * 获取returnOnMatchRuleText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnOnMatchRuleText() {
        return returnOnMatchRuleText;
    }

    /**
     * 设置returnOnMatchRuleText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnOnMatchRuleText(String value) {
        this.returnOnMatchRuleText = value;
    }

    /**
     * 获取ruleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * 设置ruleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleType(String value) {
        this.ruleType = value;
    }

    /**
     * 获取partial属性的值。
     * 
     */
    public boolean isPartial() {
        return partial;
    }

    /**
     * 设置partial属性的值。
     * 
     */
    public void setPartial(boolean value) {
        this.partial = value;
    }

    /**
     * 获取transitOnly属性的值。
     * 
     */
    public boolean isTransitOnly() {
        return transitOnly;
    }

    /**
     * 设置transitOnly属性的值。
     * 
     */
    public void setTransitOnly(boolean value) {
        this.transitOnly = value;
    }

    /**
     * 获取transitAndDest属性的值。
     * 
     */
    public boolean isTransitAndDest() {
        return transitAndDest;
    }

    /**
     * 设置transitAndDest属性的值。
     * 
     */
    public void setTransitAndDest(boolean value) {
        this.transitAndDest = value;
    }

    /**
     * 获取cliTransit属性的值。
     * 
     */
    public boolean isCliTransit() {
        return cliTransit;
    }

    /**
     * 设置cliTransit属性的值。
     * 
     */
    public void setCliTransit(boolean value) {
        this.cliTransit = value;
    }

    /**
     * 获取excludeFromCLIST属性的值。
     * 
     */
    public boolean isExcludeFromCLIST() {
        return excludeFromCLIST;
    }

    /**
     * 设置excludeFromCLIST属性的值。
     * 
     */
    public void setExcludeFromCLIST(boolean value) {
        this.excludeFromCLIST = value;
    }

    /**
     * 获取excludeFromCLIFT属性的值。
     * 
     */
    public boolean isExcludeFromCLIFT() {
        return excludeFromCLIFT;
    }

    /**
     * 设置excludeFromCLIFT属性的值。
     * 
     */
    public void setExcludeFromCLIFT(boolean value) {
        this.excludeFromCLIFT = value;
    }

    /**
     * 获取excludeFromQI属性的值。
     * 
     */
    public boolean isExcludeFromQI() {
        return excludeFromQI;
    }

    /**
     * 设置excludeFromQI属性的值。
     * 
     */
    public void setExcludeFromQI(boolean value) {
        this.excludeFromQI = value;
    }

    /**
     * 获取allTransitPoints属性的值。
     * 
     */
    public boolean isAllTransitPoints() {
        return allTransitPoints;
    }

    /**
     * 设置allTransitPoints属性的值。
     * 
     */
    public void setAllTransitPoints(boolean value) {
        this.allTransitPoints = value;
    }

    /**
     * 获取overrideCarrierCodeRule属性的值。
     * 
     */
    public boolean isOverrideCarrierCodeRule() {
        return overrideCarrierCodeRule;
    }

    /**
     * 设置overrideCarrierCodeRule属性的值。
     * 
     */
    public void setOverrideCarrierCodeRule(boolean value) {
        this.overrideCarrierCodeRule = value;
    }

    /**
     * 获取overrideRestrictionRule属性的值。
     * 
     */
    public boolean isOverrideRestrictionRule() {
        return overrideRestrictionRule;
    }

    /**
     * 设置overrideRestrictionRule属性的值。
     * 
     */
    public void setOverrideRestrictionRule(boolean value) {
        this.overrideRestrictionRule = value;
    }

    /**
     * 获取overrideVisaEvaluation属性的值。
     * 
     */
    public boolean isOverrideVisaEvaluation() {
        return overrideVisaEvaluation;
    }

    /**
     * 设置overrideVisaEvaluation属性的值。
     * 
     */
    public void setOverrideVisaEvaluation(boolean value) {
        this.overrideVisaEvaluation = value;
    }

    /**
     * 获取excludeFromTimBook属性的值。
     * 
     */
    public boolean isExcludeFromTimBook() {
        return excludeFromTimBook;
    }

    /**
     * 设置excludeFromTimBook属性的值。
     * 
     */
    public void setExcludeFromTimBook(boolean value) {
        this.excludeFromTimBook = value;
    }

    /**
     * 获取excludeFromExtract属性的值。
     * 
     */
    public boolean isExcludeFromExtract() {
        return excludeFromExtract;
    }

    /**
     * 设置excludeFromExtract属性的值。
     * 
     */
    public void setExcludeFromExtract(boolean value) {
        this.excludeFromExtract = value;
    }

    /**
     * Gets the value of the cyclicReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cyclicReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCyclicReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CyclicReference }
     * 
     * 
     */
    public List<CyclicReference> getCyclicReference() {
        if (cyclicReference == null) {
            cyclicReference = new ArrayList<CyclicReference>();
        }
        return this.cyclicReference;
    }

    /**
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportParagraph }
     * 
     * 
     */
    public List<ReportParagraph> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ReportParagraph>();
        }
        return this.paragraph;
    }

}
