package home.library.entities;


public class Book {

    private int id;
    private String title;
    private String subTitle;
    private String author;
    private long isbn;
    private long lccn;
    private String publisher;
    private OclcNumbers oclcNumbers;

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public OclcNumbers getOclcNumbers() {
        return oclcNumbers;
    }

    public void setOclcNumbers(OclcNumbers oclcNumbers) {
        this.oclcNumbers = oclcNumbers;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public long getLccn() {
        return lccn;
    }

    public void setLccn(long lccn) {
        this.lccn = lccn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", lccn='" + lccn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
