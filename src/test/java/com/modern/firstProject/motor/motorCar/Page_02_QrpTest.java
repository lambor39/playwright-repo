package com.modern.firstProject.motor.motorCar;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.modern.firstProject.commom.CommonHelper;
import com.modern.firstProject.proceed.website.motor.motorCar.InputPage;

public class Page_02_QrpTest {
    @Test
    public void qrp() {
        Map<String, String> outputMap = new HashMap<String, String>();
        CommonHelper.navigateToTargetPage("https://www.roojai.com/");
        InputPage inputPageObj = new InputPage();
        outputMap = inputPageObj.start();
        System.out.println(CommonHelper.convertStringToBoolean(outputMap.get("result")));
        Assert.assertEquals(true, CommonHelper.convertStringToBoolean(outputMap.get("result")));
    }
}
