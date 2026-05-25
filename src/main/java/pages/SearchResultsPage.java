package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
	 By firstProperty=By.xpath("(//a[contains(@class,'tupleNew__propertyHeading')])[1]");
	 By validationMessage = By.xpath("//span[contains(text(),'Please try again with the location included!')]");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyValidationMessage() {
        return isDisplayed(validationMessage);
    }
    
    public void clickFirstProperty() {
        click(firstProperty);
        for (String window:driver.getWindowHandles()) {
            driver.switchTo().window(window);
        }
        waitForElement(By.id("bedWash"));
    }
}