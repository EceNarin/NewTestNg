package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TradyLinnPages {
    public TradyLinnPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div[1]/div/div[2]/div/div[3]/div/div/a[1]/span")
    public WebElement girisyap;
    @FindBy(xpath = "(//input[@id=\"username\"])[1]")
    public WebElement email;
    @FindBy(xpath = "(//input[@id=\"password\"])[1]")
    public WebElement password;
    @FindBy(xpath = "(//button[@value=\"Giriş Yap\"])[1]")
    public WebElement login;
    @FindBy(xpath = "//*[@id=\"menu-item-1074\"]/a")
    public WebElement hesabim;
    @FindBy(linkText = "Store Manager")
    public WebElement storeManager;
    @FindBy(xpath = "//a[@data-tip=\"Add New Product\"]")
    public WebElement addNewProduct;
    @FindBy(xpath = "//input[@id=\"is_virtual\"]")
    public WebElement virtualCheckBox;
    @FindBy(xpath = "//input[@id=\"is_downloadable\"]")
    public WebElement dowloadablecheckBox ;
    @FindBy(xpath = "//input[@id=\"pro_title\"]")
    public WebElement productName;
    @FindBy(xpath = "//img[@id=\"featured_img_display\"]")
    public WebElement photo;
    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div")
    public List<WebElement> myStoreMenu;
    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/thead/tr/th")
    public List<WebElement> tableList;
    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/tbody/tr/td")
    public WebElement emptyBody;
    @FindBy(id = "__wp-uploader-id-1")
    public WebElement uploadFile;
    @FindBy(xpath = "//*[@id=\"__wp-uploader-id-0\"]/div[4]/div/div[2]/button")
    public WebElement sec;
    @FindBy(xpath = "//iframe[@id=\"excerpt_ifr\"]")
    public WebElement iframe;
    @FindBy(xpath = "//iframe[@id=\"description_ifr\"]")
    public WebElement iframe2;
    @FindBy(xpath = "//*[@id=\"tinymce\"]/p/br")
    public WebElement description;
    @FindBy(xpath = "//ul[@id=\"product_cats_checklist\"]//li")
    public List<WebElement> categories;
    @FindBy(xpath = "//*[@id=\"product_cats_checklist\"]/li/input")
    public List<WebElement> categories2;
    @FindBy(xpath = "//*[@id=\"product_brand\"]/li/input")
    public List<WebElement> productBrand;


    //saniye hanim
    @FindBy(xpath = "//nav[@class=\"woocommerce-MyAccount-navigation col-md-3 mb-8\"]/ul/li/a")
    public List<WebElement> pano;
    @FindBy(xpath = "    @FindBy(xpath = \"//*[@id=\\\"product_brand\\\"]/li/input\")\n" +
            "    public List<WebElement> productBrand;")
    public List<WebElement> siparislerTble;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/p")
    public WebElement indirmeler;
    @FindBy(xpath = "//table[@class=\"address-table\"]//tbody[1]//tr")
    public List<WebElement> faturaAdresleri;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[2]/div/address/table/tbody/tr")
    public List<WebElement> gönderimAdresi;

    @FindBy(xpath = "//button[@value=\"Değişiklikleri kaydet\"]")
    public WebElement degisiklikUpdate;
    @FindBy(xpath = "(//form[@method=\"post\"])[1]//p//label")
    public List<WebElement> hesapDetaylariForm;


    public WebElement choiceElement(List<WebElement> myStoreMenu,String str){
        WebElement element=null;
        for (WebElement w:myStoreMenu) {
            if(w.getText().equalsIgnoreCase(str)){
                element=w;
            }
        }
        return element;
    }
    public WebElement choiceContainsElement(List<WebElement> myStoreMenu,String str){
        WebElement element=null;
        for (WebElement w:myStoreMenu) {
            if(w.getText().toLowerCase().contains(str.toLowerCase())){
                element=w;
            }
        }
        return element;
    }
    public void list(List<WebElement> list ){
        list.stream().forEach(t-> System.out.println(t.getText()));
    }

    public WebElement check(List<WebElement> list){
        WebElement element=null;
        for (WebElement w:myStoreMenu) {
            element=w;
        }
        return element;
    }



}
