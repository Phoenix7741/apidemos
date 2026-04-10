package com.vts.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vts.capstone.base.BaseTest;
import com.vts.capstone.pages.HomePage;

public class ValidationTest extends BaseTest {

    @Test
    public void validateAppLaunch() throws Exception {

        configure();

        HomePage home = new HomePage(driver);
        Assert.assertTrue(home.isTitleDisplayed());
    }
}
