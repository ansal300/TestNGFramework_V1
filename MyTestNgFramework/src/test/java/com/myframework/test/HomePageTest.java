package com.myframework.test;

import com.aventstack.extentreports.Status;
import com.google.common.truth.Truth;
import com.myframework.driver.Driver;
import com.myframework.driver.DriverManager;
import com.myframework.pages.HomePage;
import com.myframework.pages.LoginPage;
import com.myframework.reports.ExtentLogger;
import com.myframework.reports.ExtentManager;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class HomePageTest extends  BaseTest
{

    @Test(description = "my test",dataProvider ="getTestData")
    public void HomePageTest(String username,String password,String header) throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        HomePage homePage=new HomePage();

        loginPage.userLogsIn(username,password).verifyUserIsLoggedIn(header);
        ExtentLogger.pass("User has logged in");
    }

    @DataProvider()
    public static Object[][] getTestData()
    {

        return new Object[][] {{"standard_user","secret_sauce","Swag Labs"}};
    }


}
