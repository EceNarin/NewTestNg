package tests.RndomTests;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UITestPage;
import utilities.*;

import java.awt.*;

public class Test_01 extends TestBaseRapor {
    UITestPage ui=new UITestPage();
    String firstWindowsHandle="";
    SoftAssert soft=new SoftAssert();
    @Test
    public void test_01(){
        //    String secondHandle=ReusableMethods2.switchToWindowEce(firstWindowsHandle);
        //        System.out.println(firstWindowsHandle);
        //        System.out.println(secondHandle);
        //        Driver.getDriver().switchTo().newWindow(WindowType.TAB).switchTo().window(secondHandle);
        extentTest=extentReports.createTest("Smoke","HidePart");
        //1. Go to http://uitestingplayground.com/
        extentTest.info("Go to http://uitestingplayground.com/");
        Driver.getDriver().get(ConfigReader.getProperty("uiTestUrl"));
        //2. Open "Visibility" link in a new tab
        extentTest.info("Open \"Visibility\" link in a new tab");
        firstWindowsHandle=Driver.getDriver().getWindowHandle();
        ui.choice(ui.allTable,"Visibility").click();
        //3. Switch to the tab
        //4. Verify that all of eight buttons are displayed
        extentTest.pass("Verify that all of eight buttons are displayed");
        boolean ifDisplayed=ui.playGroundButtons.stream().allMatch(t->t.isDisplayed());
        soft.assertTrue(ifDisplayed);
        //4. Click "Hide" button
        extentTest.info("Click \"Hide\" button");
        ui.choice(ui.playGroundButtons,"Hide").click();
        //5. Verify that buttons are not displayed
        extentTest.pass("Verify that buttons are not displayed");
        boolean verify=ui.playGroundButtons.stream().anyMatch(t->t.getText().equalsIgnoreCase("Zero Width"));
        soft.assertTrue(verify);
        //6. Refresh the page
        extentTest.info("Refresh the page");
        Driver.getDriver().navigate().refresh();
        //7. Switch to the first tab
        extentTest.info("Switch to the first tab");
        Driver.getDriver().switchTo().window(firstWindowsHandle);
        //8. Close all browser tabs
        extentTest.info("Close all browser tabs");
        Driver.getClose();
    }
}
