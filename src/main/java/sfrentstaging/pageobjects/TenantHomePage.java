package sfrentstaging.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TenantHomePage {
	WebDriver driver;
	public TenantHomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//a[@class='sidenav-link active ripple-surface-primary']")
	WebElement homepageoption;
	
	@FindBy (xpath="//a[@class='btn btn-sm btn-rounded btn-danger']")
	WebElement deleteTenantApplication;
	@FindBy (xpath="//a[@class='btn btn-sm btn-rounded btn-primary']")
	WebElement viewTenantApplication;
	@FindBy (xpath="//a[@class='btn btn-sm btn-rounded btn-success']")
	WebElement editTenantApplication;
	
	
	@FindBy (xpath="//input[@role='listbox']")
	WebElement expandOptionsDropdown;
	@FindBy (xpath="//div[3]/span")
	WebElement tenantApp;
	@FindBy (id="application_type")
	WebElement selectApplication;
	@FindBy (xpath="//input[@value='Start application']")
	WebElement startAppCTA;
	

	public void goToHomepage()
	{
		homepageoption.click();
	}
	public void startNewTenantApplication()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		expandOptionsDropdown.click();
		expandOptionsDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		//startAppCTA.click();
	}
	public void startNewGuarantorApplication()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		expandOptionsDropdown.click();
		expandOptionsDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//startAppCTA.click();
	}
	public void deleteTenantApplication()
	{
		deleteTenantApplication.click();
	}
	public void viewTenantApplication()
	{
		viewTenantApplication.click();
	}
	public void editTenantApplication()
	{
		editTenantApplication.click();
	}
}
