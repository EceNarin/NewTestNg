package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TradyLinnPages {
    public TradyLinnPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div[1]/div/div[2]/div/div[3]/div/div/a[1]/span")
    public WebElement girisyap;

    @FindBy(xpath = "//*[@id=\"wcfm-followers\"]/tbody/tr/td")
    public List<WebElement> takipcilerTableBody;
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
    //*[@id="wcfm_menu"]/div/a
    //*[@id="wcfm_menu"]/div
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
    //hatice hanm

    @FindBy(xpath = "//*[@id=\"wcfm-shop-customers\"]/thead/tr/th")
    public List<WebElement> tableBaslik;

    @FindBy(xpath = "//*[@id=\"wcfm-shop-customers\"]/tbody/tr\n")
    public List<WebElement> tableBody;

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
    //US_010
    @FindBy(xpath = "//button[@class=\"button wcfm_add_attribute_term wcfm_select_all_attributes\"]")
    public WebElement selectAll;

    @FindBy(id="attributes_is_active_1")
    public WebElement colorClickButton;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_attribute_head\"]/div")
    public WebElement attirbute;

    @FindBy(xpath = "//*[@id=\"attributes\"]/div[2]/span[2]/span[1]/span/ul/li")
    public List<WebElement> colorText;
    @FindBy(xpath = "//*[@id=\"attributes\"]/div[3]/span[2]/span[1]/span/ul/li")
    public List<WebElement> sizeText;
    //*[@id="attributes"]/div[3]/span[2]/span[1]/span/ul/li
    @FindBy(xpath = "//input[@id=\"attributes_is_active_2\"]")
    public WebElement sizeClickbutton;
    @FindBy(xpath = "//*[@id=\"attributes\"]/div[3]/button[3]")
    public WebElement selectAll2;




    //11
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head\"]/div")
    public WebElement toptanUrun;

    @FindBy(xpath = "//select[@id=\"piecetype\"]")
    public WebElement pieceType;
    @FindBy(xpath = "//input[@id=\"unitpercart\"]")
    public WebElement unitperCart;
    @FindBy(xpath = "//input[@id=\"minorderqtytr\"]")
    public WebElement minOrder;





    @FindBy(xpath = "//button[@value=\"Değişiklikleri kaydet\"]")
    public WebElement degisiklikUpdate;
    @FindBy(xpath = "(//form[@method=\"post\"])[1]//p//label")
    public List<WebElement> hesapDetaylariForm;
    //US008_009
    @FindBy(xpath = "//input[@id=\"sku\"]")
    public WebElement sku;
    @FindBy(xpath = "//input[@id=\"manage_stock\"]")
    public WebElement manageStock;
    @FindBy(xpath = "//select[@id=\"stock_status\"]")
    public WebElement allowBackorders;
    @FindBy(xpath = "//input[@id=\"sold_individually\"]")
    public WebElement sold;
    @FindBy(xpath = "//input[@id=\"stock_qty\"]")
    public WebElement stockQuity;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_shipping_head\"]/div")
    public WebElement shipping;
    @FindBy(xpath = "//input[@id=\"weight\"]")
    public WebElement weight;
    @FindBy(xpath = " //input[@id=\"length\"]")
    public WebElement length;
    @FindBy(xpath = "//input[@id=\"width\"]")
    public WebElement width;
    @FindBy(xpath = "//input[@id=\"height\"]")
    public WebElement height;
    @FindBy(xpath = "//select[@id=\"_wcfmmp_processing_time\"]")
    public WebElement processingTime;

//12

