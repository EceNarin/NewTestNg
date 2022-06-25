package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SahibindenPage {
    public SahibindenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy
    public WebElement x;
    @FindBy
    public List<WebElement> y;
    @FindBy
    public WebElement z;
    @FindBy
    public List<WebElement> t;
    @FindBy
    public WebElement q;
    @FindBy
    public List<WebElement> d;
    @FindBy
    public WebElement c;
    @FindBy
    public List<WebElement> h;
    @FindBy
    public WebElement ş;
    @FindBy
    public List<WebElement> b;


}
