package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AppiumDriver<MobileElement>appiumDriver;

    public static AppiumDriver getAppiumDriver() {

        URL appiumServerURL = null;

        try {
            appiumServerURL = new URL("http:0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        if (appiumDriver ==null){

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,ConfigReader.getProperty("automationNameBusra"));
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ConfigReader.getProperty("platformNameBusra"));
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigReader.getProperty("platformVersionBusra"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigReader.getProperty("deviceNameBusra"));
        //  caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,ConfigReader.getProperty("appPackage"));
        //  caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,ConfigReader.getProperty("appActivity"));
            caps.setCapability(MobileCapabilityType.APP,ConfigReader.getProperty("appBusra"));
            caps.setCapability(MobileCapabilityType.NO_RESET,true);
        // false kullandığınızda uygulamayı ilk defa yüklüyomuş gibi sıfırlamaya yarar.






            if (ConfigReader.getProperty("platformName").equals("Android")) {
                appiumDriver = new AndroidDriver<>(appiumServerURL,caps);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }else {

                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));

            }

        }

        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}