package seleniumbookingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Second_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver\\geckodriver.exe" );  
        
	    DesiredCapabilities capabilitiesDesired = DesiredCapabilities.firefox();  
	    capabilitiesDesired.setCapability("marionette", true);  
	    WebDriver driver = new FirefoxDriver(capabilitiesDesired); 
	    
	    driver.navigate().to("http://booking.com");
	     
	    driver.findElement(By.id("ss")).sendKeys("Limerick");
	    
	    driver.findElement(By.className("xp__input")).click();  
	    
	    driver.findElement(By.className("xp__dates-inner")).click();
	    
	    driver.findElement(By.className("sb-searchbox__button")).click();
	    
	    //driver.close();

	}

}
