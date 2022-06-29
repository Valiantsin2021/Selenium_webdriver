package Asserts;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class MailPage {

    WebDriver driver;
    public MailPage(WebDriver driver) {
        this.driver = driver;
    }

    By login = By.cssSelector("#login");
    By refreshBtn = By.cssSelector("#refresh");
    By monthlyEstimate = By.cssSelector("#mail h2");
    String mail = "me@yopmail.com";

    public void setNewWindowInstance(){

//      Open yopmail.com website

        driver.get("https://yopmail.com/");

//      Manage cookies

        WebElement close1 = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#accept")));
        close1.click();
    }

    public void setLocateMail() {

//      Create temporal email

        WebElement temporaryMailAccount = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(login));
        temporaryMailAccount.sendKeys(mail, Keys.ENTER);
    }

    public void checkEmailEstimatedReceived() throws InterruptedException {

//      Check new email received and check monthly rent sum estimate
        Thread.sleep(10000);
        WebElement clickRefreshBtn = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(refreshBtn));
        clickRefreshBtn.click();

        driver.switchTo().frame("ifmail");

        String estimateSum = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(monthlyEstimate)).getText();

        System.out.println(estimateSum);

        Assert.assertEquals(estimateSum, "Estimated Monthly Cost: USD 1,081.20");
    }
}
