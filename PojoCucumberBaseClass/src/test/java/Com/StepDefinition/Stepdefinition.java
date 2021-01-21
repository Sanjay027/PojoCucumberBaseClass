package Com.StepDefinition;



import Com.Base.BaseClass;
import Com.pojo.Pom_Class1;
import Com.pojo.pom_Class2;
import Com.pojo.pom_Class3;
import Com.pojo.pom_Class4;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {
	Pom_Class1 p1;
	pom_Class2 p2;
	pom_Class3 p3;
	pom_Class4 p4;

	@Given("user is on adactin logi page")
	public void user_is_on_adactin_logi_page() {
		chromeBrowserLaunch();
		LaunchURL("http://adactinhotelapp.com/");

	}

	@When("user enters the valids {string} and {string}")
	public void user_enters_the_valids_and(String string, String string2) {
        p1 = new Pom_Class1();
		sendKeys(p1.getUsername(), string);
		sendKeys(p1.getPass(), string2);
		click(p1.getLoginbtn());

	}

	@When("user enter  valids {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_valids(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {

		p2 = new pom_Class2();

		selectVisibleText(p2.getLocator(), string);
		selectVisibleText(p2.getHotel(), string2);
		selectVisibleText(p2.getRoomtype(), string3);
		selectVisibleText(p2.getRoomno(), string4);
		selectVisibleText(p2.getCheckin(), string5);
		selectVisibleText(p2.getCheckout(), string6);
		selectVisibleText(p2.getAdult(), string7);
		selectVisibleText(p2.getChild(), string8);
		click(p2.getSubmit());
	}

	public void user_click_the_select_hotels() {

		p3 = new pom_Class3();
		click(p3.getRadio());

	}

	@When("user click the s" + "cearch buttons")
	public void user_click_the_scearch_buttons() {
		p3 = new pom_Class3();
		click(p3.getConti());

	}

	@When("user enter THE valids {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enter_THE_valids(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {

		p4 = new pom_Class4();

		selectVisibleText(p4.getFirstname(), string);
		selectVisibleText(p4.getLastname(), string2);
		selectVisibleText(p4.getAdress(), string3);
		selectVisibleText(p4.getCcnum(), string4);
		selectVisibleText(p4.getCardtype(), string5);
		selectVisibleText(p4.getMonth(), string6);
		selectVisibleText(p4.getYear(), string7);
		selectVisibleText(p4.getCvvnoo(), string8);
		getText(p4.getBooknow());

		driver.close();
	}

}
