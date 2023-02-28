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
	
}
