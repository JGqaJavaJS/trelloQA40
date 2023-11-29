package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseHelper {

    Logger logger = LoggerFactory.getLogger(BaseHelper.class);

    public WebElement findElementBase(By by) {
        return ApplicationManager.getDriver().findElement(by);
    }

    public void clickBase(By by) {
        logger.info("By: " + by + " method click");
        findElementBase(by).click();
    }

    public void sendKeysBase(By by, String text) {
        WebElement el = findElementBase(by);
        el.click();
        el.clear();
        el.sendKeys(text);
    }

    public boolean isTextActualEqualToExpected(By by, String text) {
        if(findElementBase(by).getText().toUpperCase().trim()
                .equals(text.toUpperCase().trim())) {
            return true;
        } else {
            System.out.println("actual result: " +
                    findElementBase(by).getText().toUpperCase().trim() +
                    " expected result: " + text.toUpperCase().trim());
            return false;
        }
    }
}
