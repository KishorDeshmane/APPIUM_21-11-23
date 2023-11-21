package com.qa.factory;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class DriverFactory {
	public AndroidDriver driver;
	public IOSDriver driver1;

	public static ThreadLocal<AndroidDriver> tlDriver = new ThreadLocal<AndroidDriver>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser
	 * @param browser
	 * @return this will return tldriver.
	 * @throws MalformedURLException 
	 */
	
	public AndroidDriver init_driver(String application , String apkLocation, String appium_url ) throws MalformedURLException {
		System.out.println("Application: " + application);
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: " + projectPath);
		
		
		if (application.equals("apk")) {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

//			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
//			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "nokia c3");
			
			//Keyboard_operations_for_otp
			dc.setCapability("unicodeKeyboard", false);
			dc.setCapability("resetKeyboard", false);
			
			System.out.println("Application Location: "+apkLocation);
			dc.setCapability(MobileCapabilityType.APP, apkLocation);
			
			System.out.println("Appium URL: "+appium_url);
			URL url = new URL(appium_url);
			
//			AndroidDriver driver = new AndroidDriver(url, dc);
			tlDriver.set(new AndroidDriver(url, dc));
			System.out.println("Appium Driver Started");
	
			 
			 
			 
		} else if (application.equals("ios")) {
//			 EdgeOptions options = new EdgeOptions();
//			 options.setBrowserVersion("117");
//			WebDriverManager.edgedriver().setup();
//			System.setProperty("webdriver.edge.driver",  projectPath+"\\drivers\\msedgedriver.exe");
//			tlDriver.set(new EdgeDriver(options));
			System.out.println("IOS");
				
	
		} else {
			System.out.println("Please pass the correct application value: " + application);
		}

//		getDriver().manage().deleteAllCookies();
//		driver.manage().addCookie(cookie);
//		getDriver().manage().window().maximize();
		
		
//		try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		return getDriver();
	}

	public static AndroidDriver getDriver() {
		return tlDriver.get();
	}
}