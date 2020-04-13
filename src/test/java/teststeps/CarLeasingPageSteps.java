package teststeps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CarLeasingPageObjects;

public class CarLeasingPageSteps {

    private CarLeasingPageObjects carLeasingPageObjects;

    public CarLeasingPageSteps(CarLeasingPageObjects carLeasingPageObjects) {
        this.carLeasingPageObjects = carLeasingPageObjects;
    }

    @And("I enter vehicle price amount ([^\\\"]*)")
    public void enterVehiclePrice(String amount) {
        carLeasingPageObjects.vehiclePriceField().sendKeys(amount);
    }

    @And("I enter downpayment amount ([^\\\"]*)")
    public void enterDownPaymentAmount(String amount) {
        carLeasingPageObjects.downPaymentField().clear();
        carLeasingPageObjects.downPaymentField().sendKeys(amount);
    }

    @And("I select downpayment type ([^\\\"]*)")
    public void selectDownPaymentType(String type) {
        carLeasingPageObjects.downPaymentType(type).click();
    }

    @And("I select contract period to ([^\\\"]*) months")
    public void selectContractPeriod(String months) {
        carLeasingPageObjects.contractPeriod(months).click();
    }

    @And("I enter interest rate amount ([^\\\"]*)")
    public void enterInterestRateAMount(String amount) {
        carLeasingPageObjects.interestRateField().clear();
        carLeasingPageObjects.interestRateField().sendKeys(amount);
    }

    @And("I enter residual value amount ([^\\\"]*)")
    public void enterResidualValueAmount(String amount) {
        carLeasingPageObjects.residualValueField().clear();
        carLeasingPageObjects.residualValueField().sendKeys(amount);
    }

    @And("I select ([^\\\"]*) as leasing type")
    public void selectLeasingType(String leasingType) {
        carLeasingPageObjects.typeOfLeaseRadioButton(leasingType).click();
    }

    @And("I confirm cookie dialogue")
    public void confirmCookie() {
        carLeasingPageObjects.cookieConfirmationButton().click();
    }

    @And("I expand Car leasing calculator menu")
    public void expandCarLeasingCalculatorMenu() {
        carLeasingPageObjects.carLeasingCalculatorMenu().click();
    }

    @And("I switch to calculator iframe")
    public void switchToIframe() throws InterruptedException {
        Selenide.switchTo().frame(carLeasingPageObjects.calculatorIframe());
        Thread.sleep(2000);
    }

    @Then("I check that monthly payment amount is equal to ([^\\\"]*)")
    public void checkMonthlyPaymentAmount(String expectedAmount) {
        Assert.assertEquals(expectedAmount, carLeasingPageObjects.monthlyPaymentAmount().getText());
    }

    @And("I click schedule button")
    public void clickScheduleButton() {
        carLeasingPageObjects.scheduleButton().click();
    }

    @Then("I check that amount of rows with monthly payments equal to the contract period months")
    public void checkAmountOfRowsWithAmountOfMonths() {
        Assert.assertEquals(carLeasingPageObjects.monthsMenu().getValue(),
                String.valueOf(carLeasingPageObjects.scheduleRowWithMonthlyPayment
                (carLeasingPageObjects.monthlyPaymentAmount().getText().replace(" euros", "")).size()));
    }
}
