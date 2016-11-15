package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonUtils;


public class SearchResultPage extends BasePage {

    public SearchResultPage selectResult() {
        try {
            Assert.assertTrue(CommonUtils.isTextPresent("Search"));//verify the Search page

        } catch (Exception e) {
            System.out.println("Search page not loaded");
        }
        return this;
    }


    public SearchResultPage gotoSmartContentPage() {
      try {
          CommonUtils.click(By.linkText("Smart Content"));//click on smart content link
      }catch (Exception e)
      {
          e.printStackTrace();
      }

        return this;
    }

}
