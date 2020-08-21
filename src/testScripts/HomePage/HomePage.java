package testScripts.HomePage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;
import libraries.CommonLibrary;
import pages.Automobile.EnterInsuranceData;
import testScripts.Motorcycle.PreconditionMotorcycle;

public class HomePage extends PreconditionMotorcycle {
	
	CommonLibrary lib = new CommonLibrary();
	
	
	pages.HomePage homePage;
	EnterInsuranceData automobileEnterInsuranceData;
	EnterInsuranceData truckEnterInsuranceData;
	EnterInsuranceData motorcycleEnterInsuranceData;
	EnterInsuranceData camperEnterInsuranceData;
	
	
	@BeforeClass
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		//dr=lib.launchBrowser(browser);
		homePage=new pages.HomePage(dr);
		automobileEnterInsuranceData= new EnterInsuranceData(dr);
		truckEnterInsuranceData= new EnterInsuranceData(dr);
		motorcycleEnterInsuranceData= new EnterInsuranceData(dr);
		camperEnterInsuranceData= new EnterInsuranceData(dr);
	}
	
	
	
	@Test(priority=-1)
	public void verifyIsHomepageVisible()
	{
		Assert.assertEquals(homePage.isTricentis_logoDisplayed(), true);
		Assert.assertEquals(homePage.isApp_sub_titleDisplayed(), true);
		Assert.assertEquals(homePage.isApp_versionDisplayed(), true);
		Assert.assertEquals(homePage.isDownloadtrialDisplayed(), true);
		Assert.assertEquals(homePage.isVisitsupportDisplayed(), true);
		Assert.assertEquals(homePage.isSearchsupportDisplayed(), true);
		Assert.assertEquals(homePage.isSearchsupportclickDisplayed(), true);
		Assert.assertEquals(homePage.isMenuDisplayed(), true);
		Assert.assertEquals(homePage.isAutomobileDisplayed(), true);
		Assert.assertEquals(homePage.isTruckDisplayed(), true);
		Assert.assertEquals(homePage.isMotorcycleDisplayed(), true);
		Assert.assertEquals(homePage.isCamperDisplayed(), true);
		Assert.assertEquals(homePage.isGetquoteautomobileDisplayed(), true);
		Assert.assertEquals(homePage.isGetquotemotorcycleDisplayed(), true);
		Assert.assertEquals(homePage.isGetquotecamperDisplayed(), true);
		Assert.assertEquals(homePage.isGetquotetruckDisplayed(), true);
		Assert.assertEquals(homePage.isTricentis_aboutDisplayed(), true);
		Assert.assertEquals(homePage.isTricentis_productsDisplayed(), true);
		Assert.assertEquals(homePage.isTricentis_eventsDisplayed(), true);
		Assert.assertEquals(homePage.isTricentis_resourcesDisplayed(), true);
		Assert.assertEquals(homePage.isTricentis_servicesDisplayed(), true);
		Assert.assertEquals(homePage.isFacebookDisplayed(), true);
		Assert.assertEquals(homePage.isTwitterDisplayed(), true);
		Assert.assertEquals(homePage.isGoogleDisplayed(), true);
		Assert.assertEquals(homePage.isTricentis_copyrightDisplayed(), true);
	}
	@Test(priority=0)
	public void verifyHomepagetext()
	{		
		Assert.assertEquals(homePage.getDownloadtrialText(),"Download Trial");
		Assert.assertEquals(homePage.getVisitsupportText(),"Visit Support!");
		Assert.assertEquals(homePage.getSearchsupportText(),"");
		Assert.assertEquals(homePage.getAutomobileText(),"Automobile");
		Assert.assertEquals(homePage.getTruckText(),"Truck");
		Assert.assertEquals(homePage.getMotorcycleText(),"Motorcycle");
		Assert.assertEquals(homePage.getCamperText(),"Camper");
		//Assert.assertEquals(homePage.getGetquoteautomobileText(),"Get a quote");
		//Assert.assertEquals(homePage.getGetquotemotorcycleText(),"Get a quote");
		//Assert.assertEquals(homePage.getGetquotecamperText(),"Get a quote");
		//Assert.assertEquals(homePage.getGetquotetruckText(),"Get a quote");
		Assert.assertEquals(homePage.getTricentis_aboutText(),"About");
		Assert.assertEquals(homePage.getTricentis_productsText(),"Products");
		Assert.assertEquals(homePage.getTricentis_eventsText(),"Events & Webinars");
		Assert.assertEquals(homePage.getTricentis_resourcesText(),"Resources");
		Assert.assertEquals(homePage.getTricentis_servicesText(),"Services");
		Assert.assertEquals(homePage.getFacebookText(),"");
		Assert.assertEquals(homePage.getTwitterText(),"");
		Assert.assertEquals(homePage.getGoogleText(),"");
		Assert.assertEquals(homePage.getTricentis_copyrightText(),"Copyright 2015 by Tricentis GmbH. All rights reserved.");
	}
	@Test(priority=1)
	public void verifyIsSearchsupportClickable() throws InterruptedException
	{
	String parent=dr.getWindowHandle();
	System.out.println(parent);
	dr.findElement(By.id("search_form")).sendKeys("BMW");
	dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
	//WAY3= By finding unique elements in child windows.
	Set<String> wins=dr.getWindowHandles();
	for(String w:wins)
	{
		dr.switchTo().window(w);
		List<WebElement> elements =  dr.findElements(By.xpath("//input[@value='BMW']"));
		if(elements.size()>0)
		{
			break;
		}
	}
	//3.Click on Login/Register link
	Thread.sleep(2000);
	dr.findElement(By.xpath("//a[text()='Login/Register']")).click();
	dr.findElement(By.id("user_name")).sendKeys("anshika@gmail.com");
	dr.close();
	dr.switchTo().window(parent);
	}
	@Test(priority=2)
	public void verifyIsVisitsupportClickable() throws InterruptedException
	{
		homePage.clickVisitsupport();
		Thread.sleep(2000);
		navigateToHomePage();
		
	}
	@Test(priority=3)
	public void verifyIsAutomobileClickable() throws InterruptedException
	{
		homePage.clickAutomobile();
		Thread.sleep(2000);
		Assert.assertEquals(automobileEnterInsuranceData.isMakeDropdownDisplayed(), true);
	}
	@Test(priority=4)
	public void verifyIsTruckClickable() throws InterruptedException
	{
		homePage.clickTruck();
		Thread.sleep(2000);
		Assert.assertEquals(truckEnterInsuranceData.isMakeDropdownDisplayed(), true);
	}
	@Test(priority=5)
	public void verifyIsMotorcycleClickable() throws InterruptedException
	{
		homePage.clickMotorcycle();		
		Thread.sleep(2000);
		Assert.assertEquals(camperEnterInsuranceData.isMakeDropdownDisplayed(), true);
	}
	@Test(priority=6)
	public void verifyIsCamperClickable() throws InterruptedException
	{
		homePage.clickCamper();
		Thread.sleep(2000);
		lib.navigateTohomePage(dr);
			
		//Put Validation -- Need to add elements in enterInsuranceData class under Truck
	}
	@Test(priority=7)
	public void verifyIsTricentis_aboutClickable() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,250)", "");
		homePage.clickTricentis_about();
		Thread.sleep(2000);
		lib.navigateTohomePage(dr);
	}
	@Test(priority=8)
	public void verifyIsTricentis_productsClickable() throws InterruptedException
	{
		homePage.clickTricentis_products();
		Thread.sleep(2000);
		lib.navigateTohomePage(dr);
	}
	@Test(priority=9)
	public void verifyIsTricentis_eventsClickable() throws InterruptedException
	{
		homePage.clickTricentis_events();
		Thread.sleep(2000);
		lib.navigateTohomePage(dr);
	}
	@Test(priority=10)
	public void verifyIsTricentis_resourcesClickable() throws InterruptedException
	{
		homePage.clickTricentis_resources();
		Thread.sleep(2000);
		lib.navigateTohomePage(dr);
	}
	@Test(priority=11)
	public void verifyIsTricentis_servicesClickable() throws InterruptedException
	{
		homePage.clickTricentis_services();
		Thread.sleep(2000);
		lib.navigateTohomePage(dr);
	}
	@Test(priority=12)
	public void verifyIsNav_facebookClickable() throws InterruptedException
	{
		homePage.clickNav_facebook();
		Thread.sleep(2000);
		navigateToHomePage();
	}
	@Test(priority=13)
	public void verifyIsNav_twitterClickable() throws InterruptedException
	{
		homePage.clickNav_twitter();
		Thread.sleep(2000);
		navigateToHomePage();
	}
	@Test(priority=14)
	public void verifyIsNav_googleClickable() throws InterruptedException
	{
		homePage.clickNav_google();
		Thread.sleep(2000);
		navigateToHomePage();
	}
	
	public void navigateToHomePage()
	{
		String parent=dr.getWindowHandle();
		Set<String> wins=dr.getWindowHandles();
		for(String w:wins)
		{
			if (!(w.equals(parent)))
			{		
				dr.switchTo().window(w);
				dr.close();
			}
		}
		dr.switchTo().window(parent);
	}

}
