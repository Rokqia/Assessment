package Task2;

import Pages.BookATrip;
import Pages.CheckOutPage;
import baseTest.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Scenario1 extends BaseTests {

    BookATrip seatInformation;
    CheckOutPage checkOutPage;

    @Test(priority = 1)
    public void verifyHomePageLoadSuccessfully(){
        String homePageHeader = homePage.getHomePageHeader();
        assertTrue(homePageHeader.contains("Welcome to KSRTC | 080-26252625"), "The HomePage doesn't load successfully");
    }

    @Test(priority = 2)
    public void verifyTicketBooking(){
        homePage.chooseLeavingFromCity();
        homePage.chooseGoingTo();
        homePage.chooseArrivalDay();
        seatInformation = homePage.searchForBus();
    }
    @Test(priority = 3)
    public void verifySelectASeatSuccessfully(){
        seatInformation.clickSelectSeatButton();
        seatInformation.selectSeat("41");
        String greenMark = seatInformation.getSelectSeatAssert();
        assertTrue(greenMark.contains("greentickmark"), "The Seat hasn't been selected");
    }
    @Test(priority = 4)
    public void verifySelectPickupAndDropoffuccessfully(){
        seatInformation.selectBoardingPoint();
        seatInformation.selectDroppingPoint();
        String greenMark = seatInformation.getSelectPickupAndDropoff();
        seatInformation.clickProvidePassengerDetails();
        assertTrue(greenMark.contains("greentickmark"), "The Pickup And Drop off point haven't been selected");
    }
    @DataProvider(name = "CustomerData")
    public static Object[][] customerdata() {
        return new Object[][]{
                {"6789125987", "rokqyaaraby@gmail.com"}
        };
    }
    @Test(priority =5 , dataProvider = "CustomerData")
    public void validCustomerDetails(String mobileNo, String emailId){
        seatInformation.setMobileNumber(mobileNo);
        seatInformation.setEmailID(emailId);
        seatInformation.processedToPassengerDetails();
        String greenMark = seatInformation.getSelectPickupAndDropoff();
        assertTrue(greenMark.contains("greentickmark"), "The Customer Data hasn't been filled");
    }
    @DataProvider(name = "PassengerData")
    public static Object[][] passengerdata() {
        return new Object[][]{
                {"Rokaya", "25", "123456"}
        };
    }
    @Test(priority = 6, dataProvider = "PassengerData")
    public void validPassengerDetails(String name, String age, String cardidNo){

        seatInformation.setName(name);
        seatInformation.setGender();
        seatInformation.setAge(age);
        seatInformation.setConcession();
        seatInformation.setCardID();
        seatInformation.setCardIDNumber(cardidNo);
        seatInformation.setCountry();
    }
    @Test(priority = 7)
    public void verifyCheckoutProcess(){
        checkOutPage = seatInformation.processedToCheckout();
        checkOutPage.confirmCheckOutProcess();
    }

}
