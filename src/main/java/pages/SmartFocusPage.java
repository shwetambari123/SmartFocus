package pages;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonUtils;

import java.util.concurrent.TimeUnit;


public class SmartFocusPage extends BasePage {


    public SmartFocusPage CheckSmartFocusPage() {

        try {
            Assert.assertTrue(CommonUtils.isTextPresent("Contact us"));//verify the Smart focus page with contact us text

        } catch (Exception e) {
            System.out.println("Smart focus is not present on page");
        }
        return this;

    }


    public SmartFocusPage gotoSearchResultPage() {

       try {
           CommonUtils.click(By.className("icon-search"));
           driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
           CommonUtils.EnterGivenText(By.id("edit-keys"),"Smart Content");//enter smart content text to search
           Thread.sleep(2000);
           CommonUtils.click(By.className("form-submit"));//click on search sign

       }catch (Exception e)
       {
           e.printStackTrace();
       }
        return this;
    }


}