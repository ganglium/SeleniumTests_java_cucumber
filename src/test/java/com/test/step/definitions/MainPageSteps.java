package com.test.step.definitions;

import com.test.step.definitions.pages.MainPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MainPageSteps {
    WebDriver driver;

    MainPage mainPage = new MainPage();

    public MainPageSteps() {
        driver = Hooks.driver;
    }

    @Then("^I should see if user logged in$")
    public void iShouldSeeIfUserLoggedIn() throws InterruptedException {
        mainPage.CheckLogin();
    }

    @When("^I search for text: \"([^\"]*)\"$")
    public void iSearchForText(String arg1) throws Throwable {
        mainPage.SearchText(arg1);
    }
}
