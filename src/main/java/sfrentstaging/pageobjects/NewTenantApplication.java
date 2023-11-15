package sfrentstaging.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTenantApplication {
	WebDriver driver;
	public NewTenantApplication(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//div[@class='d-flex flex-column text-center step-column'])[1]")
	WebElement personalInfoTab;
	
	By toastMessage = By.xpath("//div[@class='toast fade bg-success toast-fixed show']");
	 
	@FindBy (id="form_entry_form_entry_fields_attributes_0_string_value")
	WebElement FirstName;
	@FindBy (id="form_entry_form_entry_fields_attributes_1_string_value")
	WebElement LastName;
	@FindBy (xpath="(//ul[@id='stepper-buttons']//li[1]//input[@role='listbox'])[1]")
	WebElement MobilePhoneNumber;
	@FindBy (xpath="(//div[@class='select-option'])[1]")
	WebElement selectPhonecountry;
	@FindBy (id="form_entry_form_entry_fields_attributes_3_string_value")
	WebElement inputMobilePhoneNumber;
	@FindBy (id="form_entry_form_entry_fields_attributes_5_string_value")
	WebElement EmailAddress;
	@FindBy (xpath="(//input[@role='listbox'])[3]")
	WebElement Howdidyouhearaboutthisapartment;
	@FindBy (xpath="(//span[@class='select-option-text'])[2]")
	WebElement referrerOption;
	@FindBy (id="form_entry_form_entry_fields_attributes_7_string_value")
	WebElement referrerOtherField;
	@FindBy (id="form_entry_form_entry_fields_attributes_8_string_value")
	WebElement SocialSecurity;
	@FindBy (id="form_entry_form_entry_fields_attributes_9_string_value")
	WebElement DateofBirth;
	@FindBy (id="form_entry_form_entry_fields_attributes_15_string_value")
	WebElement emergencyContactFirstName;
	@FindBy (id="form_entry_form_entry_fields_attributes_16_string_value")
	WebElement emergencyContactLastName;
	@FindBy (xpath="(//ul[@id='stepper-buttons']//li[1]//input[@role='listbox'])[5]")
	WebElement emergencyContactPhoneNo;
	@FindBy (id="form_entry_form_entry_fields_attributes_18_string_value")
	WebElement addEmergencyContactPhoneNo;
	@FindBy (id="form_entry_form_entry_fields_attributes_19_string_value")
	WebElement EmergencyContactEmail;
	@FindBy (id="form_entry_form_entry_fields_attributes_20_number_value")
	WebElement AmountofLiquidAssets;
	@FindBy (id="next-step")
	WebElement NextCTA;
	//------------------------------------------------------------------------------------
	@FindBy (xpath="(//li[contains(@class, 'stepper-step')])[2]")
	WebElement apartmentTab;
	@FindBy (xpath="(//input[@role='listbox'])[6]")
	WebElement building;
	@FindBy (xpath="(//input[@role='listbox'])[7]")
	WebElement unitNumber;
	@FindBy (xpath="(//input[@role='listbox'])[8]")
	WebElement apartmentUnitType;
	@FindBy (xpath="(//input[@role='listbox'])[9]")
	WebElement alternateBuilding;
	@FindBy (xpath="(//input[@role='listbox'])[10]")
	WebElement alternateApartmentUnitType;
	@FindBy (id="form_entry_form_entry_fields_attributes_33_string_value") 
	WebElement desiredMoveinDate;
	@FindBy (xpath="(//input[@role='listbox'])[11]")
	WebElement haveYouSeenTheUnit;
	

	public void addTenantProfileInfo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		personalInfoTab.click();
		FirstName.sendKeys("john", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		LastName.sendKeys("Wick", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		//Select phone dropdown
		wait.until(ExpectedConditions.elementToBeClickable(MobilePhoneNumber));
		Actions actions = new Actions(driver);
		//actions.moveToElement(MobilePhoneNumber).click(MobilePhoneNumber);
		MobilePhoneNumber.sendKeys(Keys.ARROW_DOWN,Keys.TAB);
		inputMobilePhoneNumber.sendKeys("+18885552222",Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		EmailAddress.sendKeys("johnwick@yopmail.com",Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		//Handling dropdown
		//actions.moveToElement(Howdidyouhearaboutthisapartment).click(Howdidyouhearaboutthisapartment);
		//actions.moveToElement(referrerOption).click(referrerOption);
		Howdidyouhearaboutthisapartment.sendKeys(Keys.END, Keys.TAB);
		referrerOtherField.sendKeys("Sfrent Website", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		SocialSecurity.sendKeys("123456789", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		DateofBirth.sendKeys("10/30/1992", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		emergencyContactFirstName.sendKeys("Abraham", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		emergencyContactLastName.sendKeys("Robert", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		//Emergency contact PhoneNumber Dropdown
		//actions.moveToElement(emergencyContactPhoneNo).click(emergencyContactPhoneNo);
		emergencyContactPhoneNo.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
		addEmergencyContactPhoneNo.sendKeys("+15556669999", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		EmergencyContactEmail.sendKeys("abrahamrobert@yopmail.com", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		AmountofLiquidAssets.sendKeys("45000", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		NextCTA.click();
	}
	public void addApartmentInfo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		wait.until(ExpectedConditions.elementToBeClickable(apartmentTab));
		apartmentTab.click();
		building.sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		unitNumber.sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		apartmentUnitType.sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		alternateBuilding.sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		alternateApartmentUnitType.sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		desiredMoveinDate.sendKeys("05/21/2024", Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		haveYouSeenTheUnit.sendKeys(Keys.DOWN, Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		NextCTA.click();
	}
	
}
