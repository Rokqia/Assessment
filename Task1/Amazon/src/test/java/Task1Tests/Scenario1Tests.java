package Task1Tests;

import BaseTests.BaseTests;
import Pages.CartPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Scenario1Tests extends BaseTests {

    private String productTitle;

    @Test(priority = 1)
    public void verifyAmazonHomePageLoadSuccessfully(){
        String homePaheTitle = homePage.getHomePageTitle();
        assertTrue(homePaheTitle.contains("Amazon"), "The HomePage doesn't load successfully");
    }

    @Test(priority = 2)
    public void searchForCarAccessories(){
        homePage.searchForProduct("car accessories");
        String searcgResultText = homePage.getSearchResult();
        assertTrue(searcgResultText.contains("car accessories"), "The search results page for car accessories is not displayed.");
    }

    @Test(priority = 3)
    public void selectFirsItem(){
        String firstItemText = homePage.getFirstItemText();
        homePage.selectFirstItem();
        productTitle = homePage.getProductTitle();
        assertTrue(firstItemText.contains(productTitle)," The product details page for the first item isn't displayed.");
    }

    @Test(priority = 4)
    public void addItemToCartSuccessfully(){
        homePage.addProductToCart();
        String cartText = homePage.getCartItemText();
        assertEquals(cartText,"Added to Cart", "The item doesn't added to cart");
    }

    @Test(priority = 5)
    public void verifyItemAddedSuccessfuly(){
        CartPage cartPage = homePage.clickCartButton();
        String cartProductTitle = cartPage.getProductText();
        assertTrue(cartProductTitle.contains(productTitle), ": The cart doesn't contain the item that was added.");
    }



}
