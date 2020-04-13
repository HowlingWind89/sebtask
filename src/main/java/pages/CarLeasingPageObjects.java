package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CarLeasingPageObjects {

    public SelenideElement typeOfLeaseRadioButton(String leasingType) {
        return $(By.xpath("//label[contains(text(), '" + leasingType + "')]"));
    }

    public SelenideElement vehiclePriceField() {
        return $(By.xpath("//input[@id='calc08-sum']"));
    }

    public SelenideElement downPaymentField() {
        return $(By.xpath("//input[@id='calc08-deposit']"));
    }

    public SelenideElement downPaymentType(String downPaymentType) {
        return $(By.xpath("//select[@id='calc08-deposit-type']/option[contains(text(), '" + downPaymentType + "')]"));
    }

    public SelenideElement contractPeriod(String numberOfMonths) {
        return $(By.xpath("//select[@id='calc08-period']/option[contains(text(), '" + numberOfMonths + "')]"));
    }

    public SelenideElement interestRateField() {
        return $(By.xpath("//input[@id='calc08-int']"));
    }

    public SelenideElement residualValueField() {
        return $(By.xpath("//input[@id='calc08-salvage-value']"));
    }

    public SelenideElement monthlyPaymentAmount() {
        return $(By.xpath("//span[@id='monthly-result']"));
    }

    public SelenideElement cookieConfirmationButton() {
        return $(By.xpath("//span[contains(text(), 'I agree')]"));
    }

    public SelenideElement carLeasingCalculatorMenu() {
        return $(By.xpath("//h3[contains(text(), 'Car leasing calculator')]"));
    }

    public SelenideElement calculatorIframe() {
        return $(By.id("calculator-frame-08a"));
    }

    public SelenideElement scheduleButton() {
        return $(By.xpath("//input[@id='value-payment-schedule']"));
    }

    public ElementsCollection scheduleRowWithMonthlyPayment(String amount) {
        return $$(By.xpath("//td[contains(text(), '" + amount + "')]"));
    }

    public SelenideElement monthsMenu() {
        return $(By.xpath("//select[@id='calc08-period']"));
    }
}
