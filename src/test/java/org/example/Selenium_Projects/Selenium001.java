package org.example.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium001 {

    @Test
    public void test_selenium(){

        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://10.1.120.164/WebUi/Account/Index");
        webdriver.findElement(By.id("details-button")).click();
        webdriver.findElement(By.id("proceed-link")).click();
        WebElement username=webdriver.findElement(By.id("username"));
        username.sendKeys("hclr@ac.com");
        webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/button")).click();
        username.sendKeys(Keys.RETURN);
        WebElement password=webdriver.findElement(By.id("password"));
        password.sendKeys("Testing@1234");
        WebElement login=webdriver.findElement(By.id("btnlogin"));
        login.click();

    }
}
