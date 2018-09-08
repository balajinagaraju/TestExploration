package test.com.commonUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtils {

	public static WebDriver GetWebdriverInstance() {

		String frameworkPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", frameworkPath+ "/src/main/resources/chromedriver");
		WebDriver TestDriver = new ChromeDriver();

		return TestDriver;

	}

}
