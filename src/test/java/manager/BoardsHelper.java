package manager;

import org.openqa.selenium.By;

public class BoardsHelper extends BaseHelper{

    By btnCreateNewBoard = By.xpath("//*[@data-testid='create-board-tile']/div");
    By inputBoardName = By.xpath("//input[@data-testid='create-board-title-input']");
    By btnCreateNewBoardForm = By.xpath("//button[@data-testid='create-board-submit-button']");
    By textBoardNameBoardPage = By.xpath("//h1[@data-testid='board-name-display']");

    public void clickBtnCreateNewBoard() {
        clickBase(btnCreateNewBoard);
    }

    public void inputBoardName(String name) {
        sendKeysBase(inputBoardName, name);
    }

    public void clickBtnCreateNewBoardForm() {
        clickBase(btnCreateNewBoardForm);
    }

    public void createNewBoard(String name) {
        clickBtnCreateNewBoard();
        inputBoardName(name);
        clickBtnCreateNewBoardForm();
    }

    public boolean validateBoardNameOnPageOfBoardCorrect(String name) {
        return isTextActualEqualToExpected(textBoardNameBoardPage, name);
    }
 }
