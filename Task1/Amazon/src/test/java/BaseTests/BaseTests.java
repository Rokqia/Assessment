package BaseTests;

import Pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        //driver.manage().window().maximize();
        homePage = new HomePage(driver);
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
