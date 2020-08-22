package testScripts.Motorcycle;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.CommonLibrary;

public class SelectPriceOption extends PreconditionMotorcycle {

	CommonLibrary lib = new CommonLibrary();

	@BeforeClass
	public void preClass() throws InterruptedException {
		Thread.sleep(3000);
		selectpriceoption.preClassData();
		Thread.sleep(3000);
	}

	@Test
	public void verifyIsSelectpriceoptionVisible() {

		Assert.assertEquals(selectpriceoption.isPriceperyearDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isOnlineclaimDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isClaimsdiscountDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isWorldwidecoverDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectoptionDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectoptionErrorDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSilverDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isGoldDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isPlatinumDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isUltimateDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectsilverDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectgoldDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectplatinumDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectultimateDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isViewquoteDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isDownloadquoteDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isNextbuttonDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isPreviousbuttonDisplayed(), true);
	}

	@Test(priority = 1)
	public void verifyIsSelectpriceoptiontext() {
		Assert.assertEquals(selectpriceoption.getPriceperyearText(), "Price per Year ($)");
		Assert.assertEquals(selectpriceoption.getOnlineclaimText(), "Online Claim");
		Assert.assertEquals(selectpriceoption.getClaimsdiscountText(), "Claims Discount (%)");
		Assert.assertEquals(selectpriceoption.getWorldwidecoverText(), "Worldwide Cover");
		Assert.assertEquals(selectpriceoption.getSelectoptionText(), "Select Option");
		Assert.assertEquals(selectpriceoption.getSilverText(), "Silver");
		Assert.assertEquals(selectpriceoption.getGoldText(), "Gold");
		Assert.assertEquals(selectpriceoption.getPlatinumText(), "Platinum");
		Assert.assertEquals(selectpriceoption.getUltimateText(), "Ultimate");
	}

	@Test(priority = 2)
	public void verifyIsSelectpriceoptionClickable() {
		selectpriceoption.clickSelectsilver();
		selectpriceoption.clickSelectgold();
		selectpriceoption.clickSelectplatinum();
		selectpriceoption.clickSelectultimate();
	}

	@Test(priority = 3)
	public void verifyIsSelectpriceoption1text() {
		Assert.assertEquals(selectpriceoption.getViewquoteText(), "VIEW QUOTE");
		Assert.assertEquals(selectpriceoption.getDownloadquoteText(), "DOWNLOAD QUOTE");
		Assert.assertEquals(selectpriceoption.getNextbuttonText(), "Next »");
		Assert.assertEquals(selectpriceoption.getPreviousbuttonText(), "« Prev");
	}

	@Test(priority = 4)
	public void verifyIsSelectpriceoption1Clickable() {
		selectpriceoption.clickNextbutton();
	}

}
