package Test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class uiTest {
	
	@BeforeMethod
	public void loginToApplication()
	{
		System.out.println(" Login to application");
		
	}
	
	@AfterTest
	
	public void logoutToApplication()
	{
		System.out.println(" Logout to application");
		
	}
	
	
	
	@BeforeMethod
	public void method1() {
		System.out.println("DB connected");
	}
	@AfterMethod
	public void method2() {
		System.out.println("DB disconnected");
	}
	
	
	
	@Test(priority=1)
	public void bloginTest() {
		System.out.println(" Login is successfull");
	}
	
	@Test(priority=2)
	public void alogoutTest() {
		
		System.out.println(" Logout is Successfull");
	}
	

}
