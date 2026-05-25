package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class PropertyDetailPage extends BasePage {
    By propertyTitle=By.id("bedWash");
    By propertyLocation=By.xpath("//*[@id='FloatingHeaderComponentTop']/div/div[2]/div[2]/h1/div[2]/span");
    By propertyPrice=By.id("pdPrice");

    public PropertyDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyPropertyTitle() {
        waitForElement(propertyTitle);
        return isDisplayed(propertyTitle);
    }

    public boolean verifyPropertyPrice() {
        waitForElement(propertyPrice);
        return isDisplayed(propertyPrice);
    }

    public boolean verifyPropertyLocation(String city) {
        waitForElement(propertyLocation);
        return getText(propertyLocation).contains(city);
    }

    public String getPropertyTitle() {
        return getText(propertyTitle);
    }

    public String getPropertyPrice() {
        return getText(propertyPrice);
    }

    public String getPropertyLocation() {
        return getText(propertyLocation);
    }
}