package com.vts.capstone.pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ViewsPage {

    AndroidDriver driver;

    public ViewsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By controls = By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]");
    By dragAndDrop = By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");

    public void clickControls() {
        driver.findElement(controls).click();
    }

    public void clickDragAndDrop() {
        driver.findElement(dragAndDrop).click();
    }
    public void scrollToText(String text) {
        driver.findElementByAndroidUIAutomator(
            "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"
        );
    }
}
