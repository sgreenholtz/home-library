package home.library.util;

/**
 * Utility class to help with testing
 * @author Sebastian Greenholtz
 */
public class TestUtility {

    public static String getErrorMessage(String actual, String expected) {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected: ");
        sb.append(expected);
        sb.append("; Actual: ");
        if (actual == null) {
            actual = "";
        }
        sb.append(actual);
        return sb.toString();
    }

    public static String getWorldCatURL(String isbn) {
        return Props.WORLDCAT_URL.replace(Props.REPLACE_STR, isbn);
    }

    public static String getLocURL(String lccn) {
        return Props.LOC_URL.replace(Props.REPLACE_STR, lccn);
    }
}
