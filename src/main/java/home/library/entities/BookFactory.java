package home.library.entities;

import home.library.entities.loc.ModsType;
import home.library.entities.state.BookState;
import home.library.entities.worldcat.RspType;
import org.springframework.stereotype.Component;

/**
 * Factory class for assembling all the components that make up a
 * book record:
 *
 * <ol>
 *     <li>Get the ISBN number from the user and assign it to the ISBN instance</li>
 *     <li>Use ISBN number to send a query to WorldCat and create WorldCatBook object from response</li>
 *     <li>Use LCCN number from WorldCat Book object to send a query to the Library of Congress and
 *              create a Library of Congress Book object from response</li>
 *     <li>Map fields from WorldCat book and Library of Congress book to the pojo Book type</li>
 *     <li>Send the results to the front-end for user to approve</li>
 *     <li>If user approves, insert the book into the database</li>
 * </ol>
 */
@Component
public class BookFactory {

    private RspType worldCatBook;
    private ModsType locBook;
    private Book book;
    private BookState state;
    private String isbn;

    public BookFactory() {}

    public RspType getWorldCatBook() {
        return worldCatBook;
    }

    public void setWorldCatBook(RspType worldCatBook) {
        this.worldCatBook = worldCatBook;
    }

    public ModsType getLocBook() {
        return locBook;
    }

    public void setLocBook(ModsType locBook) {
        this.locBook = locBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookState getState() {
        return state;
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}