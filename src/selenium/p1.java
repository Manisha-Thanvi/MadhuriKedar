package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}
	   public static void main(String[]args)throws InterruptedException{
		   WebDriver driver=new ChromeDriver();
		   driver.get("https:www.google.com");
		   driver.findElement(By.id("lga")).sendKeys("manishathanvi@gmail.com");
		   driver.findElement(By.xpath("//img[@class=gb_ua]")).click();	   
		   Thread.sleep(3000);
		  driver.close();
		   
		   
	   }
}
