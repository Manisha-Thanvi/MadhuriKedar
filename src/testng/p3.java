package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p3 {
	@AfterMethod
	public void carrot(){
	Reporter.log("from carrot after method",true);

}
	@BeforeMethod
	public void brinjal(){
		Reporter.log("from brinjal before method",true);

	}
	@Test
	public void cat(){
		Reporter.log("from cat",true);

	}
	@Test
	public void apple(){
		Reporter.log("from apple",true);

	}
	
}
