package sfrentstaging.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenantSignup {
	WebDriver driver;
	public TenantSignup(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='form-group']//input[@type='email']")
	WebElement tenantsignupEmail;
	By tenantsignupEmailLocator = By.id("tenant_user_email");	
	
	@FindBy (id="tenant_user_password")
	WebElement tenantnewPassword;
	
	@FindBy (id="tenant_user_password_confirmation")
	WebElement tenantConfirmPassword;
	
	@FindBy (name="commit")
	WebElement signupCTA;
	
	@FindBy (xpath="//div[@class='alert alert-danger']")
	WebElement errorMsg;
	
	@FindBy (xpath="//[@class='alert alert-success']")
	WebElement signupSuccess;
	public boolean tenantSignup(String email, String password) throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(tenantsignupEmailLocator));
		
		Thread.sleep(1000);
		
		tenantsignupEmail.sendKeys(email);
		tenantnewPassword.sendKeys(password);
		tenantConfirmPassword.sendKeys(password);
		signupCTA.click();
		Thread.sleep(2000);
		
		boolean isErrorPresent = true;

		if (errorMsg.getText().contains("Please review the problems below:")) {
		    isErrorPresent = false;
		}
		return isErrorPresent;
	}

}
