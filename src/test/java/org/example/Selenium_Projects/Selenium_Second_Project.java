package org.example.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Selenium_Second_Project {

    @Test
    public void myProject() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--incognito");


        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://awesomeqa.com/practice.html");
        //edgeDriver.findElement(By.name("btn-make-appointment")).click();
        WebElement username = edgeDriver.findElement( By.name("firstname"));
        username.sendKeys("Abhishek");
        WebElement password = edgeDriver.findElement(By.name("lastname"));
        password.sendKeys("Gaur");
        WebElement gender = edgeDriver.findElement(By.id("sex-0"));
        gender.click();
        WebElement exp = edgeDriver.findElement(By.id("exp-6"));
        exp.click();
        WebElement datepicker = edgeDriver.findElement(By.id("datepicker"));
        datepicker.sendKeys("29/12/2024");
        WebElement profession = edgeDriver.findElement(By.id("profession-1"));
        profession.click();
        WebElement tools = edgeDriver.findElement(By.id("tool-2"));
        tools.click();
        WebElement continents = edgeDriver.findElement(By.xpath("/html/body/div/div/div[25]/div[2]/select"));
        continents.click();
        WebElement continentsselection = edgeDriver.findElement(By.xpath("/html/body/div/div/div[25]/div[2]/select/option[6]"));
        continentsselection.click();
        WebElement selecomm = edgeDriver.findElement(By.xpath("/html/body/div/div/div[27]/div[2]/select/option[4]"));
        selecomm.click();

        //WebElement file = edgeDriver.findElement(By.id("photo"));
        //file.click();

        Thread.sleep(3000);
        edgeDriver.quit();

    }
}
