package com.rambabu.ex01_seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testSelenium_01 {
    @Test
    public void test_verifyVWOlogin(){

        // write the code which will execute the perform the ui intereaction
        EdgeDriver Driver = new EdgeDriver();
        Driver.get("https://app.vwo.com");
        System.out.println(Driver.getTitle());

    }
}
