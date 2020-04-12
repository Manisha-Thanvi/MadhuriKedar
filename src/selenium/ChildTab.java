package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildTab {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}
	 public static void main(String[]args)throws InterruptedException{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  String parent = driver.getWindowHandle();
		  driver.get("http://www.demo.actitime.com/login.do");
		  driver.findElement(By.linkText("actiTIME Inc."));click();
		   Thread.sleep(2000);
		   Set<String> allWindowHandles = driver.getWindowHandles();
		   int count=allWindowHandles.size();
		  System.out.println(count);
		  for(String v:allWindowHandles){
			 driver.switchTo().window(v);
			 System.out.println(driver.getTitle()); 
			  }
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie-button--got-it"))).click();
		  driver.close();
		  Thread.sleep(4000);
		  driver.switchTo().window(parent);
		  driver.close();
		    }
	private static void click() {
		// TODO Auto-generated method stub
		
	}
		
	}

	
	 

