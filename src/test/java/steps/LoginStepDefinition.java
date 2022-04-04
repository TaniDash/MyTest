package steps;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}
	
	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
	 driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
	loginPage.enterUserName(username);

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginPage.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page()  {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenshot(driver);
	}
	
	@When("^User enters \"([^\"]*)\" from database$")
	public void user_enters_as_from_database(String loginData )  {
	 
//		if(loginData.equalsIgnoreCase("username")) {
//			
//		}
//		else if (loginData.equalsIgnoreCase("password")) {
//			
//		}
//		else {
//			System.out.println("Unable to extract login data" +loginData+ "from DB");
//		}
	
		
		  switch (loginData) {
		  case "username":
		   loginPage.enterUserName(databasePage.getData("username"));
		   System.out.println("Username from DB: "+ databasePage.getData("username"));
		   break;
		  case "password":
		   loginPage.enterPassword(databasePage.getData("password"));
		   System.out.println("Password from DB: "+ databasePage.getData("password"));
		   break;

		  default:
		   System.out.println("Unable to extract login data " + loginData + "from DB");
		  
		  }  
	}
	




	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
