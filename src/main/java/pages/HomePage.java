package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By buyButton=By.id("inPageSearchForm_0");
    By searchBox=By.id("keyword2");
    By searchButton=By.xpath("//span[text()='Search']");
    By citySuggestion=By.xpath("//li[@id='0']");
    By allResidential=By.xpath("//div[@class='component__activeFilterHead']");
    By bedroomFilter=By.id("bedroom_num_wrap");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickBuy() {
        click(buyButton);
    }

    public void selectCity(String cityName) {
        click(searchBox);
        enterText(searchBox, cityName);
        waitForElement(citySuggestion);
        click(citySuggestion);
    }
    
    public void selectBhk(String bhk) {
    	click(searchBox);
        click(bedroomFilter);
        By bhkOption=By.xpath("//span[contains(text(),'" + bhk + " BHK')]");
        waitForElement(bhkOption);
        click(bhkOption);
    }
    
    public void clickAllResidential() {
        click(allResidential);
    }
    
    public void clickSearch() {
        click(searchButton);
    }
}