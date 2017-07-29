package home.library.controller;

import home.library.dataservices.WorldCatService;
import home.library.entities.worldcat.WorldCatBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to get information on a book from
 * various web services
 * @author Sebastian Greenholtz
 */
@RestController
public class GetBookInfoController {

    static Logger LOG = LoggerFactory.getLogger(GetBookInfoController.class);
    @Autowired
    private WorldCatService worldCatService;

    @RequestMapping(value="/services/search/{isbn}")
    @ResponseBody
    public void getWebServiceResults(@RequestParam long isbn) {
        LOG.debug("Entering getWebServiceResults, isbn: " + isbn);
        WorldCatBook book = initiateSearch(isbn);
        LOG.debug("Exiting getWebServiceResults, book: " + book.getIsbn().getTitle());
    }

    private WorldCatBook initiateSearch(Long isbn) {
        return worldCatService.getWorldCatBook(isbn);
    }
}
