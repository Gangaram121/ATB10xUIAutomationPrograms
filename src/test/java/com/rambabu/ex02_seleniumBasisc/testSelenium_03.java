package com.rambabu.ex02_seleniumBasisc;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testSelenium_03 {
    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01(){

        // Selenium 3
        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");



    }

}
