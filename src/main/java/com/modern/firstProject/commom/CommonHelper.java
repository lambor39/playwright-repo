package com.modern.firstProject.commom;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.ViewportSize;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Random;

public class CommonHelper {
    static final int screenWidthMobileMode = 430;
    static final int screenHeightMobileMode = 932;
    static int screenWidth;
    static int screenHeight;
    static Playwright playwright = Playwright.create();
    static Browser browser;
    static BrowserContext context;
    static Page page;
    public static Page getPage(){
        return page;
    }
    public static int getScreenWidthMobileMode(){
        return screenWidthMobileMode;
    }
    public static int getScreenHeightMobileMode(){
        return screenHeightMobileMode;
    }
    public static int getScreenWidth(){
        return screenWidth;
    }
    public static int getScreenHeight(){
        return screenHeight;
    }
    public static Map<String,Integer> getActualScreenSize(){
        Map<String,Integer> outputMap = new HashMap<String,Integer>();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenSize.width;
        screenHeight = screenSize.height;
        outputMap.put("screenWidth", screenWidth);
        outputMap.put("screenHeight", screenHeight);
        return outputMap;
    }
    public static void proceedScreenSize(int screenWidthInt, int screenHeightInt){
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(new ViewportSize(screenWidthInt, screenHeightInt)));
    }
    public static boolean openBrowser(String targetBrowser, boolean isRunWithHeadless, boolean isMaximumMode){
        switch (targetBrowser) {
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(isRunWithHeadless));
                break;
            case "egde":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(isRunWithHeadless));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(isRunWithHeadless));                
                break;
            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(isRunWithHeadless));                
                break;
            default:
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(isRunWithHeadless));
                break;
        }
        getActualScreenSize();
        if(!isMaximumMode){
            screenWidth = screenWidthMobileMode;
            screenHeight = screenHeightMobileMode;
        }
        proceedScreenSize(screenWidth,screenHeight);
        return browser.isConnected();
    }
    public static void closeBrowser(){
        boolean isOpened = browser.isConnected();
        if(isOpened){
            browser.close();
        }
    }
    public static void navigateToTargetPage(String url){
        page = context.newPage();
        page.navigate(url);
    }
    ////////////////////////////////////////////////////////////////////
    public static Locator getLocator(String parentString){
        Locator locatorOutput = page.locator(parentString);
        locatorOutput.waitFor();
        return locatorOutput;
    }
    public static Locator getLocatorWithRandom(List<Locator> locatorList){
        Locator locatorOutput = null;
        locatorOutput = locatorList.get(getItemWithRandom(locatorList.size()));
        return locatorOutput;
    }
    public static List<Locator> getLocatorListWithChild(Locator locatorMain, String targetString){
        List<Locator> locatorListOutput = locatorMain.locator(targetString).all();
        return locatorListOutput;
    }
    public static List<Locator> getLocatorListWithNonChild(String targetString){
        List<Locator> locatorListOutput = page.locator(targetString).all();
        return locatorListOutput;
    }
    public static Locator getLocatorWithAttributeName(String parentString, String ChildString, String attributeString, String targetString){
        List<Locator> locatorListOutput = null;
        if(ChildString.isBlank()){
            locatorListOutput = getLocatorListWithNonChild(parentString);
        }else{
            locatorListOutput = getLocatorListWithChild(CommonHelper.getLocator(parentString),ChildString);
        }
        Locator locatorOutput = null;
        for(Locator locatorName : locatorListOutput){
            if(locatorName.getAttribute(attributeString).equalsIgnoreCase(targetString)){
                locatorOutput=locatorName;
                break;
            }
        }
        return locatorOutput;
    }
    public static Locator getLocatorWithAttributeNameRandom(String parentString, String ChildString, String attributeString){
        List<Locator> locatorListOutput = null;
        if(ChildString.isBlank()){
            locatorListOutput = getLocatorListWithNonChild(parentString);
        }else{
            locatorListOutput = getLocatorListWithChild(CommonHelper.getLocator(parentString),ChildString);
        }
        Locator locatorOutput = getLocatorWithRandom(locatorListOutput);
        return locatorOutput;
    }
    public static String getValueFromAttributeName(Locator locatorTarget, String attributeString){
        String output = locatorTarget.getAttribute(attributeString);
        return output;
    }
    public static void clickLocator(Locator locatorTarget){
        locatorTarget.waitFor();
        locatorTarget.scrollIntoViewIfNeeded();
        locatorTarget.click();
    }
    public static void selectedSliderLocatorV1(Locator locatorTarget, Integer targetIndex, boolean isRandom){
        Integer index = targetIndex;
        Integer maxValue = CommonHelper.convertStringToInteger(CommonHelper.getValueFromAttributeName(locatorTarget, "max"));
        Integer stepValue = CommonHelper.convertStringToInteger(CommonHelper.getValueFromAttributeName(locatorTarget, "step"));
        Integer rangeValue = maxValue / stepValue;
        if(isRandom){
            index = getItemWithRandom(rangeValue + 1);
            while(index == 0){
                index = getItemWithRandom(rangeValue + 1);
            }
        }
        for(Integer x = 0; x <= rangeValue; x++){
            if(index == x){
                break;
            }else{
                locatorTarget.press("ArrowRight");
            }
        }
    }
    public static void inputTextLocator(Locator locatorTarget, String targetString){
        locatorTarget.waitFor();
        locatorTarget.scrollIntoViewIfNeeded();
        locatorTarget.clear();
        locatorTarget.fill(targetString);
    }
    ////////////////////////////////////////////////////////////////////
    public static String makeDataSeleniumNameTag(String targetString){
        String output = "[data-selenium-name=\""+targetString+"\"]";
        return output;
    }
    public static boolean convertStringToBoolean(String targetString){
        boolean output = false;
        if(targetString.equalsIgnoreCase("YES")){
            targetString = "True";
        }
        if(targetString.equalsIgnoreCase("NO")){
            targetString = "False";
        }
        output = Boolean.valueOf(targetString);
        return output;
    }
    public static String convertBooleanToString(boolean targetBoolean){
        String output;
        output = String.valueOf(targetBoolean);
        return output;
    }
    public static Integer convertStringToInteger(String targetString){
        Integer output = 0;
        String target = targetString.replaceAll(",","").trim();
        target = target.replaceAll("\\.\\d+$","").trim();
        output = Integer.parseInt(target);
        return output;
    }
    ////////////////////////////////////////////////////////////////////
    public static Integer getItemWithRandom(Integer number){
        Integer output;
        Random random = new Random();
        output = random.nextInt(number);
        return output;
    }
}