@FindBy(xpath = "//*[@id=\"wcfm-orders\"]/thead/tr/th")
public List<WebElement> emirlerTable;
//*[@id="wcfm-orders"]/tbody/tr[1]/td
    public List<WebElement> getCell(List<WebElement> emirlerTable,String str){
        int x=0;
        for(int i=0;i<emirlerTable.size();i++){
            if(emirlerTable.get(i).getText().equalsIgnoreCase(str)){
                x=i;
            }
        }
        return Driver.getDriver().findElements(By.xpath("//*[@id=\"wcfm-orders\"]/tbody/tr[1]/td["+x+""));

    }






    //US_22
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public List<WebElement> tumunuGor;
    @FindBy(xpath = "//ul[@class='breadcrumb']/li[3]")
    public List<WebElement> homePageCategories;

    @FindBy(xpath = "//select[@name=\"orderby\"]")
    public WebElement dde;

    @FindBy(xpath = "//span[@class=\"price\"]")
    public List<WebElement> allPrices;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[2]/div/div/div/section/div/div[1]/div/div/div/h2/a")
    public List<WebElement> allCategories;
    //span[@class="price"]
    @FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[3]")
    public WebElement check;
    //US_012
    @FindBy(xpath = "//img[@id=\"gallery_img_gimage_0_display\"]")
    public WebElement littleImage;
    @FindBy(xpath = "(//button[@id=\"menu-item-upload\"])[5]")
    public WebElement accessFileDowload;
    @FindBy(xpath = "//*[@id=\"__wp-uploader-id-4\"]")
    public WebElement file2Dowload;
    //13US
    @FindBy(xpath = "//*[@id=\"add_new_coupon_dashboard\"]/span[2]")
    public WebElement addCoupon;
    @FindBy(xpath = "//input[@id=\"title\"]")
    public WebElement couponText;
    @FindBy(xpath = "//textarea[@id=\"description\"]")
    public WebElement descriptionText;
    @FindBy(xpath = "//select[@id=\"discount_type\"]")
    public WebElement discountType;
    @FindBy(xpath = "//input[@id=\"coupon_amount\"]")
    public WebElement couponAmount;
    @FindBy(xpath = "//input[@id=\"expiry_date\"]")
    public WebElement expireDate;
    @FindBy(xpath = "//input[@id=\"free_shipping\"]")
    public WebElement freeShip;
    @FindBy(xpath = "//input[@id=\"show_on_store\"]")
    public WebElement showStore;
    //20
    @FindBy(xpath = "//*[@id=\"wcfm-reviews\"]/thead/tr/th")
    public List<WebElement> incelemelerTable;
    @FindBy(xpath = " //*[@id=\"add_new_product_dashboard\"]/span[2]")
    public WebElement productReview;
//03
@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li")
public List<WebElement> heabimPano;

@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/table/tbody/tr")
public List<WebElement> siparisler;

    @FindBy(linkText = "Alışverişe Devam Et")
    public WebElement alisveriseDevamEt;



//14US
@FindBy(xpath = "//div[@id=\"coupons_manage_restriction\"]")
public WebElement restriction;

@FindBy(xpath = "//input[@id=\"minimum_amount\"]")
public WebElement minimum_amount;

    @FindBy(xpath = "//input[@id=\"maximum_amount\"]")
    public WebElement maximum_amount;

    @FindBy(xpath = "//input[@id=\"individual_use\"]")
    public WebElement individual_use;

    @FindBy(xpath = "//input[@id=\"exclude_sale_items\"]")
    public WebElement exclude_sale_items;

    @FindBy(xpath = "//select[@id=\"product_categories\"]")
    public WebElement product_categories;

    @FindBy(xpath = "//select[@id=\"exclude_product_categories\"]")
    public WebElement exclude_product_categories;






//hakanhoca

    @FindBy(xpath = "//*[@id=\"orders_details_general_expander\"]/table/tbody/tr/td")
    public List<WebElement> takipciteslimatBilgileri;

    @FindBy(xpath = "//*[@id=\"wcfm-orders\"]/tbody/tr[2]/td[9]/a[2]/span")
    public WebElement emirlerViewDetails;
    @FindBy(xpath = "//*[@id=\"orders_details_general_expander\"]/p[3]/a")
    public WebElement teslimatAdresi;

    @FindBy(xpath = "//*[@id=\"wcfm-refund-requests\"]/thead/tr/th")
    public List<WebElement> tableHead;
    public void getSpecificRow(String ... str){
        List<Integer> nums=new ArrayList<>();
        for (String each:str) {
            for(int i=0;i<tableHead.size();i++){
                if(tableHead.get(i).getText().equalsIgnoreCase(each)){
                    nums.add(i);
                }
            }
        }
        System.out.println(nums);
        for(int i=0;i<nums.size();i++){
            System.out.println(Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm-refund-requests\"]/tbody/tr/td[" + nums.get(i) + "]")).getText());
        }
    }
    public WebElement selecto(String str){
        List<WebElement> element=Driver.getDriver().findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/section/div/div[1]/div/div/div/h2/a"));
        WebElement elemento=null;
        for(int i=0;i<element.size();i++){
            if(element.get(i).getText().trim().equalsIgnoreCase(str)){
                elemento= Driver.getDriver().findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/section/div/div[2]/div/div/div/h2/a")).get(i);
            }
        }
        return elemento;
    }
    public List<Integer> makeStringToInt(List<WebElement> list){
        List<Integer> priceList=new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            priceList.add(i,Integer.parseInt(list.get(i).getText().trim().replaceAll("[^0-9]","")));
        }
        return priceList;
    }

    public WebElement choiceElement(List<WebElement> myStoreMenu,String str){
        WebElement element=null;
        for (WebElement w:myStoreMenu) {
            if(w.getText().trim().equalsIgnoreCase(str)){
                element=w;
            }
        }
        return element;
    }
    public WebElement choiceContainsElement(List<WebElement> a,String str){
        WebElement element=null;
        for (WebElement w:a) {
            if(w.getText().trim().toLowerCase().contains(str.toLowerCase())){
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
