package com.rambabu.ex02_seleniumBasisc;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Task {
    @Description("Verify the current URL changes to https://katalon-demo-cura.herokuapp.com/#appointment")
    @Test
    public void test_negative_Make_Appointment() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com");

        WebElement buttonMakeAppointment = driver.findElement(By.id("btn-make-appointment"));
        buttonMakeAppointment.click();

        Thread.sleep(3000);

        WebElement userNameInputBox = driver.findElement(By.id("txt-username"));
        userNameInputBox.sendKeys("John Doe");

        Thread.sleep(3000);

        WebElement passwordInputBox = driver.findElement(By.id("txt-password"));
        passwordInputBox.sendKeys("ThisIsNotAPassword");

        WebElement buttonLogin = driver.findElement(By.id("btn-login"));
        buttonLogin.click();

        Thread.sleep(3000);


        String cUrl=driver.getCurrentUrl();
        Assert.assertEquals(cUrl,"https://katalon-demo-cura.herokuapp.com/#appointment");


        driver.quit();


    }
}
