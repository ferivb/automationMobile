package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import util.tests.BaseMobileTest;

public class PrivacyAndLegalTest extends BaseMobileTest {

    @Description("Privacy & Legal Navigation Tests")
    @Test
    public void privacyAndLegalTest(){
        log.info("Navigating to Other Options Screen");
    }
}
