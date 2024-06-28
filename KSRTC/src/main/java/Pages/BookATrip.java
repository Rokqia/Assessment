package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookATrip extends HomePage{

    private By selectSeatButton = By.xpath("(//div[@class='selectbutton'])[1]");
    private By boardingPoint = By.xpath("(//div[@class='point-inp flex-vc'])[1]");
    private By boardOption = By.xpath("//div[@class='pickups']//div[@class='col-time']");
    private By dropPoint = By.xpath("(//div[@class='point-inp flex-vc'])[2]");
    private By dropOption = By.xpath("//div[@class='point-opt active']/div");
    private By providePassengerInfoButton = By.className("btnPassDetails");
    private By mobileNoField = By.name("mobileNo");
    private By emailIDField = By.name("email");
    private By passengerDetailsButton = By.xpath("(//div[@class='navswitchbtn flex-all-c'])[1]");
    private By nameField = By.name("paxName[0]");
    private By genderRadioButton = By.name("paxGender[0]");
    private By femaleButton = By.xpath("(//div[@class='radio-btn'])[2]");
    private By ageField = By.name("paxAge[0]");
    private By concessionRadioButton= By.name("paxConcessionType[0]");
    private By concessionType = By.className("radio-btn");
    private By cardIDRadioButton = By.name("paxIDCardType[0]");
    private By cardId = By.xpath("(//div[@class='radio-btn'])[1]");
    private By cardIdNo = By.name("paxIDCardNo[0]");
    private By countryRadioButton = By.name("paxNationality[0]");
    private By countryButton = By.xpath("(//div[@class='radio-btn'])[2]");
    private By checkOutButton = By.xpath("//div[contains(text(), 'Proceed to Checkout')]");
    private By selectSeatAssert = By.xpath("(//span[@class='greentickmark'])[1]");
    private By selectPickupAndDropoff= By.xpath("(//span[@class='greentickmark'])[2]");
    private By customerDetailsAssert = By.xpath("(//span[@class='greentickmark'])[3]");



    public BookATrip(WebDriver driver) {
        super(driver);
    }

    public void clickSelectSeatButton(){
        driver.findElement(selectSeatButton).click();
    }
    public void selectSeat(String seatNo){
        WebElement seatNumber = driver.findElement(By.xpath("//div[@class= 'seatlook' and contains(text(), '"+seatNo+"')]"));
        seatNumber.click();
    }
    public void selectBoardingPoint(){
        driver.findElement(boardingPoint).click();
        driver.findElement(boardOption).click();
    }
    public void selectDroppingPoint(){
        driver.findElement(dropPoint).click();
        driver.findElement(dropOption).click();
    }
    public String getSelectSeatAssert(){
        return driver.findElement(selectSeatAssert).getAttribute("class");
    }
    public String getSelectPickupAndDropoff(){
        return driver.findElement(selectPickupAndDropoff).getAttribute("class");
    }
    public String getCustomerDetailsAssert(){
        return driver.findElement(customerDetailsAssert).getAttribute("class");
    }
    public void clickProvidePassengerDetails(){
        driver.findElement(providePassengerInfoButton).click();
    }
    public void setMobileNumber(String mobileNumber){
        driver.findElement(mobileNoField).sendKeys(mobileNumber);
    }
    public void setEmailID(String email){
        driver.findElement(emailIDField).sendKeys(email);
    }
    public void processedToPassengerDetails(){
        driver.findElement(passengerDetailsButton).click();
    }
    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void setGender(){
        driver.findElement(genderRadioButton).click();
        driver.findElement(femaleButton).click();
    }
    public void setAge(String age){
        driver.findElement(ageField).sendKeys(age);
    }
    public void setConcession(){
        driver.findElement(concessionRadioButton).click();
        driver.findElement(concessionType).click();
    }
    public void setCardID(){
        driver.findElement(cardIDRadioButton).click();
        driver.findElement(cardId).click();
    }
    public void setCardIDNumber(String cardno){
        driver.findElement(cardIdNo).sendKeys(cardno);
    }
    public void setCountry(){
        driver.findElement(countryRadioButton).click();
        driver.findElement(countryButton).click();
    }
    public CheckOutPage processedToCheckout(){
        driver.findElement(checkOutButton).click();
        return new CheckOutPage(driver);
    }





}
