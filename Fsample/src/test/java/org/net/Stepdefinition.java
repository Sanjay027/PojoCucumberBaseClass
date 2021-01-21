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
	
	
	@Given("user is on face book logi page")
	public void user_is_on_face_book_logi_page() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\G Sree Mamatha\\eclipse-workspace\\cucumber\\Fsample\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	
		
	
	}

	@When("user enters the valid user name and password")
	public void user_enters_the_valid_user_name_and_password() {
	   driver.findElement(By.id("email")).sendKeys("praveen");
       driver.findElement(By.id("pass")).sendKeys("vinod");
      
	}

	@Then("user should click on login buttom")
	public void user_should_click_on_login_buttom() {
	    driver.findElement(By.id("u_0_b")).click();
	    driver.close();
		
		
	}
	
}
