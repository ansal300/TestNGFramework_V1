package com.myframework.test;

import com.myframework.driver.Driver;
import com.myframework.reports.ExtentManager;
import com.myframework.reports.ExtentReport;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {

    @BeforeSuite
    public void beforeSuit() {
        //extent report initialization code moved to listener
    }

    @BeforeMethod
    public void setUp(Method method) {
        Driver.initializeDriver();
        //ExtentReport.createTest(method.getName()); -- this moved to listner
    }

    @AfterMethod()
    public void tearDown() {
        //extent report flush code moved to listener
    }

    @AfterSuite
    public void afterSuit() {
        ExtentReport.flushReports();
    }

}
