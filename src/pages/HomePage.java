package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibrary;
import testScripts.Motorcycle.PreconditionMotorcycle;

public class HomePage {

	WebDriver dr;
	CommonLibrary lib= new CommonLibrary();
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;	
	}
	By tricentis_logo=By.xpath("//img[@id='tricentis_logo']");
	By app_sub_title=By.xpath("//h1[@id='app_sub_title']");
	By app_version=By.xpath("//small[@id='app_version']");
	By downloadtrial=By.xpath("//a[@id='downloadtrial']");
	By visitsupport=By.xpath("//a[@id='visitsupport']");
	By searchsupport=By.xpath("//button[@id='search_button']");
	By searchsupportclick=By.xpath("//input[@id='search_form']");
	By menu=By.xpath("//div[@class='main-navigation']");
	By automobile=By.id("nav_automobile");
	By truck=By.id("nav_truck");
	By motorcycle=By.id("nav_motorcycle");
	By camper=By.id("nav_camper");
	By getquoteautomobile=By.xpath("//a[@id='get_automobile']");
	By getquotemotorcycle=By.xpath("//a[@id='get_motorcycle']");
	By getquotecamper=By.xpath("//a[@id='get_camper']");
	By getquotetruck=By.xpath("//a[@id='get_truck']");
	By tricentis_about=By.xpath("//a[@id='tricentis_about']");
	By tricentis_products=By.xpath("//a[@id='tricentis_products']");
	By tricentis_events=By.xpath("//a[@id='tricentis_events']");
	By tricentis_resources=By.xpath("//a[@id='tricentis_resources']");
	By tricentis_services=By.xpath("//a[@id='tricentis_services']");
	By nav_facebook=By.xpath("//a[@id='nav_facebook']");
	By nav_twitter=By.xpath("//a[@id='nav_twitter']");
	By nav_google=By.xpath("//a[@id='nav_google']");
	By tricentis_copyright=By.xpath("//div[text()='Copyright 2015 by Tricentis GmbH. All rights reserved.']");
	
	public boolean isTricentis_logoDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_logo);	
	}
	public boolean isApp_sub_titleDisplayed()
	{
		return lib.isElementPresent(dr, app_sub_title);	
	}
	public boolean isApp_versionDisplayed()
	{
		return lib.isElementPresent(dr, app_version);	
	}
	public boolean isDownloadtrialDisplayed()
	{
		return lib.isElementPresent(dr, downloadtrial);	
	}
	public boolean isVisitsupportDisplayed()
	{
		return lib.isElementPresent(dr, visitsupport);	
	}
	public boolean isSearchsupportDisplayed()
	{
		return lib.isElementPresent(dr, searchsupport);	
	}
	public boolean isSearchsupportclickDisplayed()
	{
		return lib.isElementPresent(dr, searchsupportclick);	
	}
	public boolean isMenuDisplayed()
	{
		return lib.isElementPresent(dr, menu);	
	}
	public boolean isAutomobileDisplayed()
	{
		return lib.isElementPresent(dr, automobile);
	}
	public boolean isTruckDisplayed()
	{
		return lib.isElementPresent(dr, truck);		
	}
	public boolean isMotorcycleDisplayed()
	{
		return lib.isElementPresent(dr, motorcycle);	
	}
	public boolean isCamperDisplayed()
	{
		return lib.isElementPresent(dr, camper);	
	}
	public boolean isGetquoteautomobileDisplayed()
	{
		return lib.isElementPresent(dr, getquoteautomobile);	
	}
	public boolean isGetquotemotorcycleDisplayed()
	{
		return lib.isElementPresent(dr, getquotemotorcycle);	
	}
	public boolean isGetquotecamperDisplayed()
	{
		return lib.isElementPresent(dr, getquotecamper);	
	}
	public boolean isGetquotetruckDisplayed()
	{
		return lib.isElementPresent(dr, getquotetruck);	
	}
	public boolean isTricentis_aboutDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_about);	
	}
	public boolean isTricentis_productsDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_products);	
	}
	public boolean isTricentis_eventsDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_events);	
	}
	public boolean isTricentis_resourcesDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_resources);	
	}
	public boolean isTricentis_servicesDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_services);	
	}
	public boolean isFacebookDisplayed()
	{
		return lib.isElementPresent(dr, nav_facebook);	
	}
	public boolean isTwitterDisplayed()
	{
		return lib.isElementPresent(dr, nav_twitter);	
	}
	public boolean isGoogleDisplayed()
	{
		return lib.isElementPresent(dr, nav_google);	
	}
	public boolean isTricentis_copyrightDisplayed()
	{
		return lib.isElementPresent(dr, tricentis_copyright);	
	}
	public String getDownloadtrialText()
	{
		return dr.findElement(downloadtrial).getText();
	}
	public String getVisitsupportText()
	{
		return dr.findElement(visitsupport).getText();
	}
	public String getSearchsupportText()
	{
		return dr.findElement(searchsupport).getText();
	}
	public String getAutomobileText()
	{
		return dr.findElement(automobile).getText();
	}
	public String getTruckText()
	{
		return dr.findElement(truck).getText();
	}
	public String getMotorcycleText()
	{
		return dr.findElement(motorcycle).getText();
	}
	public String getCamperText()
	{
		return dr.findElement(camper).getText();
	}
	public String getGetquoteautomobileText()
	{
		return dr.findElement(getquoteautomobile).getText();
	}
	public String getGetquotemotorcycleText()
	{
		return dr.findElement(getquotemotorcycle).getText();
	}
	public String getGetquotecamperText()
	{
		return dr.findElement(getquotecamper).getText();
	}
	public String getGetquotetruckText()
	{
		return dr.findElement(getquotetruck).getText();
	}
	public String getTricentis_aboutText()
	{
		return dr.findElement(tricentis_about).getText();
	}
	public String getTricentis_productsText()
	{
		return dr.findElement(tricentis_products).getText();
	}
	public String getTricentis_eventsText()
	{
		return dr.findElement(tricentis_events).getText();
	}
	public String getTricentis_resourcesText()
	{
		return dr.findElement(tricentis_resources).getText();
	}
	public String getTricentis_servicesText()
	{
		return dr.findElement(tricentis_services).getText();
	}
	public String getFacebookText()
	{
		return dr.findElement(nav_facebook).getText();
	}
	public String getTwitterText()
	{
		return dr.findElement(nav_twitter).getText();
	}
	public String getGoogleText()
	{
		return dr.findElement(nav_google).getText();
	}
	public String getTricentis_copyrightText()
	{
		return dr.findElement(tricentis_copyright).getText();
	}
	public void clickVisitsupport()
	{
		dr.findElement(visitsupport).click();
	}
	public void clickSearchsupport()
	{
		dr.findElement(searchsupport).click();
	}
	public void clickAutomobile()
	{
		dr.findElement(automobile).click();
	}
	public void clickTruck()
	{
		dr.findElement(truck).click();
	}
	public void clickCamper()
	{
		dr.findElement(camper).click();
	}
	public void clickMotorcycle()
	{
		dr.findElement(motorcycle).click();
	}
	public void clickTricentis_about()
	{
		dr.findElement(tricentis_about).click();
	}
	public void clickTricentis_products()
	{
		dr.findElement(tricentis_products).click();
	}
	public void clickTricentis_events()
	{
		dr.findElement(tricentis_events).click();
	}
	public void clickTricentis_resources()
	{
		dr.findElement(tricentis_resources).click();
	}
	public void clickTricentis_services()
	{
		dr.findElement(tricentis_services).click();
	}
	public void clickNav_facebook()
	{
		dr.findElement(nav_facebook).click();
	}
	public void clickNav_twitter()
	{
		dr.findElement(nav_twitter).click();
	}
	public void clickNav_google()
	{
		dr.findElement(nav_google).click();
	}
}
