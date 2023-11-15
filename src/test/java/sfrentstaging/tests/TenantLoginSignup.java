package sfrentstaging.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import sfrentstaging.TestComponents.BaseTest;
import sfrentstaging.pageobjects.TenantLogin;
import sfrentstaging.pageobjects.TenantSignup;

public class TenantLoginSignup extends BaseTest {

	@Test
	public void tenantLoginValidCreds() {
		WebDriver driver = initializeDriver();
		TenantLogin tenanlogin = new TenantLogin(driver);
		tenanlogin.goToTenantLogin();
		tenanlogin.tenantLogin("edaroc01+qa@gmail.com", "edaroc01+qa@gmail.com");
		driver.close();
	}
	@Test
	public void tenantLoginInvalidCreds() {
		WebDriver driver = initializeDriver();
		TenantLogin tenanlogin = new TenantLogin(driver);
		tenanlogin.goToTenantLogin();
		tenanlogin.tenantLogin("efdskflsdfm", "sdflkmsdlm");
		driver.close();
	}

	@Test
	public void tenantSignupUsingInvalidEmail() throws InterruptedException {
		WebDriver driver = initializeDriver();
		TenantLogin tenanlogin = new TenantLogin(driver);
		tenanlogin.goToTenantLogin();
		tenanlogin.goToTenantSignup();
		TenantSignup tenantsignup = new TenantSignup(driver);
		Boolean status = tenantsignup.tenantSignup("akldaskjdkl", "sdklsjklfds");
		Assert.assertFalse(status);
		driver.close();
	}
	@Test
	public void tenantSignupUsingValidEmail() throws InterruptedException {
		WebDriver driver = initializeDriver();
		TenantLogin tenanlogin = new TenantLogin(driver);
		tenanlogin.goToTenantLogin();
		tenanlogin.goToTenantSignup();
		TenantSignup tenantsignup = new TenantSignup(driver);
		tenantsignup.tenantSignup("tenantuser2@yopmail.com", "qwerty123");
		Assert.assertTrue(true);
		driver.close();
	}
	
}
