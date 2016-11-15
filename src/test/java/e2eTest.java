import org.junit.Assert;
import org.junit.Test;
import pages.*;
import utils.CommonUtils;

/**
 * Created by Yogesh on 10-10-2016.
 */
public class e2eTest extends BaseTest {

    GooglePage googlePage = new GooglePage();
    SmartFocusPage smartFocusPage = new SmartFocusPage();
    SearchResultPage searchResultPage =new SearchResultPage();
    SmartContentPage smartContentPage =new SmartContentPage();

   @Test
    public void userJourney()
    {
        googlePage.openGooglePage().gotoSmartFocusPage();
        smartFocusPage.CheckSmartFocusPage().gotoSearchResultPage();
        searchResultPage.selectResult().gotoSmartContentPage();
       smartContentPage.checkText();

    }
}
