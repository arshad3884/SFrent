package sfrentstaging.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import sfrentstaging.TestComponents.BaseTest;
import sfrentstaging.pageobjects.NewTenantApplication;
import sfrentstaging.pageobjects.TenantHomePage;
import sfrentstaging.pageobjects.TenantLogin;

public class CreateTenantApplication extends BaseTest {

	@Test
	public void createNewTenantApplication() throws InterruptedException
	{
		WebDriver driver = initializeDriver();
		TenantLogin tenanlogin = new TenantLogin(driver);
		tenanlogin.goToTenantLogin();
		tenanlogin.tenantLogin("edaroc01+qa@gmail.com", "edaroc01+qa@gmail.com");
		TenantHomePage tenantHomepage = new TenantHomePage(driver);
		tenantHomepage.startNewTenantApplication();
		NewTenantApplication newTenantApp = new NewTenantApplication(driver);
		//newTenantApp.addTenantProfileInfo();
		newTenantApp.addApartmentInfo();
	}
	
	@Test
	public void createNewGuarantorApplication()
	{
		WebDriver driver = initializeDriver();
		TenantLogin tenanlogin = new TenantLogin(driver);
		tenanlogin.goToTenantLogin();
		tenanlogin.tenantLogin("edaroc01+qa@gmail.com", "edaroc01+qa@gmail.com");
		TenantHomePage tenantHomepage = new TenantHomePage(driver);
		tenantHomepage.startNewGuarantorApplication();
	}

}
