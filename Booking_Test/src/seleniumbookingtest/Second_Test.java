package seleniumbookingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Second_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver\\geckodriver.exe" );  
        
	    DesiredCapabilities capabilitiesDesired = DesiredCapabilities.firefox();  
	    capabilitiesDesired.setCapability("marionette", true);  
	    WebDriver driver = new FirefoxDriver(capabilitiesDesired); 
	    
	    driver.navigate().to("http://booking.com");
	    WebDriverWait wait = new WebDriverWait(driver, 15, 100);
	     
	    driver.findElement(By.id("ss")).sendKeys("Limerick");
	        
	    driver.findElement(By.className("xp__dates-inner")).click();
	       
	    //driver.findElement(By.cssSelector(".bui-calendar__control bui-calendar__control--next")).click();
	    //driver.findElement(By.cssSelector(".calendar-next")).click();
	     
	    
	    driver.findElement(By.cssSelector("div.bui-calendar__control:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div.bui-calendar__control:nth-child(2)")).click();
	    
	    LocalTime timeCurrent = LocalTime.now();
	    System.out.println("The current time of day: " + timeCurrent);
	    
	    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    Date date = new Date();
	    String dateToday = dateFormat.format(date);
	    System.out.println("Today's date is " + dateToday);
	       
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'xp__dates__checkin')]//span[contains(@class, 'calendar-restructure-sb')]"))).click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='xp-calendar']//table[@class='bui-calendar__dates']//tr//td[@data-date='2021-12-29']"))).click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='xp-calendar']//table[@class='bui-calendar__dates']//tr//td[@data-date='2021-12-30']"))).click();
	    
	    driver.findElement(By.className("xp__input")).click();  
	   
	    driver.findElement(By.className("sb-searchbox__button")).click();
	    
	    // this pause is only to prevent to exit the code immediately, if you want to see yhe result before page closes
	    Thread.sleep(3000);
	    driver.quit();

	}


}
