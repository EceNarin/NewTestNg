package tests.tradylinn_Tests.US_005_006_007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradyLinnPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US_006 {
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
    }
    @Test
    public void task_001() {
        //1) User verifies product categories are displayed
        action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        boolean ifdisplayedAllmatch=trd.categories.stream().allMatch(t->t.isDisplayed());
        soft.assertTrue(ifdisplayedAllmatch);
    }
    @Test
    public void task_002() {

        //2) User selects "Product Categories"
        Random rnd=new Random();
        for(int i=0;i<5;i++){
            int random= rnd.nextInt(trd.categories2.size()-1);
            System.out.println(random);
            trd.categories2.get(random).click();
        }
    }

}
