package Insert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Insert {

    WebDriver driver;

    public Insert (WebDriver driver) {
        this.driver = driver;
    }

    public void pasteCode() {
        WebElement newPaste = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-text")));
        newPaste.sendKeys("git config --global user.name 'New Sheriff in Town'\n" +
                " git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                " git push origin master --force");
    }

    public void setBash() {
        WebElement dropdown1 = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='w0']/div[5]/div[1]/div[1]/div/span/span[1]/span/span[2]")));
        dropdown1.click();

        WebElement bash = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Bash']")));
        bash.click();
    }

    public void setMinutes() {
        WebElement dropdown = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='w0']/div[5]/div[1]/div[2]/div/span/span[1]/span/span[2]")));
        dropdown.click();

        WebElement setMinutes = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='10 Minutes']")));
        setMinutes.click();
    }

    public void pasteName() {
        WebElement pasteName =  (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-name")));
        pasteName.sendKeys("how to gain dominance among developers");
    }
    public void pressSubmit() {
        WebElement submit = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button")));
        submit.click();
    }

    public void checkTitle() {
        WebElement closeAgain = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='qc-cmp2-ui']//button[2]")));
        closeAgain.click();
        String title = driver.getTitle();
        assert title.contains("how to gain dominance among developers");
    }

    public void checkSyntax() {
        String bash = driver.findElement(By.xpath("//*[text()='Bash']")).getText();
        Assert.assertEquals(bash, "Bash");
    }

    public void checkCode() {
        List<WebElement> codeList = driver.findElements(By.xpath("//li[@class='li1']"));
        String result = "";
        for(WebElement c: codeList){
            String text = c.getText();
            result += text;
        }
        Assert.assertEquals(result, "git config --global user.name 'New Sheriff in Town' git reset $(git commit-tree HEAD^{tree} -m 'Legacy code') git push origin master --force");

    }
}
