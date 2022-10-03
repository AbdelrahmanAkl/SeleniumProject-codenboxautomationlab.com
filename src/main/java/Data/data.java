package Data;

import com.github.javafaker.Faker;

public class data {
	
	Faker fake = new Faker();
	public String FirstName ="Abdelrahman";
	public String LastName = "Ahmed";
	public String phone= "01111111111";
	public String email ="Test@test.com"; 
	public String course ="Agile & Manual Testing";
	public String Month ="April";
	public String InValidPhone = "01125";
	public String InValidEmailAddress ="AAAA";
	public String InValidFirstName="ahmed";
	
	public String ChangableEmailAddress =fake.internet().emailAddress();
	
}
