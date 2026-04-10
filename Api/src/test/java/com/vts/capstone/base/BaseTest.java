package com.vts.capstone.base;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	public AndroidDriver driver;
  @Test(priority = 1)
  public void configure() throws Exception {
	  DesiredCapabilities capObj=new DesiredCapabilities();
	  capObj.setCapability("appium:deviceName", "Android Emulator");
	  capObj.setCapability("platformName", "Android");
	  capObj.setCapability("appium:automationName", "UiAutomator2");
	  capObj.setCapability("appium:app", "D:\\thanush\\virtusa\\daily\\DemoCap\\src\\test\\java\\resources\\ApiDemos-debug.apk");
	  
	  driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), capObj);	  
	  Thread.sleep(3000);
  }
  @AfterTest
  public void tearDown() {
      if (driver != null) {
          driver.quit();
      }
  }
}
