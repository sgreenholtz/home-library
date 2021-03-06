package home.library.entities;

import home.library.entities.loc.LibraryOfCongressBook;
import home.library.entities.state.BookState;
import home.library.entities.worldcat.WorldCatBook;
import org.springframework.stereotype.Component;

/**
 * Builder class for assembling all the components that make up a
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
public class BookBuilder {

    private WorldCatBook worldCatBook;
    private LibraryOfCongressBook locBook;
    private Book book;
    private BookState state;

    public BookBuilder() {
        book = new Book();
    }

    public WorldCatBook getWorldCatBook() {
        return worldCatBook;
    }

    public void setWorldCatBook(WorldCatBook worldCatBook) {
        this.worldCatBook = worldCatBook;
    }

    public LibraryOfCongressBook getLocBook() {
        return locBook;
    }

    public void setLocBook(LibraryOfCongressBook locBook) {
        this.locBook = locBook;
    }

    public Book getBook() {
        return book;
    }

    public BookState getState() {
        return state;
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public void extractWorldCatFields(WorldCatBook worldCatBook) {
        book.setLccn(Long.parseLong(worldCatBook.getIsbn().getLccn()));
        book.setAuthor(worldCatBook.getIsbn().getAuthor());
        book.setTitle(worldCatBook.getIsbn().getTitle());
        book.setOclcNumbers(OclcNumbers.parseOclcNumbers(
                worldCatBook.getIsbn().getOclcnum()));
    }

    public void extractLibraryOfCongressFields(LibraryOfCongressBook libraryOfCongressBook) {
        book.setPublisher(libraryOfCongressBook.getOriginInfo().getPublisher());
//        book.setTags(libraryOfCongressBook.getSubject().getTopic());

    }
}
