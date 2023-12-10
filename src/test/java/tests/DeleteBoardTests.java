package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoardTests extends BaseTest{

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        loginHelper.login(user);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        logoutHelper.logout();
    }

    @Test
    public void deleteOneBoardPositive() {

    }

    // after method navigate to page ???
}
