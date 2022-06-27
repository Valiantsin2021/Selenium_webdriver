package Asserts;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Asserts {

    WebDriver driver;

    public Asserts (WebDriver driver) {
        this.driver = driver;
    }

    By input = By.name("q");
    By calculatorLink = By.xpath("//a[@href='https://cloud.google.com/products/calculator']/b");
    By computeEngine = By.xpath("//md-tab-item[1]/div[1]");
    By instances = By.cssSelector("md-input-container.flex input[ng-model='listingCtrl.computeServer.quantity']");
    By operatingSystemDropdown = By.cssSelector("#select_value_label_77 span");
    By operatingSystem = By.cssSelector("#select_option_87 div");
    By provisioningModelDropdown = By.cssSelector("#select_value_label_78 span.md-select-icon");
    By provisioningModel = By.cssSelector("md-option[value='regular']");
    By seriesDropdown = By.cssSelector("#select_value_label_80 span.md-select-icon");
    By series = By.cssSelector("md-option[value='n1']");
    By machineFamilyDropdown = By.cssSelector("#select_value_label_81 span.md-select-icon");
    By machineFamily = By.cssSelector("md-option[value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    By addGPUs = By.xpath("//form[@name='ComputeEngineForm']//md-checkbox[@aria-label='Add GPUs']");
    By GPUTypeDropdown = By.cssSelector("md-select[aria-label='GPU type']");
    By GPUType = By.cssSelector("md-option[value='NVIDIA_TESLA_V100']");
    By numberOfGPUsDropdown = By.cssSelector("md-select[placeholder='Number of GPUs']");
    By numberOfGPUs = By.xpath("//html/body/div[8]//md-option[2]");
    By localSSDDropdown = By.cssSelector("#select_value_label_412 span.md-select-icon");
    By localSSD = By.cssSelector("#select_option_439 div.md-text");
    By dataCenterLocationDropdown = By.cssSelector("#select_value_label_83 span.md-select-icon");
    By commitedUsageDropdown = By.cssSelector("#select_value_label_84 span.md-select-icon");
    By commitedUsage = By.cssSelector("#select_option_123 div");
    By addToEstimate = By.xpath("//*[@id='mainForm']//button[@aria-label='Add to Estimate']");

//  Preparation of the page

    public void clickSearch() {
        WebElement search = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(input));
        search.sendKeys("Google Cloud Platform Pricing Calculator" + Keys.ENTER);
    }

    public void setCalculator() {
        WebElement calculator = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(calculatorLink));
        calculator.click();
    }

//    Insert data to estimate

    public void setComputeEngine() {
        WebElement iframe = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#cloud-site > devsite-iframe > iframe")));
        driver.switchTo().frame(iframe);
        driver.switchTo().frame("myFrame");
        WebElement computeE = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(computeEngine));
        computeE.click();
    }


    public void setInstances() {
        WebElement newInstance = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(instances));
        newInstance.sendKeys("4");
    }


    public void setOperatingSystem() {
        WebElement systemList = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(operatingSystemDropdown));
        systemList.click();
        WebElement system = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(operatingSystem));
        system.click();
    }

    public void setProvisioningModel() {
        WebElement modelList = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(provisioningModelDropdown));
        modelList.click();
        WebElement model = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(provisioningModel));
        model.click();
    }

    public void setSeries() {
        WebElement seriesList = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(seriesDropdown));
        seriesList.click();
        WebElement seriesType = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(series));
        seriesType.click();
    }

    public void setMachineFamily() {
        WebElement mFamilyList = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(machineFamilyDropdown));
        mFamilyList.click();
        WebElement mFamily = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(machineFamily));
        mFamily.click();
    }


    public void setAddGPUs() {
        driver.findElement(addGPUs).click();

    }

    public void setGPUType() {
        WebElement GPUList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(GPUTypeDropdown));
        GPUList.click();
        WebElement GPU = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(GPUType));
        GPU.click();
    }

    public void setNumberOfGPUs() {
        WebElement numberGPUList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(numberOfGPUsDropdown));
        numberGPUList.click();
        WebElement numberGPU = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(numberOfGPUs));
        numberGPU.click();
    }

    public void setLocalSSD() {

        WebElement SSDList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(localSSDDropdown));
        SSDList.click();
        WebElement SSD = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(localSSD));
        SSD.click();

    }

    public void setDataCenterLocation() {
        WebElement dataCenterList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(dataCenterLocationDropdown));
        dataCenterList.click();
        WebElement input = driver.findElement(By.cssSelector("#input_117"));
        input.sendKeys("Frankfurt", Keys.TAB, Keys.ENTER);
    }

    public void setCommitedUsage() {
        WebElement usageList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(commitedUsageDropdown));
        usageList.click();
        WebElement usage = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(commitedUsage));
        usage.click();

    }
    public void setAddToEstimate() {
        driver.findElement(addToEstimate).click();
    }

//    Assert data received in estimate is correct

    public void VMClass(){
        String VMClassAssert = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("md-list-item:nth-child(8) > div"))).getText();
        Assert.assertEquals(VMClassAssert, "Provisioning model: Regular");
    }

    public void instanceType(){
        String instanceTypeAssert = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("md-list-item:nth-child(10) > div.md-list-item-text.ng-binding"))).getText();
        Assert.assertEquals(instanceTypeAssert, "Instance type: n1-standard-8\nCommitted Use Discount applied");
    }
    public void region(){
        String regionAssert = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("md-list-item:nth-child(2) > div"))).getText();
        Assert.assertEquals(regionAssert, "Region: Frankfurt");
    }
    public void SSDType(){
        String SSDTypeAssert = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("md-list-item:nth-child(14) > div.md-list-item-text.ng-binding.cpc-cart-multiline.flex"))).getText();
        Assert.assertEquals(SSDTypeAssert, "Local SSD: 2x375 GiB\nCommitted Use Discount applied");
    }
    public void commitmentTerm(){
        String commitmentTermAssert = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("md-list-item:nth-child(6) > div"))).getText();
        Assert.assertEquals(commitmentTermAssert, "Commitment term: 1 Year");
    }



}
