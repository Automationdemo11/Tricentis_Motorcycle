package testScripts.Motorcycle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnterVehicleData extends PreconditionMotorcycle {

	public void navigateToEnterVehicleData() {
		motorEnterVehicleData.navigateToEnterVehicleData();
	}

	/*
	 * @Test(dataProvider = "validWebsiteTestData") public void
	 * validWebsiteEntry(String validCylinderCapacit) {
	 * 
	 * Assert.assertEquals(motorEnterVehicleData.validCylinderCapacitEntry(
	 * validCylinderCapacit), true); }
	 */

	@Test
	public void verifyIsMakeVisible() {
		Assert.assertEquals(motorEnterVehicleData.isMakeDropdownDisplayed(), true);
	}

	@Test
	public void verifyIsModelVisible() {
		Assert.assertEquals(motorEnterVehicleData.isModelDropdownDisplayed(), true);
	}

	@Test
	public void verifyIsNumberOfSeatsVisible() {
		Assert.assertEquals(motorEnterVehicleData.isNumberOfSeatsDropdownDisplayed(), true);
	}

	@Test
	public void verifyIsCylinderCapacityVisible() {
		Assert.assertEquals(motorEnterVehicleData.isCylinderCapacityTextboxDisplayed(), true);
	}

	@Test
	public void verifyIsListPriceVisible() {
		Assert.assertEquals(motorEnterVehicleData.isListPriceTextboxDisplayed(), true);
	}

	@Test
	public void verifyIsEnginePerformanceVisible() {
		Assert.assertEquals(motorEnterVehicleData.isEnginePerformanceTextboxDisplayed(), true);
	}

	public void verifyIsDateOfManufactureVisible() {
		Assert.assertEquals(motorEnterVehicleData.isDateofManufactureTextboxDispiayed(), true);
	}

	@Test
	public void verifyIsAnnualMileageVisible() {
		Assert.assertEquals(motorEnterVehicleData.isAnnualMileageTextboxDispiayed(), true);
	}

	@Test
	public void verifyIsNextButtonVisible() {
		Assert.assertEquals(motorEnterVehicleData.isNextButtonDisplayed(), true);
	}

	@Test
	public void verifyIsOpenNextButtonVisible() {
		Assert.assertEquals(motorEnterVehicleData.isOpenNextDisplayed(), true);
	}

	@Test
	public void verifyIsOpenPrevButtonVisible() {
		Assert.assertEquals(motorEnterVehicleData.isOpenPrevButtonDisplayed(), true);
	}

	@Test
	public void verifyIsOpenDateOfCalenderButtonVisible() {
		Assert.assertEquals(motorEnterVehicleData.isOpenDateOfCalenderButtonDisplayed(), true);
	}

	@Test
	public void verifyIsSelectMakeMakerSelectable() {
		motorEnterVehicleData.Makeselectmaker("BMW");

	}

	@Test
	public void verifyIsSelectModelMakerSelectable() {
		motorEnterVehicleData.ModelselectMaker("Scooter");
	}

	@Test
	public void verifyIsSelectnumberofseatsSelectable() {
		motorEnterVehicleData.NumberOfSeatsselectMaker("2");
	}

	@Test
	public void verifyIsListpricetext() {
		Assert.assertEquals(motorEnterVehicleData.getListpriceText(), "List Price [$]");

	}

	@Test
	public void verifyIsNumberofSeatstext() {
		Assert.assertEquals(motorEnterVehicleData.getNumberofSeatsText(), "Number of Seats");

	}

	@Test
	public void verifyIsAnnualMileagetext() {
		Assert.assertEquals(motorEnterVehicleData.getAnnualMileageText(), "Annual Mileage [mi]");

	}

	@Test
	public void verifyIsCylinderCapacitytext() {
		Assert.assertEquals(motorEnterVehicleData.getCylinderCapacityText(), "Cylinder Capacity [ccm]");

	}

	@Test
	public void verifyIsDateOfManufacturetext() {
		Assert.assertEquals(motorEnterVehicleData.getDateOfManufactureText(), "Date of Manufacture");

	}

	@Test
	public void verifyIsEnginePerformancetext() {
		Assert.assertEquals(motorEnterVehicleData.getEnginePerformanceText(), "Engine Performance [kW]");

	}

	@Test
	public void verifyIsNextButtontext() {
		Assert.assertEquals(motorEnterVehicleData.getNextButtonText(), "Next »");

	}

	@Test
	public void verifyIsMaketext() {
		Assert.assertEquals(motorEnterVehicleData.getMakeText(), "Make");

	}

	@Test
	public void verifyIsModeltext() {
		Assert.assertEquals(motorEnterVehicleData.getModelText(), "Model");

	}

	@Test(priority = 1)
	public void verifyIsOpendateOfcalenderClickable() {
		motorEnterVehicleData.clickOpenDateOfCalenderButton();
		Assert.assertEquals(motorEnterVehicleData.isMakeDropdownDisplayed(), true);
	}

	@Test(priority = 2)
	public void verifyIsOpenNextClickable() {
		motorEnterVehicleData.clickOpenNextButton();
		Assert.assertEquals(motorEnterVehicleData.isMakeDropdownDisplayed(), true);
	}

	@Test(priority = 3)
	public void verifyIsOpenPrevClickable() {
		motorEnterVehicleData.clickOpenPrevButton();
		Assert.assertEquals(motorEnterVehicleData.isMakeDropdownDisplayed(), true);
	}

	@Test(priority = 4)
	public void verifyIsNextClickable() {
		motorEnterVehicleData.clickNextButton();

		Assert.assertEquals(motorEnterVehicleData.isMakeDropdownDisplayed(), true);
	}

	@Test
	public void verifyEnginePerformanceSelection() {
		motorEnterVehicleData.enterEnginePerformace("");
	}

	@Test
	public void verifyCylinderCapacitySelection() {
		motorEnterVehicleData.enterCylinderCapacity("");
	}

	@Test
	public void verifyAnnualMileageSelection() {
		motorEnterVehicleData.enterAnnualMileage("");
	}

	@Test
	public void verifyListPriceSelection() {
		motorEnterVehicleData.enterListPrice("");
	}

	@Test
	public void verifyDateOfmanufacture() {
		motorEnterVehicleData.enterDateofManufacture("");
	}

}
