package com.test.step.definitions;

import com.test.step.definitions.pages.LoginPage;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginPageSteps {
    WebDriver driver;

    LoginPage page = new LoginPage();

    public LoginPageSteps() {
        driver = Hooks.driver;
    }


    @And("^I enter credentials$")
    public void iEnterCredentials(List<User> table) throws InterruptedException {
        for (User user : table) {
            page.EnterLogin(user.username, user.password);
        }
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
