package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklistbox {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		WebElement day = driver.findElement(By.id("day"));
		Select l1=new Select(day);
		Thread.sleep(2000);
		l1.selectByVisibleText("15");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.id("month"));
		Select l2=new Select(month);
		Thread.sleep(2000);
		l2.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement year= driver.findElement(By.id("year"));
		Select l3=new Select(year);
		Thread.sleep(2000);
		l3.selectByVisibleText("1981");
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
