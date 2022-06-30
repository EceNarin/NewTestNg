package tests.tradylinn_Tests.US_008_009;
import org.testng.annotations.Test;
import pages.TradyLinnPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009 {
    TradyLinnPages trd=new TradyLinnPages();
    SoftAssert soft=new SoftAssert();
    Actions action=new Actions(Driver.getDriver());
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        //extentTest=extentReports.createTest("E2E","stepConfigration");
        // User goes to tradylinn.com
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //        User clicks "Giriş Yap"
        trd.girisyap.click();
        //        User enters email
        trd.email.sendKeys(ConfigReader.getProperty("userMailOrtak"));
        //        User enters password
        trd.password.sendKeys(ConfigReader.getProperty("userPasswordOrtak"));
        //        User clicks "Giriş Yap" button
        trd.login.click();
        //        User clicks "Hesabım"
        Thread.sleep(5000);
        trd.hesabim.click();
        Thread.sleep(5000);
        trd.storeManager.click();
        //1. User clicks "Ürünler" button
        trd.choiceContainsElement(trd.myStoreMenu,"Ürün").click();
        //2. User clicks "Yeni Ekle" button
        trd.addNewProduct.click();
    }
    @Test
    public void task_001() {
        // User scrolls down the page
        action.sendKeys(Keys.PAGE_DOWN,Keys.DOWN).perform();
        // User verifies "Shipping" menu  is displayed
        soft.assertTrue(trd.shipping.isDisplayed());
        //User clicks "Shipping" menu


    }
    @Test
    public void task_002() {
        //10) User scrolls down the page
        action.sendKeys(Keys.PAGE_DOWN,Keys.DOWN).perform();
        //User clicks "Shipping" menu
        ReusableMethods.waitFor(5);
        trd.shipping.click();
        //User enters a data into "weight" input
        trd.weight.sendKeys("20");
        //User enters a data into "length" input
        trd.length.sendKeys("50");
        //User enters a data into  "width " input
        trd.width.sendKeys("60");
        //User enters a data into "height" input
        trd.height.sendKeys("50");
        // User  selects "Shipping class/ Processing Time" dropdown menu tab
        Select select=new Select(trd.processingTime);
        select.selectByVisibleText("1-2 weeks");
    }

}

