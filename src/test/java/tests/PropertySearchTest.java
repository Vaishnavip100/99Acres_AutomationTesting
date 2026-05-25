package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.PropertyDetailPage;
import pages.SearchResultsPage;

public class PropertySearchTest extends BaseTest {

    @Test
    public void verifyPropertySearch() {
        String city="Vijayawada";

        HomePage home=new HomePage(driver);
        home.clickBuy();
        home.selectCity(city);
        home.selectBhk("2");
        home.clickSearch();

        SearchResultsPage result=new SearchResultsPage(driver);

        result.clickFirstProperty();

        PropertyDetailPage detail=new PropertyDetailPage(driver);

        Assert.assertTrue(detail.verifyPropertyTitle());

        Assert.assertTrue(detail.verifyPropertyPrice());

        Assert.assertTrue(detail.verifyPropertyLocation(city));

        System.out.println("Property Title : " + detail.getPropertyTitle());
        System.out.println("Property Price : " + detail.getPropertyPrice());
        System.out.println("Property Location : " + detail.getPropertyLocation());
    }
    
    @Test
    public void verifyEmptySearch() {
        HomePage home=new HomePage(driver);
        home.clickBuy();
        home.clickSearch();

        SearchResultsPage result=new SearchResultsPage(driver);

        Assert.assertTrue(result.verifyValidationMessage());
    }
}