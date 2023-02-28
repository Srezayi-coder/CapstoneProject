package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on account option");
	}
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().AccountName);
		sendText(factory.accountPage().AccountName, nameValue);
		clearTextUsingSendKeys(factory.accountPage().PhoneNumber);
		sendText(factory.accountPage().PhoneNumber, phoneValue);
		logger.info("user updated name and phone");
	}
	
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("user clicked on update button");
	}
	@Then("user profile information should be updated {string}")
	public void userProfileInformationShouldBeUpdated(String message) {
		String msg = getAttribute(factory.accountPage().updatedSuccessfully, message);
		logger.info("user profile information should be updated");
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassField, data.get(0).get("perviousPassword"));
		sendText(factory.accountPage().newPasswordField, data.get(0).get("newPassword"));
		sendText(factory.accountPage().AccountConfrimPassword, data.get(0).get("confirmPassword"));
		logger.info("user entered below infromation");
		
	}
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePassword);
		logger.info("user click on change password button");
	}
	@Then("a messgae should be displayed {string}")
	public void aMessageShouldBeDisplayed(String value) {
		String text = getAttribute(factory.accountPage().PasswordMessage, value);
		logger.info("message displayed");
		
	}
	
	@And("User click on Add a payment method link")
	public void userClickOnAddPaymentMethodLink() {
		click(factory.accountPage().paymentMethod);
		logger.info("user clicked on Add a payment method link");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumber, data.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCard, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear, data.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, data.get(0).get("securityCode"));
		logger.info("user filled debit or credit card information");
	}
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addCardButton);
		logger.info("user clicked on Add your card button");
	}
	
	@Then("message should be displayed {string}")
	public void messageShouldBeDisplayed(String message) {
		String msg = getAttribute(factory.accountPage().paymentMessage, message);
		logger.info("message should be displayed");
		
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().card);
		click(factory.accountPage().editCardBtn);
		logger.info("user clicked on Edit option of card");
	}
	
	@And("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		sendText(factory.accountPage().cardNumber, data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		sendText(factory.accountPage().nameOnCard, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear, data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		sendText(factory.accountPage().securityCode, data.get(0).get("securityCode"));
		logger.info("user edited information with below data");
		
	}
	
	@And("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCard);
		logger.info("user clicked on update your card button");
	}
	
	@Then("a message should displayed {string}")
	public void messageDisplayed(String value) {
		String message = getAttribute(factory.accountPage().paymentUpdateMessage, value);
		logger.info("message should be displayed");
	}
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().card);
		click(factory.accountPage().removeOption);
		logger.info("user clicked on remove option of card section");
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethod));
		logger.info("payment details removed");
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddress);
		logger.info("user clicked on add address option");
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().country, data.get(0).get("country"));
		
		sendText(factory.accountPage().fullName, data.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberInput, data.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput, data.get(0).get("streetAddress"));
		sendText(factory.accountPage().aptInput, data.get(0).get("apt"));
		sendText(factory.accountPage().cityInput, data.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, data.get(0).get("state"));
		sendText(factory.accountPage().zipCode, data.get(0).get("zipCode"));
		logger.info("user filled new address form with information");
	}
	
	@And("User click Add Your Address button")
	public void userClickedAddYourAddressButton() {
		click(factory.accountPage().addAddressBtn);
		logger.info("user clicked add your address button");
	}
	
	@Then("A message should be displayed {string}")
	public void addressMessagedisplayed(String message2) {
		String text = getAttribute(factory.accountPage().addressMessage, message2);
		logger.info("message should display");
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().AddressEditBtn);
		logger.info("user clicked on edit address option");
	}
	
	@And("User update new address form with below information")
	public void userUpdateNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().country, data.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullName);
		sendText(factory.accountPage().fullName, data.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, data.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, data.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().aptInput);
		sendText(factory.accountPage().aptInput, data.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, data.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, data.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		sendText(factory.accountPage().zipCode, data.get(0).get("zipCode"));
		logger.info("user updated new address form with information");
	}
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateAddressBtn);
		logger.info("user clicked update address button");
	}
	
	@Then("updated message should be displayed {string}")
	public void updateMessageDisplayed(String updateMsg) {
		String text = getAttribute(factory.accountPage().addressUpdated, updateMsg);
		logger.info("update message should display");
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().addressRemoveOption);
		logger.info("user clicked on remove option of address");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().detailAddress));
		logger.info("address details removed");
	}
}
