package seleniumbookingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.*;


public class Second_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver\\geckodriver.exe" );  
        
	    DesiredCapabilities capabilitiesDesired = DesiredCapabilities.firefox();  
	    capabilitiesDesired.setCapability("marionette", true);  
	    WebDriver driver = new FirefoxDriver(capabilitiesDesired); 
	    
	    driver.navigate().to("http://booking.com");
	     
	    driver.findElement(By.id("ss")).sendKeys("Limerick");
	        
	    driver.findElement(By.className("xp__dates-inner")).click();
	    
	    // driver.findElement(By.cssSelector(".bui-calendar__control bui-calendar__control--next")).click();
	    driver.findElement(By.cssSelector(".calendar-next")).click();
	    
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'xp__dates__checkin')]//span[contains(@class, 'calendar-restructure-sb')]"))).click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='xp-calendar']//table[@class='bui-calendar__dates']//tr//td[@data-date='2021-10-24']"))).click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='xp-calendar']//table[@class='bui-calendar__dates']//tr//td[@data-date='2021-10-25']"))).click();
	    
	    driver.findElement(By.className("xp__input")).click();  
	   
	    driver.findElement(By.className("sb-searchbox__button")).click();
	    
	    //driver.close();

	}

}
