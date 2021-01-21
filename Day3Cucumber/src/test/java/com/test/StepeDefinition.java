package com.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


 
 
public class StepeDefinition {
	
	public WebDriver driver;
	
	@Given("user is on face book logi page")
	public void user_is_on_face_book_logi_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MICROSECONDS);
    
	
	}

	@When("user enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String string1, String string2) {
	
		
		driver.findElement(By.id("username")).sendKeys("praveen05");
		driver.findElement(By.id("password")).sendKeys("praveen@05");
		
		driver.findElement(By.id("login")).click();
	}

	@When("user enter  valid {string}{string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  
		
		WebElement location = driver.findElement(By.id("location"));
		Select sc=new Select(location);
		sc.selectByVisibleText("London");
		
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select sc1=new Select(Hotels);
		sc1.selectByVisibleText("Hotel Hervey");
		
		WebElement TypeTRoom = driver.findElement(By.id("room_type"));
		Select sc2=new Select(TypeTRoom);
		sc2.selectByVisibleText("Double");
		

		WebElement Rooms = driver.findElement(By.id("room_nos"));
		Select sc3=new Select(Rooms);
		sc3.selectByVisibleText("5 - Five");
		
		WebElement date = driver.findElement(By.id("datepick_in"));
        date.clear();
		date.sendKeys("22/12/2020");
		
		WebElement year = driver.findElement(By.id("datepick_out"));
		year.clear();
		year.sendKeys("25/12/2020");
		
		
		WebElement Adultroom = driver.findElement(By.id("adult_room"));
		Select sc4=new Select(Adultroom);
		sc4.selectByVisibleText("3 - Three");
		
		WebElement Childroom = driver.findElement(By.id("child_room"));
		Select sc5=new Select(Childroom);
		sc5.selectByVisibleText("2 - Two");
		
	
	
		
	}

	@When("user click the select hotel")
	public void user_click_the_select_hotel() {
		
		
		driver.findElement(By.id("Submit")).click();
	}

	@When("user click the scearch button")
	public void user_click_the_scearch_button() {
	  

		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	
		
		
	}

	@When("user enter THE valid {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_THE_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {

		
		driver.findElement(By.id("first_name")).sendKeys("SANJAY");
		driver.findElement(By.id("last_name")).sendKeys("VINOD");
		driver.findElement(By.id("address")).sendKeys("fl no 203 avanthika appartment.");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
		WebElement creaditcardtype = driver.findElement(By.id("cc_type"));
		Select sc6=new Select(creaditcardtype);
        sc6.selectByVisibleText("VISA");
        
        WebElement creadit = driver.findElement(By.id("cc_type"));
		Select sc7=new Select(creadit);
        sc7.selectByVisibleText("VISA");
        
        
        WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select sc8=new Select(month);
        sc8.selectByVisibleText("August");
        
        WebElement year = driver.findElement(By.id("cc_exp_year"));
    	Select sc9=new Select(year);
        sc9.selectByVisibleText("2020");
            
            
            driver.findElement(By.id("cc_cvv")).sendKeys("127");
            
            driver.findElement(By.id("book_now")).click();
            
            Thread.sleep(5000);
            WebElement nn = driver.findElement(By.id("order_no"));
            nn.getAttribute("value");
            
            
        
	}
}