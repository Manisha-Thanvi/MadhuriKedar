package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/A/Desktop/Fileupload.html");
	File f=new File("./CV/resume.txt");
	
	String absolutepath = f.getAbsolutePath();
	System.out.println(absolutepath);
	Thread.sleep(6000);
	WebElement browsebutton= driver.findElement(By.id("s1"));
	browsebutton.sendKeys(absolutepath);
	Thread.sleep(6000);
	 driver.close();
    
    
    
    
	
	
	
	
	

	}

}
