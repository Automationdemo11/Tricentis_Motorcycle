package driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import configuration.Configuration;
import libraries.CommonLibrary;
import libraries.Xls_Reader;

public class Driver {
	
	public CommonLibrary lib;
	public Xls_Reader xl;
	
	@BeforeSuite
	public void initialize()
	{
		lib= new CommonLibrary();
		xl= new Xls_Reader(Configuration.testDataPath);
		//Other project level initializers
	}
	
	@AfterSuite
	public void tearDown()
	{
		//Project level closers
		
	}

}
