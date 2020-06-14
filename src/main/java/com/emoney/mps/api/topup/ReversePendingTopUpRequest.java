//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.14 at 05:29:21 PM IST 
//


package com.emoney.mps.api.topup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trxDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="origTrxDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transmissionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="origTransmissionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billKey1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billKey2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billKey3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference6" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "language",
    "trxDateTime",
    "origTrxDateTime",
    "transmissionDateTime",
    "origTransmissionDateTime",
    "companyCode",
    "channelID",
    "terminalID",
    "billKey1",
    "billKey2",
    "billKey3",
    "paymentAmount",
    "currency",
    "transactionId",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "reference5",
    "reference6"
})
@XmlRootElement(name = "reversePendingTopUpRequest")
public class ReversePendingTopUpRequest {

    @XmlElement(required = true)
    protected String language;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trxDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origTrxDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transmissionDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origTransmissionDateTime;
    protected int companyCode;
    @XmlElement(required = true)
    protected String channelID;
    @XmlElement(required = true)
    protected String terminalID;
    @XmlElement(required = true)
    protected String billKey1;
    @XmlElement(required = true)
    protected String billKey2;
    @XmlElement(required = true)
    protected String billKey3;
    protected int paymentAmount;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String reference1;
    @XmlElement(required = true)
    protected String reference2;
    @XmlElement(required = true)
    protected String reference3;
    @XmlElement(required = true)
    protected String reference4;
    @XmlElement(required = true)
    protected String reference5;
    @XmlElement(required = true)
    protected String reference6;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the trxDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrxDateTime() {
        return trxDateTime;
    }

    /**
     * Sets the value of the trxDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrxDateTime(XMLGregorianCalendar value) {
        this.trxDateTime = value;
    }

    /**
     * Gets the value of the origTrxDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTrxDateTime() {
        return origTrxDateTime;
    }

    /**
     * Sets the value of the origTrxDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTrxDateTime(XMLGregorianCalendar value) {
        this.origTrxDateTime = value;
    }

    /**
     * Gets the value of the transmissionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransmissionDateTime() {
        return transmissionDateTime;
    }

    /**
     * Sets the value of the transmissionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransmissionDateTime(XMLGregorianCalendar value) {
        this.transmissionDateTime = value;
    }

    /**
     * Gets the value of the origTransmissionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTransmissionDateTime() {
        return origTransmissionDateTime;
    }

    /**
     * Sets the value of the origTransmissionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTransmissionDateTime(XMLGregorianCalendar value) {
        this.origTransmissionDateTime = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     */
    public int getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     */
    public void setCompanyCode(int value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the channelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the billKey1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillKey1() {
        return billKey1;
    }

    /**
     * Sets the value of the billKey1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillKey1(String value) {
        this.billKey1 = value;
    }

    /**
     * Gets the value of the billKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillKey2() {
        return billKey2;
    }

    /**
     * Sets the value of the billKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillKey2(String value) {
        this.billKey2 = value;
    }

    /**
     * Gets the value of the billKey3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillKey3() {
        return billKey3;
    }

    /**
     * Sets the value of the billKey3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillKey3(String value) {
        this.billKey3 = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     */
    public int getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     */
    public void setPaymentAmount(int value) {
        this.paymentAmount = value;
    }

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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the reference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * Sets the value of the reference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1(String value) {
        this.reference1 = value;
    }

    /**
     * Gets the value of the reference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Sets the value of the reference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

    /**
     * Gets the value of the reference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference3() {
        return reference3;
    }

    /**
     * Sets the value of the reference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference3(String value) {
        this.reference3 = value;
    }

    /**
     * Gets the value of the reference4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference4() {
        return reference4;
    }

    /**
     * Sets the value of the reference4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference4(String value) {
        this.reference4 = value;
    }

    /**
     * Gets the value of the reference5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference5() {
        return reference5;
    }

    /**
     * Sets the value of the reference5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference5(String value) {
        this.reference5 = value;
    }

    /**
     * Gets the value of the reference6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference6() {
        return reference6;
    }

    /**
     * Sets the value of the reference6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference6(String value) {
        this.reference6 = value;
    }

}
