package Task1Tests;

import BaseTests.BaseTests;
import Pages.CartPage;
import Pages.TodayDealsPage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class Scenario2Test extends BaseTests {

    TodayDealsPage todayDealsPage;
    private String randomHeadphoneItemTitle;
    private String randomGroceryItemTitle;
    List<String> filterTexts = new ArrayList<>();

    @Test(priority = 1)
    public void verifyAmazonTodayDealsPageLoadSuccessfully(){
        homePage.dismissAlert();
        todayDealsPage = homePage.clickTodayDeals();
        String pageName = todayDealsPage.getPageName();
        assertTrue(pageName.contains("Today's Deals"), "The Today's Deals Page doesn't load successfully");
    }

    @Test(priority = 2)
    public void filterHeadPhonesItems() {
        todayDealsPage.clickSeeMoreDepartments();
        todayDealsPage.selectHeadPhones();
        filterTexts = todayDealsPage.getFilterTexts();
        assertTrue(filterTexts.contains("Headphones & Earbuds"), "The filter does not contain 'Headphones & Earbuds'");
    }

    @Test(priority = 3)
    public void selectDiscount(){
        todayDealsPage.select10orMoreDiscount();
        filterTexts = todayDealsPage.getFilterTexts();
        assertTrue(filterTexts.contains("10% off or more"), "The filter does not contain '10% off or more'");
    }

    @Test(priority = 4)
    public void selectRandomItem(){
        todayDealsPage.findRandomItem();
        String itemTitle = todayDealsPage.getItemText();
        todayDealsPage.selectItem();
        randomHeadphoneItemTitle = todayDealsPage.getRandomProductTitle();
        //assertEquals(itemTitle, productTitle, "The products not the same");
        System.out.println("Item Title: " + itemTitle);
        System.out.println("Random Item Title: " + randomHeadphoneItemTitle);
        assertTrue(itemTitle.contains(randomHeadphoneItemTitle),"The products are not the same");
    }


    @Test(priority = 5)
    public void addToCartSuccessfully(){
        todayDealsPage.clickAddToCart();
        String cartText = todayDealsPage.getCartAssertion();
        assertEquals(cartText,"Added to Cart", "The item doesn't added to cart");
    }

    @Test(priority = 6)
    public void verifyItemAddedSuccessfuly(){
        CartPage cartPage = todayDealsPage.clickCart();
        String cartProductTitle = cartPage.getProductText();
        assertTrue(cartProductTitle.contains(randomHeadphoneItemTitle), ": The cart doesn't contain the item that was added.");
    }

    @Test(priority = 7)
    public void verifyFilterGroceryItemsSuccessfully(){
        todayDealsPage = homePage.clickTodayDeals();
        todayDealsPage.clickSeeMoreDepartments();
        todayDealsPage.selectGroceryDepartment();
        todayDealsPage.select10orMoreDiscount();
        todayDealsPage.findRandomItem();
        String itemTitle = todayDealsPage.getItemText();
        todayDealsPage.selectItem();
        randomGroceryItemTitle = todayDealsPage.getRandomProductTitle();
        assertTrue(itemTitle.contains(randomGroceryItemTitle),"The products are not the same");
    }
    @Test(priority = 8)
    public void addGroceryItemToCartSuccessfully(){
        todayDealsPage.clickAddToCart();
        String cartText = todayDealsPage.getCartAssertion();
        assertEquals(cartText,"Added to Cart", "The item doesn't added to cart");
    }
    @Test(priority = 9)
    public void verifyGroceryItemAddedSuccessfuly(){
        CartPage cartPage = todayDealsPage.clickCart();
        String cartProductTitle = cartPage.getProductText();
        assertTrue(cartProductTitle.contains(randomGroceryItemTitle), ": The cart doesn't contain the item that was added.");
    }


}
