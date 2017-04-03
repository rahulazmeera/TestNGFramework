package framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBYtestNG {
	
	//give the data provider name 
	@Test (dataProvider="getdata")
	public void useid(String username, String password, String id){
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//created two dimensional array for providing the data to the data needed test
		Object[][] data=new Object[3][3];
		
		data[0][0]="hello";
		data[0][1]="its me";
		data[0][2]="12";
		
		data[1][0]="hello";
		data[1][1]="its me";
		data[1][2]="12";
		
		data[2][0]="hello";
		data[2][1]="its me";
		data[2][2]="12";
		
	
		return data;
		
	}
	
	
	
	

}
