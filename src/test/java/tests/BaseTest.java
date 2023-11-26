package tests;

import dto.UserDTOLombok;
import manager.ApplicationManager;
import manager.LoginHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    LoginHelper loginHelper = new LoginHelper();

    UserDTOLombok user = UserDTOLombok.builder()
            .email("juliagordyin@gmail.com")
            .password("123456Aa$")
            .build();

    @BeforeSuite(alwaysRun = true)
    public void preconditions() {
        ApplicationManager.init();
    }

    @AfterSuite(alwaysRun = true)
    public void postConditions() {
        ApplicationManager.tearDown();
    }
}
