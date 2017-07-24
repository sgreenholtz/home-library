package home.library;

import home.library.entities.loc.ModsType;
import home.library.util.Props;
import home.library.util.TestUtility;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import home.library.entities.worldcat.*;

import static junit.framework.TestCase.assertTrue;

/**
 * Tests Spring Rest Template
 * @author Sebastian Greenholtz
 */
@SpringBootTest
public class RestServiceTest {


    @Test
    public void worldCatRestTest() {
        String isbn = "9781476755885";
        RestTemplate restTemplate = new RestTemplate();
        RspType book = restTemplate.getForObject(TestUtility.getWorldCatURL(isbn), RspType.class);
        String lccnExpected = "2013049742";
        String msg = TestUtility.getErrorMessage(book.getIsbn().getLccn(), lccnExpected);
        assertTrue(msg, book.getIsbn().getLccn().equals(lccnExpected));
    }

    @Test
    public void libraryOfCongressRestTest() {
        String lccn = "2013049742";
        RestTemplate template = new RestTemplate();
        ModsType book = template.getForObject(TestUtility.getLocURL(lccn), ModsType.class);
        String titleExpected = "Rush Revere and the first patriots";
        String msg = TestUtility.getErrorMessage(book.getTitleInfo().getTitle(), titleExpected);
        assertTrue(msg, book.getTitleInfo().getTitle().equals(titleExpected));
    }

}
