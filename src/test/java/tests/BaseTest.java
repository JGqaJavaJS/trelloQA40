package tests;

import manager.ApplicationManager;
import manager.LoginHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    LoginHelper loginHelper = new LoginHelper();

    @BeforeSuite(alwaysRun = true)
    public void preconditions() {
        ApplicationManager.init();
    }

    @AfterSuite(alwaysRun = true)
    public void postConditions() {
        ApplicationManager.tearDown();
    }
}
