package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    private By homepageHeader = By.xpath("//div[@class='header-screen-reader-left']");
    private By leavingFromButton = By.xpath("//div[@id='fromCity_chosen']");
    private By searchFromCityField = By.xpath("//div[@id='fromCity_chosen']//input");
    private By leavingFromOption = By.xpath("//div[@id='fromCity_chosen']//li[@data-option-array-index='112']");
    private By goingToButton= By.cssSelector("#toCity_chosen");
    private By searchToCityField = By.xpath("//div[@id='toCity_chosen']//input");
    private By leavingToOption = By.xpath("//div[@id='toCity_chosen']//li[@data-option-array-index='13']");
    private By dateDepatureButton = By.xpath("//img[@id='imgDepartDate']");
    private By arrivalDate = By.xpath("//td[contains(@class, 'ui-datepicker-week-end') and .//a[text()='30']]");
    private By searchForBusButton = By.id("submitSearch");




    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getHomePageHeader(){
        return driver.findElement(homepageHeader).getText();
    }
    public void chooseLeavingFromCity(){
        driver.findElement(leavingFromButton).click();
        driver.findElement(searchFromCityField).sendKeys("CHIKKAMAGALURU");
        /*WebElement leavingFrom = driver.findElement(leavingFromList);
        Select fromCity = new Select(leavingFrom);
        fromCity.selectByVisibleText("Chikkamagaluru");*/
        WebElement fromCity = driver.findElement(leavingFromOption);
        fromCity.click();
    }

    public void chooseGoingTo(){
        driver.findElement(goingToButton).click();
        driver.findElement(searchToCityField).sendKeys("Bengaluru");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement toCity = driver.findElement(leavingToOption);
        toCity.click();
    }
    public void chooseArrivalDay(){
        driver.findElement(dateDepatureButton).click();

        WebElement dayArrival = driver.findElement(arrivalDate);
        dayArrival.click();
    }
    public BookATrip searchForBus(){
        driver.findElement(searchForBusButton).click();
        return new BookATrip(driver);
    }
}
