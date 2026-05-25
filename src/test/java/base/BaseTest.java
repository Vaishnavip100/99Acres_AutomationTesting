package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTest {
    public WebDriver driver;
    ConfigReader config=new ConfigReader();

    @BeforeMethod
    public void setup() {
        String browser=config.getBrowser();

        if (browser.equalsIgnoreCase("chrome")) {
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(config.getBaseUrl());
    }
    
    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}