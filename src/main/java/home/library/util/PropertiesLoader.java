package home.library.util;

import java.io.*;
import java.util.*;

/**
 * Loads properties from properties files
 * @author Sebastian Greenholtz
 */
public class PropertiesLoader {

    private static final String DEFAULT_PROPERTIES_FILE = "homelibrary";
    private static Properties properties;

    /**
     * Gets a single property from the default properties file
     * @param key String key of specified property value
     * @return String value for given property key
     * @throws IOException
     */
    public static String getProperty(String key) throws IOException {
        if (properties == null) {
            initializeProperties();
        }
        return properties.getProperty(key);
    }

    /**
     * Get Properties object for a passed in properties file
     * @param propertiesFile name or URL/path to properties file
     * @return Properties
     */
    private static void getProperties(String propertiesFile) throws IOException {
        loadProperties(propertiesFile);
    }

    /**
     * Get the Properties object for the default properties file
     * @return Properties
     */
    private static void initializeProperties() throws IOException {
        loadProperties(DEFAULT_PROPERTIES_FILE);
    }

    private static void loadProperties(String propertiesFile) throws IOException {
        Reader reader = new FileReader(new File(propertiesFile));
        properties = new Properties();
        properties.load(reader);
    }
}

