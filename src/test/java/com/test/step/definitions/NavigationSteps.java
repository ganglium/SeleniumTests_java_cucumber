package com.test.step.definitions;

import com.test.step.definitions.base.Factory;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import static com.test.step.definitions.pages.LoginPage.acceptAllBtn;

public class NavigationSteps {
    WebDriver driver;
    Factory factory = new Factory();

    public NavigationSteps() {
        driver = Hooks.driver;
    }

    @Given("^I navigate to application \"([^\"]*)\"$")
    public void i_navigate_to_application(String arg1) throws Throwable {
        driver.navigate().to(arg1);
        if (driver.findElements(acceptAllBtn).size() > 0) {
            factory.Click(acceptAllBtn);
        }
    }
}