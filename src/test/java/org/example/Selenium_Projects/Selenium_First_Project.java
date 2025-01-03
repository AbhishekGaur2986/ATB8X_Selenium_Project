package org.example.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium_First_Project {

    @Test
    public void myProject() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--incognito");


        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://katalon-demo-cura.herokuapp.com/");
        edgeDriver.findElement(By.id("btn-make-appointment")).click();
        WebElement username = edgeDriver.findElement( By.id("txt-username"));
        username.sendKeys("John Doe");
        WebElement password = edgeDriver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement login = edgeDriver.findElement(By.id("btn-login"));
        login.click();

        assertThat(edgeDriver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println(edgeDriver.getCurrentUrl());

        Thread.sleep(3000);
        edgeDriver.quit();

    }
}
