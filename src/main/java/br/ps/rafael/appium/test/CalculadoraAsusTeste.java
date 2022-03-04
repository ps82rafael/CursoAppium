package br.ps.rafael.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraAsusTeste {

	@Test
	public void deveSomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-4723");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.asus.calculator");
		desiredCapabilities.setCapability("appActivity", "com.asus.calculator.Calculator");
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
		
		//AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

		MobileElement el1 = (MobileElement) driver.findElementById("com.asus.calculator:id/digit2");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("mais");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.asus.calculator:id/digit2");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("igual");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("4");

		// System.out.println(el11.getText());

		Assert.assertEquals("4", el5.getText());

		driver.quit();

	}

}
