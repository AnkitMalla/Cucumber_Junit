package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //@Before
    public void setupScenario() {
        System.out.println("Setting up browser using cucumber @Before each scenario");
    }


    @After
    public void teardownScenario(Scenario scenario) {
        //we will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }
}


////        //@BeforeStep
////        public void setupScenarioStep(){
////            System.out.println("Setting up browser using cucumber @Before each scenario step");
////        }
////
////        // @BeforeStep
////        public void setupScenarioStepForLogin(){
////            System.out.println("Setting up browser using cucumber @Before each scenario step for login");
////        }
////    @Before (value = "@login", order = 2)
//public void setupForLogin(){
//    //if you want to run specific feature/scenario
//    System.out.println("Setting up browser scnario using cucumber @Before @login scenario");
//
//

