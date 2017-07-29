
package home.library.entities.loc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionStandard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordContentSource" type="{http://www.loc.gov/mods/v3}recordContentSourceType"/>
 *         &lt;element name="recordCreationDate" type="{http://www.loc.gov/mods/v3}recordCreationDateType"/>
 *         &lt;element name="recordChangeDate" type="{http://www.loc.gov/mods/v3}recordChangeDateType"/>
 *         &lt;element name="recordIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordInfoType", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "descriptionStandard",
    "recordContentSource",
    "recordCreationDate",
    "recordChangeDate",
    "recordIdentifier",
    "recordOrigin"
})
public class RecordInfoType {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String descriptionStandard;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected RecordContentSourceType recordContentSource;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected RecordCreationDateType recordCreationDate;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected RecordChangeDateType recordChangeDate;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String recordIdentifier;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String recordOrigin;

    @Override
    public String toString() {
        return "RecordInfoType{" +
                "descriptionStandard='" + descriptionStandard + '\'' +
                ", recordContentSource=" + recordContentSource +
                ", recordCreationDate=" + recordCreationDate +
                ", recordChangeDate=" + recordChangeDate +
                ", recordIdentifier='" + recordIdentifier + '\'' +
                ", recordOrigin='" + recordOrigin + '\'' +
                '}';
    }

    /**
     * Gets the value of the descriptionStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionStandard() {
        return descriptionStandard;
    }

    /**
     * Sets the value of the descriptionStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionStandard(String value) {
        this.descriptionStandard = value;
    }

    /**
     * Gets the value of the recordContentSource property.
     * 
     * @return
     *     possible object is
     *     {@link RecordContentSourceType }
     *     
     */
    public RecordContentSourceType getRecordContentSource() {
        return recordContentSource;
    }

    /**
     * Sets the value of the recordContentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordContentSourceType }
     *     
     */
    public void setRecordContentSource(RecordContentSourceType value) {
        this.recordContentSource = value;
    }

    /**
     * Gets the value of the recordCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RecordCreationDateType }
     *     
     */
    public RecordCreationDateType getRecordCreationDate() {
        return recordCreationDate;
    }

    /**
     * Sets the value of the recordCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordCreationDateType }
     *     
     */
    public void setRecordCreationDate(RecordCreationDateType value) {
        this.recordCreationDate = value;
    }

    /**
     * Gets the value of the recordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link RecordChangeDateType }
     *     
     */
    public RecordChangeDateType getRecordChangeDate() {
        return recordChangeDate;
    }

    /**
     * Sets the value of the recordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordChangeDateType }
     *     
     */
    public void setRecordChangeDate(RecordChangeDateType value) {
        this.recordChangeDate = value;
    }

    /**
     * Gets the value of the recordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * Sets the value of the recordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier(String value) {
        this.recordIdentifier = value;
    }

    /**
     * Gets the value of the recordOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordOrigin() {
        return recordOrigin;
    }

    /**
     * Sets the value of the recordOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordOrigin(String value) {
        this.recordOrigin = value;
    }

}
