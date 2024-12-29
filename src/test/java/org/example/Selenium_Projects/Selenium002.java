package org.example.Selenium_Projects;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.*;

public class Selenium002 {

    @Test
    public void testMethod01(){

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addExtensions(new File("C:\\Users\\gaur.abhishek\\IdeaProjects\\ATB8X_SeleniumProject\\src\\test\\java\\org\\example\\Selenium_Projects\\adblock.crx"));


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        //driver.manage().window().maximize();
        driver.get("https://google.com");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isEqualTo("https://google.comc");
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
