package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;


/**
 * Object of the first screen that appears when we open the application.
 *
 * @author Arley.Bolivar
 */

public class TutorialScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Arley.Bolivar
     */
    public TutorialScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.Button)")
    private AndroidElement getStartedButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.Button)")
    private AndroidElement shareLocationButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.Button)")
    private AndroidElement allowLocationButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.Button).textContains(\"WHILE\")")
    private AndroidElement allowButton;

    /**
     * @author Hans.Marquez
     * Start permissions process.
     */
    public void startPermissionsProcess() {
        click(getStartedButton);
    }

    /**
     * @author Hans.Marquez
     * Share Location permissions process.
     */
    public DashBoardScreen shareLocationPermissions() {
        click(shareLocationButton);
        click(allowLocationButton);
        click(allowButton);
        return new DashBoardScreen(driver);
    }
}
