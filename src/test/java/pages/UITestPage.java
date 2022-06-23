package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UITestPage {
    public UITestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id=\"newButtonName\"]")
    public WebElement text;
    @FindBy(xpath = "//tbody//tr//td//button")
    public List<WebElement> playGroundButtons;
    @FindBy(xpath = "//*[@id=\"overview\"]/div/div/div/h3/a")
    public List<WebElement> allTable;
    @FindBy(xpath = "//button[@id=\"updatingButton\"]")
    public WebElement textButton;
    public WebElement choice(List<WebElement> list,String str){
        WebElement element=null;
        for (WebElement w:list) {
            if(w.getText().equalsIgnoreCase(str)){
                element=w;
            }
        }
        return element;
    }
}
