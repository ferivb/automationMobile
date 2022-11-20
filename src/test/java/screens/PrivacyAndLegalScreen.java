package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class PrivacyAndLegalScreen extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public PrivacyAndLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Privacy & Legal\")")
    private AndroidElement titleText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Privacy Policy\")")
    private AndroidElement privacyPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Terms of Use\")")
    private AndroidElement termsOfUse;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Supplemental\")")
    private AndroidElement supplemental;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Legal Notices\")")
    private AndroidElement legalNotices;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Property Rules\")")
    private AndroidElement propertyRules;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Electronic\")")
    private AndroidElement electronicTOS;

    public boolean titleIsDisplayed(){
        return isElementAvailable(titleText);
    }

    public boolean privacyPolicyIsDisplayed(){
        return isElementAvailable(privacyPolicy);
    }

    public boolean termsOfUseIsDisplayed(){
        return isElementAvailable(termsOfUse);
    }

    public boolean supplementalIsDisplayed(){
        return isElementAvailable(supplemental);
    }

    public boolean legalNoticesIsDisplayed(){
        return isElementAvailable(legalNotices);
    }

    public boolean propertyRulesIsDisplayed(){
        return isElementAvailable(propertyRules);
    }

    public boolean electronicTOSIsDisplayed(){
        return isElementAvailable(electronicTOS);
    }

}
