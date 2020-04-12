package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("manishathanvi@gmail.com");;
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		driver.findElement(By.name("password")).sendKeys("aditi@0313");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		driver.findElement(By.name("//@role='button'][3]")).click();
		Thread.sleep(2000);
		WebElement compose = driver.findElement(By.xpath("//div[@role='button']"));
		compose.sendKeys("hi");
		driver.findElement(By.xpath("//a[contains(.,'Sign out')]")).click();
		Thread.sleep(3000);
		driver.close();
				
		
	}

}
