package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Use @before junit method for open a browser for method
    public void setup() {
        openbrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //computer element
        clickOnElement(By.linkText("Computers"));

        //Actuall result
        String actualmsg=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));

        //expected result
        String expectedresult = "Computers";

        //Match actual result and expectedresult
        Assert.assertEquals(actualmsg, expectedresult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //Electronics elements
        clickOnElement(By.linkText("Electronics"));

        //Actalresult
        String actualmsg =getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        //ecpectedresult
        String expectedresult = "Electronics";

        //match actallresult and expectedresult
        Assert.assertEquals(actualmsg, expectedresult);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //Apparelink elements
        clickOnElement(By.linkText("Apparel"));


        //actualresult
        String actualmsg=getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        //expectedresult
        String expectedmsg = "Apparel";

        //match actuall and expected result
        Assert.assertEquals("User is not on appareal page", actualmsg, expectedmsg);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //digitaldownload elements
        clickOnElement(By.linkText("Digital downloads"));

        //actualresult
        String actualmsg=getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        //expectedresult
        String expectedmsg = "Digital downloads";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //bboks elements
        clickOnElement(By.linkText("Books"));

        //actualresult
        String actualmsg =getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

        //expectedresult
        String expectedmsg = "Books";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //jewelry elemetns
        clickOnElement(By.linkText("Jewelry"));

        //actualresult
        String actualmsg =getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

        //expectedresult
        String expectedmsg = "Jewelry";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Giftcard elements
        clickOnElement(By.linkText("Gift Cards"));

        //actualresult
        String actualmsg =getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        //expectedresult
        String expectedmsg = "Gift Cards";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @After
    //Here After method for close the browser
    public void teardown() {
        closebrowser();

    }

}
