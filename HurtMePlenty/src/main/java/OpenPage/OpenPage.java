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
import Asserts.Asserts;
import java.time.Duration;

public class OpenPage {
    WebDriver driver = new ChromeDriver();
    Asserts objAsserts;

    @BeforeTest
    public void setup() {

//      Open Google

        driver.get(" https://cloud.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//      Manage cookies

        WebElement close = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ОК']")));
        close.click();
    }


    @AfterTest

    //  Close the page

    public void closeup(){
        driver.quit();
    }

//  Control the data inserted to prepare estimate is correct

    @Test (priority=0, groups="preparation")

//  Insert search data and search to find Google Cloud Platform Pricing Calculator

    public void clickSearch() {
        objAsserts = new Asserts(driver);
        objAsserts.clickSearch();
    }
    @Test (priority=1, groups="preparation")

//  Click on Google Cloud Platform Pricing Calculator link

    public void setCalculator() {
        objAsserts = new Asserts(driver);
        objAsserts.setCalculator();
    }
    @Test (priority=2, groups="preparation")

//  Click COMPUTE ENGINE at the top of the page

    public void setComputeEngine() {
        objAsserts = new Asserts(driver);
        objAsserts.setComputeEngine();
    }
    @Test (priority=3, groups="preparation")

//  Set number of instances

    public void setInstances() {
        objAsserts = new Asserts(driver);
        objAsserts.setInstances();
    }
    @Test (priority=4, groups="preparation")

//  Set Operating system

    public void setOperatingSystem() {
        objAsserts = new Asserts(driver);
        objAsserts.setOperatingSystem();
    }
    @Test (priority=5, groups="preparation")

//  Set Provisioning model to Regular

    public void setProvisioningModel() {
        objAsserts = new Asserts(driver);
        objAsserts.setProvisioningModel();
    }
    @Test (priority=6, groups="preparation")

//  Set series to n1

    public void setSeries() {
        objAsserts = new Asserts(driver);
        objAsserts.setSeries();
    }
    @Test (priority=7, groups="preparation")

//  Set Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)

    public void setMachineFamily() {
        objAsserts = new Asserts(driver);
        objAsserts.setMachineFamily();
    }
    @Test (priority=8, groups="preparation")

//  Select add GPU

    public void setAddGPUs() {
        objAsserts = new Asserts(driver);
        objAsserts.setAddGPUs();
    }
    @Test (priority=9, groups="preparation")

//  Set GPU type NVIDIA Tesla V100

    public void setGPUType() {
        objAsserts = new Asserts(driver);
        objAsserts.setGPUType();
    }
    @Test (priority=10, groups="preparation")

//  Set number of GPU to 1

    public void setNumberOfGPUs() {
        objAsserts = new Asserts(driver);
        objAsserts.setNumberOfGPUs();
    }
    @Test (priority=11, groups="preparation")

//  Set local SSD to 2x375 Gb

    public void setLocalSSD() {
        objAsserts = new Asserts(driver);
        objAsserts.setLocalSSD();
    }
    @Test (priority=12, groups="preparation")

//  Set Datacenter location: Frankfurt (europe-west3)

    public void setDataCenterLocation() {
        objAsserts = new Asserts(driver);
        objAsserts.setDataCenterLocation();
    }
    @Test (priority=13, groups="preparation")

//  Set Committed usage: 1 Year

    public void setCommitedUsage() {
        objAsserts = new Asserts(driver);
        objAsserts.setCommitedUsage();
    }
    @Test (priority=14, groups="preparation")

//  Click on estimate button

    public void setAddToEstimate() {
        objAsserts = new Asserts(driver);
        objAsserts.setAddToEstimate();
    }

//  Control the data received in estimate is correct

    @Test (priority=15, groups="assertion")

//  Check Provisioning model is set to Regular in estimate

    public void VMClass() {
        objAsserts = new Asserts(driver);
        objAsserts.VMClass();
    }
    @Test (priority=16, groups="assertion")

//  Check Instance type is n1-standard-8 in estimate

    public void instanceType() {
        objAsserts = new Asserts(driver);
        objAsserts.instanceType();
    }
    @Test (priority=17, groups="assertion")

//  Check region is Frankfurt in estimate

    public void region() {
        objAsserts = new Asserts(driver);
        objAsserts.region();
    }
    @Test (priority=18, groups="assertion")

//  Check Local SSD is 2x375 Gb in estimate

    public void SSDType() {
        objAsserts = new Asserts(driver);
        objAsserts.SSDType();
    }
    @Test (priority=19, groups="assertion")

//  Check commitment term is set to 1 Year in estimate

    public void commitmentTerm() {
        objAsserts = new Asserts(driver);
        objAsserts.commitmentTerm();
    }

    @Test (priority=20, groups="assertion")

//  Check commitment term is set to 1 Year in estimate

    public void monthlyRent() {
        objAsserts = new Asserts(driver);
        objAsserts.monthlyRent();
    }
}
