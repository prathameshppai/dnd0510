package com.capgemini.dnd.Cucumber.login;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class LoginStepDefination {
	
	String chromeDriverPath = "C:\\Users\\ashwapan\\Documents\\chromedriver.exe";
	WebDriver driver = null;

	@Given("I am on Drink and Delight Login Page")
	public void i_am_on_Drink_and_Delight_Login_Page() {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(
				"http://localhost:9090/drinkanddelight/loginpage.html");
	    
	}

	@When("I click on {string} button")
	public void i_click_on_button(String string) {
		System.out.println(string);
		driver.findElement(By.id("username")).sendKeys(string);
	}
	@When("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) {
		System.out.println(arg1);
		driver.findElement(By.id("password")).sendKeys(arg1);
		driver.findElement(By.name("logonForm")).submit();
	}
	@Then("The credentials should be successfully validated")
	public void the_credentials_should_be_successfully_validated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Main Menu page is opened")
	public void main_Menu_page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("I am on Drink and Delight Login page")
	public void i_am_on_Drink_and_Delight_Login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("username is not entered message is displayed")
	public void username_is_not_entered_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("password is not entered message is displayed")
	public void password_is_not_entered_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("incorrect password message is displayed")
	public void incorrect_password_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("invalid username message is displayed")
	public void invalid_username_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
