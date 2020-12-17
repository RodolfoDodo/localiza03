package br.localiza.app.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			instalarCompletae();
			createDriver();
		}
		return driver;
	}
	
	private static void instalarCompletae() {

		String apkpath="APK/Combustivel-v2.0.2(202)-debug.apk";
		File app=new File(apkpath);
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		//desiredCapabilities.setCapability("app","C:\\Users\\195869\\eclipse-workspace\\CompletaeTest\\APK\\Combustivel-v2.0.2(202)-debug.apk");
		desiredCapabilities.setCapability("app",app.getAbsolutePath());
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appPackage", "com.localiza.combustivelapp");
		desiredCapabilities.setCapability("appActivity", "com.localiza.combustivelapp.ui.main.MainActivity");
		desiredCapabilities.setCapability("deviceName", "Nexus One");
		//desiredCapabilities.setCapability("platformVersion", "7");
		desiredCapabilities.setCapability("platformVersion", "10");
		desiredCapabilities.setCapability("autoGrantPermissions", true);
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();

	}
	private static void createDriver() {
		
		String apkpath="APK/Menu-hmg-v2.1.6(216)-debug.apk";
		File app=new File(apkpath);
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		//desiredCapabilities.setCapability("app","C:\\Users\\195869\\eclipse-workspace\\CompletaeTest\\APK\\Combustivel-v2.0.2(202)-debug.apk");
		desiredCapabilities.setCapability("app",app.getAbsolutePath());
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appPackage", "com.localiza.menuapp");
		desiredCapabilities.setCapability("appActivity", "com.localiza.menuapp.ui.main.MainActivity");
		desiredCapabilities.setCapability("deviceName", "Nexus One");
	    //desiredCapabilities.setCapability("platformVersion", "7");
		desiredCapabilities.setCapability("platformVersion", "10");
		//desiredCapabilities.setCapability("deviceName", "	 API 29");
		//desiredCapabilities.setCapability("platformVersion", "7");
		desiredCapabilities.setCapability("autoGrantPermissions", true);
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
