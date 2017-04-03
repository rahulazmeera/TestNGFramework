package framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class anootatintypes {
	//wrinting the tests that need to be run before the every test cases and every classes and as well before the
	//@Before Siut runs before every everything in the suit
	@BeforeSuite
	public void beforesuit(){
		
		System.out.println("Hey i am the fist candidate ");
	}
	
   //crete the after suit method which need to be run after the whole test cases are tested
	@AfterSuite
	public void aftersuit(){
		
		System.out.println("Hey i destroid every thing again after your methods ");
	}
	
	
	@Test
	public void checkvalidCreditard(){
		
		System.out.println("hey your card is valid ");
	}
	
	//creat the dependency in the testng to assign the priritization
	//simply just declare the dependency of the method to execue
	//what if case the fist test is fails so we want to make the below method test to run always
	//so jest give its (alwaysRun=true)
	@Test(dependsOnMethods={"checkvalidCreditard"},alwaysRun=true)
	public void makethePayment(){
		System.out.println("hey 30 $ was charged for you shit man ");
		
	}
	//this is the case when some test that cant run or having problem then they can be skipped from the test
	//use (enabled=false)if its set true then it runs again
	//to make this test case to run in the definite amount of time period then we should give it the time 
	//limit to be executed in y(timeout=5000)
	@Test(enabled=false, timeOut=500)
	public void skipmethod(){
		
		System.out.println("i miss the chance");
	}
	
	
	
	
	
}
