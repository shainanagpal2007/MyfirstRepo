package com.vapasi.selenium.helpers;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListenerImpl implements ITestListener{
    @Override
    public void onTestFailure(ITestResult Result) {
        try {
            Utils.takeScreenshot(Driver.getDriver());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
