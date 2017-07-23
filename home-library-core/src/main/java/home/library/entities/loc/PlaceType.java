
package home.library.entities.loc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placeTerm" type="{http://www.loc.gov/mods/v3}placeTermType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeType", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "placeTerm"
})
public class PlaceType {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected PlaceTermType placeTerm;

    /**
     * Gets the value of the placeTerm property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceTermType }
     *     
     */
    public PlaceTermType getPlaceTerm() {
        return placeTerm;
    }

    /**
     * Sets the value of the placeTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceTermType }
     *     
     */
    public void setPlaceTerm(PlaceTermType value) {
        this.placeTerm = value;
    }

}
