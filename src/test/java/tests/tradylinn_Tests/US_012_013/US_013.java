package tests.tradylinn_Tests.US_012_013;

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

public class US_013 {
    TradyLinnPages trd=new TradyLinnPages();
    SoftAssert soft=new SoftAssert();
    Actions action=new Actions(Driver.getDriver());
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    // js.executeScript("arguments[0].click();",trd.attirbute);

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
        //5) User fills "Code"text area
        trd.couponText.sendKeys("gkgkfjgkj");
    }
    @Test
    public void task_002() {
        //2)User fills the Description text area
        trd.descriptionText.sendKeys("jfdhfjhfjfhjdhfjhjdhfjfhjdhfjhdjfhjhncbncvbnbnc");
    }
    @Test
    public void task_003() {
        //1)User choose the discount type
        Select select=new Select(trd.discountType);
        select.selectByIndex(1);
    }
    @Test
    public void task_004() {
        //1)User fills the Coupon amount
        trd.couponAmount.clear();
        trd.couponAmount.sendKeys("89");
    }
    @Test
    public void task_005() {
        //1)User fills the Coupon expiry date
        trd.expireDate.sendKeys("2022/12/31");
    }
    @Test
    public void task_006() {
        //1) User clicks "Allow free shipping" checkbox
        trd.freeShip.click();
    }
    @Test
    public void task_007() {
        //1) User clicks "Show on store" checkbox
        trd.showStore.click();
    }

}
