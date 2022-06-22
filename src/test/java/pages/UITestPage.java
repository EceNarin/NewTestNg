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
    @FindBy(xpath = "//a[@href=\"/visibility\"]")
    public WebElement visibility;
    @FindBy(xpath = "//tbody//tr//td//button")
    public List<WebElement> playGroundButtons;

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
