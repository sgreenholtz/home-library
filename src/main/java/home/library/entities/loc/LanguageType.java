
package home.library.entities.loc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for languageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="languageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageTerm" type="{http://www.loc.gov/mods/v3}languageTermType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "languageType", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "languageTerm"
})
public class LanguageType {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected LanguageTermType languageTerm;

    /**
     * Gets the value of the languageTerm property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageTermType }
     *     
     */
    public LanguageTermType getLanguageTerm() {
        return languageTerm;
    }

    /**
     * Sets the value of the languageTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageTermType }
     *     
     */
    public void setLanguageTerm(LanguageTermType value) {
        this.languageTerm = value;
    }

}
