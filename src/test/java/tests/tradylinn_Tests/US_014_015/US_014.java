package tests.tradylinn_Tests.US_014_015;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradyLinnPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014 {
    TradyLinnPages trd=new TradyLinnPages();
    SoftAssert soft=new SoftAssert();
    Actions action=new Actions(Driver.getDriver());
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    // js.executeScript("arguments[0].click();",trd.attirbute);
    Select select;

    @BeforeMethod
    public void before(){
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
        ReusableMethods.waitFor(5);
        trd.hesabim.click();
        //        User clicks "Store Manager"
        trd.storeManager.click();
        //        User clicks "Kuponlar"
        trd.choiceContainsElement(trd.myStoreMenu,"Kuponlar").click();
        //4) User clicks "Yeni Ekle" button
        trd.addCoupon.click();
    }

    @Test
    public void task_001() {
        //User verify displayed "Resriction"
         soft.assertTrue(trd.restriction.isDisplayed());
        //User enter "Minimum spend"
        trd.minimum_amount.sendKeys("20");
        //User enter "maximum spend"
        trd.maximum_amount.sendKeys("50");


    }
    @Test
    public void task_002() {
        //User clicks "Individual use only"
        trd.individual_use.click();
        //User clicks "Exlude sale items"
        trd.exclude_sale_items.click();
    }
    @Test
    public void task_003() {
        //User clicks "Exlude products"
        select=new Select(trd.exclude_product_categories);
        select.selectByVisibleText("  Accessories");
        //User clicks "Product Categories"
        select=new Select(trd.product_categories);
        select.selectByVisibleText("Kapüşonlular");
    }

}
