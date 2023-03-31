package com.test.step.definitions.pages;

import com.test.step.definitions.Hooks;
import com.test.step.definitions.base.Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
    Factory factory = new Factory();

    public MainPage() {
        driver = Hooks.driver;
    }

    public static By googleImg = By.xpath("//img[@alt = 'Google']");
    public static By textFill = By.xpath("//input[@type = 'text']");
    public static By searchBtn = By.xpath("//input[@class = 'gNO89b']");
    public static By resultStatsStatic = By.xpath("//div[@id = 'result-stats']");

    public void CheckLogin() throws InterruptedException {
        factory.Check(googleImg);
    }

    public void SearchText(String text) throws  InterruptedException {
        factory.Fill(textFill, text);
        factory.Click(searchBtn);
        factory.Check(resultStatsStatic);
    }
}

