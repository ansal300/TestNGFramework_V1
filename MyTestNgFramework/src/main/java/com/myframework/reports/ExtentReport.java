package com.myframework.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.myframework.constants.Constants;

public class ExtentReport {

    public static ExtentReports extent;
    public static  ExtentTest test;

    public static void initReports()
    {
        extent = new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter(Constants.getReportPath());
        extent.attachReporter(spark);
    }

    public static void createTest(String testName)
    {
        test=extent.createTest(testName);
        ExtentManager.setTest(test);
    }

    public static void flushReports()
    {
        extent.flush();
    }
}
