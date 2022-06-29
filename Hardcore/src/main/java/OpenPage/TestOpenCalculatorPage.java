package OpenPage;

import Asserts.CalculatorPage;
import Asserts.MailPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;

public class TestOpenCalculatorPage {
    WebDriver driver = new ChromeDriver();
    CalculatorPage objCalculator;
    MailPage objMail;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeTest
    public void setup() {

//      Open Google
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://cloud.google.com/");

//      Manage cookies

        WebElement close = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ОК']")));
        close.click();
    }


//    @AfterTest
//
//    //  Close the page
//
//    public void closeup(){
//        driver.quit();
//    }

//  Control the data inserted to prepare estimate is correct

    @Test (priority=0, groups="preparation")

//  Insert search data and search to find Google Cloud Platform Pricing Calculator

    public void clickSearch() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.clickSearch();
    }
    @Test (priority=1, groups="preparation")

//  Click on Google Cloud Platform Pricing Calculator link

    public void setCalculator() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setCalculator();
    }
    @Test (priority=2, groups="preparation")

//  Click COMPUTE ENGINE at the top of the page

    public void setComputeEngine() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setComputeEngine();
    }
    @Test (priority=3, groups="preparation")

//  Set number of instances

    public void setInstances() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setInstances();
    }
    @Test (priority=4, groups="preparation")

//  Set Operating system

    public void setOperatingSystem() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setOperatingSystem();
    }
    @Test (priority=5, groups="preparation")

//  Set Provisioning model to Regular

    public void setProvisioningModel() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setProvisioningModel();
    }
    @Test (priority=6, groups="preparation")

//  Set series to n1

    public void setSeries() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setSeries();
    }
    @Test (priority=7, groups="preparation")

//  Set Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)

    public void setMachineFamily() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setMachineFamily();
    }
    @Test (priority=8, groups="preparation")

//  Select add GPU

    public void setAddGPUs() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setAddGPUs();
    }
    @Test (priority=9, groups="preparation")

//  Set GPU type NVIDIA Tesla V100

    public void setGPUType() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setGPUType();
    }
    @Test (priority=10, groups="preparation")

//  Set number of GPU to 1

    public void setNumberOfGPUs() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setNumberOfGPUs();
    }
    @Test (priority=11, groups="preparation")

//  Set local SSD to 2x375 Gb

    public void setLocalSSD() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setLocalSSD();
    }
    @Test (priority=12, groups="preparation")

//  Set Datacenter location: Frankfurt (europe-west3)

    public void setDataCenterLocation() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setDataCenterLocation();
    }
    @Test (priority=13, groups="preparation")

//  Set Committed usage: 1 Year

    public void setCommitedUsage() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setCommitedUsage();
    }
    @Test (priority=14, groups="preparation")

//  Click on estimate button

    public void setAddToEstimate() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.setAddToEstimate();
    }

//  Check the data received in estimate is correct

    @Test (priority=15, groups="assertion")

//  Check Provisioning model is set to Regular in estimate

    public void VMClass() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.VMClass();
    }
    @Test (priority=16, groups="assertion")

//  Check Instance type is n1-standard-8 in estimate

    public void instanceType() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.instanceType();
    }
    @Test (priority=17, groups="assertion")

//  Check region is Frankfurt in estimate

    public void region() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.region();
    }
    @Test (priority=18, groups="assertion")

//  Check Local SSD is 2x375 Gb in estimate

    public void SSDType() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.SSDType();
    }
    @Test (priority=19, groups="assertion")

//  Check commitment term is set to 1 Year in estimate

    public void commitmentTerm() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.commitmentTerm();
    }

    @Test (priority=20, groups="assertion")

//  Check monthly rent sum is the same with the manual test

    public void monthlyRent() {
        objCalculator = new CalculatorPage(driver);
        objCalculator.monthlyRent();
    }

    @Test (priority=21, groups="checkMail")

//    Create new window instance and switch to new tab

    public void switchToNewWindow() {
        js.executeScript("window.open()");
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        //switch to mailPage tab
        driver.switchTo().window(newTb.get(1));
        System.out.println("Page title of new tab: " + driver.getTitle());
    }

    @Test (priority=22, groups="checkMail")

//    Open mail website

    public void newWindowInstance(){
        objMail = new MailPage(driver);
        objMail.setNewWindowInstance();
    }


    @Test(priority=23, groups="checkMail")

//    Create temporal email

    public void locateMail() {
        objMail = new MailPage(driver);
        objMail.setLocateMail();
    }

    @Test(priority=24, groups="checkMail")

//    Switch to calculator page and send email

    public void sendMail() {

        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());

//      Switch to calculatorPage tab

        driver.switchTo().window(newTb.get(0));
        System.out.println("Page title of new tab: " + driver.getTitle());

//      Send email

        objCalculator = new CalculatorPage(driver);
        objCalculator.setSendMail();
    }

    @Test(priority=25, groups="checkMail")

//    Switch to mail page

    public void switchMailPage(){
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        //switch to mailPage tab
        driver.switchTo().window(newTb.get(1));
        System.out.println("Page title of new tab: " + driver.getTitle());
    }

    @Test(priority=26, groups="checkMail")

//    Check mail received and estimate correctness

    public void emailEstimatedReceived() throws InterruptedException {
        objMail = new MailPage(driver);
        objMail.checkEmailEstimatedReceived();
    }
}


