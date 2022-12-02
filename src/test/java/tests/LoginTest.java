package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	public LoginPage lp;
	
	public void initObjects() {
		
		lp = new LoginPage(driver);
	}
	
	
	@BeforeClass
	public void init() {
		launchBrowser();
		
		initObjects();
	}
	
	@Test
	public void verifyLogin() {
		
		lp.loginApplication();
		lp.clickOnLoginbutton();
	}
	
	@AfterClass
	public void tearDown() {
		tearD();
	}
	

}
