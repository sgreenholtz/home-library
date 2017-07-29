package home.library.entities;

import home.library.entities.loc.LibraryOfCongressBook;
import home.library.entities.state.BookState;
import home.library.entities.state.ErrorState;
import home.library.entities.state.LocState;
import home.library.entities.state.WorldCatState;
import home.library.util.LoggingUtility;
import home.library.util.XMLParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private XMLParser parser;
    static Logger LOG = LoggerFactory.getLogger(BookBuilder.class);

    public BookBuilder() {
        book = new Book();
    }

    public Book getBook() {
        return book;
    }

    /**
     * Parses the XML response from WorldCat into a WorldCatBook object
     * @param xml
     */
    public void setWorldCatBook(String xml) {
        state = WorldCatState.getInstance();
        try {
            parser.setDocument(xml);
            worldCatBook = new WorldCatBook(xml);
            worldCatBook.setLccn(Long.parseLong(parser.getFirstChildAttribute("lccn")));
            worldCatBook.setAuthor(parser.getFirstChildAttribute("author"));
            worldCatBook.setTitle(parser.getFirstChildAttribute("title"));
            worldCatBook.setPublisher(parser.getFirstChildAttribute("publisher"));
            worldCatBook.setOclcNumbers(
                    OclcNumbers.parseOclcNumbers(
                            parser.getFirstChildAttribute("oclcnum")
                    )
            );
        } catch (Exception e) {
            state = ErrorState.getInstance();
            LOG.error(LoggingUtility.formatStackTrace(e));
        }
    }

    /**
     * Parses the XML response from Library of Congress
     * into a LibraryofCongressBook object
     * @param xml
     */
    public void setLocBook(String xml) {
        state = LocState.getInstance();
        try {

        } catch (Exception e) {
            state = ErrorState.getInstance();
            LOG.error(LoggingUtility.formatStackTrace(e));
        }
    }


}
