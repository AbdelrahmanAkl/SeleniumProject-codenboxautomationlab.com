package tests;



import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Data.data;
import pages.SignUpPage;

public class SignUpTest extends TestBase {
	SignUpPage signuppage;
	data data;
    @BeforeMethod
    public void setupdata() {
    	signuppage = new SignUpPage(driver);
    	data = new data();
    }
    
    @Test
    public void signUpWithAValidData() {
    	signuppage.fillFirstName(data.FirstName);
    	signuppage.fillLastName(data.LastName);
    	signuppage.fillEmailAddress(data.ChangableEmailAddress);
    	signuppage.enterPhoneNumber(data.phone);
    	signuppage.selectCourse(data.course);
    	signuppage.selectMonth(data.Month);
    	signuppage.selectHowYouKnowUs();
    	signuppage.clickonRegisterButton();
    	Assert.assertTrue(driver.findElement(signuppage.AssertionMessage).isDisplayed());
    }
    
    @Test
    public void signUpWithInvalidData() {
    	signuppage.fillFirstName("");
    	signuppage.fillLastName("");
    	signuppage.fillEmailAddress("");
    	signuppage.enterPhoneNumber("");
    	signuppage.selectCourse("");
    	signuppage.selectMonth("");
    	signuppage.selectHowYouKnowUs();
    	signuppage.clickonRegisterButton();
    	Assert.assertEquals(driver.findElement(signuppage.ErrorMessage).getText(),signuppage.errorMessage);
    }
    
    
    @Test
    public void signUpWithInvalidFistrstName() {
    	signuppage.fillFirstName(data.InValidFirstName);
    	signuppage.fillLastName(data.LastName);
    	signuppage.fillEmailAddress(data.ChangableEmailAddress);
    	signuppage.enterPhoneNumber(data.phone);
    	signuppage.selectCourse(data.course);
    	signuppage.selectMonth(data.Month);
    	signuppage.selectHowYouKnowUs();
    	signuppage.clickonRegisterButton();
    }
    
    @Test
    public void signUpWithFistAndLastNameWithTheSameData() {
    	signuppage.fillFirstName(data.FirstName);
    	signuppage.fillLastName(data.FirstName);
    	signuppage.fillEmailAddress(data.ChangableEmailAddress);
    	signuppage.enterPhoneNumber(data.phone);
    	signuppage.selectCourse(data.course);
    	signuppage.selectMonth(data.Month);
    	signuppage.selectHowYouKnowUs();
    	signuppage.clickonRegisterButton();
    }
    
    @Test
    public void signUpWithTheSameEmailforTheSecondTime() {
    	signuppage.fillFirstName(data.FirstName);
    	signuppage.fillLastName(data.LastName);
    	signuppage.fillEmailAddress(data.email);
    	signuppage.enterPhoneNumber(data.phone);
    	signuppage.selectCourse(data.course);
    	signuppage.selectMonth(data.Month);
    	signuppage.selectHowYouKnowUs();
    	signuppage.clickonRegisterButton();
    }
    
    @Test
    public void signUpWithInvalidPhoneNumber() {
    	signuppage.fillFirstName(data.FirstName);
    	signuppage.fillLastName(data.LastName);
    	signuppage.fillEmailAddress(data.email);
    	signuppage.enterPhoneNumber(data.InValidPhone);
    	signuppage.selectCourse(data.course);
    	signuppage.selectMonth(data.Month);
    	signuppage.selectHowYouKnowUs();
    	signuppage.clickonRegisterButton();
    }
    
    
    
    
    
    
}

