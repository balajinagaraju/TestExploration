package test.org.openqa.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassesOforgopenqaselenium {

	public static void main(String args[]) {

		String frameworkPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", frameworkPath+ "/src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");

	

		// finding elements using the different mechanisms available in selenium
		// webdriver.

	}

}
