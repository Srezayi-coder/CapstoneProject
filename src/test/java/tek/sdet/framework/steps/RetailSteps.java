package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allOption);
		logger.info("user clicked on all section");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionPresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().sideBar;
		for (int i = 0; i < departmentSection.get(0).size(); i++) {
			for (WebElement element : dept) {
				if (element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + " The item is present");
				}

			}

		}
	}

	@And("User on {string}")
	public void userOnDepartment(String department) {
		List<WebElement> dept = factory.homePage().sideBar;
		for(WebElement element: dept) {
			if(element.getText().equals(department)) {
				element.click();
				break;
			}
		}
		
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().sideBar;
		for(int i = 0; i < departmentSection.get(0).size(); i++) {
			for(WebElement element: dept) {
				if(element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + " the items are present in department");
				}
			}
		}
		
	}
	
	@And("User change the category to {string}")
	public void userChangeTheCategory(String category) {
		List<WebElement> catg = factory.homePage().category;
		for(WebElement element: catg) {
			if(element.getText().equals(category)) {
				element.click();
				break;
			}
		}
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchBarInput, value);
		logger.info("user searched for an item");
		
	}
	
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search icon");
	}
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().smartPlugImg);
		logger.info("user clicked on item");
		
	}
	@And("User select quantity {string}")
	public void userSelectQuantity(String quantity) {
		List<WebElement> num = factory.homePage().quantity;
		for(WebElement element: num) {
			if(element.getText().equals(quantity)) {
				element.click();
				break;
			}
		}
	}
	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		
		click(factory.homePage().addCartBtn);
		logger.info("user clicked add cart button");
	}
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String cartIcon) {
		waitTillPresence(factory.homePage().cartQuantity);
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		logger.info("the cart icon quantity is changed");
	}
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartOption);
		logger.info("user clicked on cart option");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedBtn);
		logger.info("user clicked on proceed to checkout button");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddNewAddressLinkForShippingAddress() {
		click(factory.homePage().addShippingAddress);
		logger.info("user clicked add a new address for shipping address");
	}
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addPaymentBtn);
		logger.info("user clicked add a credit card or debit card for payment method");
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceOrder() {
		click(factory.homePage().placeOrderBtn);
		logger.info("user clicked on place your order");
	}
	
	@Then("a message should be displayed {string}")
	public void messageShouldBeDisplayed(String message) {
		waitTillPresence(factory.homePage().OrderPlaceMsg);
		Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlaceMsg));
		logger.info("A message is displayed");
	}
	
	@And("User change the category {string}")
	public void userChangeTheCategoryTo(String item) {
		List<WebElement> category = factory.homePage().category;
		for(WebElement element: category) {
			if(element.getText().equals(item)) {
				element.click();
				break;
			}
		}
			
		}
	
	@And("User search for item {string}")
	public void userSearchforAnItem(String value) {
		sendText(factory.homePage().searchBarInput, value);
		logger.info("user searched for an item");
	}
	
	@And("User click on a item")
	public void userClickOnAItem() {
		click(factory.homePage().electronicImg);
		logger.info("user click on an electronic item");
	}
	
	@And("User select quantity to {string}")
	public void userSelectQuantityItem(String num) {
		List<WebElement> quantity = factory.homePage().quantity;
		for(WebElement element: quantity) {
			if(element.getText().equals(num)) {
				element.click();
				break;
			}
		}
		
	}
	@And("the cart icon quantity should change {string}")
	public void cartIconQuantityShouldChangeTo(String cartIcon) {
		waitTillPresence(factory.homePage().cartQuantity);
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		logger.info("the cart icon quantity is changed");
		
	}
		
	}
	


