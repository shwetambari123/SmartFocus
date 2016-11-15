package pages;

import org.junit.Assert;
import utils.CommonUtils;

/**
 * Created by Yogesh on 10-10-2016.
 */
public class SmartContentPage extends BasePage {

    public SmartContentPage checkText() {
        Assert.assertTrue(CommonUtils.isTextPresent("Smart Content"));//verify the text smart content
        Assert.assertTrue(CommonUtils.isTextPresent("Achieve a true Content Multiverse"));//verify the highlighted text
        return this;
    }
}

