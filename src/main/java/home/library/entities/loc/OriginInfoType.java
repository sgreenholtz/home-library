
package home.library.entities.loc;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for originInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="originInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="place" type="{http://www.loc.gov/mods/v3}placeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateIssued" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issuance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "originInfoType", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "place",
    "publisher",
    "dateIssued",
    "edition",
    "issuance"
})
public class OriginInfoType {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<PlaceType> place;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String publisher;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String edition;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String issuance;

    @Override
    public String toString() {
        return "OriginInfoType{" +
                "place=" + place +
                ", publisher='" + publisher + '\'' +
                ", edition='" + edition + '\'' +
                ", issuance='" + issuance + '\'' +
                '}';
    }

    /**
     * Gets the value of the place property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the place property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceType }
     * 
     * 
     */
    public List<PlaceType> getPlace() {
        if (place == null) {
            place = new ArrayList<PlaceType>();
        }
        return this.place;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the issuance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuance() {
        return issuance;
    }

    /**
     * Sets the value of the issuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuance(String value) {
        this.issuance = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DateIssued {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "encoding")
        protected String encoding;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the encoding property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncoding() {
            return encoding;
        }

        /**
         * Sets the value of the encoding property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncoding(String value) {
            this.encoding = value;
        }

    }

}
