package br.ps.rafael.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {
	
	@Test
	public  void deveSomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-4723");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
		
		
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
		MobileElement el8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el8.click();
	    MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("plus");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el10.click();
	    MobileElement el11 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
	    
	  //  System.out.println(el11.getText());
	    
	    Assert.assertEquals("4", el11.getText());
	    
	    driver.quit();
		

	}

}
