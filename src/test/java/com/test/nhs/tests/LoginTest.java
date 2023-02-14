package com.test.nhs.tests;

import com.test.nhs.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validateSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        Assert.assertEquals(driver.getCurrentUrl(),"http://www.techtorialacademy.link/app");
    }
}
