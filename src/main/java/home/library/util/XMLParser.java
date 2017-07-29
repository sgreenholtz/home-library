package home.library.util;

import nu.xom.*;

/**
 * @author Sebastian Greenholtz
 */
public class XMLParser {

    private final String base = System.getProperty("user.dir") + "/src/test/resources/";
    private Builder builder;

    public XMLParser() {
        builder = new Builder();
    }

    public void worldCatTest() throws Exception {
        Document doc = builder.build(base + "worldcat2.xml");
        Element e = doc.getRootElement();
        System.out.println(e.getChildElements().get(0).getAttribute("lccn").getValue());
    }
}
