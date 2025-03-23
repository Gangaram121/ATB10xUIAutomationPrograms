package com.rambabu.ex01_seleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class testSelenium_02 {
    @Description("Open the app.vwo.com verify the title")
    @Test
            public void  Test_selenium02(){
        // Open the URL
        ChromeDriver driver  = new ChromeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX), Create New Session Endpoint


        // Navigate the URL -> get the URL
        driver.get("https://app.vwo.com");


        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();




    }


}
