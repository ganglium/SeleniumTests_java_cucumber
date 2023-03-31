package com.test.step.definitions.base;

import com.test.step.definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Helpers {
    static WebDriver driver;

    public Helpers() {
        driver = Hooks.driver;
    }

    public boolean IsElementPresent(By by) {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        try {
            driver.findElement(by);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return true;
        } catch (NoSuchElementException e) {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return false;
        }
    }

    public void ModalWait() throws InterruptedException {
        By by = By.xpath("//div[@class='modal-footer']");
        if (IsElementPresent(by)) {
            Thread.sleep(700);
        }
    }

    public void Wait(By by) {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(by));
    }


}
