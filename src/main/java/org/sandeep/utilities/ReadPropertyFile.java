package org.sandeep.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile(){}

    private static Properties property = new Properties();

    static{
        try{
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config/config.properties");
            property.load(file);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getValue(String key) throws Exception {
        String value = property.getProperty(key);
        if(value == null)
            throw new Exception("Property name"+ key +"not found. Please check config.properties file");
        return value;
    }
}
