package tests;

import dto.UserDTOLombok;
import manager.ApplicationManager;
import manager.LoginHelper;
import manager.LogoutHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    LoginHelper loginHelper = new LoginHelper();
    LogoutHelper logoutHelper = new LogoutHelper();

    UserDTOLombok user = UserDTOLombok.builder()
            .email("juliagordyin@gmail.com")
            .password("123456Aa$")
            .build();

    boolean flagNeedLogout = false;
    boolean flagNeedOpenMainPage = false;

    @BeforeSuite(alwaysRun = true)
    public void preconditions() {
        ApplicationManager.init();
    }

    @AfterSuite(alwaysRun = true)
    public void postConditions() {
        ApplicationManager.tearDown();
    }
}
