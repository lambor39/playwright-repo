package com.modern.firstProject.motor.motorCar;

import java.util.*;
import org.testng.annotations.*;
import com.modern.firstProject.commom.CommonHelper;
import com.modern.firstProject.proceed.website.motor.motorCar.InputPage;

public class Page_01_InputTest {

    @BeforeClass
    public void openBrowser() {
        if (!Page_00_CarryValues.isBrowserOpened) {
            Page_00_CarryValues.isBrowserOpened = CommonHelper.openBrowser(Page_00_CarryValues.targetBrowser,
                    Page_00_CarryValues.isRunWithHeadless,
                    Page_00_CarryValues.isMaximumMode);
        }
    }

    @Test
    public void input() {
        Map<String, String> outputMap = new HashMap<String, String>();
        if (Page_00_CarryValues.isBrowserOpened) {
            CommonHelper.navigateToTargetPage("https://www.roojai.com/");
            InputPage inputPageObj = new InputPage();
            outputMap = inputPageObj.start();
            System.out.println(CommonHelper.convertStringToBoolean(outputMap.get("result")));
        }
        Page_00_CarryValues.mapResultPage.put("input_page",
                CommonHelper.convertStringToBoolean(outputMap.get("result")));
    }
}
