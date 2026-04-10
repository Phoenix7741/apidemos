package com.vts.capstone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfoPage {

    WebDriver driver;

    public MyInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    By myInfoMenu = By.xpath("//span[normalize-space()='My Info']");
    By contactDetailsTab = By.xpath("//a[normalize-space()='Contact Details']");
    By homePhone = By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]");
    By saveBtn = By.xpath("//button[normalize-space()='Save']");

    public void clickMyInfo() {
        driver.findElement(myInfoMenu).click();
    }

    public boolean isPersonalDetailsVisible() {
        return driver.getPageSource().contains("Personal Details");
    }

    public void openContactDetails() {
        driver.findElement(contactDetailsTab).click();
    }

    public void updateHomePhone(String phone) {
        driver.findElement(homePhone).clear();
        driver.findElement(homePhone).sendKeys(phone);
    }

    public void clickSave() {
        driver.findElement(saveBtn).click();
    }
}
