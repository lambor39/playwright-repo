package com.modern.firstProject.motor.motorCar;

import java.util.*;

import com.modern.firstProject.commom.CommonHelper;

public class Page_00_CarryValues {
    public static String targetBrowser = System.getProperty("targetBrowser");
    public static Boolean isRunWithHeadless = CommonHelper.convertStringToBoolean(System.getProperty("isRunWithHeadless"));
    public static Boolean isMaximumMode = CommonHelper.convertStringToBoolean(System.getProperty("isMaximumMode"));
    public static Boolean isBrowserOpened = false;
    public static Map<String,Boolean> mapResultPage = new HashMap<String,Boolean>();
}
