package home.library.dataservices;

import home.library.entities.WorldCatBook;
import home.library.util.Props;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Communicates with the WorldCat service
 */
@Component
public class WorldCatService {
    static final Logger LOG = LoggerFactory.getLogger(WorldCatService.class);

    public WorldCatBook getWorldCatBook(Long isbn) {
        LOG.debug("Entering getWorldCatBook, isbn: " + isbn);
        RestTemplate restTemplate = new RestTemplate();
        WorldCatBook book =  restTemplate.getForObject(Props.getWorldCatUrl(isbn.toString()), WorldCatBook.class);
        LOG.debug("Exiting getWorldCatBook, title: " + book.getIsbn().getTitle());
        return book;
    }

}
