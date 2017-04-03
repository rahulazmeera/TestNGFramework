package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class frameworktestingone {
	
	
	//hear the testing frame work starts and there no need of main method in this 
	
	//now we need to create the method for the execution
	// @ Test annotations are given to handle tests 
	@Test
	public void openingbrowser(){
		
		System.out.println("hey i am opening ");
		
		
	}
	
	//creating second method to open flightbooking
	//assigning groups as priority one or two like to test them effectievely
	@Test(groups="Priority1")
	public void flightbooking()
	{
		
		System.out.println("flight is booked");
		
	}
	//now creating before method to be executed before every test runs
	//declaring @beforemethod
	
	@BeforeMethod
	public void userIDgenerator(){
		System.out.println("hey you got new use ID");
	}
	
	//now create the thing which should run before starting the actual tests
	@BeforeTest
	public void beofretest(){
		System.out.println("come start your way now");
	}
	//now create the thing which should run after every test was completes 
	@AfterTest
	public void aftertest(){
		System.out.println("just get lost your work has done");
	}
	//now creating the @aftermethod to run every time after each method
	@AfterMethod
	public void aftermethod(){
		System.out.println("Hey i destroed everything ");
		
	}
	@Test
	@Parameters({"UsereID"})
	public void Enterusename(String userid){
		
		System.out.println(userid);
		
		
	}
	
	

}
