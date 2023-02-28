package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement AccountName;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement PhoneNumber;
	
	@FindBy(xpath = "//button[text() = 'Update']")
	public WebElement updateButton;
	
	@FindBy(css = "#previousPasswordInput")
	public WebElement previousPassField;
	
	@FindBy(xpath = "//input[@id = 'newPasswordInput']")
	public WebElement newPasswordField;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement AccountConfrimPassword;
	
	@FindBy(xpath = "//button[text()='Change Password']")
	public WebElement changePassword;
	
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement profile;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement PasswordMessage;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement updatedSuccessfully;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement paymentMethod;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumber;
	
	@FindBy(css = "#nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(xpath = "//button[text()='Add Your card']")
	public WebElement addCardButton;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMessage;
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editCardBtn;
	
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement card;
	
	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateCard;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentUpdateMessage;

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeOption;
	
	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement country;
	
	@FindBy(css = "#fullNameInput")
	public WebElement fullName;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement aptInput;
	
	@FindBy(css = "#cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement state;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(xpath = "//button[text()='Add Your Address']")
	public WebElement addAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressMessage;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement AddressEditBtn;
	
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdated;
	
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement addressRemoveOption;
	
	@FindBy(xpath = "//div[@class='account__address-single']")
	public WebElement detailAddress;
	
	
	
	
	
	
	
	
	
	
}
