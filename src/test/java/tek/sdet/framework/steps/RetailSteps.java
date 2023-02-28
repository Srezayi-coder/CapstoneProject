package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility{

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
		logger.info("user  clicked on all section");
	}
	
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionPresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().sideBar;
		for(int i = 0; i < departmentSection.get(0).size(); i++) {
		for(WebElement element: dept) {
			if(element.getText().equals(departmentSection.get(0).get(i))) {
				Assert.assertTrue(element.isDisplayed());
				logger.info(element.getText() + " The item is present");
		}
		
		
	}
	
}
}
}
