package com.test.nhs.tests;

import com.test.nhs.utils.BrowserUtils;
import com.test.nhs.utils.ConfigReader;
import com.test.nhs.utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = DriverHelper.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.readProperty("nhs_url"));

    }

    @AfterMethod
    public void tearDown(){
        BrowserUtils.getScreenShot(driver,"nhs");
        driver.quit();

    }
}
