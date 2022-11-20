package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

public class AddPlansTest extends BaseMobileTest {

    @Description(value = "Testing if some elements are present in Add Plans")
    @Test()
    public void addPlansTest() {
        log.info("Start Navigation to Dashboard");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.skipWelcomeAndUpdates();

        log.info("Validating if Add Plans Button is Displayed");
        Assert.assertTrue(dashBoard.addPlansIsDisplayed());

        dashBoard.clickAddPlansButton();

        log.info("Validating if Dinner Reservation Button is enabled");
        Assert.assertTrue(dashBoard.dinnerReservationIsDisplayed());
    }

}
