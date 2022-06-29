package tests.tradylinn_Tests.US_001_002;

import org.testng.annotations.Test;

public class US_001 {
    @Test
    public void task01() {
        //1) User goes to tradylinn.com
        //2) User verifies if "uye ol" button is visible
        //3) User clicks on "uye ol" button
        //4) User verifies if "satici ol" button is visible
    }

    @Test
    public void task02() {
        //1) User goes to tradylinn.com
        //2) User clicks on "uye ol" button
        //3) User clicks on "satici ol" button
        //4) verifying e mail- pasword- confirm password boxes are visible
    }
    @Test
    public void task03() {
        //1) User goes to tradylinn.com
        //2) User clicks on "uye ol" button
        //3) User clicks on "satici ol" button
        //4) User leaves email box empty
        //5) user clicks on register
        //6) user should be able to display "Email:this field is required" text
        //7) user enters valid email to email box
    }
    @Test
    public void task04() {
        //1) User goes to tradylinn.com
        //2) User clicks on "uye ol" button
        //3) User clicks on "satici ol" button
        //4) user clicks on email box
        //5) user enters previously used email to email box
        //6) user clicks on password box
        //7) user enters required password
        //8)user clicks on confirm password box
        //9) user enters required password again
        //10)user clicks on register
        //11)User should display "This Email already exists. Please login to the site and apply as vendor."
    }
    @Test
    public void task05() {
        //1) User goes to tradylinn.com
        //2) User clicks on "uye ol" button
        //3) User clicks on "satici ol" button
        //4) verifying e mail- pasword- confirm password boxes are visible
        //5) user clicks on e mail box
        //6)user enters a unique and valid email
        //7) user clicks on password box
        //"8)user should enter a password thatcontain capital, small letter, number and special character
        //9)User should be able to display "Guclu" text
    }
    @Test
    public void task06() {
        //1) User goes to tradylinn.com
        //2) User clicks on "uye ol" button
        //3) User clicks on "satici ol" button
        //4) user clicks on e mail box
        //5)user enters a unique and valid email
        //6) user clicks on password box
        //7) User should enter a password that contains capital and small letter, special character and at least 12 digit
        //8) user clicks on confirm password box
        //9) user should enter the previous password again.
    }
    @Test
    public void task07() {
        //1) User goes to tradylinn.com
        //2) User clicks on "uye ol" button
        //3) User clicks on "satici ol" button
        //4) user clicks on e mail box
        //5)user enters a unique and valid email
        //6) user clicks on password box
        //7) User should enter a password that contains capital and small letter, special character and at least 12 digit
        //8) user clicks on confirm password box
        //9) user should enter the previous password again.
        //10) user should click on register button
        //11) user should test that by checking personal email, and verify he/she is getting a confirmation link by the system
    }
}
