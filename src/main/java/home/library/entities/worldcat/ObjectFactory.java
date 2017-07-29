
package home.library.entities.worldcat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the home.library.entities package. 
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

    private final static QName _Rsp_QNAME = new QName("http://worldcat.org/xid/isbn/", "rsp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: home.library.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorldCatBook }
     * 
     */
    public WorldCatBook createRspType() {
        return new WorldCatBook();
    }

    /**
     * Create an instance of {@link IsbnType }
     * 
     */
    public IsbnType createIsbnType() {
        return new IsbnType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorldCatBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://worldcat.org/xid/isbn/", name = "rsp")
    public JAXBElement<WorldCatBook> createRsp(WorldCatBook value) {
        return new JAXBElement<WorldCatBook>(_Rsp_QNAME, WorldCatBook.class, null, value);
    }

}
