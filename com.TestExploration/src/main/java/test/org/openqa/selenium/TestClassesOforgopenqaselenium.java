package test.org.openqa.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import test.com.commonUtilis.TestUtils;

public class TestClassesOforgopenqaselenium {

	public static void main(String args[]) {

		WebDriver mydriver = TestUtils.GetWebdriverInstance();

		mydriver.get("https://accounts.google.com/signin");

		// finding elements using the different mechanisms available in selenium
		// webdriver.

		//Find the element using the ID of an element
		WebElement EmailId = mydriver.findElement(By.id("identifierId"));
		String EmaildTag = EmailId.getTagName();
		System.out.println("The tag for Emaild field is:" + EmaildTag + " Tag");
		
		
		//Find the element using the name of an element
		WebElement EmailIdTagName = mydriver.findElement(By.name("identifier"));
		String EmailIdTagNamevalue = EmailIdTagName.getTagName();
		System.out.println("The tag for Emaild field is:" + EmailIdTagNamevalue + " Tag");
			
			
		mydriver.close();
		
		
		
		
	}

}
