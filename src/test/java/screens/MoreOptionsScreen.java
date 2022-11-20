package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.ArrayList;
import java.util.List;


public class MoreOptionsScreen extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public MoreOptionsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Tickets\")")
    private AndroidElement ticketsAndPasses;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Privacy\")")
    private AndroidElement privacyAndLegalButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\")")
    private List<AndroidElement> categories;

    public boolean ticketsAndPassesIsDisplayed(){
        return isElementAvailable(ticketsAndPasses);
    }

    public boolean areCategoriesDifferent(){
        List<String> trimmedCategories = new ArrayList<>();
        for (AndroidElement i: categories) {
            String category = i.getText();
            trimmedCategories.add(category);
        }
        return trimmedCategories.stream().distinct().count() == trimmedCategories.size();
    }

    public boolean isPrivacyAndLegalDisplayed(){
        return isElementAvailable(privacyAndLegalButton);
    }

    public void swipeToPrivacyAndLegal(){
        while(!isPrivacyAndLegalDisplayed()){
            swipeDown();
        }
    }

    public PrivacyAndLegalScreen goToPrivacyAndLegalScreen(){
        click(privacyAndLegalButton);
        return new PrivacyAndLegalScreen(driver);
    }


}
