package testScripts.Motorcycle;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.CommonLibrary;

public class SendQuote extends PreconditionMotorcycle{
	
//	CommonLibrary lib = new CommonLibrary();
	
	@BeforeClass
	public void beforeProductData() throws InterruptedException {
		Thread.sleep(3000);
//		sendquote = new pages.Motorcycle.SendQuote(dr);
	}

	@Test
	public void verifyIsEmailVisible() 
	{
		Assert.assertEquals(sendquote.isEmailDisplayed(), true);
	}
	@Test
	public void verifyIsPhoneVisible() 
	{
		Assert.assertEquals(sendquote.isPhoneDisplayed(), true);
	}
	@Test
	public void verifyIsUsernameVisible() 
	{
		Assert.assertEquals(sendquote.isUsernameDisplayed(), true);
	}
	@Test
	public void verifyIsPasswordVisible() 
	{
		Assert.assertEquals(sendquote.isPasswordDisplayed(), true);
	}
	@Test
	public void verifyIsConfirmpasswordVisible() 
	{
		Assert.assertEquals(sendquote.isConfirmpasswordDisplayed(), true);
	}
	@Test
	public void verifyIsCommentsVisible() 
	{
		Assert.assertEquals(sendquote.isCommentsDisplayed(), true);
	}
	@Test
	public void verifyIsSendemailVisible() 
	{
		Assert.assertEquals(sendquote.isSendemailDisplayed(), true);
	}
	@Test
	public void verifyIsPrevVisible() 
	{
		Assert.assertEquals(sendquote.isPrevDisplayed(), true);
	}
	@Test
	public void verifyIsMainpageVisible() 
	{
		Assert.assertEquals(sendquote.isMainpageDisplayed(), true);
	}
	@Test
	public void verifyIsNewautomobileinsuranceVisible() 
	{
		Assert.assertEquals(sendquote.isNewautomobileinsuranceDisplayed(), true);
	}
	@Test
	public void verifyIsNewtruckinsuranceVisible() 
	{
		Assert.assertEquals(sendquote.isNewtruckinsuranceDisplayed(), true);
	}
	@Test
	public void verifyIsNewcamperinsuranceVisible() 
	{
		Assert.assertEquals(sendquote.isNewcamperinsuranceDisplayed(), true);
	}
	@Test(priority=1)
	public void enterandVerifySendQuotesPage()
	{
		
		sendquote.enterEmail("abcd@gmail.com");
		sendquote.enterPhone("1234567890");
		sendquote.enterUsername("Anshika");
		sendquote.enterPassword("Ans1234");
		sendquote.enterComments("Comments Must be under 300 characters.");
				
	}
}
