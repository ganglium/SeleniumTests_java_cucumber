package com.test.step.definitions.base;

import com.test.step.definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Factory {
    static WebDriver driver;

    public Factory() {
        driver = Hooks.driver;
    }

    Helpers helpers = new Helpers();

    public void Click(By by) throws InterruptedException {
        helpers.ModalWait();
        helpers.Wait(by);
        driver.findElement(by).click();
        helpers.ModalWait();
    }

    public void Fill(By by, String value) throws InterruptedException {
        helpers.ModalWait();
        helpers.Wait(by);
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(value);
        helpers.ModalWait();
    }

    public void Check(By by) throws InterruptedException {
        helpers.ModalWait();
        helpers.Wait(by);
        driver.findElement(by);
        helpers.ModalWait();
    }

    public void SendKey(By by, Keys key) throws InterruptedException {
        helpers.ModalWait();
        helpers.Wait(by);
        driver.findElement(by).sendKeys(key);
        helpers.ModalWait();
    }
}
