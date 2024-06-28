package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends HomePage{

    private By productText = By.xpath("//a[@class='a-link-normal sc-product-link']//img[@class='sc-product-image']");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductText(){
        WebElement imageElement = driver.findElement(productText);
        return imageElement.getAttribute("alt");
        //return driver.findElement(productText).getText();
    }


}
