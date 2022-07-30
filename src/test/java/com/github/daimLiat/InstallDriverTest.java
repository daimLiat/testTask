package com.github.daimLiat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

@Disabled
public class InstallDriverTest {

//    @Disabled
    @Test
    public void chromeSession() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jetbrains.com/teamcity/");
    }

//    @Disabled
    @Test
    public void firefoxSession() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.jetbrains.com/teamcity/");
    }
}
