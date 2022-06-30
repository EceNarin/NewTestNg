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

public class US_008 {
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
        //user clicks to  manage stock click button
        trd.manageStock.click();
        // user verify to if stockQuity textt box displayed
        soft.assertTrue(trd.stockQuity.isDisplayed());
        //user clear to stock quity tet box
        trd.stockQuity.clear();
        //User enters "Stock Quantity",
        trd.stockQuity.sendKeys("20");


    }
    @Test
    public void task_002() {
        //selects "Status" dropdown menu
        Select select=new Select(trd.allowBackorders);
        select.selectByVisibleText("Allow");
    }

}




