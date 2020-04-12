package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P4 {
	@BeforeClass
	public void bc(){
	System.out.println("before class");

}	
	@AfterClass
	public void ac(){
		System.out.println("after class");
	
	
}
	@AfterMethod
	public void af(){
	System.out.println("after method");	

}
	@BeforeMethod
	public void bm(){
	System.out.println("before method");	

}
	@Test
	public void method3(){
	System.out.println("method3");
	}
	@Test
	public void method4(){
	System.out.println("method4");
	
	}	
}
