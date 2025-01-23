package com.modern.firstProject.motor.motorCar;

import java.util.HashMap;
import java.util.Map;

//import org.testng.Assert;
import org.testng.annotations.*;

import com.modern.firstProject.commom.CommonHelper;
import com.modern.firstProject.proceed.website.motor.motorCar.InputPage;

public class Page_01_InputTest {

    protected String targetBrowser = System.getProperty("targetBrowser");
    protected boolean isRunWithHeadless = CommonHelper.convertStringToBoolean(System.getProperty("isRunWithHeadless"));
    protected boolean isMaximumMode = CommonHelper.convertStringToBoolean(System.getProperty("isMaximumMode"));
    protected boolean isOpened = false;

    @BeforeClass
    public void openBrowser() {
        isOpened = CommonHelper.openBrowser(targetBrowser, isRunWithHeadless, isMaximumMode);
        if (!isOpened) {
            System.out.println("Browser not open");
        }
        //Assert.assertEquals(true, isOpened);
    }

    @Test
    public void input() {
        Map<String, String> outputMap = new HashMap<String, String>();
        if (isOpened) {
            CommonHelper.navigateToTargetPage("https://www.roojai.com/");
            InputPage inputPageObj = new InputPage();
            outputMap = inputPageObj.start();
            System.out.println(CommonHelper.convertStringToBoolean(outputMap.get("result")));
        }
        //Assert.assertEquals(true, CommonHelper.convertStringToBoolean(outputMap.get("result")));
    }

    /*
    @AfterClass
    public void closeBrowser() {
        CommonHelper.closeBrowser();
    }
    */
}
