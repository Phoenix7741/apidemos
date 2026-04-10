package com.vts.capstone.tests;

import com.vts.capstone.base.BaseTest;
import org.testng.annotations.Test;
import com.vts.capstone.pages.LoginPage;
import com.vts.capstone.pages.MyInfoPage;

public class ContactDetailsTest extends BaseTest {

    @Test
    public void testContactDetails() {

        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        MyInfoPage myInfo = new MyInfoPage(driver);
        myInfo.clickMyInfo();
        myInfo.openContactDetails();

        myInfo.updateHomePhone("5551234567");
        myInfo.clickSave();
    }
}
