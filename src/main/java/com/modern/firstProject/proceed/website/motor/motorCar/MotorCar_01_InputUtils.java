package com.modern.firstProject.proceed.website.motor.motorCar;

import java.util.HashMap;
import java.util.Map;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.modern.firstProject.commom.CommonHelper;

public class MotorCar_01_InputUtils {
    Page page = CommonHelper.getPage();

    public Map<String,String> start(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Map<String,String> inputCmsProductMap = inputCmsProduct();
        if(CommonHelper.convertStringToBoolean(inputCmsProductMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputCmsProductMap.get("result"));
        }      
        if(!result){
            return outputMap;
        }
        Map<String,String> inputLanguageMap = inputLanguage();
        if(CommonHelper.convertStringToBoolean(inputLanguageMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputLanguageMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputMakeMap = inputMake();
        if(CommonHelper.convertStringToBoolean(inputMakeMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputMakeMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputModelMap = inputModel();
        if(CommonHelper.convertStringToBoolean(inputModelMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputModelMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputModelYearMap = inputModelYear();
        if(CommonHelper.convertStringToBoolean(inputModelYearMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputModelYearMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputSubModelMap = inputSubModel();
        if(CommonHelper.convertStringToBoolean(inputSubModelMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputSubModelMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputCarCameraMap = inputCarCamera();
        if(CommonHelper.convertStringToBoolean(inputCarCameraMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputCarCameraMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputOdoMeterMap = inputOdoMeter();
        if(CommonHelper.convertStringToBoolean(inputOdoMeterMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputOdoMeterMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputCarUsageMap = inputCarUsage();
        if(CommonHelper.convertStringToBoolean(inputCarUsageMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputCarUsageMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        switch (inputCarUsageMap.get("whichType").toUpperCase()) {
            case "SPT":
            Map<String,String> inputFrequencyOfCarUseMap = inputFrequencyOfCarUse();
            if(CommonHelper.convertStringToBoolean(inputFrequencyOfCarUseMap.get("result"))){
                result = CommonHelper.convertStringToBoolean(inputFrequencyOfCarUseMap.get("result"));
            }
            if(!result){
                return outputMap;
            }                
            break;
            case "COMMERCIAL":
                Map<String,String> inputCommercialCarUsageMap = inputCommercialCarUsage();
                if(CommonHelper.convertStringToBoolean(inputCommercialCarUsageMap.get("result"))){
                    result = CommonHelper.convertStringToBoolean(inputCommercialCarUsageMap.get("result"));
                }
                if(!result){
                    return outputMap;
                }
            break;       
        }
        Map<String,String> inputClaimMap = inputClaim();
        if(CommonHelper.convertStringToBoolean(inputClaimMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputClaimMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputUnderFinanceMap = inputUnderFinance();
        if(CommonHelper.convertStringToBoolean(inputUnderFinanceMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputUnderFinanceMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputMaritalStatusMap = inputMaritalStatus();
        if(CommonHelper.convertStringToBoolean(inputMaritalStatusMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputMaritalStatusMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputDateOfBirthMap = inputDateOfBirth();
        if(CommonHelper.convertStringToBoolean(inputDateOfBirthMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputDateOfBirthMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputDrivingExperienceMap = inputDrivingExperience();
        if(CommonHelper.convertStringToBoolean(inputDrivingExperienceMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputDrivingExperienceMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputPostalCodeMap = inputPostalCode();
        if(CommonHelper.convertStringToBoolean(inputPostalCodeMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputPostalCodeMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputNCBMap = inputNCB();
        if(CommonHelper.convertStringToBoolean(inputNCBMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputNCBMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> inputPolicyStartMap = inputPolicyStart();
        if(CommonHelper.convertStringToBoolean(inputPolicyStartMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(inputPolicyStartMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        Map<String,String> selectedGetQuoteButtonMap = selectedGetQuoteButton();
        if(CommonHelper.convertStringToBoolean(selectedGetQuoteButtonMap.get("result"))){
            result = CommonHelper.convertStringToBoolean(selectedGetQuoteButtonMap.get("result"));
        }
        if(!result){
            return outputMap;
        }
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputCmsProduct(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator productLocatorOutput = CommonHelper.getLocatorWithAttributeName(
            "#product-link", 
            "a", 
            "eact", 
            "Startquote_car"
            );
        CommonHelper.clickLocator(productLocatorOutput);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputLanguage(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator languageLocator = CommonHelper.getLocator("#btn-select-language");
        CommonHelper.clickLocator(languageLocator);
        Locator languageItemLocator = CommonHelper.getLocatorWithAttributeName(
            CommonHelper.makeDataSeleniumNameTag("language"), 
            "", 
            "data-selenium-value",
            "en"
            );
        CommonHelper.clickLocator(languageItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputMake(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator makeLocator = CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("carBrand"));
        CommonHelper.clickLocator(makeLocator);
        Locator makeItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("carBrand-item"), 
            "", 
            "data-selenium-value"
            );
        CommonHelper.clickLocator(makeItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputModel(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator modelItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("carModel-item"), 
            "", 
            "data-selenium-value"
            );
        CommonHelper.clickLocator(modelItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputModelYear(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator modelYearItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("carYear-item"), 
            "", 
            "data-selenium-value"
            );
        CommonHelper.clickLocator(modelYearItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputSubModel(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator subModelItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("carDesc-item"), 
            "", 
            "data-selenium-value"
            );
        CommonHelper.clickLocator(subModelItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputCarCamera(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator carCameraItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("carcam"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(carCameraItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputOdoMeter(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator odoMeterABTestingLocator = CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("ODOmeter-version"));
        String abTestingValue = CommonHelper.getValueFromAttributeName(odoMeterABTestingLocator, "data-selenium-value").toUpperCase();
        switch (abTestingValue) {
            case "A":
                outputMap = inputOdoMeterB();
                break;
            case "B":
                outputMap = inputOdoMeterB();
                break;       
            default:
                outputMap = inputOdoMeterA();
                break;
        }
        result = CommonHelper.convertStringToBoolean(outputMap.get("result"));
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputOdoMeterA(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        CommonHelper.selectedSliderLocatorV1(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("ODOmeter-step")),15,true);
        CommonHelper.clickLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("ODOmeter-next")));
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputOdoMeterB(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator odoMeterLocator = CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("ODOmeter_dropdown"));
        CommonHelper.clickLocator(odoMeterLocator);
        Locator odoMeterItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("ODOmeter-item"), 
            "", 
            "data-selenium-value"
            );
        CommonHelper.clickLocator(odoMeterItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputCarUsage(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        String whichType = "";
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        outputMap.put("whichType", whichType);
        Locator carUsageItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("carUsage"), 
            "",
            "data-selenium-value"
            );
        whichType = CommonHelper.getValueFromAttributeName(carUsageItemLocator, "data-selenium-value");
        CommonHelper.clickLocator(carUsageItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        outputMap.put("whichType", whichType);
        return outputMap;
    }
    public Map<String,String> inputCommercialCarUsage(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator rideShareLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("taxi-veh-for-hire"), 
            "",
            "data-selenium-value"
            );
        Boolean selectedValue = CommonHelper.convertStringToBoolean(CommonHelper.getValueFromAttributeName(rideShareLocator, "data-selenium-value"));
        CommonHelper.clickLocator(rideShareLocator);
        if(!selectedValue){
            Locator rentalVehicleLocator = CommonHelper.getLocatorWithAttributeNameRandom(
                CommonHelper.makeDataSeleniumNameTag("rental-vehicle"), 
                "",
                "data-selenium-value"
                );
            selectedValue = CommonHelper.convertStringToBoolean(CommonHelper.getValueFromAttributeName(rentalVehicleLocator, "data-selenium-value"));
            CommonHelper.clickLocator(rentalVehicleLocator);
            page.waitForTimeout(3000);
            if(!selectedValue){
                Locator transportGoodsLocator = CommonHelper.getLocatorWithAttributeNameRandom(
                    CommonHelper.makeDataSeleniumNameTag("goods-transport-vehicle"), 
                    "",
                    "data-selenium-value"
                    );
                selectedValue = CommonHelper.convertStringToBoolean(CommonHelper.getValueFromAttributeName(transportGoodsLocator, "data-selenium-value"));
                CommonHelper.clickLocator(transportGoodsLocator);
                page.waitForTimeout(3000);
                if(selectedValue){
                    Locator logisticsCompanyLocator = CommonHelper.getLocatorWithAttributeNameRandom(
                        CommonHelper.makeDataSeleniumNameTag("whose-goods"), 
                        "",
                        "data-selenium-value"
                        );
                    selectedValue = CommonHelper.convertStringToBoolean(CommonHelper.getValueFromAttributeName(logisticsCompanyLocator, "data-selenium-value"));
                    CommonHelper.clickLocator(logisticsCompanyLocator);
                    page.waitForTimeout(3000);
                    if(!selectedValue){
                        Locator transportRouteLocator = CommonHelper.getLocatorWithAttributeNameRandom(
                            CommonHelper.makeDataSeleniumNameTag("goods-transport-route"), 
                            "",
                            "data-selenium-value"
                            );
                        CommonHelper.clickLocator(transportRouteLocator);
                        page.waitForTimeout(3000);          
                    }       
                }    
            }
        }
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputFrequencyOfCarUse(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator frequencyOfCarUseItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("personalUse"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(frequencyOfCarUseItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputClaim(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator claimItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("claim"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(claimItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputUnderFinance(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator underFinanceItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("CarFinancing"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(underFinanceItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputMaritalStatus(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator MaritalStatusItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("GenderMD"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(MaritalStatusItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputDateOfBirth(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        CommonHelper.inputTextLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("dd-dob")),"01");
        CommonHelper.inputTextLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("mm-dob")),"01");
        CommonHelper.inputTextLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("yyyy-dob")),"1980");
        CommonHelper.clickLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("DOBMD-next")));
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputDrivingExperience(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator drivingExperienceItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("drivingExperience"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(drivingExperienceItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputPostalCode(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        CommonHelper.inputTextLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("quotePostalCode")),"10110");
        CommonHelper.clickLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("quotePostalCode-next")));
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputNCB(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator ncbItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("hdDeclareNCB"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(ncbItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> inputPolicyStart(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        Locator policyStartItemLocator = CommonHelper.getLocatorWithAttributeNameRandom(
            CommonHelper.makeDataSeleniumNameTag("policyStartDate"), 
            "",
            "data-selenium-value"
            );
        CommonHelper.clickLocator(policyStartItemLocator);
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
    public Map<String,String> selectedGetQuoteButton(){
        Boolean result = false;
        Map<String,String> outputMap = new HashMap<String,String>();
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        CommonHelper.clickLocator(CommonHelper.getLocator(CommonHelper.makeDataSeleniumNameTag("getQuote")));
        result = true;
        page.waitForTimeout(3000);
        outputMap.put("result", CommonHelper.convertBooleanToString(result));
        return outputMap;
    }
}