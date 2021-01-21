package com.stepdefinitionfile;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacatinStepdefinition  {

	WebDriver driver;
	
	@Given("user is on adactin logi page")
	public void user_is_on_adactin_logi_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	   
	}

	@When("user enters the valids {string} and {string}")
	public void user_enters_the_valids_and(String string1, String string2) {
		
	   driver.findElement(By.id("username")).sendKeys(string1);
	   driver.findElement(By.id("password")).sendKeys(string2);
	   driver.findElement(By.id("login")).click();
		
	}
      
	@When("user enter  valids {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_valids(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	  
		Thread.sleep(2000);
		 
		WebElement LOCATION = driver.findElement(By.id("location"));
	     Select s = new Select(LOCATION);
	     s.selectByVisibleText(string);
	     
	     WebElement hotel = driver.findElement(By.id("hotels"));
	     Select s2 = new  Select(hotel);
	     s2.selectByVisibleText(string2);
	     
	     WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s3 = new Select(roomtype);
		s3.selectByVisibleText(string3);
		
		WebElement noofroom = driver.findElement(By.id("room_nos"));
		Select s4 = new  Select(noofroom);
		s4.selectByVisibleText(string4);
		
		driver.findElement(By.id("datepick_in")).sendKeys(string5);
	
		
	    driver.findElement(By.id("datepick_out")).sendKeys(string6);
		
		Thread.sleep(2000);
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		  Select s7 = new Select(adult);
	      s7.selectByVisibleText(string7);
				
		WebElement child = driver.findElement(By.id("child_room"));
			Select s8 = new Select(child);
			s8.selectByVisibleText(string8);
			
	}
	
	@When("user click the select hotels")
	public void user_click_the_select_hotels() throws InterruptedException {
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("Submit")).click();
	   
		
		
	}

	@When("user click the scearch buttons")
	public void user_click_the_scearch_buttons() {
	 
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
	}

	@When("user enter THE valids {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_THE_valids(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   
	   driver.findElement(By.id("first_name")).sendKeys(string);
	   
		
	   driver.findElement(By.id("last_name")).sendKeys(string2);
	  
	   
	   driver.findElement(By.id("address")).sendKeys(string3);
	
	   
	   driver.findElement(By.id("cc_num")).sendKeys(string4);
	   
	   WebElement cardtype = driver.findElement(By.id("cc_type"));
	   Select s9 = new Select(cardtype);
	   s9.selectByVisibleText(string5);
	   
	   WebElement month = driver.findElement(By.id("cc_exp_month"));
	   Select s10 = new Select(month);
	   s10.selectByVisibleText(string6);
	   
	   WebElement year = driver.findElement(By.id("cc_exp_year"));
	   Select s11 = new Select(year);
	   s11.selectByVisibleText(string7);
	   
	   driver.findElement(By.id("cc_cvv")).sendKeys(string8);
			   
	   
	   driver.findElement(By.id("book_now")).click();
	 
	   WebElement orderno = driver.findElement(By.id("order_no"));
	   System.out.println(orderno);
			   
	   
	   
	}

	
	
	
	
	
	
	
	
	
	

	
}
