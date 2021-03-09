package com.vapasi.selenium.helpers;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

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
        testresultfile=new File(System.getProperty("user.dir")+"/"+time+".png");
        FileHandler.copy(src, testresultfile.getAbsoluteFile());
        String  filePath = testresultfile.toString();
        System.out.println(filePath);
        Reporter.log("<img src='"+filePath+"'");

        //("screenshots\" + scenario.getId().split(";")[0] + "\" + scenario.getName().replaceAll("\s", "") + "" + timeStamp + ".png");
        //Reporter.log("<a href='"+ src.getAbsolutePath() + "'> <img src='"+ src.getAbsolutePath() + "' height='100' width='100'/> </a>");
    }

}
