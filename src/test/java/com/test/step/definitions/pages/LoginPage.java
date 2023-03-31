package com.test.step.definitions.pages;

import com.test.step.definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.test.step.definitions.base.Helpers;
import com.test.step.definitions.base.Factory;

public class LoginPage {
    WebDriver driver;
    Factory factory = new Factory();

    public LoginPage() {
        driver = Hooks.driver;
    }

    public static By acceptAllBtn = By.id("L2AGLb");
    public static By signInBtn = By.xpath("//*[@class='gb_ja gb_ka gb_Pd gb_gd' or @class='hero-scroll__header__chapter__buttons']");

    public static By usernameFill = By.xpath("//input[@type = 'email']");
    public static By passwordFill = By.xpath("//input[@type = 'password']");
    public static By nextBtn = By.xpath("//div[@class= 'FliLIb FmFZVc']");

    public void EnterLogin(String userName, String password) throws InterruptedException {
        factory.Click(signInBtn);
        factory.Fill(usernameFill, userName);
        factory.Click(nextBtn);
        factory.Fill(passwordFill, password);
        factory.Click(nextBtn);
    }
}

