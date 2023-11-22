package manager;

import dto.UserDTO;
import org.openqa.selenium.By;

public class LoginHelper extends BaseHelper{

    /*
            clickBase(By.xpath("//a[contains(@data-uuid, 'login')]"));
        sendKeysBase(By.xpath("//input[@id='username']"), "juliagordyin@gmail.com");
        clickBase(By.xpath("//button[@id='login-submit']"));
        sendKeysBase(By.xpath("//input[@id='password']"), "123456Aa$");
        clickBase(By.xpath("//button[@id='login-submit']"));
        String boardText = driver.findElement(By.xpath("//span[text()='Boards']")).getText();
        Assert.assertEquals(boardText, "Boards", "text not Boards");
     */

    By btnLoginMainPage = By.xpath("//a[contains(@data-uuid, 'login')]");
    By inputEmail = By.xpath("//input[@id='username']");
    By btnSubmitEmailPassword = By.xpath("//button[@id='login-submit']");
    By inputPassword = By.xpath("//input[@id='password']");
    By textBoards = By.xpath("//span[text()='Boards']");

    public void loginUserDto(UserDTO user) {
        clickBase(btnLoginMainPage);
        sendKeysBase(inputEmail, user.getEmail());
        clickBase(btnSubmitEmailPassword);
        sendKeysBase(inputPassword, user.getPassword());
        clickBase(btnSubmitEmailPassword);
    }

    public boolean validateTextBoardsExist() {
        return isTextActualEqualToExpected(textBoards, "Boards");
    }

}
