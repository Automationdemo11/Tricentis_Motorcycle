package testScripts.Motorcycle;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EnterInsuranceData extends PreconditionMotorcycle {

	@BeforeClass
	public void navigateToEnterInsuranceData() throws InterruptedException {
		motorEnterInsuranceData.navigateToEnterInsuranceData();
	}

	@Test(dataProvider="validNames")
	public void validFirstName(String validFirstName) {
		Assert.assertEquals(motorEnterInsuranceData.validFirstName(validFirstName), true);
	}

	@Test(dataProvider="invalidNames")
	public void invalidFirstName(String invalidFirstName) {
		Assert.assertEquals(motorEnterInsuranceData.validFirstName(invalidFirstName), false);
	}
	
	@Test(dataProvider="validNames")
	public void validLastName(String validLastName) {
		Assert.assertEquals(motorEnterInsuranceData.validLastName(validLastName), true);
	}

	@Test(dataProvider="invalidNames")
	public void invalidLastName(String invalidLastName) {
		Assert.assertEquals(motorEnterInsuranceData.validLastName(invalidLastName), false);
	}
	
	@Test
	public void validCountryDropDown() {
		Assert.assertEquals(motorEnterInsuranceData.validateCountrySelection(), true);
	}

	@Test(dataProvider="validZipCodeEntry")
	public void validZipCode(String validZipCode) {
		Assert.assertEquals(motorEnterInsuranceData.validateZipCode(validZipCode), true);
	}
	
	@Test(dataProvider="invalidZipCodeEntry")
	public void invalidZipCode(String invalidZipCode) {
		Assert.assertEquals(motorEnterInsuranceData.validateZipCode(invalidZipCode), false);
	}
	
	@Test(dataProvider = "occupationOptions")
	public void occupationOptionsVisible(String occupationOption) {
		Assert.assertEquals(motorEnterInsuranceData.verifyOccupationOptions(occupationOption), true);
	}
	
	@Test
	public void validOccupationDropDown() {
		Assert.assertEquals(motorEnterInsuranceData.validateOccupationSelection(), true);
	}
	
	@Test
	public void isHobbiesLabelVisible() {

		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesLabelVisibility(), true);
	}

	@Test
	public void isHobbiesCheckBoxVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesCheckBoxVisibility(), true);
	}

	@Test(dataProvider = "hobbiesOptions")
	public void hobbiesOptionsVisible(String hobbiesOption) {
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesOptions(hobbiesOption), true);
	}

	@Test
	public void validHobbiesSelection() {
		Assert.assertEquals(motorEnterInsuranceData.validHobbiesSelection(), true);
	}

	@Test
	public void isWebsiteLabelVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyWebsiteLabel(), true);
	}

	@Test
	public void isWebsiteTextBoxVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyWebsiteTextBoxVisibility(), true);
	}

	@Test(dataProvider = "validWebsiteTestData")
	public void validWebsiteEntry(String validWebsite) {
		Assert.assertEquals(motorEnterInsuranceData.validWebsiteEntry(validWebsite), true);
	}

	@Test(dataProvider = "invalidWebsiteTestData")
	public void invalidWebsitentry(String invalidWebsite) throws InterruptedException {
		Assert.assertEquals(motorEnterInsuranceData.validWebsiteEntry(invalidWebsite), false);
	}

	@Test
	public void isPictureLabelVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPictureLabelVisibility(), true);
	}

	@Test
	public void selectPicture() throws InterruptedException, AWTException {
		Assert.assertEquals(motorEnterInsuranceData.validPictureSelection(), true);
	}

	@Test
	public void isPrevButtonVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPrevButtonVisibility(), true);
	}

	@Test
	public void verifyPrevButtonText() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPrevButtonText(), true);
	}

	@Test
	public void verifyOnClickPrevButton() {
		motorEnterInsuranceData.ClickPrev();
		Assert.assertEquals(motorEnterVehicleData.isCylinderCapacityTextboxDisplayed(), true);
		motorEnterInsuranceData.navigateToEnterInsuranceData();
	}

	@Test
	public void isNextButtonVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyNextButtonVisibility(), true);
	}

	@Test
	public void verifyNextButtonText() {
		Assert.assertEquals(motorEnterInsuranceData.verifyNextButtonText(), true);
	}

	@Test(priority = 1)
	public void verifyOnClickNextButton() throws InterruptedException {
		Thread.sleep(2000);
		motorEnterInsuranceData.ClickNext();
		boolean result;
		boolean navigatorStatus = motorEnterInsuranceData.verifyOnClickNextButton();
		boolean nextPageElementStatus = motorEnterProductData.verifyStartLabelVisibility();
		result = navigatorStatus && nextPageElementStatus;
		Assert.assertEquals(result, true);
	}

	@DataProvider
	public String[] validWebsiteTestData() throws IOException {
		String data[] = new String[3];
		for (int i = 1; i <= 3; i++) {
			data[i - 1] = xl.getCellData("Test", i, 0);
		}
		return data;
	}

	@DataProvider
	public String[] invalidWebsiteTestData() throws IOException {
		String data[] = new String[5];
		int j = 0;
		for (int i = 5; i <= 9; i++) {
			data[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return data;
	}

	@DataProvider
	public String[] hobbiesOptions() throws IOException {
		String hobbiesOptions[] = new String[5];
		int j = 0;
		for (int i = 11; i < 16; i++) {
			hobbiesOptions[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return hobbiesOptions;
	}

	@DataProvider
	public String[] invalidNames() throws IOException {
		String[] invalidFirstNames = new String[4];
		int j = 0;
		for (int i = 35; i < 39; i++) {
			invalidFirstNames[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return invalidFirstNames;
	}
	
	@DataProvider
	public String[] validNames() throws IOException {
		String[] validFirstNames = new String[2];
		int j = 0;
		for (int i = 40; i < 42; i++) {
			validFirstNames[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return validFirstNames;
	}
	
	@DataProvider
	public String[] occupationOptions() throws IOException {
		String occupationOptions[] = new String[5];
		int j = 0;
		for (int i = 43; i < 48; i++) {
			occupationOptions[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return occupationOptions;
	}
	
	@DataProvider
	public String[] validZipCodeEntry() {
		String[] validZipCodes = {"4444", "88888888"};
		return validZipCodes;
	}
	
	@DataProvider
	public String[] invalidZipCodeEntry() {
		String[] validZipCodes = {"333", "888888889", "abcd", "122()"};
		return validZipCodes;
	}
}
