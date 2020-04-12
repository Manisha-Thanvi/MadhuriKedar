package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVtiger  {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	}


	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Vtigerpom v1=new Vtigerpom(driver);
		v1.setUsn("admin");
		Thread.sleep(2000);
		v1.setPwd("admin");
		Thread.sleep(2000);
		v1.clickSignIn();
		Thread.sleep(2000);
		driver.close();
		

	}


}
