package environment;

import static com.codeborne.selenide.Selenide.*;

public class EnvironmentSetup {

    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open("https://www.seb.ee/eng/loan-and-leasing/leasing/car-leasing");
    }

    public void tearDown() {
        close();
    }
}
