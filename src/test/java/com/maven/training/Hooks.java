package com.maven.training;

import com.maven.training.driver.DriverHelpers;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    private DriverHelpers driverHelpers = new DriverHelpers();
    Scenario scenario;


    @cucumber.api.java.Before()
    public void setUp() {
        driverHelpers.openBrowser();
        driverHelpers.maximiseBrowser();
        driverHelpers.navigateTo("http://www.argos.co.uk");
        driverHelpers.applyImpWaits();
        driverHelpers.applyActions();
    }

    @cucumber.api.java.After
    public void tearDown() {
       boolean conditon= scenario.isFailed();
       if(conditon){
         // takeScreenShot();
       }
         driverHelpers.closeBrowser();
    }
}
