package sfrentstaging.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenantLogin {
	WebDriver driver;
	public TenantLogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="tenant_user_email")
	WebElement tenantEmail;
	
	@FindBy (id="tenant_user_password")
	WebElement tenantPassword;
	
	@FindBy (name="commit")
	WebElement loginCTA;
	
	@FindBy (xpath="//a[@href='/tenant_users/sign_up']")
	WebElement SignupCTA;
	
	@FindBy (xpath="//a[@href='/tenant_users/password/new']")
	WebElement requestNewPassword;
	
	@FindBy (xpath="//div[@class='alert alert-warning']")
	WebElement loginError;
	
	@FindBy (xpath="//div[@class='alert alert-success']")
	WebElement loginSuccess;
	
	public void goToTenantLogin()
	{
		driver.get("https://sfrent.rentpro-staging.co/tenant_users/sign_in");
	}
	public void tenantLogin(String email, String password)
	{
		tenantEmail.sendKeys(email);
		tenantPassword.sendKeys(password);
		loginCTA.click();
	}
	
	public void goToTenantSignup()
	{
		SignupCTA.click();
	}
	public void goTOforgotTenantPassword()
	{
		requestNewPassword.click();
	}
	
}
