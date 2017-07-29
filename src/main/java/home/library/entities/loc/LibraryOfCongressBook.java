
package home.library.entities.loc;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titleInfo" type="{http://www.loc.gov/mods/v3}titleInfoType"/>
 *         &lt;element name="name" type="{http://www.loc.gov/mods/v3}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeOfResource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originInfo" type="{http://www.loc.gov/mods/v3}originInfoType"/>
 *         &lt;element name="language" type="{http://www.loc.gov/mods/v3}languageType"/>
 *         &lt;element name="physicalDescription" type="{http://www.loc.gov/mods/v3}physicalDescriptionType"/>
 *         &lt;element name="note" type="{http://www.loc.gov/mods/v3}noteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.loc.gov/mods/v3}subjectType"/>
 *         &lt;element name="classification" type="{http://www.loc.gov/mods/v3}classificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.loc.gov/mods/v3}locationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.loc.gov/mods/v3}identifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedItem" type="{http://www.loc.gov/mods/v3}relatedItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordInfo" type="{http://www.loc.gov/mods/v3}recordInfoType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modsType", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "titleInfo",
    "name",
    "typeOfResource",
    "originInfo",
    "language",
    "physicalDescription",
    "note",
    "subject",
    "classification",
    "location",
    "identifier",
    "relatedItem",
    "recordInfo"
})
public class LibraryOfCongressBook {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected TitleInfoType titleInfo;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    @JacksonXmlElementWrapper(localName = "name", useWrapping = false)
    protected List<NameType> name;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected String typeOfResource;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    @JacksonXmlElementWrapper(localName = "originInfo", useWrapping = false)
    protected OriginInfoType originInfo;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected LanguageType language;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected PhysicalDescriptionType physicalDescription;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<NoteType> note;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected TagType subject;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<ClassificationType> classification;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<LocationType> location;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<IdentifierType> identifier;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<RelatedItemType> relatedItem;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected RecordInfoType recordInfo;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the titleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TitleInfoType }
     *     
     */
    public TitleInfoType getTitleInfo() {
        return titleInfo;
    }

    /**
     * Sets the value of the titleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleInfoType }
     *     
     */
    public void setTitleInfo(TitleInfoType value) {
        this.titleInfo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the typeOfResource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfResource() {
        return typeOfResource;
    }

    /**
     * Sets the value of the typeOfResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfResource(String value) {
        this.typeOfResource = value;
    }

    /**
     * Gets the value of the originInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OriginInfoType }
     *     
     */
    public OriginInfoType getOriginInfo() {
        return originInfo;
    }

    /**
     * Sets the value of the originInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginInfoType }
     *     
     */
    public void setOriginInfo(OriginInfoType value) {
        this.originInfo = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the physicalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDescriptionType }
     *     
     */
    public PhysicalDescriptionType getPhysicalDescription() {
        return physicalDescription;
    }

    /**
     * Sets the value of the physicalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDescriptionType }
     *     
     */
    public void setPhysicalDescription(PhysicalDescriptionType value) {
        this.physicalDescription = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link TagType }
     *     
     */
    public TagType getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagType }
     *     
     */
    public void setSubject(TagType value) {
        this.subject = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<IdentifierType>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the relatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getRelatedItem() {
        if (relatedItem == null) {
            relatedItem = new ArrayList<RelatedItemType>();
        }
        return this.relatedItem;
    }

    /**
     * Gets the value of the recordInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordInfoType }
     *     
     */
    public RecordInfoType getRecordInfo() {
        return recordInfo;
    }

    /**
     * Sets the value of the recordInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordInfoType }
     *     
     */
    public void setRecordInfo(RecordInfoType value) {
        this.recordInfo = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    @Override
    public String toString() {
        return "ModsType{" +
                "titleInfo=" + titleInfo +
                ", name=" + name +
                ", typeOfResource='" + typeOfResource + '\'' +
                ", originInfo=" + originInfo +
                ", language=" + language +
                ", physicalDescription=" + physicalDescription +
                ", note=" + note +
                ", subject=" + subject +
                ", classification=" + classification +
                ", location=" + location +
                ", identifier=" + identifier +
                ", relatedItem=" + relatedItem +
                ", recordInfo=" + recordInfo +
                ", version='" + version + '\'' +
                '}';
    }
}
