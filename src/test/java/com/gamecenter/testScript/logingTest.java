package com.gamecenter.testScript;

import com.gamecenter.appModule.TestDriver;
import com.gamecenter.util.Constant;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class logingTest {

    private AndroidDriver driver;
    private TestDriver testDriver;

    @Before
    public void setUp() throws Exception{
        TestDriver testDrvier = new TestDriver();
        driver = testDrvier.initDriver();
    }

    @Test
    public void sampleTest() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementById("com.qihoo.gamecenter.sdk.demosp:id/btn_portrait_game");
        el1.click();
        Thread.sleep(8000);
        MobileElement el2 = (MobileElement) driver.findElementById("com.qihoo.gamecenter.sdk.demosp:id/btn_switch_account");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.qihoo.gamecenter.pluginapk:id/lp_account_input_edit");
        el3.sendKeys(Constant.USERNAME);
        MobileElement el4 = (MobileElement) driver.findElementById("com.qihoo.gamecenter.pluginapk:id/lp_pwd_input_edit");
        el4.sendKeys(Constant.PASSWORD);
        MobileElement el5 = (MobileElement) driver.findElementById("com.qihoo.gamecenter.pluginapk:id/lpid_ap_login_btn");
        el5.click();
        driver.navigate().back();
        MobileElement el6 = (MobileElement) driver.findElementById("com.qihoo.gamecenter.pluginapk:id/ad_quit_btn");
        el6.click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
