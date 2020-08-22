package testScripts.Motorcycle;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Configuration;
import libraries.Xls_Reader;

public class EnterProductData extends PreconditionMotorcycle {

	@BeforeClass
	public void beforeProductData() throws InterruptedException {
		// motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		Thread.sleep(5000);
		motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		motorEnterProductData.navigateToEnterProductData();
	}

	@Test
	public void isStartDateLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyStartLabelVisibility(), true);
	}

	@Test
	public void isStartDateTextBoxVisible() {
		Assert.assertEquals(motorEnterProductData.verifyStartDateTextBoxVisible(), true);
	}

	@Test
	public void isCalendarButtonClickable() {
		Assert.assertEquals(motorEnterProductData.verifyCalendarClickable(), true);
	}

	@Test(dataProvider = "startDateValid")
	public void validStartDateText(String validDate) {
		Assert.assertEquals(motorEnterProductData.validateStartDate(validDate), true);
	}

	@Test
	public void checkNextLabelInsSum() {
		String temp = motorEnterProductData.verifyNextLabelText();
		Assert.assertEquals(temp, "Insurance Sum [$]");
	}

	@Test
	public void isInsuranceSumLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyInsuranceSumLabelVisibility(), true);
	}

	@Test
	public void isInsuranceSumDropDownVisible() {
		Assert.assertEquals(motorEnterProductData.verifyInsuranceSumDropDownVisibility(), true);
	}

	@Test
	public void validInsuranceDropDown() {
		Assert.assertEquals(motorEnterProductData.validateInsuranceSumSelection(), true);
	}

	@Test
	public void damageInsuranceLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyDamageInsuranceLabelVisibility(), true);
	}

	@Test
	public void isDamageInsuranceDropDownVisible() {
		Assert.assertEquals(motorEnterProductData.verifyDamageInsuranceDropDownVisibility(), true);
	}

	@Test(dataProvider = "insuranceSumOptions")
	public void hobbiesOptionsVisible(String insuranceSumOption) {
		Assert.assertEquals(motorEnterProductData.verifyInsuranceSumOptions(insuranceSumOption), true);
	}

	@Test(dataProvider = "damageInsuranceOptions")
	public void damageInsuranceOptionsVisible(String damageInsuranceOption) {
		Assert.assertEquals(motorEnterProductData.verifyDamageInsuranceOptions(damageInsuranceOption), true);
	}

	@Test
	public void validDamageInsuranceDropDownSelection() {
		Assert.assertEquals(motorEnterProductData.validateDamageInsuranceDropDownSelection(), true);
	}

	@Test
	public void isOptionalProductsLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyOptionalProductLabelVisibility(), true);
	}

	@Test
	public void isOptionalProductTextBoxVisible() {
		Assert.assertEquals(motorEnterProductData.verifyOptionalProductTextBoxVisibility(), true);
	}

/*	@Test
	public void validOptionalProductSelection() {
		Assert.assertEquals(motorEnterProductData.validateOptionalProductCheckBoxSelection(), true);
	}*/

	@Test
	public void isPrevButtonVisible() {
		Assert.assertEquals(motorEnterProductData.verifyPrevButtonVisibility(), true);
	}

	@Test
	public void verifyPrevButtonText() {
		Assert.assertEquals(motorEnterProductData.verifyPrevButtonText(), true);
	}

	@Test
	public void verifyOnClickPrevButton() {
		motorEnterProductData.ClickPrev();
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesLabelVisibility(), true);
		motorEnterProductData.navigateToEnterProductData();
	}

	@Test
	public void isNextButtonVisible() {
		Assert.assertEquals(motorEnterProductData.verifyNextButtonVisibility(), true);
	}

	@Test
	public void verifyNextButtonText() {
		Assert.assertEquals(motorEnterProductData.verifyNextButtonText(), true);
	}

	@DataProvider
	public String[] startDateValid() throws IOException {

		String[] date = { "12/30/2020" };
		return date;
	}

	@DataProvider
	public String[] insuranceSumOptions() throws IOException {
		String insuranceSumOptions[] = new String[9];
		int j = 0;
		for (int i = 21; i < 30; i++) {
			insuranceSumOptions[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return insuranceSumOptions;
	}

	@DataProvider
	public String[] damageInsuranceOptions() throws IOException {
		String damageInsuranceOptions[] = new String[3];
		int j = 0;
		for (int i = 31; i < 34; i++) {
			damageInsuranceOptions[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return damageInsuranceOptions;
	}
}
