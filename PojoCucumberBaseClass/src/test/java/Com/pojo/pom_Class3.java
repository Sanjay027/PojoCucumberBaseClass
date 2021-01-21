package Com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class pom_Class3  extends BaseClass{

	
	public pom_Class3() {
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy (id ="continue")
	private WebElement conti;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;

		
		
		
	}
	}
