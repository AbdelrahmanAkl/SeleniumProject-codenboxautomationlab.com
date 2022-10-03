package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage{

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	By firstName = By.id("nf-field-17");
	By lastName  = By.id("nf-field-18");
	By email = By.id("nf-field-19");
	By phone = By.id("nf-field-20");
	By course = By.id("nf-field-22");
	By month =By.id("nf-field-24");
	By knowUs = By.xpath("(((//*[@class=\"nf-field-element\"])[10])//li)[2]");
	By RegisterButton = By.id("nf-field-15");
    public By AssertionMessage =By.xpath("//*[@class=\"nf-response-msg\"]/p");
    public By ErrorMessage = By.xpath("//*[@id=\"nf-error-23\"]/div");
    public String errorMessage = "This is a required field."; 



	public void fillFirstName(String firstName) {
		sendKey(this.firstName, firstName);
	}
	public void fillLastName(String lastName) {
		sendKey(this.lastName, lastName);
	}
	public void fillEmailAddress(String email) {
		sendKey(this.email, email);
	}
	public void enterPhoneNumber(String phone) {
		sendKey(this.phone, phone);
	}
	public void selectCourse(String course) {
		sendKey(this.course, course);
	}
	public void selectMonth(String month) {
		Select options = new Select(driver.findElement(this.month));
		options.selectByVisibleText(month);
	}
	public void selectHowYouKnowUs() {
		clickElement(knowUs);
	}
	public void clickonRegisterButton() {
		clickElement(RegisterButton);
	}
	
}

