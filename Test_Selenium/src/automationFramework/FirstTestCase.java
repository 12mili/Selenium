package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import WebDriver;

public class FirstTestCase {
public static void main(String[] args)
{
	
	// Create a new instance of the Firefox driver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Basant\\Documents\\MySelenium\\chromedriver_win32\\chromedriver.exe");		
		//WebDriver driver = new FirefoxDriver();
			WebDriver driver = new ChromeDriver();
			
	        //Launch google.com
			driver.get("http://www.google.com");
	 
	        // Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
	 
	    driver.findElement(By.id("lst-ib")).sendKeys("Dangal");
	    driver.findElement(By.name(("btnK"))).click();
	    
			//Wait for 5 Sec
		//	Thread.sleep(5000);
			
	        // Close the driver
	        driver.quit();
	
}
}
