package tests;

import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void LoginPositiveUserDto() {
        UserDTO user =
                new UserDTO("juliagordyin@gmail.com",
                        "123456Aa$");
        loginHelper.loginUserDto(user);
        Assert.assertTrue(loginHelper.validateTextBoardsExist());
    }
}
