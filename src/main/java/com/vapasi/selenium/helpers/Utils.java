package com.vapasi.selenium.helpers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Utils
{
    public static void takeScreenshot(WebDriver driver) throws IOException {
        String time = null;
        File testresultfile;
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String screenshotName = time+".png";
        testresultfile=new File(System.getProperty("user.dir")+"/screenshots/"+screenshotName);
        FileHandler.copy(src, testresultfile.getAbsoluteFile());
        String  filePath = testresultfile.toString();
        System.out.println(filePath);
        String screenshot="<img src='../../screenshots/"+screenshotName+"' width='400'/>";
        Reporter.getCurrentTestResult().setAttribute("Screenshot",screenshot);
        Reporter.log(screenshot);
    }

}
