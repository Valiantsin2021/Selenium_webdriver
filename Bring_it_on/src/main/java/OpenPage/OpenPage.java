package OpenPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Insert.Insert;
import java.time.Duration;
import java.util.List;

public class OpenPage {
    WebDriver driver = new ChromeDriver();
    Insert objInsert;

    @BeforeTest
    public void setup() {
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();

//  Manage cookies

        WebElement close = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='qc-cmp2-ui']//button[2]")));
        close.click();
    }

    @Test (priority = 0, groups = "preparation")
    public void pasteCode() {
        objInsert = new Insert(driver);
        objInsert.pasteCode();
    }
    @Test (priority = 1, groups = "preparation")
    public void setBash() {
        objInsert = new Insert(driver);
        objInsert.setBash();
    }
    @Test (priority = 2, groups = "preparation")
    public void setMinutes() {
        objInsert = new Insert(driver);
        objInsert.setMinutes();
    }
    @Test (priority = 3,groups = "preparation")
    public void pasteName() {
        objInsert = new Insert(driver);
        objInsert.pasteName();
    }
    @Test (priority = 4,groups = "preparation")
    public void pressSubmit() {
        objInsert = new Insert(driver);
        objInsert.pressSubmit();
    }
    @Test (priority = 5,groups = "implementation")
    public void checkTitle() {
        objInsert = new Insert(driver);
        objInsert.checkTitle();
    }
    @Test (priority = 6,groups = "implementation")
    public void checkSyntax() {
        objInsert = new Insert(driver);
        objInsert.checkSyntax();
    }
    @Test (priority = 7,groups = "implementation")
    public void checkCode() {
        objInsert = new Insert(driver);
        objInsert.checkCode();
    }
    @AfterTest
    public void quit() {
        driver.quit();

    }
}
