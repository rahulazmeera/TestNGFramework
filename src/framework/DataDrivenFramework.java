package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataDrivenFramework {
	@Test
	public void Username() throws IOException{
		//fro data driven frame work now give the file loction by fileinputstream
		
		//create property method hear
		Properties prop=new Properties();
		
		FileInputStream File=new FileInputStream("/home/rahul/workspace/TestNG/src/datadriver.properties");
		
		prop.load(File);
		
		System.out.println(prop.getProperty("username"));
		
		
		
	}

}
