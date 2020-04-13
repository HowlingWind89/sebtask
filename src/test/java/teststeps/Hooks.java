package teststeps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import environment.EnvironmentSetup;

public class Hooks {
    private EnvironmentSetup environment;

    public Hooks(EnvironmentSetup environment) {
        this.environment = environment;
    }

    @Before
    @Given("I open Car leasing calculator page")
    public void openBankLoginPage() {
        environment.SetUp();
    }

    @After
    public void closeBrowser() {
        environment.tearDown();
    }
}