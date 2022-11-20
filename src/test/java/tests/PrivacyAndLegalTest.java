package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MoreOptionsScreen;
import screens.PrivacyAndLegalScreen;
import util.tests.BaseMobileTest;

public class PrivacyAndLegalTest extends BaseMobileTest {

    @Description("Privacy & Legal Navigation Tests")
    @Test
    public void privacyAndLegalTest(){
        log.info("Navigating to more Options Screen");
        DashBoardScreen dashboard = loadDashBoardScreen();
        MoreOptionsScreen more = dashboard.goToMoreOptionsScreen();

        log.info("Validating if Tickets and Passes is present");
        Assert.assertTrue(more.ticketsAndPassesIsDisplayed());

        more.swipeToPrivacyAndLegal();

        log.info("Validating if all categories are different");
        Assert.assertTrue(more.areCategoriesDifferent());

        log.info("Navigating to Privacy & Legal Screen");
        PrivacyAndLegalScreen privacy = more.goToPrivacyAndLegalScreen();

        log.info("Validating if Privacy & Legal screen is displayed");
        Assert.assertTrue(privacy.titleIsDisplayed());

        log.info("Validating if Privacy & Legal has 6 options:");

        Assert.assertTrue(privacy.privacyPolicyIsDisplayed());
        log.info("Privacy Policy option is Present");

        Assert.assertTrue(privacy.termsOfUseIsDisplayed());
        log.info("Terms of Use option is Present");

        Assert.assertTrue(privacy.supplementalIsDisplayed());
        log.info("Supplemental Terms of Service option is Present");

        Assert.assertTrue(privacy.legalNoticesIsDisplayed());
        log.info("Legal Notices option is Present");

        Assert.assertTrue(privacy.propertyRulesIsDisplayed());
        log.info("Property Rules option is Present");

        Assert.assertTrue(privacy.electronicTOSIsDisplayed());
        log.info("Electronic Communications Disclosure option is Present");

    }
}
