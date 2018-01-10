package automationFramework;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Basant\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com");
		driver.manage().window().maximize();
		String bob = driver.getTitle();
		System.out.println(bob);
		 String camp = driver.getCurrentUrl();
		 System.out.println(camp);
		 driver.quit();
		
	   
	
	}

}
