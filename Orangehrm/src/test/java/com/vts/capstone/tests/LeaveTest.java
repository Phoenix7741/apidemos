package com.vts.capstone.tests;

import com.vts.capstone.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vts.capstone.pages.LeavePage;
import com.vts.capstone.pages.LoginPage;

public class LeaveTest extends BaseTest {

    @Test
    public void testLeaveList() {

        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.openLeave();
        
        Assert.assertTrue (leave.verifyLeavePageLoaded(), "Leave page not loaded");

        Assert.assertTrue(leave.verifyAllFields(), "Fields missing");

        Assert.assertTrue(leave.verifyPlaceholder(), "Placeholder incorrect");

        leave.clickSearch();

        Assert.assertTrue(leave.isTableDisplayed());
    }
}
