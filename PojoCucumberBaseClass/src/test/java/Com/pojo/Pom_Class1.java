package Com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Pom_Class1 extends BaseClass {
	public Pom_Class1() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}