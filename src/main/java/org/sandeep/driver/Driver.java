package org.sandeep.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sandeep.constants.FramworkConstants;
import org.sandeep.utilities.ReadPropertyFile;

import java.io.IOException;
import java.nio.ReadOnlyBufferException;

public final class Driver {

    private Driver(){}

    public static void initDriver() throws Exception {
        if(DriverManager.getDriver()==null) {
            System.setProperty("webdriver.chrome.driver", FramworkConstants.getChromDriverPath());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
        }
    }

    public static void quitDriver(){
        if(DriverManager.getDriver()!=null ) {
            DriverManager.getDriver().quit();
            DriverManager.remove();
        }
    }
}
