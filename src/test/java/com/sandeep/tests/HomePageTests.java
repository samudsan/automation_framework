package com.sandeep.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sandeep.driver.Driver;
import org.sandeep.driver.DriverManager;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest{

    private HomePageTests(){} // To avoid other classes to instantiate this class


    @Test
    public void test3(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Sandeep Samudrala", Keys.ENTER);
    }
}
