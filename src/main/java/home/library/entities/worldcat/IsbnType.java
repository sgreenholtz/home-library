
package home.library.entities.worldcat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for isbnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isbnType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="oclcnum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="form" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publisher" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isbnType", namespace = "http://worldcat.org/xid/isbn/", propOrder = {
    "value"
})
public class IsbnType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "oclcnum")
    protected String oclcnum;
    @XmlAttribute(name = "year")
    protected String year;
    @XmlAttribute(name = "ed")
    protected String ed;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "publisher")
    protected String publisher;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name="lccn")
    protected String lccn;

    public String getLccn() {
        return lccn;
    }

    public void setLccn(String lccn) {
        this.lccn = lccn;
    }

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
     * Gets the value of the oclcnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOclcnum() {
        return oclcnum;
    }

    /**
     * Sets the value of the oclcnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOclcnum(String value) {
        this.oclcnum = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the ed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEd() {
        return ed;
    }

    /**
     * Sets the value of the ed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEd(String value) {
        this.ed = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    @Override
    public String toString() {
        return "IsbnType{" +
                "value='" + value + '\'' +
                ", oclcnum='" + oclcnum + '\'' +
                ", year='" + year + '\'' +
                ", ed='" + ed + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", url='" + url + '\'' +
                ", lccn='" + lccn + '\'' +
                '}';
    }
}
