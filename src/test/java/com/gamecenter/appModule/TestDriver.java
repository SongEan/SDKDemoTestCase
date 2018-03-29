package com.gamecenter.appModule;

import com.gamecenter.util.Constant;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestDriver {
    private AndroidDriver<WebElement> driver;

    public AndroidDriver<WebElement> initDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appPackage", Constant.PACKAGE_NAME_GAMECENTER_SDK_DEMO);
        desiredCapabilities.setCapability("appActivity", Constant.ACTIVITY_GAMECENTER_SDK_FIRST_ACTIVITY);
        desiredCapabilities.setCapability("platformName", Constant.PLATFORM_NAME);
        desiredCapabilities.setCapability("deviceName", Constant.DEVICE_NAME);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<WebElement>(remoteUrl, desiredCapabilities);
        //设置脚本全局超时时间
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
