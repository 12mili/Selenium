package automationFramework;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerLaunch {

	public static void main(String[] args) throws InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Basant\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.babiesrus.com");
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       String d = driver.getTitle();
        System.out.println(d);
         String g = driver.getCurrentUrl();
         System.out.println(g);
         driver.navigate().back();
         Thread.sleep(4000);
         driver.navigate().forward();
         Thread.sleep(4000);
         driver.navigate().refresh();
         //driver.close();
         driver.quit();

	}

}
