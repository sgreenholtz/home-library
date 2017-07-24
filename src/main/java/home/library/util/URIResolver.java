package home.library.util;

public class URIResolver {

    /**
     * Generates the full URI based on the URL, a string to look for to
     * replace, and the string to replace it with
     * @param URL
     * @param replaceString
     * @param replaceValue
     * @return String
     */
    public static String getFullURI(String URL, String replaceString, String replaceValue) {
        return URL.replace(replaceString, replaceValue);
    }
}
