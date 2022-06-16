package OpenPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Insert.Insert;
import java.time.Duration;

public class Page {
    WebDriver driver = new ChromeDriver();
    Insert objInsert;

    @BeforeTest
    public void setup() {
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();

        WebElement close = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='qc-cmp2-ui']//button[2]")));
        close.click();
    }

    @Test
    public void paste() {
        objInsert = new Insert(driver);
        objInsert.paste();
    }
    @Test
    public void dropdown() {
        objInsert = new Insert(driver);
        objInsert.dropdown();
    }
    @Test
    public void setMinutes() {
        objInsert = new Insert(driver);
        objInsert.setMinutes();
    }
    @Test
    public void PasteName() {
        objInsert = new Insert(driver);
        objInsert.PasteName();
    }

    @AfterTest
    public void quit() {
        driver.quit();

    }
}