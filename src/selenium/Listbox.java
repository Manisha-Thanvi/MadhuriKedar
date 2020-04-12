package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/A/Desktop/a.html");
		WebElement l1=driver.findElement(By.id("oberoi"));
		Select oberoi= new Select(l1);
		System.out.println(oberoi.isMultiple());//trueZ
		Thread.sleep(2000);
		oberoi.selectByIndex(2);
		Thread.sleep(2000);
		List<WebElement> oberoiOptions = oberoi.getOptions();
		for(int i=0;i<oberoiOptions.size();i++){
			System.out.println(oberoiOptions.get(i).getText());
			}
		oberoi.selectByVisibleText("chai");
		Thread.sleep(1000);
		oberoi.selectByValue("bo");
		Thread.sleep(1000);
		oberoi.selectByIndex(1);
		Thread.sleep(2000);
		WebElement firstSelectedOption = oberoi.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		Thread.sleep(2000);
		driver.close();		
		
		
		
		
		
		
		
		
		
		

	}

}
