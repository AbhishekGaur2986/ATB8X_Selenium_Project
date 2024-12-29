package org.example.Selenium_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class Selenium003 {

    @Test
    public void test_assert(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://google.com");
        driver.navigate().forward();
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();

    }
}
