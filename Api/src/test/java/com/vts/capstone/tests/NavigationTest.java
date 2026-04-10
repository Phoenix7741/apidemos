package com.vts.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vts.capstone.base.BaseTest;
import com.vts.capstone.pages.HomePage;
import com.vts.capstone.pages.ViewsPage;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigation() throws Exception {

        configure();

        HomePage home = new HomePage(driver);
        Assert.assertTrue(home.isTitleDisplayed());

        home.clickViews();

        ViewsPage views = new ViewsPage(driver);
        views.clickControls();
    }
}
