package org.net;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	WebDriver driver;
	
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\G Sree Mamatha\\eclipse-workspace\\cucumber\\Cucumber21\\src\\test\\resources\\login.feature");
		
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  
	}
	

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
	  driver.findElement(By.id("email")).sendKeys("sanjay");
	  driver.findElement(By.id("pass")).sendKeys("vinod");
	  
	}

	@Then("user should click on login button")
	public void user_should_click_on_login_button() {
	   
		driver.findElement(By.id("login")).click();
		
		
	}

	@Then("user should click logout button")
	public void user_should_click_logout_button() {
	    driver.close();
	}



	}


