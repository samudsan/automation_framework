package com.sandeep.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sandeep.driver.Driver;
import org.sandeep.driver.DriverManager;
import org.testng.annotations.Test;

public final class LoginPageTests extends BaseTest {

    private LoginPageTests(){} // To avoid other classes to instantiate this class

    @Test
    public void test1() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Dileep Samudrala", Keys.ENTER);
    }

}
