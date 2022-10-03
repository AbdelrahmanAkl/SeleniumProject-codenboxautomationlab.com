package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	public final long WAIT=60;
	public BasePage(WebDriver driver)  {
		this.driver= driver;	
	}
	public void clickElement(By element)
	{   
		waitTime(element);
		driver.findElement(element).click();
	}
	public void sendKeyWithBy(By element,String value)
	{   waitTime(element);
		driver.findElement(element).sendKeys(value);
	}

	
	public void sendKey(By element,String value)
	{   waitTime(element);
		driver.findElement(element).sendKeys(value);
	}
	public void waitTime(By element) {
		WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
	}
	public void SubmitButton(By element) {
            waitTime(element);
            driver.findElement(element).submit();
	}
}


