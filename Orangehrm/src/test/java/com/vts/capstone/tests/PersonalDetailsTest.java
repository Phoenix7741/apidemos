package com.vts.capstone.tests;

import com.vts.capstone.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vts.capstone.pages.LoginPage;
import com.vts.capstone.pages.MyInfoPage;

public class PersonalDetailsTest extends BaseTest {

    @Test
    public void testPersonalDetails() {

        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        MyInfoPage myInfo = new MyInfoPage(driver);
        myInfo.clickMyInfo();

        Assert.assertTrue(myInfo.isPersonalDetailsVisible());
    }
}
