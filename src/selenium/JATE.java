package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATE {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/reports/reports.do");
		SATE l1=new SATE(driver);
		l1.setUsername("abc");
		Thread.sleep(2000);
		l1.setPassword("123");
		Thread.sleep(2000);
		l1.clickLogin();
		Thread.sleep(2000);
		l1.setUsername("admin");
		Thread.sleep(2000);
		l1.setPassword("manager");
		Thread.sleep(2000);
		l1.clickLogin();
		driver.close();
		
				
		
		
		
		

	}

}
