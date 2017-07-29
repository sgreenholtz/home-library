package home.library.controller;

import home.library.dataservices.LibraryOfCongressService;
import home.library.dataservices.WorldCatService;
import home.library.entities.Book;
import home.library.entities.BookBuilder;
import home.library.entities.loc.LibraryOfCongressBook;
import home.library.entities.WorldCatBook;
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
    @Autowired
    private LibraryOfCongressService locService;

    @Autowired
    private BookBuilder builder;

    @RequestMapping(value="/services/search/{isbn}")
    @ResponseBody
    public Book getWebServiceResults(@RequestParam long isbn) {
        LOG.debug("Entering getWebServiceResults, isbn: " + isbn);
        builder.setWorldCatBook(searchWorldCat(isbn));
        builder.setLocBook(searchLibraryOfCongress(builder.getBook().getLccn()));
        LOG.debug("Exiting getWebServiceResults, book: " + builder.getBook().getTitle());
        return builder.getBook();
    }

    private WorldCatBook searchWorldCat(Long isbn) {
        return worldCatService.getWorldCatBook(isbn);
    }

    private LibraryOfCongressBook searchLibraryOfCongress(long lccn) {
        return locService.getLibraryOfCongressBook(lccn);
    }
}
