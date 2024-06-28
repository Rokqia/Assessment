package baseTest;

import Pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        //this size will be not efficient in this site
        //driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
