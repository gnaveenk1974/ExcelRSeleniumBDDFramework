package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import pages.LoginPage;

public class FBLoginPageSteps {
	
		FBLoginPage lp=new FBLoginPage();
		@Given("user in on the login page")
		public void isBrowserOpen() {
			lp.initialiazation();
		}
//		@When("user enters username {string} and password {string}")
//		public void enterDetails(String username,String password) {
//			lp.userDetails(username, password);
//		}
		@Then("user clicks on the login button")
		public void loginStep() {
			lp.login();
		}
		@And("user shoud be logged in successfully")
		public void closeBroswer() {
			lp.tearDown();
		}
		@When("^user enters username (.+) and password (.+)$")
		public void enterCreds(String username,String password) {
			lp.userDetails(username, password);
		}
		
}
