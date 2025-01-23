package com.modern.firstProject.motor.motorCar;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.modern.firstProject.commom.CommonHelper;

public class Page_99_VerifyTest {

    @Test
    public void verify() {
        for(String keyString : Page_00_CarryValues.mapResultPage.keySet()){
            Assert.assertEquals(true,Page_00_CarryValues.mapResultPage.get(keyString));
        }
    }

    @AfterClass
    public void closeBrowser() {
        if (!Page_00_CarryValues.isBrowserOpened) {
            CommonHelper.closeBrowser();
        }
    }
}
