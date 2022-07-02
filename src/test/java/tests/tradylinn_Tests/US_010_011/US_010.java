package tests.tradylinn_Tests.US_010_011;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class US_010 {
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
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        ReusableMethods.waitFor(4);
        //user down page attiribute
        js.executeScript("arguments[0].click();",trd.attirbute);
        ReusableMethods.waitFor(4);
        //user clicks
        trd.colorClickButton.click();
        //user clicks selectAll
        trd.selectAll.click();
        //user verify all selects
        trd.colorText.stream().forEach(t-> System.out.println(t.getText()));
        boolean verify=trd.colorText.stream().allMatch(t->t.isDisplayed());
        soft.assertTrue(verify);
          }
    @Test
    public void task_002() {
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(4);
        //user down page attiribute
        trd.attirbute.click();
        ReusableMethods.waitFor(4);
        //user clicks
        trd.sizeClickbutton.click();
        //user clicks selectAll
        trd.selectAll2.click();
        //user verify all selects
        ReusableMethods.waitFor(4);
        trd.sizeText.stream().forEach(t-> System.out.println(t.getText()));
        List<String> arr= Arrays.asList("Extra Large","Large","Medium","Small");
        for(int i=0;i< arr.size();i++){
            soft.assertTrue(trd.choiceContainsElement(trd.sizeText, arr.get(i)).isDisplayed());
        }    }

}
