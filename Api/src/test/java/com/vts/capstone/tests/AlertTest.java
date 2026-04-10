package com.vts.capstone.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vts.capstone.base.BaseTest;

public class AlertTest extends BaseTest {

    @Test
    public void testAlertHandling() throws Exception {

        configure(); 

        
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();

        
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();

        
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK Cancel dialog with a message\"]")).click();

        
        driver.findElement(By.id("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
    }
}
