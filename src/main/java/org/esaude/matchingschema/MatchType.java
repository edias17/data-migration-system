//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.18 at 01:21:29 PM CAT 
//


package org.esaude.matchingschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="left" type="{http://esaude.org/matchingschema}matchSideType"/>
 *         &lt;element name="right" type="{http://esaude.org/matchingschema}matchSideType"/>
 *         &lt;element name="hasValueMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rightReference" type="{http://esaude.org/matchingschema}referenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchType", propOrder = {
    "terminology",
    "left",
    "right",
    "hasValueMatch",
    "rightReference"
})
public class MatchType {

    @XmlElement(required = true)
    protected String terminology;
    @XmlElement(required = true)
    protected MatchSideType left;
    @XmlElement(required = true)
    protected MatchSideType right;
    @XmlElement(defaultValue = "false")
    protected boolean hasValueMatch;
    protected List<ReferenceType> rightReference;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Gets the value of the terminology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminology() {
        return terminology;
    }

    /**
     * Sets the value of the terminology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminology(String value) {
        this.terminology = value;
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSideType }
     *     
     */
    public MatchSideType getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSideType }
     *     
     */
    public void setLeft(MatchSideType value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSideType }
     *     
     */
    public MatchSideType getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSideType }
     *     
     */
    public void setRight(MatchSideType value) {
        this.right = value;
    }

    /**
     * Gets the value of the hasValueMatch property.
     * 
     */
    public boolean isHasValueMatch() {
        return hasValueMatch;
    }

    /**
     * Sets the value of the hasValueMatch property.
     * 
     */
    public void setHasValueMatch(boolean value) {
        this.hasValueMatch = value;
    }

    /**
     * Gets the value of the rightReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRightReference() {
        if (rightReference == null) {
            rightReference = new ArrayList<ReferenceType>();
        }
        return this.rightReference;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
