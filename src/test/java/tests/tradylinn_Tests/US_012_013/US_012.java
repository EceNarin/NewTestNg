package tests.tradylinn_Tests.US_012_013;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
import java.util.Random;

public class US_012 {
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
        //        User clicks "Emirler"
        trd.choiceContainsElement(trd.myStoreMenu,"Emirler").click();
    }
    @Test
    public void task_001() {
        //10) User scrolls down the page
        action.sendKeys(Keys.DOWN).perform();
        ReusableMethods.waitFor(4);
        //11) User verifies tarih,durum,eylemler column head if displayed
        List<String> arr= Arrays.asList("Billing Address","Shipping Address","Earning","Date");
        ReusableMethods.waitFor(5);
        for(int i=0;i< arr.size();i++){
            soft.assertTrue(trd.choiceElement(trd.emirlerTable, arr.get(i)).isDisplayed());
        }
    }
    @Test
    public void task_002() {
        //1) User verifies "İndirimler" button is displayed
       boolean verify= trd.choiceContainsElement(trd.tableList,"Gross Sales").isDisplayed();
       soft.assertTrue(verify);
        //2) User print "Gross Sales" all cells
        trd.getCell(trd.emirlerTable,"Gross Sales").stream().forEach(t-> System.out.println(t.getText()));
    }
    @Test
    public void task_003() {
        //1) User verifies "Billing Address" button is displayed
        boolean verify= trd.choiceContainsElement(trd.tableList,"Billing Address").isDisplayed();
        soft.assertTrue(verify);
        //2) User clicks "Billing Address " all cells
        trd.getCell(trd.emirlerTable,"Billing Address").stream().forEach(t-> System.out.println(t.getText()));
    }
    @Test
    public void task_004() {
        //1) User verifies "View Details" button is displayed
        boolean verify= trd.choiceContainsElement(trd.tableList,"View Details").isDisplayed();
        soft.assertTrue(verify);
        //2) User clicks "Hesap detaylari " button
        Random rnd=new Random();
        List<WebElement> list= trd.getCell(trd.emirlerTable,"View Details");
        int random= rnd.nextInt(list.size()-1);
        list.get(random).click();

    }
    @Test
    public void task_005() {
    }
}
