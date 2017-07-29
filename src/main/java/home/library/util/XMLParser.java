package home.library.util;

import nu.xom.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sebastian Greenholtz
 */
@Component
public class XMLParser {

    private final String base = System.getProperty("user.dir") + "/src/test/resources/";
    private Builder builder;
    private Document doc;

    public XMLParser() {
        builder = new Builder();
    }

    public void setDocument(String xml) throws Exception {
        doc = builder.build(xml);
    }

    public String getFirstChildAttribute(String attributeName)
            throws Exception {
        return doc.getRootElement()
                .getChildElements()
                .get(0)
                .getAttribute(attributeName)
                .getValue();
    }

    public Elements getChildNodesByName(String name)
        throws Exception {
        return doc.getRootElement().getChildElements(name);
    }

    public List<String> getChildNodeAttributes(String nodeName, String attributeName)
        throws Exception {
        List<String> list = new ArrayList<>();
        Elements e = getChildNodesByName(nodeName);
        for (int i=0; i<e.size(); i++) {
            list.add(e.get(i).getAttribute(attributeName).getValue());
        }
        return list;
    }

    public String worldCatTest(String document) throws Exception {
        Document doc = builder.build(base + document);
        return doc.getRootElement().getChildElements().get(0).getAttribute("lccn").getValue();
    }
}
