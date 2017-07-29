package home.library.util;

public class Props {

    protected static String WORLDCAT_URL = "http://xisbn.worldcat.org/webservices/xid/isbn/" +
            "%%?method=getMetadata&format=xml&fl=*";
    protected static String REPLACE_STR = "%%";
    protected static String LOC_URL = "https://lccn.loc.gov/%%/mods";

    public static String getWorldCatUrl(String isbn) {
        return WORLDCAT_URL.replace(REPLACE_STR, isbn);
    }

    public static String getLocUrl(String lccn) {
        return LOC_URL.replace(REPLACE_STR, lccn);
    }
}
