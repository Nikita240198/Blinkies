package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestTitle {
	@Test
	
	public void titletest() {
		
		String expectedtitle = "Blinklyfdfd";
		
		System.setProperty("webdriver.chrome.driver", "/Users/Mind/Downloads/chromedriver_mac64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.blinkly.com/");
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		driver.close();
	}

	

}
