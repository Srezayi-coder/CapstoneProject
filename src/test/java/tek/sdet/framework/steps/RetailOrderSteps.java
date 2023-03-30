package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();

	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderSection);
		logger.info("user clicked on order section");
	}
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().firstOrder));
		logger.info("user clicked on first order in list");
		
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("user clicked on cancel the order button");
		
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelReason) {
		selectByVisibleText(factory.orderPage().CancelReason, cancelReason);
		logger.info("user selected the cancelation reason");
		
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().orderCancelSubmit);
		logger.info("user clicked on cancel order button");
		
	}
	
	@Then("a cancelation message should be displayed {string}")
	public void cancelationMessageShouldBeDisplayed(String cancelMessage) {
		waitTillPresence(factory.orderPage().cancelMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelMessage));
		logger.info("a cancelation message is displayed");
		
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemButton() {
		click(factory.orderPage().returnBtn);
		logger.info("user clicked on return item button");
		
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReason) {
		selectByVisibleText(factory.orderPage().returnReason, returnReason);
		logger.info("user selected the return reason");
		
	}
	
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String service) {
		selectByVisibleText(factory.orderPage().dropOff, service);
		logger.info("user selected the drop of service");
		
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnSubmitBtn);
		logger.info("user clicked on return order button");
		
	}
	
	@Then("a return message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String returnMessage) {
		waitTillPresence(factory.orderPage().returnConfirmMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnConfirmMessage));
		logger.info("a return message is displayed");
		
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("user clicked on review button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadline(String headLine, String description) {
		sendText(factory.orderPage().headlineInput, headLine);
		sendText(factory.orderPage().descriptionInput, description );
		logger.info("user wrote a review");
		
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("user cliked add review button");
		
	}
	
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reivewMessage) {
		waitTillPresence(factory.orderPage().reviewMessageConfirmation);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMessageConfirmation));
		logger.info("a review message is displayed");
		
		
	}
}
