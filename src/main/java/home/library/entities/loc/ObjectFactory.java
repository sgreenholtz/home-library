
package home.library.entities.loc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the home.library.entities.loc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Mods_QNAME = new QName("http://www.loc.gov/mods/v3", "mods");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: home.library.entities.loc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OriginInfoType }
     * 
     */
    public OriginInfoType createOriginInfoType() {
        return new OriginInfoType();
    }

    /**
     * Create an instance of {@link LibraryOfCongressBook }
     * 
     */
    public LibraryOfCongressBook createModsType() {
        return new LibraryOfCongressBook();
    }

    /**
     * Create an instance of {@link DateIssuedType }
     * 
     */
    public DateIssuedType createDateIssuedType() {
        return new DateIssuedType();
    }

    /**
     * Create an instance of {@link LanguageTermType }
     * 
     */
    public LanguageTermType createLanguageTermType() {
        return new LanguageTermType();
    }

    /**
     * Create an instance of {@link RecordContentSourceType }
     * 
     */
    public RecordContentSourceType createRecordContentSourceType() {
        return new RecordContentSourceType();
    }

    /**
     * Create an instance of {@link FormType }
     * 
     */
    public FormType createFormType() {
        return new FormType();
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link ClassificationType }
     * 
     */
    public ClassificationType createClassificationType() {
        return new ClassificationType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link RecordChangeDateType }
     * 
     */
    public RecordChangeDateType createRecordChangeDateType() {
        return new RecordChangeDateType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createSubjectType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link TitleInfoType }
     * 
     */
    public TitleInfoType createTitleInfoType() {
        return new TitleInfoType();
    }

    /**
     * Create an instance of {@link RecordInfoType }
     * 
     */
    public RecordInfoType createRecordInfoType() {
        return new RecordInfoType();
    }

    /**
     * Create an instance of {@link RecordCreationDateType }
     * 
     */
    public RecordCreationDateType createRecordCreationDateType() {
        return new RecordCreationDateType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link PhysicalDescriptionType }
     * 
     */
    public PhysicalDescriptionType createPhysicalDescriptionType() {
        return new PhysicalDescriptionType();
    }

    /**
     * Create an instance of {@link PlaceType }
     * 
     */
    public PlaceType createPlaceType() {
        return new PlaceType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link UrlType }
     * 
     */
    public UrlType createUrlType() {
        return new UrlType();
    }

    /**
     * Create an instance of {@link RelatedItemType }
     * 
     */
    public RelatedItemType createRelatedItemType() {
        return new RelatedItemType();
    }

    /**
     * Create an instance of {@link PlaceTermType }
     * 
     */
    public PlaceTermType createPlaceTermType() {
        return new PlaceTermType();
    }

    /**
     * Create an instance of {@link OriginInfoType.DateIssued }
     * 
     */
    public OriginInfoType.DateIssued createOriginInfoTypeDateIssued() {
        return new OriginInfoType.DateIssued();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryOfCongressBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/mods/v3", name = "mods")
    public JAXBElement<LibraryOfCongressBook> createMods(LibraryOfCongressBook value) {
        return new JAXBElement<LibraryOfCongressBook>(_Mods_QNAME, LibraryOfCongressBook.class, null, value);
    }

}
