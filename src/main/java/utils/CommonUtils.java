package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

/**
 * Created by Yogesh on 10-10-2016.
 */
public class CommonUtils extends BasePage{


   // protected static WebDriver driver = BasePage.getDriver();
    public static void EnterGivenText(By element,String text)
    {
        driver.findElement(element).sendKeys(text);

    }


    public static void click( By Element)
    {
        driver.findElement(Element).click();
    }



    public static boolean isTextPresent(String text) {
        return getVisibleText().contains(text);
    }

    public static String getVisibleText() {

        return driver.findElement(By.tagName("body")).getText();
    }




}
