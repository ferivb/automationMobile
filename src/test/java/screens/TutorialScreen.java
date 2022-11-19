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

    @AndroidFindBy(uiAutomator = "")
    private AndroidElement getStartedButton;

    @AndroidFindBy(uiAutomator = "")
    private AndroidElement shareLocationButton;

    @AndroidFindBy(uiAutomator = "")
    private AndroidElement allowLocationButton;

    @AndroidFindBy(uiAutomator = "")
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
