package tests;

import dto.UserDTO;
import dto.UserDTOWith;
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

    @Test
    public void LoginTestPositiveUserDtoWith() {
//        UserDTO user =
//                new UserDTO("juliagordyin@gmail.com",
//                        "123456Aa$");
//        user.setEmail("dfgbjkhfb");
//        UserDTO user2 = new UserDTO();
//
//
//        UserDTOWith u1 = new UserDTOWith();
//        UserDTOWith u2 = new UserDTOWith().withEmail("email");
//        u1.withEmail("email").withPassword("djfnr");
//        UserDTOWith u3 = new UserDTOWith().withPassword("ppp");
        UserDTOWith userWith = new UserDTOWith()
                .withEmail("juliagordyin@gmail.com")
                .withPassword("123456Aa$");
        loginHelper.loginUserDtoWith(userWith);
        Assert.assertTrue(loginHelper.validateTextBoardsExist());
    }
}
