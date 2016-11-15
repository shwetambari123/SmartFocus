package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonUtils;


public class BasePage {//This code is designed for windows os only because for mac and linux it need to install different chrome driver

    public static WebDriver driver;

    public void openBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver","src/main/browser/chromedriver.exe");//open browser
            driver = new ChromeDriver();
        } catch (Exception e) {
            System.out.println("FAILURE: Browser did not load: ");
        }

    }


    public static WebDriver getDriver() {
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }//kill browser


}
