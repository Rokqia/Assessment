package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckOutPage extends HomePage{

    private By confirmButton = By.id("okayButton");
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void confirmCheckOutProcess(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(confirmButton).click();
    }

}
