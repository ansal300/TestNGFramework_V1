package com.myframework.listeners;

import com.myframework.driver.Driver;
import com.myframework.reports.ExtentLogger;
import com.myframework.reports.ExtentManager;
import com.myframework.reports.ExtentReport;
import lombok.SneakyThrows;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

        ExtentReport.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() + " Test is passed*");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName() + " Test is failed*");
    }

    @Override
    public void onStart(ITestContext context) {

        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }
}

