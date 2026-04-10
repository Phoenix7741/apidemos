package com.vts.capstone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class DragAndDropPage {

    AndroidDriver driver;

    public DragAndDropPage(AndroidDriver driver) {
        this.driver = driver;
    }

    WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
    By destination = By.id("io.appium.android.apis:id/drag_dot_2");
    By result = By.id("io.appium.android.apis:id/drag_result_text");

    public void dragDrop() {
    	((JavascriptExecutor)driver).executeScript("mobile: dragGesture", ImmutableMap.of("elementld", ((RemoteWebElement) source).getId(), "endX", 615, "endY",
    			556)); 
    }

    public String getResultText() {
        return driver.findElement(result).getText();
    }
}
