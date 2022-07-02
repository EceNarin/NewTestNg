package tests.tradylinn_Tests.US_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradyLinnPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011 {
    TradyLinnPages trd=new TradyLinnPages();
    SoftAssert soft=new SoftAssert();
    Actions action=new Actions(Driver.getDriver());
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
        //        User clicks "Ürün"
        trd.choiceContainsElement(trd.myStoreMenu,"Ürün").click();
        //User clicks "Yeni ekle" button
        trd.addNewProduct.click();
        //12) Vendor clicks "Toptan Ürün Gösterme Ayarları" tab
        //user down page attiribute
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(4);
        ////user click toptan
        trd.toptanUrun.click();
    }
    @Test
    public void task_001() {
        //13 )  Vendor clicks "the piece type" dropdown menu.

        //user verify selects are visible
        Select select=new Select(trd.pieceType);
        //1. yol
        boolean selects=select.getOptions().stream().allMatch(t->t.isDisplayed());
        soft.assertTrue(selects);
        //2. yol
        for (WebElement each: select.getOptions()){
            soft.assertTrue(each.isDisplayed());
        }
        //14 )  Vendor selects "piece type" he/she wants via "the piece type" dropdown menu
        select.selectByVisibleText("Piece");
        //user clear to unit per piece text box
        trd.unitperCart.clear();
        //user fill in the unit per piece text box
        trd.unitperCart.sendKeys("10");
    }
    @Test
    public void task_002() {
        Select select=new Select(trd.pieceType);
        //Vendor selects "piece type" he/she wants via "the piece type" dropdown menu
        select.selectByVisibleText("Piece");
        //user clear to unit per piece text box
        trd.unitperCart.clear();
        //user fill in the unit per piece text box
        trd.unitperCart.sendKeys("10");
    }
    @Test
    public void task_003() {
        //user clear to min order quantity text box
        trd.minOrder.clear();
        //user fill in the min order quantity tezt box
        trd.minOrder.sendKeys("5");
    }

}
