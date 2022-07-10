package tests.tradylinn_Tests.US_020_021;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradyLinnPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US_020 {
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
        //9) User verifies "incelemeler"  is displayed
        soft.assertTrue( trd.choiceContainsElement(trd.myStoreMenu,"İncelemeler").isDisplayed());
        //10) User clicks "incelemeler"
        trd.choiceContainsElement(trd.myStoreMenu,"İncelemeler").click();

    }
    @Test
    public void task_001() {
        //11) User verifies "Author" "Comment" "Rating" "Dated" "Actions"

        List<String> arr= Arrays.asList("Author","Comment","Rating","Dated","Actions");
        ReusableMethods.waitFor(5);
        for(int i=0;i< arr.size();i++){
            soft.assertTrue(trd.choiceElement(trd.tableList, arr.get(i)).isDisplayed());
        }

    }
    @Test
    public void task_002() {

        //11) User verifies "Product Reviews" checkbox is displayed
        soft.assertTrue(trd.productReview.isDisplayed());
        //12) User clicks "Product Reviews"
        trd.productReview.click();

    }


}
