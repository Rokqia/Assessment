package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TodayDealsPage extends HomePage{

    private By pageTitle = By.xpath("//a[@aria-label=\"Today's Deals\"]//span[@class='nav-a-content']");
    private By seeMoreDepartments = By.xpath("//a[@class='a-size-base a-link-normal']");
    private By electronicsDepartment = By.xpath("//input[@value='493964']/following-sibling::i[@class='a-icon a-icon-radio']");
    private By headphoneandAccessoriesButton = By.xpath("//input[@value='493964/24046923011']/following-sibling::i[@class='a-icon a-icon-radio']");
    private By headPhonesButton = By.xpath("//input[@value='493964/24046923011/172541']/following-sibling::i[@class='a-icon a-icon-radio']");
    private By discout10orMore = By.xpath("//input[@value='1' and @name='percentOff']/following-sibling::i[@class='a-icon a-icon-radio']");
    private By randomItem = By.xpath("//div[@data-test-index='34' and @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']//div[@class='ProductCard-module__imageWrapper_ytp7KTuzmF4mDTFCQLzr']");
    private By randomItemText = By.xpath("//div[@data-test-index='34' and @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']//span[@class='a-truncate-cut']");
    private By filterText = By.xpath("//div[@class='RefinementsBar-module__root_IeGRESKdTizHZsbDATnM']//button[@data-csa-c-type='uxElement']");
    private By productTitle = By.xpath("//span[@id='productTitle']");
    private By cartButton = By.id("nav-cart-count-container");
    private By cartItemText = By.xpath("//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");
    private By addToCartButton = By.cssSelector("#add-to-cart-button");
    private By clearFilterButton = By.xpath("//button[@data-tabulation-id='filter-clear-all']");
    private By groceryDepartment = By.xpath("//input[@value='16310211']/following-sibling::i[@class='a-icon a-icon-radio']");


    public TodayDealsPage(WebDriver driver) {
        super(driver);
    }

    public String getPageName(){
        return driver.findElement(pageTitle).getText();
    }
    public void clickSeeMoreDepartments(){
        WebElement seeMoreButton = driver.findElement(seeMoreDepartments);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", seeMoreButton);
        seeMoreButton.click();
    }
    public void selectHeadPhones(){
        driver.findElement(electronicsDepartment).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(headphoneandAccessoriesButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(headPhonesButton).click();
    }
    public void select10orMoreDiscount(){
       WebElement filterDiscount = driver.findElement(discout10orMore);
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filterDiscount);
       filterDiscount.click();
    }
    public void selectGroceryDepartment(){
        driver.findElement(groceryDepartment).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public void findRandomItem(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='5' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='5' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='11' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='11' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='15' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='15' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='19' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='19' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='23' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='23' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='27' and @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='27' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@data-test-index='31' and @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-index='31' and  @class='GridItem-module__container_PW2gdkwTj1GQzdwJjejN']")));

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        WebElement item = driver.findElement(randomItem);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",item);

        wait.until(ExpectedConditions.elementToBeClickable(item));
    }
    public void selectItem(){
        driver.findElement(randomItem).click();
    }
    public String getItemText(){
        WebElement imageElement = driver.findElement(By.xpath("//div[@data-test-index='34']//img[@class='ProductCardImage-module__image_SU6C7KYJpko3vQ2fK7Kf']"));
        return imageElement.getAttribute("alt");

        //return driver.findElement(randomItemText).getText();
    }

    public List<String> getFilterTexts() {
        List<WebElement> elements = driver.findElements(filterText);
        List<String> texts = new ArrayList<>();
        for (WebElement element : elements) {
            texts.add(element.getText());
        }
        return texts;
    }

    public String getRandomProductTitle(){
        return driver.findElement(productTitle).getText();
    }
    public String getCartAssertion(){

        return driver.findElement(cartItemText).getText();
    }
    public void clickAddToCart(){
       WebElement cart = driver.findElement(addToCartButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cart);
        cart.click();
    }
    public CartPage clickCart(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);
    }

    public void clearAllFilters(){
        driver.findElement(clearFilterButton).click();
    }

}
