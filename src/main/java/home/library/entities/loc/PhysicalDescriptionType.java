
package home.library.entities.loc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for physicalDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physicalDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="form" type="{http://www.loc.gov/mods/v3}formType"/>
 *         &lt;element name="extent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicalDescriptionType", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "form",
    "extent"
})
public class PhysicalDescriptionType {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected FormType form;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String extent;

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setForm(FormType value) {
        this.form = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(String value) {
        this.extent = value;
    }

}
