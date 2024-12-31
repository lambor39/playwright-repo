package com.modern.firstProject;
import java.util.HashMap;
import java.util.Map;

import com.modern.firstProject.commom.CommonHelper;
import com.modern.firstProject.proceed.website.inputPage;

public class App {
    public static void main(String[] args) {
        boolean isOpened = CommonHelper.openBrowser("",false,true);
        if(!isOpened){
            System.out.println("Browser not open");
        }
        Map<String,String> outputMap = new HashMap<String,String>();
        if(isOpened){
            CommonHelper.navigateToTargetPage("https://www.roojai.com/");
            inputPage inputPageObj = new inputPage();
            outputMap = inputPageObj.start();
            if(CommonHelper.convertStringToBoolean(outputMap.get("result"))){
                CommonHelper.closeBrowser();  
            }
        }
        System.out.println(CommonHelper.convertStringToBoolean(outputMap.get("result")));
    }
}