package com.myframework.test;

import com.aventstack.extentreports.Status;
import com.google.common.truth.Truth;
import com.myframework.driver.Driver;
import com.myframework.driver.DriverManager;
import com.myframework.pages.LoginPage;
import com.myframework.reports.ExtentLogger;
import com.myframework.reports.ExtentManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(description = "verify Login")
    public void verifyLoginLockedOutUser() throws InterruptedException {

        LoginPage loginPage=new LoginPage();
        loginPage.userLogsIn("locked_out_user","secret_sauce");
        ExtentLogger.pass("User has logged in");
        loginPage.verifyErrorMessageForLockedOutUser();
        ExtentLogger.pass("User verified Error");
    }

}
