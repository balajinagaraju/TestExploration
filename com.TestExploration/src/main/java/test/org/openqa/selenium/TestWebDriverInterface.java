package test.org.openqa.selenium;

import org.openqa.selenium.WebDriver;

import test.com.commonUtilis.TestUtils;

public class TestWebDriverInterface {

	public static void main(String args[]) {

		WebDriver mydriver = TestUtils.GetWebdriverInstance();

		// Get method being called to load a new web page in the current browser
		// window.
		mydriver.get("https://accounts.google.com/signin");

		System.out.println("The Current URL Method is executed: "+ mydriver.getCurrentUrl());

		System.out.println("The Title of the current page is: "+ mydriver.getTitle());

		System.out.println("The Current window hanlde is: "+ mydriver.getWindowHandle());

		// Call the close method on the driver to kill the driver process.
		mydriver.close();

	}

}
