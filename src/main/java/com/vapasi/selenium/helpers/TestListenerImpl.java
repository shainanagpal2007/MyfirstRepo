package com.vapasi.selenium.helpers;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static com.vapasi.selenium.helpers.Utils.takeScreenshot;

public class TestListenerImpl implements ITestListener{
    @Override
    public void onTestFailure(ITestResult Result) {
        // TODO Auto-generated method stub
        System.out.println("The name of the testcase failed is :"+Result.getName());
        try {
            takeScreenshot(Driver.getDriver());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
