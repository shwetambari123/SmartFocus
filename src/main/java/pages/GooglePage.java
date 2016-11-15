package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class GooglePage extends BasePage {


    public GooglePage openGooglePage() {
        try {
            driver.get("https://www.google.co.uk/");//open google page
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Google page cannot be open");
        }

        return this;

    }

    public GooglePage gotoSmartFocusPage() {
        try {


            driver.findElement(By.id("lst-ib")).sendKeys("SmartFocusUk");
            Thread.sleep(2000);
            List<WebElement> autoSuggest = driver.findElements(By.xpath("//div[@class='sbqs_c']"));//store the result of autocomplete text in list
            autoSuggest.get(0).click();//select first result
            CommonUtils.click(By.linkText("SmartFocus: The Message Cloud"));

        } catch (Exception e) {
            e.getStackTrace();

        }
        return this;
    }


}




