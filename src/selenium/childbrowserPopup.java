package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserPopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}
	 public static void main(String[]args)throws InterruptedException{
		  WebDriver driver=new ChromeDriver();
		   driver.get("https://www.naukri.com");
		  Set<String> allWindowHandles = driver.getWindowHandles();
		  int count=allWindowHandles.size();
		  System.out.println(count);
		  for(String v:allWindowHandles){
			 driver.switchTo().window(v);
			 System.out.println(driver.getTitle()); 
			 Thread.sleep(3000);
			 driver.close();
			 
	 }
		   
			 
		  }
	 }
		   
	
