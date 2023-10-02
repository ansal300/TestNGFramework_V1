package com.myframework.test;

import com.myframework.driver.Driver;
import com.myframework.reports.ExtentManager;
import com.myframework.reports.ExtentReport;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {

    @BeforeSuite
    public void beforeSuit() {
        ExtentReport.initReports();
    }

    @BeforeMethod
    public void setUp(Method method) {
        Driver.initializeDriver();
        ExtentReport.createTest(method.getName());
    }

    @AfterMethod()
    public void tearDown() {
        Driver.tearDownDriver();
    }

    @AfterSuite
    public void afterSuit() {
        ExtentReport.flushReports();
    }

}
