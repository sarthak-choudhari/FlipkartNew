package commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class InitializePropertyFile {
	public static Properties property;
	public static String testaccount = null;

	public static void loadPropertyFile() throws FileNotFoundException, IOException {
		property = new Properties();
		String pathToTestData = System.getProperty("user.dir") + File.separator + "TestData" + File.separator
				+ "config.properties";
		property.load(new FileInputStream(pathToTestData));

	}

	public static void createUserName(String username) {
		Random r = new Random();
		char c = (char) (r.nextInt(26) + 'a');
		int n = r.nextInt(100);
		String str = c + String.valueOf(n);
		testaccount = property.getProperty(username).replace("00", str);

	}
}
