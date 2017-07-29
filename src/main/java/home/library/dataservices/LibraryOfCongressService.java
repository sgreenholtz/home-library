package home.library.dataservices;

import home.library.entities.loc.LibraryOfCongressBook;
import home.library.util.Props;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Communicates with the Library of Congress web service
 * @author Sebastian Greenholtz
 */
@Component
public class LibraryOfCongressService {

    static Logger LOG = LoggerFactory.getLogger(LibraryOfCongressService.class);

    public LibraryOfCongressBook getLibraryOfCongressBook(Long lccn) {
        LOG.debug("Entering getLibraryOfCongressBook, lccn: " + lccn);
        RestTemplate template = new RestTemplate();
        LibraryOfCongressBook book = template.getForObject(Props.getLocUrl(lccn.toString()), LibraryOfCongressBook.class);
        LOG.debug("Exiting getLibraryOfCongressBook, book: " + book.getTitleInfo().getTitle());
        return book;
    }
}
