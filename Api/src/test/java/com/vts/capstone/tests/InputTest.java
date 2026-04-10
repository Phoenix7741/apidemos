package com.vts.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vts.capstone.pages.HomePage;
import com.vts.capstone.pages.ViewsPage;
import com.vts.capstone.base.BaseTest;
import com.vts.capstone.pages.ControlsPage;

public class InputTest extends BaseTest {

    @Test
    public void testInputHandling() throws Exception {

        configure(); 

        
        HomePage home = new HomePage(driver);
        home.clickViews();

      
        ViewsPage views = new ViewsPage(driver);
        views.clickControls();

        
        ControlsPage controls = new ControlsPage(driver);

        controls.openDarkTheme();

       
        controls.enterText("Hello Appium");

        
        controls.clickCheckbox();

        
        controls.clickRadioButton();

        
        String enteredText = driver.findElementById("io.appium.android.apis:id/edit").getText();
        Assert.assertEquals(enteredText, "Hello Appium");
    }
}
