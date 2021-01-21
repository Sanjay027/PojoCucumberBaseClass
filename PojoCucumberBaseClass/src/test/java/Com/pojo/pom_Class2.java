package Com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class pom_Class2  extends BaseClass{
	
	
	public pom_Class2() {
		
		PageFactory.initElements(driver, this);
		
		
	}
		
		@FindBy (id="location")
		private WebElement locator;
		
		@FindBy (id ="hotels")
		private WebElement hotel;
		
		@FindBy (id ="room_type")
		private WebElement roomtype;
		
		@FindBy (id ="room_nos")
		private WebElement roomno;
		
		@FindBy (id="datepick_in")
		private WebElement checkin;
		
		@FindBy (id="datepick_out")
		private WebElement checkout;
		
		@FindBy (id ="adult_room")
		private WebElement adult;
		
		@FindBy (id ="child_room")
		private WebElement child;
		
		
		@FindBy (id ="Submit")
		private WebElement submit;


		public WebElement getLocator() {
			return locator;
		}


		public WebElement getHotel() {
			return hotel;
		}


		public WebElement getRoomtype() {
			return roomtype;
		}


		public WebElement getRoomno() {
			return roomno;
		}


		public WebElement getCheckin() {
			return checkin;
		}


		public WebElement getCheckout() {
			return checkout;
		}


		public WebElement getAdult() {
			return adult;
		}


		public WebElement getChild() {
			return child;
		}


		public WebElement getSubmit() {
			return submit;
		}
		
		
		
		
		
	}
	
	


