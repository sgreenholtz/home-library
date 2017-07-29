package home.library;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import home.library.entities.loc.LibraryOfCongressBook;
import home.library.entities.WorldCatBook;
import home.library.util.TestUtility;
import home.library.util.XMLParser;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.File;
import static junit.framework.TestCase.assertTrue;

@SpringBootTest
public class XMLResolverTest {

    private XmlMapper xmlMapper;

    public XMLResolverTest() {
        xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void worldCatTest() throws Exception{
        String expected = "177669176";
        WorldCatBook book = xmlMapper.readValue(new File("worldcat.xml"), WorldCatBook.class);
        String msg = TestUtility.getErrorMessage(book.getIsbn().getOclcnum(), expected);
        assertTrue(msg, book.getIsbn().getOclcnum().equals(expected));
    }

    @Test
    public void worldCatMultipleOclNums() throws Exception {
        String expected = "177669176 222927677 249274099 253402825 301161087 438280230 442197411 464709193 492988633 54619668 55847258 614957020 644729085 760707144 772683553 802989466 850841661 851226517 875412584";
        WorldCatBook book = xmlMapper.readValue(new File("worldcat2.xml"), WorldCatBook.class);
        String msg = TestUtility.getErrorMessage(book.getIsbn().getOclcnum(), expected);
        assertTrue(msg, book.getIsbn().getOclcnum().equals(expected));
    }

    @Test
    public void locTest() throws Exception {
        String expected = "Learning Python";
        LibraryOfCongressBook book = xmlMapper.readValue(new File("loc.xml"), LibraryOfCongressBook.class);
        String msg = TestUtility.getErrorMessage(book.getTitleInfo().getTitle(), expected);
        assertTrue(msg, book.getTitleInfo().getTitle().equals(expected));
    }

    @Test
    public void xmlParserTest() throws Exception {
        XMLParser parser = new XMLParser();
        parser.worldCatTest();
    }

 }
