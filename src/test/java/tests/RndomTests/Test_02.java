package tests.RndomTests;

import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UITestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test_02 {
    UITestPage ui=new UITestPage();
    @Test
    public void testName() {
        //1. Go to http://uitestingplayground.com/
        Driver.getDriver().get(ConfigReader.getProperty("uiTestUrl"));
        //2. Open "Text Input" link in a new tab
        Actions action=new Actions(Driver.getDriver());
        String firstHandle=Driver.getDriver().getWindowHandle();
        System.out.println(firstHandle);
        ui.choice(ui.allTable,"Text Input").click();
        action.keyDown(Keys.LEFT_CONTROL).click(ui.text).keyUp(Keys.LEFT_CONTROL).perform();
        //4. Locate the text form element and print the default text in it
        //5. Enter new text: "Alper seni seviyorum aşkım muç muç <3"
        String  str="Alper seni seviyorum aşkım muç muç <3";
        ui.text.sendKeys(str);
        //7. Click the button
        ui.textButton.click();
        //8. Verify that the text on the button is equal with our input
        System.out.println(ui.textButton.getText());
        Assert.assertTrue(ui.textButton.getText().equals(str));
    }
}
