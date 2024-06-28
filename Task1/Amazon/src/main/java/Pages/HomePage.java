package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage {

    protected WebDriver driver;

    private By pageTitle = By.id("nav-logo-sprites");
    private By searchField = By.name("field-keywords");
    private By searchButton = By.id("nav-search-submit-button");
    private By searchResultText = By.xpath("//span[@class='a-color-state a-text-bold']");
    private By firstItem = By.xpath("//div[@data-index='4']//a[@tabindex='-1']");
    private By firstItemText = By.xpath("//div[@data-index='4']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']");
    private By productTitle = By.xpath("//span[@id='productTitle']");
    private By addToCartButton = By.name("submit.add-to-cart");
    private By cartButton = By.id("nav-cart-count-container");
    private By cartItemText = By.xpath("//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");
    private By todayDealsButton = By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']");
    private By dismissButton = By.xpath("//input[@data-action-type='DISMISS']");



    public String getHomePageTitle() {
        return driver.findElement(pageTitle).getAttribute("aria-label");
    }
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String product){
       WebElement Product = driver.findElement(searchField);
       Product.sendKeys(product);
       driver.findElement(searchButton).click();
    }

    public void selectFirstItem(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement firstElement = driver.findElement(firstItem);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstElement);
        firstElement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public String getSearchResult(){
        return driver.findElement(searchResultText).getText();
    }
    public String getFirstItemText(){
        return driver.findElement(firstItemText).getText();
    }
    public String getProductTitle(){
        return driver.findElement(productTitle).getText();
    }
    public String getCartItemText(){
        return driver.findElement(cartItemText).getText();
    }
    public void addProductToCart(){
        driver.findElement(addToCartButton).click();
    }
    public CartPage clickCartButton(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);
    }
    public void dismissAlert(){
        driver.findElement(dismissButton).click();
    }

    public TodayDealsPage clickTodayDeals(){
        driver.findElement(todayDealsButton).click();
        return new TodayDealsPage(driver);
    }



}
