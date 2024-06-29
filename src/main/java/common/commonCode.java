package common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class commonCode {

	public String readFromProperty(String fileName, String Key) {
		Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("Sorry, unable to find credentials.properties");
                return null;
            }
            properties.load(input);

            return properties.getProperty(Key);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
	}
}
