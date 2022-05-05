package org.sandeep.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sandeep.constants.FramworkConstants;

public class Driver {

    public static void initDriver() {
        if(DriverManager.getDriver()==null) {
            System.setProperty("webdriver.chrome.driver", FramworkConstants.getChromDriverPath());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get("https://www.google.com");
        }
    }

    public static void quitDriver(){
        if(DriverManager.getDriver()!=null ) {
            DriverManager.getDriver().quit();
            DriverManager.remove();
        }
    }
}
