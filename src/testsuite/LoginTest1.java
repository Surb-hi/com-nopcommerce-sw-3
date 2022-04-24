package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest1 extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Use @before junit method for open a browser for method
    public void setup() {
        openbrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));

        //expected result
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the text elementsWebElement actualMsgElemment = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        //Validate actual and expected message
        Assert.assertEquals("Login test fail", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click in login method
       clickOnElement(By.linkText("Log in"));

        //Emailfield element
        sendTextToElement(By.id("Email"),"prime@gmail.com");

        //Passwordfield element
        sendTextToElement(By.name("Password"),"prime123");

        //loginbutton element
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //actual result
        String actualresult =getTextFromElement(By.linkText("Log out"));

        //expectedresult
        String expectedResult = "Log out";

        //Match expected and actual result
        Assert.assertEquals(expectedResult, actualresult);

    }
    @Test
    public void verifyTheErrorMessage() {
        //click on login field
        clickOnElement(By.linkText("Log in"));

        //Username elements
        sendTextToElement(By.id("Email"),"prime12@gmail.com");

        //Password elements
        sendTextToElement(By.name("Password"),"12345");

        //Loginbutton element
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //Actuall result
        String actuallmsg =getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));

        //Expected result
        String expectedresult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //match actual and expected result
        Assert.assertEquals(actuallmsg, expectedresult);
    }


    @After
    //Here After method for close the browser
    public void teardown() {
        closebrowser();
    }
}