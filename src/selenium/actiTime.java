package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/reports/reports.do");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	driver.findElement(By.xpath("//div[.='Create Chart:']")).click();
	driver.findElement(By.xpath("//div[.='Add to Dashboard']")).click();
	WebElement chartname=driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']"));
    chartname.sendKeys("Timing chart");
    Thread.sleep(2000);
    chartname.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']")).click();
    driver.findElement(By.xpath("//div[@id='closeCateChartLightboxButton']")).click();
    driver.close();
    
    
	}

}
