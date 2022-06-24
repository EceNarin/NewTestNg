package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradyLinnPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;


    public class US_12 {
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
        }

        @Test
        public void US_12_TC_001(){
            //6- Kullanici 'Siparisler' butonunu tiklar
            trd.choiceElement(trd.pano,"Siparişler").click();
            //7- Kullanici siparislerin oldugunu goruntuler
            boolean gorunur=trd.siparislerTble.stream().allMatch(t-> t.isDisplayed());
            soft.assertTrue(gorunur);
            //8- Kullanici siparislerin oldugunu listeler
            trd.siparislerTble.stream().forEach(t-> System.out.println(t.getText()));

        }

        @Test
        public void US_12_TC_002() {
            //6- Kullanici sayfadan 'indirmeler' butonunu tıklar
            trd.choiceElement(trd.pano,"İndirmeler").click();
            //7-Kullanici "Henüz indirilecek bir ürün yok."yazısının göründüğünü test eder
            soft.assertTrue(trd.indirmeler.getText().equals("Henüz indirilecek bir ürün yok."));
        }

        @Test
        public void US_12_TC_003() {
            //6-Kullanici 'Adres' butonuna tiklar
            trd.choiceElement(trd.pano,"Adres").click();
            //7- Kullanici fatura adresini gorunur
            boolean adresgorunur=trd.faturaAdresleri.stream().allMatch(t->t.isDisplayed());
            soft.assertTrue(adresgorunur);
            //8- Kullanici fatura adresini listeler
            trd.faturaAdresleri.stream().forEach(t-> System.out.println(t.getText()));
            //7- Kullanici gönderim adresini gorunur
            boolean gönderimAdersiGorunur=trd.gönderimAdresi.stream().allMatch(t->t.isDisplayed());
            soft.assertTrue(adresgorunur);
            //8- Kullanici gönderim adresini listeler
            trd.gönderimAdresi.stream().forEach(t-> System.out.println(t.getText()));
        }

        @Test
        public void US_12_TC_004() throws InterruptedException {
            //6-Kullanici "HESAP DETAYLARI" butonuna tıklar.
            trd.choiceElement(trd.pano,"Hesap Detayları").click();
            //7-Hesap detayları sayfasında
            //" Görünen ad / E-posta adresi /Biography "
            //başlıklarının oldugunu test eder
            List<String> arr= Arrays.asList("Görünen ad","E-posta adresi","Biography");
            Thread.sleep(5000);
            for(int i=0;i< arr.size();i++){
                soft.assertTrue(trd.choiceElement(trd.hesapDetaylariForm, arr.get(i)).isDisplayed());
            }
            // ve uptade edilebilidiğini görmeli
            trd.degisiklikUpdate.click();
        }
    }


