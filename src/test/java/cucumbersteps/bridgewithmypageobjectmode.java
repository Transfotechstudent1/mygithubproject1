package cucumbersteps;

import AllHtmlPages.homepage;
import AllHtmlPages.registrationpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bridgewithmypageobjectmode {
	
	
	@Given("^I Go to MCT Website$")
	public void i_Go_to_MCT_Website() throws Throwable {
		homepage home = new homepage();
		home.OpenBrowserAndNavigateToApplication();
		
	}

	@Given("^I Start the Signup Process$")
	public void i_Start_the_Signup_Process() throws Throwable {
		homepage home = new homepage();
		home.StartSignUpProcess();
	}

	@When("^I Enter All Registration Information$")
	public void i_Enter_All_Registration_Information() throws Throwable {
		registrationpage regpage = new registrationpage();
		regpage.CompleteRegistation();
		
	}

	@Then("^I see My First and last Name$")
	public void i_see_My_First_and_last_Name() throws Throwable {
	}

	@Given("^I Start the Login Process$")
	public void i_Start_the_Login_Process() throws Throwable {
	}

	@When("^I Enter My ID and Password$")
	public void i_Enter_My_ID_and_Password() throws Throwable {
	}


	
	

}
