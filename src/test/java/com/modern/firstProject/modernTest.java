package com.modern.firstProject;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.*;

import com.modern.firstProject.commom.CommonHelper;
import com.modern.firstProject.proceed.website.inputPage;

public class modernTest {

    protected String targetBrowser = System.getProperty("targetBrowser");
    protected boolean isRunWithHeadless = CommonHelper.convertStringToBoolean(System.getProperty("isRunWithHeadless"));
    protected boolean isMaximumMode = CommonHelper.convertStringToBoolean(System.getProperty("isMaximumMode"));

    @BeforeClass
    public void openBrowser() {
        boolean isOpened = CommonHelper.openBrowser(targetBrowser, isRunWithHeadless, isMaximumMode);
        if (!isOpened) {
            System.out.println("Browser not open");
        }
    }

    @Test
    public void test01() {
        Map<String, String> outputMap = new HashMap<String, String>();
        // if(isOpened){
        CommonHelper.navigateToTargetPage("https://www.roojai.com/");
        inputPage inputPageObj = new inputPage();
        outputMap = inputPageObj.start();
        /*
         * if (CommonHelper.convertStringToBoolean(outputMap.get("result"))) {
         * CommonHelper.closeBrowser();
         * }
         */
        // }
        System.out.println(CommonHelper.convertStringToBoolean(outputMap.get("result")));
    }

    @AfterClass
    public void closeBrowser() {
        CommonHelper.closeBrowser();
    }
}
