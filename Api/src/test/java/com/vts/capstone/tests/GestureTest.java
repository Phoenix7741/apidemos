package com.vts.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vts.capstone.pages.HomePage;
import com.vts.capstone.pages.ViewsPage;
import com.vts.capstone.base.BaseTest;
import com.vts.capstone.pages.DragAndDropPage;

public class GestureTest extends BaseTest {

    @Test
    public void testDragAndDrop() throws Exception {

        configure();

        HomePage home = new HomePage(driver);
        home.clickViews();

        ViewsPage views = new ViewsPage(driver);
        views.clickDragAndDrop();

        DragAndDropPage drag = new DragAndDropPage(driver);
        drag.dragDrop();
        
        views.scrollToText("WebView");

        Assert.assertTrue(drag.getResultText().contains("Dropped"));
    }
}
