package home.library.util;

public class Props {

    private static String WORLDCAT_URL = "http://xisbn.worldcat.org/webservices/xid/isbn/" +
            "%%?method=getMetadata&format=xml&fl=*";
    private static String REPLACE_STR = "%%";
    private static String LOC_URL = "https://lccn.loc.gov/%%/mods";

    public static String getWorldCatUrl(Integer isbn) {
        return WORLDCAT_URL.replace(REPLACE_STR, isbn.toString());
    }

    public static String getLocUrl(Integer lccn) {
        return LOC_URL.replace(REPLACE_STR, lccn.toString());
    }
}
