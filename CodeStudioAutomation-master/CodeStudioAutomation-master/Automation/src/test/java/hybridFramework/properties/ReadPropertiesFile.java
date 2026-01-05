package hybridFramework.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	File file = new File("./src/test/java/hybridFramework/properties/readProp.properties");
	static FileInputStream stream;
	static Properties prop;

	public ReadPropertiesFile() {

		try {
			stream = new FileInputStream(file);
		}

		catch (Exception e) {
			throw new RuntimeException("File not found excetion..!");
		}

		prop = new Properties();
		try {
			prop.load(stream);
		} catch (Exception e) {
			throw new RuntimeException("File not found");
		}
	}

	public String readURL() {

		try {
			String url = prop.getProperty("url");

			if (url != null) {
				return url;
			}

			else {
				throw new RuntimeException("URL not found");
			}
		}

		catch (NullPointerException e) {
			throw new RuntimeException("Properties file not found",e);
		}

	}

	public String browser() throws IOException {
		File file = new File("./src/test/java/hybridFramework/properties/readProp.properties");
		FileInputStream stream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(stream);
		String browser = prop.getProperty("browser");

		if (browser != null) {
			return browser;
		}

		else {
			throw new RuntimeException("browser not found");
		}

	}

}
