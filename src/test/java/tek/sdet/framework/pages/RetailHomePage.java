package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy( linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allOption;
	
	@FindBy(xpath = "//h1[text()='Shop By department']")
	public WebElement sideContent;
	
	@FindBy(id = "accountLink")
	public WebElement accountOption;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;

	@FindBy(xpath = "//div[@class='sidebar__content']")
	public WebElement sidebarContent;
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sideBar;
	
	@FindBy(xpath = "//select[@class='search__select']//option")
	public List<WebElement> category;
	
	@FindBy(xpath = "//img[contains(@alt,'Kasa Outdoor Smart Plug')]")
	public WebElement smartPlugImg;
	
	@FindBy(xpath = "//select[@class='product__select']//option")
	public List<WebElement> quantity;
	
	@FindBy(id = "addToCartBtn")
	public WebElement addCartBtn;
	
	@FindBy(id = "cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id = "cartBtn")
	public WebElement cartOption;
	
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement proceedBtn;
	
	@FindBy(xpath = "//button[@class='checkout__address-btn']")
	public WebElement addShippingAddress;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addPaymentBtn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement OrderPlaceMsg;
	
	@FindBy(xpath = "//img[contains(@alt,'Apex Legends - 1,000 Apex Coins')]")
	public WebElement electronicImg;
	
}
