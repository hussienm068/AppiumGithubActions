package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests

{
    public static AppiumDriver driver;

    public static URL appiumServerURL;

    public static void Android_SetUp() throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME , "emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION , "15");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME , "UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP , "//Users//hussien//IdeaProjects//TestAutomationUniversity//Apps//ToDo_1.24_APKPure.apk");
        appiumServerURL = new URL("http://127.0.0.1:4723");
        driver =new AndroidDriver(appiumServerURL , caps);

    }
    //16 Pro 9DFEB488-6A4B-4B93-918E-8F6F35D99ECA
    //16 Pro max 9FEE89EF-3E89-48B4-AF45-4B5EC72A5CC2
    public static void iOS_SetUp(String port , String deviceName , String udid ,String platFormVersion ,  String wdaLocalPort) throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME , deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME , "iOS");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION , platFormVersion);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME , "XCUITest");
        caps.setCapability(MobileCapabilityType.APP , "");
        caps.setCapability("wdaLocalPort" , wdaLocalPort);
        caps.setCapability(MobileCapabilityType.UDID , udid);
        appiumServerURL = new URL("http://127.0.0.1:"+port);
        driver = new IOSDriver(appiumServerURL , caps);
    }


    public void terminate()
    {
        if (null !=driver)
        {
            driver.quit();
        }
    }

}
