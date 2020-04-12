package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggetion {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.cleartrip.com");
		driver.manage().window().maximize();
		
		WebElement tb=driver.findElement(By.xpath("//input[@id='FromTag']"));
		tb.sendKeys("ban");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//input[@id='FromTag']"));
		System.out.println("No. of suggetions:"+allsugg.size());
		for(int i=0;i<allsugg.size();i++){
	
			System.out.println(allsugg.get(i).getText());
					
		Thread.sleep(5000);
		allsugg.get(i).click();
		}
			 Thread.sleep(2000);
			 driver.close();
			 
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
				
				
				
		
		

	}


