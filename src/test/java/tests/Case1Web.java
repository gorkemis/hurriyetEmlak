package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.BasePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public final class Case1Web extends BasePage {

    //RemoteWebDriver driver;
    DesiredCapabilities desiredCapabilities;
    WebDriverWait wait;
    public Case1Web(RemoteWebDriver driver) { super(driver);}
    @BeforeClass
    public void setup() throws MalformedURLException {
        desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,Platform.LINUX);
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME);
        URL url = new URL("http://localhost:4444/wd/hub ");
        driver = new RemoteWebDriver(url, desiredCapabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 15);
        driver.get("https://www.hurriyetemlak.com");
    }

    @Test
    public void  test1() throws InterruptedException {

        driver.findElement(By.cssSelector("button[class=\"btn btn-red btn-large\"]")).click();
        driver.findElement(By.cssSelector("div:nth-child(2) div.view div.wrapper:nth-child(2) div.link-sliding > div.link:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.header-wrapper div:nth-child(2) div.wrapper.basetap > button.btn.btn-white:nth-child(2)")).click();

        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.wrapper section.location:nth-child(3) div.city:nth-child(2) > select:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) div.city:nth-child(2) select:nth-child(1) > option:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) div.city:nth-child(2) select:nth-child(1) > option:nth-child(4)")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.wrapper section.location:nth-child(3) section.select-content:nth-child(3) > div.custom-select")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) section.select-content:nth-child(3) div.dropdown-lightbox div.dropdown-wrap div.district-list-dialog li:nth-child(7) label.md-checkbox > input.label-to-bold-if-checked:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) section.select-content:nth-child(3) div.dropdown-lightbox > button.btn.btn-red.filter-close")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.price:nth-child(6) div.content div.floating-label:nth-child(1) > input.floating-input:nth-child(1)")).sendKeys("100000");
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.price:nth-child(6) div.content div.floating-label:nth-child(2) > input.floating-input:nth-child(1)")).sendKeys("2000000");
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.wrapper section.building-age:nth-child(9) section.select-content > div.custom-select")).click();
        driver.findElement(By.cssSelector("body.fixed:nth-child(2) div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.building-age:nth-child(9) section.select-content div.dropdown-lightbox div.dropdown-wrap ul.list li:nth-child(1) label.md-checkbox > input.label-to-bold-if-checked:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body.fixed:nth-child(2) div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.building-age:nth-child(9) section.select-content div.dropdown-lightbox div.dropdown-wrap ul.list li:nth-child(2) label.md-checkbox > input.label-to-bold-if-checked:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body.fixed:nth-child(2) div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.building-age:nth-child(9) section.select-content div.dropdown-lightbox div.dropdown-wrap ul.list li:nth-child(3) label.md-checkbox > input.label-to-bold-if-checked:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body.fixed:nth-child(2) div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.building-age:nth-child(9) section.select-content div.dropdown-lightbox > button.btn.btn-red.filter-close")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.filter-button > button.btn.btn-red.cardShadow3.get-result:nth-child(1)")).click();

        /*element(satilikButton).click();
        element(ilSec).click();
        element(izmir).sendKeys("İzmir");
        element(listedenIlSec).click();
        element(ilceSec).click();
        element(bornova).sendKeys("Bornova");
        element(listedenIlceSec).click();
        element(enazFiyat).sendKeys("100000");
        element(encokFiyat).sendKeys("2000000");
        Actions actionObject = new Actions(driver);
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(binaYasi)).click();
        element(yas1).click();
        element(yas2).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(yas3)).click();
        jsx.executeScript("window.scrollBy(0,800)", "");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(araButton)).click();
        String actualvalue1 = element(deger1).getText();
        Assert.assertEquals(actualvalue1,"İzmir");
        String actualvalue2 = element(deger2).getText();
        Assert.assertEquals(actualvalue2,"Bornova");
        String actualvalue3 = element(deger3).getText();
        Assert.assertEquals(actualvalue3,"100.000 TL - 2.000.000 TL");
        String actualvalue4 = element(deger4).getText();
        Assert.assertEquals(actualvalue4,"Sıfır Bina");
        String actualvalue5 = element(deger5).getText();
        Assert.assertEquals(actualvalue5,"1-5");
        String actualvalue6 = element(deger6).getText();
        Assert.assertEquals(actualvalue6,"6-10");*/

    }

    @AfterTest()
    public void tearDown() {
        driver.quit();
    }


}
