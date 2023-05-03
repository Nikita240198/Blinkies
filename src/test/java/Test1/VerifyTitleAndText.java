package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

 public class VerifyTitleAndText {
	@Test
	
	public void titletest() {
		
		String expectedtitle = "Blinkly";
		
		String expectedtext= "Access";
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mind/Downloads/chromedriver_mac64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.blinkly.com/");
		
		SoftAssert softAssert = new SoftAssert();
		
		String actualtitle = driver.getTitle();
		
		String actualtext = driver.findElement (By.cssSelector("[id='accesscontainer']")).getAttribute("class");
		System.out.println("check access"+ actualtext);
		
		
		softAssert.assertEquals(actualtitle, expectedtitle);
		softAssert.assertEquals(actualtext,expectedtext);
		
		softAssert.assertAll();
		
		driver.close();
	}

	

}
