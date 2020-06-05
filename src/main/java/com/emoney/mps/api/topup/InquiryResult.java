//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.04 at 03:01:31 PM IST 
//


package com.emoney.mps.api.topup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="billName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billShortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criteriaMismatch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currency",
    "billInfo1",
    "billInfo2",
    "billInfo3",
    "billInfo4",
    "billInfo5",
    "billInfo6",
    "billInfo7",
    "billInfo8",
    "billCode",
    "billName",
    "billShortName",
    "billAmount",
    "isError",
    "errorCode",
    "statusDescription",
    "criteriaMismatch"
})
@XmlRootElement(name = "inquiryResult")
public class InquiryResult {

    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String billInfo1;
    @XmlElement(required = true)
    protected String billInfo2;
    @XmlElement(required = true)
    protected String billInfo3;
    @XmlElement(required = true)
    protected String billInfo4;
    @XmlElement(required = true)
    protected String billInfo5;
    @XmlElement(required = true)
    protected String billInfo6;
    @XmlElement(required = true)
    protected String billInfo7;
    @XmlElement(required = true)
    protected String billInfo8;
    protected int billCode;
    @XmlElement(required = true)
    protected String billName;
    @XmlElement(required = true)
    protected String billShortName;
    @XmlElement(required = true)
    protected String billAmount;
    protected boolean isError;
    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String statusDescription;
    @XmlElement(required = true)
    protected List<String> criteriaMismatch;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the billInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo1() {
        return billInfo1;
    }

    /**
     * Sets the value of the billInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo1(String value) {
        this.billInfo1 = value;
    }

    /**
     * Gets the value of the billInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo2() {
        return billInfo2;
    }

    /**
     * Sets the value of the billInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo2(String value) {
        this.billInfo2 = value;
    }

    /**
     * Gets the value of the billInfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo3() {
        return billInfo3;
    }

    /**
     * Sets the value of the billInfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo3(String value) {
        this.billInfo3 = value;
    }

    /**
     * Gets the value of the billInfo4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo4() {
        return billInfo4;
    }

    /**
     * Sets the value of the billInfo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo4(String value) {
        this.billInfo4 = value;
    }

    /**
     * Gets the value of the billInfo5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo5() {
        return billInfo5;
    }

    /**
     * Sets the value of the billInfo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo5(String value) {
        this.billInfo5 = value;
    }

    /**
     * Gets the value of the billInfo6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo6() {
        return billInfo6;
    }

    /**
     * Sets the value of the billInfo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo6(String value) {
        this.billInfo6 = value;
    }

    /**
     * Gets the value of the billInfo7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo7() {
        return billInfo7;
    }

    /**
     * Sets the value of the billInfo7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo7(String value) {
        this.billInfo7 = value;
    }

    /**
     * Gets the value of the billInfo8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo8() {
        return billInfo8;
    }

    /**
     * Sets the value of the billInfo8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo8(String value) {
        this.billInfo8 = value;
    }

    /**
     * Gets the value of the billCode property.
     * 
     */
    public int getBillCode() {
        return billCode;
    }

    /**
     * Sets the value of the billCode property.
     * 
     */
    public void setBillCode(int value) {
        this.billCode = value;
    }

    /**
     * Gets the value of the billName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillName() {
        return billName;
    }

    /**
     * Sets the value of the billName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillName(String value) {
        this.billName = value;
    }

    /**
     * Gets the value of the billShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillShortName() {
        return billShortName;
    }

    /**
     * Sets the value of the billShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillShortName(String value) {
        this.billShortName = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAmount(String value) {
        this.billAmount = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     */
    public boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the criteriaMismatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaMismatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaMismatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCriteriaMismatch() {
        if (criteriaMismatch == null) {
            criteriaMismatch = new ArrayList<String>();
        }
        return this.criteriaMismatch;
    }

}
