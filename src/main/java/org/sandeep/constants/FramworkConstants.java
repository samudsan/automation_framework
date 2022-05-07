package org.sandeep.constants;

public final class FramworkConstants {

    private FramworkConstants(){
        // To avoid other classes to create an object for this class
    }


    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
    private static final String URL = "https://www.google.com";

    public static String getChromDriverPath(){
        return CHROMEDRIVERPATH;
    }

}
