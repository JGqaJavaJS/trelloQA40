package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AddBoardTests extends BaseTest{

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        loginHelper.login(user);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        logoutHelper.logout();
    }

    // after method navigate to page ???
}
