package test.org.openqa.selenium;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import test.com.commonUtilis.TestUtils;

/*To test the methods implemented in the Capabilities interface , instantiate the class which is implementing this interface. 
 In this case it is DesiredCapabilities */
public class TestCapabilitiesInterface {

	public static void main(String args[]) {

		WebDriver mydriver = TestUtils.GetWebdriverInstance();

		mydriver.get("https://accounts.google.com/signin");

		DesiredCapabilities Capabalities = new DesiredCapabilities();
		

	}

}
