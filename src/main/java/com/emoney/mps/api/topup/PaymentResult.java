//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.09 at 09:35:09 PM IST 
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
 *         &lt;element name="billInfo1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billInfo11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.emoney.com/mps/api/topup}status" minOccurs="0"/>
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
    "billInfo1",
    "billInfo2",
    "billInfo3",
    "billInfo4",
    "billInfo5",
    "billInfo6",
    "billInfo7",
    "billInfo8",
    "billInfo9",
    "billInfo10",
    "billInfo11",
    "status",
    "criteriaMismatch"
})
@XmlRootElement(name = "paymentResult")
public class PaymentResult {

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
    @XmlElement(required = true)
    protected String billInfo9;
    @XmlElement(required = true)
    protected String billInfo10;
    @XmlElement(required = true)
    protected String billInfo11;
    protected Status status;
    @XmlElement(required = true)
    protected List<String> criteriaMismatch;

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
     * Gets the value of the billInfo9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo9() {
        return billInfo9;
    }

    /**
     * Sets the value of the billInfo9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo9(String value) {
        this.billInfo9 = value;
    }

    /**
     * Gets the value of the billInfo10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo10() {
        return billInfo10;
    }

    /**
     * Sets the value of the billInfo10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo10(String value) {
        this.billInfo10 = value;
    }

    /**
     * Gets the value of the billInfo11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo11() {
        return billInfo11;
    }

    /**
     * Sets the value of the billInfo11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo11(String value) {
        this.billInfo11 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
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
