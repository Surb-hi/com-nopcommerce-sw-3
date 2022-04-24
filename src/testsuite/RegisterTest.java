package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Use @before junit method for open a browser for method
    public void setup() {
        openbrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //regiter elements
        clickOnElement(By.linkText("Register"));

        //actualresult
        String actualmsg =getTextFromElement(By.xpath("//a[contains(text(),'Register')]"));


        //expectedresult
        String expectedmsg = "Register";

        ////match actalresult and expected result
        Assert.assertEquals("", actualmsg, expectedmsg);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //regiter elements
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        //gender elements
        clickOnElement(By.id("gender-female"));

        //Firstname elements
        sendTextToElement(By.id("FirstName"),"surbhi");

        //Lastname elements
        sendTextToElement(By.name("LastName"),"kakadiya");

        //Date of birth elements
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[2]"));

        //month of birth elements
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[6]"));

        //Year of birth elements
        clickOnElement(By.xpath("//option[contains(text(),'1997')]"));

        //Email address elements
        sendTextToElement(By.name("Email"),"prime3@gmail.com");

        // Password elements
        sendTextToElement(By.name("Password"),"prime123");

        //Confirm password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"prime123");

        //Click on REGISTER button
        clickOnElement(By.xpath("//button[@id='register-button']"));

        //actualresult
        String actualmsg=getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));

        //expected result
        String expectedresult="Register";

        //match actualresult and xpectetd result
        Assert.assertEquals("User is alredy exit",actualmsg,expectedresult);
    }
}
