package tests.tradylinn_Tests.US_005_006_007;

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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

public class US_005 {
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
        //10) User scrolls down the page
        action.sendKeys(Keys.DOWN).perform();
        //11) User verifies status, stock, price, date column head if displayed
        List<String> arr= Arrays.asList("Status","Stock","Price","Date");
        ReusableMethods.waitFor(5);
        for(int i=0;i< arr.size();i++){
            soft.assertTrue(trd.choiceElement(trd.tableList, arr.get(i)).isDisplayed());
        }
    }
    @Test
    public void task_002() {
        //2) User verifies "Virtual" checkbox is displayed
        soft.assertTrue(trd.virtualCheckBox.isDisplayed());
        //3) User verifies "Downloadable" checkbox is displayed
        trd.virtualCheckBox.click();
    }
    @Test
    public void task_003() {
        //1) User enters "Product Name"
        trd.productName.sendKeys("Hasortman");
        //2) User enters "Sale Price"
        action.click(trd.productName).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("70").perform();
    }
    @Test
    public void task_004() throws AWTException {
        //1) User clicks photo icon
        trd.photo.click();
        //2) User clicks "Dosya Seçin" button
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        trd.uploadFile.click();
        //3) User selects product photo and click open button
        Robot rb = new Robot();
        StringSelection str = new StringSelection("\"C:\\Users\\himer\\OneDrive\\Masaüstü\\hasortman.jpg\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        //5) User clicks "SEÇ" button
        trd.sec.click();
    }
    @Test
    public void task_005() {
        //1) User fills the Short Description text area
        Driver.getDriver().switchTo().frame(trd.iframe);
        action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        trd.description.sendKeys("Ürün Özelliği\n" +
                "\n" +
                "   S-M Bel 29 cm Boy 93 cm\n" +
                "  M-L Bel 30 cm Boy 95 cm\n" +
                " (Ürün Ölçüleri 1-2 cm farklılık gösterebilir.)\n");
        Driver.getDriver().switchTo().defaultContent();
        //2) User fills the Description text area
        Driver.getDriver().switchTo().frame(trd.iframe2);
        action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        trd.description.sendKeys("Şık ve hoş görünümlü eşofmanlar ile tüm dikkatleri üzerinde olacak. Kalıpları normaldir.\n" +
                "\n" +
                "İstediğin gibi kombinle bütün gözler senin üzerinde olsun.\n" +
                "\n" +
                "Birbirinden Farklı Renk Ve Modelleriyle Kendine Uygun Olanı\n" +
                "\n" +
                "Al-Giy Ve Çık .\n");
        Driver.getDriver().switchTo().defaultContent();

    }
}
