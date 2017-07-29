package home.library.entities;

import home.library.entities.OclcNumbers;

public class WorldCatBook {

    private OclcNumbers oclcNumbers;
    private long lccn;
    private String title;
    private String author;
    private String xml;
    private String publisher;

    /**
     * Package-protected constructor
     */
    WorldCatBook(String xml) {
        this.xml = xml;
    }


    public OclcNumbers getOclcNumbers() {
        return oclcNumbers;
    }

    void setOclcNumbers(OclcNumbers oclcNumbers) {
        this.oclcNumbers = oclcNumbers;
    }

    public long getLccn() {
        return lccn;
    }

    void setLccn(long lccn) {
        this.lccn = lccn;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "WorldCatBook{" +
                "oclcNumbers=" + oclcNumbers +
                ", lccn=" + lccn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
