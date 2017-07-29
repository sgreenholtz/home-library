package home.library.util;

/**
 * Utility class for use with logging
 * @author Sebastian Greenholtz
 */
public class LoggingUtility {

    public static final String LINE_SEPARATOR = System.lineSeparator();

    public static String formatStackTrace(Exception e) {
        StringBuilder sb = new StringBuilder();
        sb.append(e.getMessage());
        sb.append(LINE_SEPARATOR);
        for (StackTraceElement line : e.getStackTrace()) {
            sb.append(line.toString());
            sb.append(LINE_SEPARATOR);
        }
        return sb.toString();
    }
}
