package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	 POMFactory factory = new POMFactory();
	 
	 @When("User click on Sign in option")
	 public void userClickOnSignInOption() {
		 click(factory.homePage().signInOption);
		 logger.info("user clicked sign in");
	 }
	 
	 @And("User enter email {string} and password {string}")
	 public void userEnterEmailAndPassword(String emailValue, String password) {
		 sendText(factory.signInPage().email, emailValue);
		 sendText(factory.signInPage().password, password);
		 logger.info("user entered email and password");
	 }
	 
	 @And("User click on login button")
	 public void userClickOnLoginButton() {
		 click(factory.signInPage().loginButton);
		 logger.info("user clicked on login button");
	 }
	 
	 @Then("User should be logged in into Account")
	 public void userShouldLoggedIntoAccount() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		 logger.info("user logged into account");
		 
	 }
	 
	 @When("User click on Create New Account button")
	 public void userClickOnCreateNewAccountButton() {
		 click(factory.signInPage().createNewAccountButton);
		 logger.info("user clicked on Create New Account button");
	 }
	 
	 @When("User fill the signUp information with below data")
	 public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		 List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		 sendText(factory.signInPage().createNewAccountNameField, data.get(0).get("name"));
		 sendText(factory.signInPage().createNewAccountEmailField, data.get(0).get("email"));
		 sendText(factory.signInPage().createNewAccountPassField, data.get(0).get("password"));
		 sendText(factory.signInPage().createNewAccountConfPassField, data.get(0).get("confirmPassword"));
		 logger.info("user filled the sign up information form");
		 
	 }
	 
	 @When("User click on SignUp button")
	 public void userClickOnSignUpButton() {
		 click(factory.signInPage().singUpButton);
		 logger.info("user clicked on SignUp button");
	 }
	 
	 
	 


}
