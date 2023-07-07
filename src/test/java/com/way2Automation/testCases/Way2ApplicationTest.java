package com.way2Automation.testCases;

import com.way2Automation.BaseClass;
import com.way2Automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Way2ApplicationTest extends BaseClass {
    @Test
    public void homePageTest(){
        WebDriver driver =getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.frontPage();
        driver.close();
    }

}