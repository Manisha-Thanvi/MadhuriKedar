package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime2 {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("https://demo.actitime.com/reports/reports.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Create Chart:']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='All Staff'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Export to PDF']")).click();
		Thread.sleep(2000);
		WebElement radio1=driver.findElement(By.xpath("//lable[text()='Selected Staff']"));
		radio1.click();
		driver.findElement(By.xpath("//span[.='Users Without Department']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Apply']")).click();
		
		
		
		
		

	}

}
