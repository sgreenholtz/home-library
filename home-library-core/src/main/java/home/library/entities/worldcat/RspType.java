
package home.library.entities.worldcat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rspType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rspType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isbn" type="{http://worldcat.org/xid/isbn/}isbnType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rspType", namespace = "http://worldcat.org/xid/isbn/", propOrder = {
    "isbn"
})
public class RspType {

    @XmlElement(namespace = "http://worldcat.org/xid/isbn/", required = true)
    protected IsbnType isbn;
    @XmlAttribute(name = "stat")
    protected String stat;

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link IsbnType }
     *     
     */
    public IsbnType getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsbnType }
     *     
     */
    public void setIsbn(IsbnType value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    @Override
    public String toString() {
        return "RspType{" +
                "isbn=" + isbn +
                ", stat='" + stat + '\'' +
                '}';
    }
}
