package com.vts.capstone.pages;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class ControlsPage {

    AndroidDriver driver;

    public ControlsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By darkTheme = By.xpath("//android.widget.TextView[@content-desc='2. Dark Theme']");
    By editText = By.id("io.appium.android.apis:id/edit");
    By checkbox1 = By.xpath("//android.widget.CheckBox[@text='Checkbox 1']");
    By radioButton1 = By.xpath("//android.widget.RadioButton[@text='RadioButton 1']");

    public void openDarkTheme() {
        driver.findElement(darkTheme).click();
    }

    public void enterText(String text) {
        driver.findElement(editText).sendKeys(text);
    }

    public void clickCheckbox() {
        driver.findElement(checkbox1).click();
    }

    public void clickRadioButton() {
        driver.findElement(radioButton1).click();
    }
}
