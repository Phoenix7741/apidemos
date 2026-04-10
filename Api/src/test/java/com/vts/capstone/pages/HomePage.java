package com.vts.capstone.pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {

    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    By title = By.xpath("//android.widget.TextView[@text=\"API Demos\"]");
    By views = By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");

    public boolean isTitleDisplayed() {
        return driver.findElement(title).isDisplayed();
    }

    public void clickViews() {
        driver.findElement(views).click();
    }
}
