package tests.tradylinn_Tests.US_003_004;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradyLinnPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_003 {
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
        //        User clicks "Siparişler"
        trd.choiceContainsElement(trd.siparisler,"Siparişler").click();
        //ürünlere göz at/Alisverise devam et linkine tiklayiniz
        trd.alisveriseDevamEt.click();

    }
    @Test
    public void task_001() {

        //7-

    }
    @Test
    public void task_002() {
        //5- 5 ürün sepete eklenir
        //6- sepete 5 tane yeni ürün eklendigi test edilir
    }
    @Test
    public void task_003() {


        //5- Herhangi bir ürün sepete ekleyiniz
        //6- Sepete gidiniz ve gidildigini test ediniz
        //7- Checkout'a gidiniz ve gidildigini test ediniz
    }
    @Test
    public void task_004() {


        //5- Herhangi bir ürünüsepete ekleyiniz
        //6- Sepete gidiniz
        //7- Checkout a gidiniz
        //8- Fatura icin zorunlu alanlar doldurulmadan sparisler tamamlanamadigini Test ediniz
    }
    @Test
    public void task_005() {

        //5- Herhangi bir ürünüsepete ekleyiniz
        //6- Sepete gidiniz
        //7- Checkout a gidiniz
        //8- Fatura icin Zorunlu alanlari dodurup siparisi onaylayiniz
        //9- Siparisin basariy olusturuldugunu test ediniz
    }
}
