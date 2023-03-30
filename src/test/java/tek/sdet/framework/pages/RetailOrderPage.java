package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderSection;
	
	@FindBy(xpath = "//div[@class='orders__container']/div[@class='order'][1]")
	public WebElement firstOrder;
	
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement CancelReason;
	
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement orderCancelSubmit;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelMessage;
	
	@FindBy(xpath = "//button[@id='returnBtn']")
	public WebElement returnBtn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOff;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement returnSubmitBtn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement returnReason;
	
	@FindBy(xpath = "//div[@class='return__confirm-message']")
	public WebElement returnConfirmMessage;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewMessageConfirmation;
	
}
