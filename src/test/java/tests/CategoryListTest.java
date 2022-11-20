package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class CategoryListTest extends BaseMobileTest {

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Map screen Navigation test")
    @Test()
    public void mapScreenTest() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Show List Button exists");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        log.info("Validate Category Button exists");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Validate Filter Button exists");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");

        log.info("Validate Attractions is the Default Category");
        Assert.assertEquals(map.getDefaultCategoryText(), "Attractions");

        map.tapOnCategories();

        log.info("Validate Hotels Category exists");
        Assert.assertTrue(map.hotelsIsDisplayed(), "Hotels not displayed");

        log.info("Validating All Categories are Different");
        Assert.assertTrue(map.areCategoriesDifferent(), "Categories are not different");

    }

}
