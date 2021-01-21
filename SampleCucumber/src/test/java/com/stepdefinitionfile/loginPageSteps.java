package com.stepdefinitionfile;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginPageSteps {

	WebDriver driver;

	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\G Sree Mamatha\\eclipse-workspace\\cucumber\\SampleCucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("http://adactinhotelapp.com/");

	}

	@When("user should enter username and password")
	public void user_should_enter_username_and_password() throws InterruptedException {
     driver.findElement(By.id("username")).sendKeys("praveen05");
     driver.findElement(By.id("password")).sendKeys("praveen@05");
     driver.findElement(By.id("login")).click();
     Thread.sleep(2000);
     WebElement location = driver.findElement(By.id("location"));
     Select  se = new Select(location);
     se.selectByVisibleText("London");
     
     WebElement hotel = driver.findElement(By.id("hotels"));
    		 Select se1 = new Select(hotel);
    		 se1.selectByVisibleText("Hotel Cornice");
     
      WebElement roomstype = driver.findElement(By.id("room_type"));
      Select se2 = new Select(roomstype);
      se2.selectByVisibleText("Deluxe");
    		  
      WebElement noofrooms = driver.findElement(By.id("room_nos"));
    		 Select se3 = new Select(noofrooms);
    		 se3.selectByVisibleText("4 - Four");
    		 
    		 driver.findElement(By.id("datepick_in")).sendKeys("27/01/2021");
    		 driver.findElement(By.id("datepick_out")).sendKeys("07/02/2021");
    		 
    		 WebElement adult = driver.findElement(By.id("adult_room"));
    		 Select se4 = new Select(adult);
    		 se4.selectByVisibleText("3 - Three");
    				
    		 WebElement child = driver.findElement(By.id("child_room"));
		     Select se5 = new Select(child);
		     se5.selectByVisibleText("3 - Three");
		  

		     driver.findElement(By.id("Submit")).click();
		     
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
      
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("sanjay");
		driver.findElement(By.id("last_name")).sendKeys("vinod");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("cc_num")).sendKeys("12345678912345674");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
         Select se6 = new Select(cardtype);
         se6.selectByVisibleText("Master Card");
         
         WebElement month = driver.findElement(By.id("cc_exp_month"));
         Select se7 = new Select(month);
         se7.selectByVisibleText("August");
         
         WebElement year = driver.findElement(By.id("cc_exp_year"));
         Select se8  = new  Select(year);
         se8.selectByVisibleText("2022");
         
         driver.findElement(By.id("cc_cvv")).sendKeys("1277");
         
         
         
         }

	@When("user should enter the valid data")
	public void user_should_enter_the_valid_data() throws InterruptedException {

		Thread.sleep(2000);
		
		driver.findElement(By.id("book_now")).click();
		
		WebElement orderno = driver.findElement(By.id("order_no"));
		String text = orderno.getAttribute("value");
		System.out.println(text);
		
		
		
	}

	@Then("user should verify the success meg")
	public void user_should_verify_the_success_meg() {

		
		String currentUrl ="http://adactinhotelapp.com/BookingConfirm.php";
		boolean b = currentUrl.contains("BookingConfirm");
	 Assert.assertTrue("ovr", b);
	 driver.quit();
	 
		
	}

}
