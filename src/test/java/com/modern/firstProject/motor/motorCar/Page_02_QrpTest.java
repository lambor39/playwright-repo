package com.modern.firstProject.motor.motorCar;

import java.util.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.modern.firstProject.commom.CommonHelper;
import com.modern.firstProject.proceed.website.motor.motorCar.InputPage;

public class Page_02_QrpTest {

    @BeforeClass
    public void openBrowser() {
        if (!Page_00_CarryValues.isBrowserOpened) {
            Page_00_CarryValues.isBrowserOpened = CommonHelper.openBrowser(Page_00_CarryValues.targetBrowser,
                    Page_00_CarryValues.isRunWithHeadless,
                    Page_00_CarryValues.isMaximumMode);
        }
    }

    @Test
    public void qrp() {
        Map<String, String> outputMap = new HashMap<String, String>();
        CommonHelper.navigateToTargetPage("https://www.roojai.com/");
        InputPage inputPageObj = new InputPage();
        outputMap = inputPageObj.start();
        System.out.println(CommonHelper.convertStringToBoolean(outputMap.get("result")));
        Page_00_CarryValues.mapResultPage.put("qrp_page", CommonHelper.convertStringToBoolean(outputMap.get("result")));
    }
}
