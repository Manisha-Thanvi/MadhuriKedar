package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printPopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(3000);
		 Robot r = new  Robot();
		 Thread.sleep(3000);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_P);
		 Thread.sleep(3000);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_TAB);
          Thread.sleep(2000);
         r.keyPress(KeyEvent.VK_TAB);
         Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		  driver.close();
		  
		 
		 
		 
		 
    	
    	
    	
    	
    	

	}

}
