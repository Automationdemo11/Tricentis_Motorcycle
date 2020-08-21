package testScripts.Motorcycle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driver.Driver;

public class PreconditionMotorcycle extends Driver {

	protected static WebDriver dr;
	pages.HomePage homePage;
	pages.Motorcycle.EnterInsuranceData motorEnterInsuranceData;
	pages.Motorcycle.EnterVehicleData motorEnterVehicleData;
	pages.Motorcycle.EnterProductData motorEnterProductData;
	pages.Motorcycle.SelectPriceOption selectpriceoption;
	pages.Motorcycle.SendQuote sendquote;
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		dr = lib.launchBrowser(browser);
		homePage=new pages.HomePage(dr);
		motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
		motorEnterVehicleData = new pages.Motorcycle.EnterVehicleData(dr);
		motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		selectpriceoption = new pages.Motorcycle.SelectPriceOption(dr);
		sendquote = new pages.Motorcycle.SendQuote(dr);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		dr.quit();
	}
}
