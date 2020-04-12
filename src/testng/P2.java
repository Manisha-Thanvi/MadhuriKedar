package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P2 {
	@AfterMethod
	public void carrot(){
	System.out.print("from carrot AfterMethod method");

}
	@BeforeMethod
	public void brinjal(){
	System.out.print("from brinjal before method");
}
	@Test
	public void cat(){
	System.out.print("from cat");
	}


	@Test
	public void apple(){
	System.out.print("from apple");
	}
}
