package home.library;

import home.library.dataservices.LibraryOfCongressService;
import home.library.dataservices.WorldCatService;
import home.library.entities.WorldCatBook;
import home.library.entities.loc.LibraryOfCongressBook;
import home.library.util.TestUtility;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static junit.framework.TestCase.assertTrue;

/**
 * Tests Spring Rest Template
 * @author Sebastian Greenholtz
 */
@SpringBootTest
public class RestServiceTest {

    private WorldCatService worldCatService = new WorldCatService();
    private LibraryOfCongressService locService = new LibraryOfCongressService();

    @Test
    public void worldCatRestTest() {
        String isbn = "9781476755885";
        RestTemplate restTemplate = new RestTemplate();
        WorldCatBook book = restTemplate.getForObject(TestUtility.getWorldCatURL(isbn), WorldCatBook.class);
        String lccnExpected = "2013049742";
        String msg = TestUtility.getErrorMessage(book.getIsbn().getLccn(), lccnExpected);
        assertTrue(msg, book.getIsbn().getLccn().equals(lccnExpected));
    }

    @Test
    public void libraryOfCongressRestTest() {
        String lccn = "2013049742";
        RestTemplate template = new RestTemplate();
        LibraryOfCongressBook book = template.getForObject(TestUtility.getLocURL(lccn), LibraryOfCongressBook.class);
        String titleExpected = "Rush Revere and the first patriots";
        String msg = TestUtility.getErrorMessage(book.getTitleInfo().getTitle(), titleExpected);
        assertTrue(msg, book.getTitleInfo().getTitle().equals(titleExpected));
    }

    @Test
    public void libraryOfCongressRestRawXMLTest() {
        String lccn="2013049742";
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(TestUtility.getLocURL(lccn), String.class);
        System.out.println(result);
    }

    @Test
    public void worldCatServiceTest() {
        long isbn = 9781476755885l;
        String lccnExpected = "2013049742";
        WorldCatBook book = worldCatService.getWorldCatBook(isbn);
        String msg = TestUtility.getErrorMessage(book.getIsbn().getLccn(), lccnExpected);
        assertTrue(msg, book.getIsbn().getLccn().equals(lccnExpected));
    }

    @Test
    public void libraryOfCongressServiceTest() {
        long lccn = 2013049742l;
        String expected = "Rush Revere and the first patriots";
        LibraryOfCongressBook book = locService.getLibraryOfCongressBook(lccn);
        String msg = TestUtility.getErrorMessage(book.getTitleInfo().getTitle(), expected);
        System.out.println(book);
        assertTrue(msg, book.getTitleInfo().getTitle().equals(expected));
    }

}
