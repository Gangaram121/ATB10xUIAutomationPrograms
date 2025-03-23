package com.rambabu.ex02_seleniumBasisc;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testSelenium_06 {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();



    }
}
