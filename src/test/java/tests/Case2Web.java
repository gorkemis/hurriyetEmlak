package tests;

import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Case2Web {
    RemoteWebDriver driver;
    DesiredCapabilities desiredCapabilities;
    WebDriverWait wait;

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
    public void  test2() throws InterruptedException {
    driver.findElement(By.cssSelector("section.home-wrapper:nth-child(2) div.home-search-wrap:nth-child(1) div.main-inner div.middle.home-content div:nth-child(2) ul.search-title-tab-list:nth-child(5) li:nth-child(3) a.btn.btn-search > img:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.locationSec:nth-child(1) section.filter-item-wrap.loc.locationCitySec:nth-child(2) div.filter-item-inner div.filter-select.grid-100 div.he-filter-control.he-select.js-city-filter div.he-filter-control__field div.he-select-base > div.he-select-base__container")).click();
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.locationSec:nth-child(1) section.filter-item-wrap.loc.locationCitySec:nth-child(2) div.filter-item-inner div.filter-select.grid-100 div.he-filter-control.he-select.js-city-filter div.he-filter-control__field div.he-select-base div.he-popper.he-select-base__dropdown > input.he-select-base__search")).sendKeys("Ankara");
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.locationSec:nth-child(1) section.filter-item-wrap.loc.locationCitySec:nth-child(2) div.filter-item-inner div.filter-select.grid-100 div.he-filter-control.he-select.js-city-filter div.he-filter-control__field div.he-select-base div.he-popper.he-select-base__dropdown div.ps div.he-select-base__list ul.he-select__list > li.he-select__list-item")).click();
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.locationSec:nth-child(1) section.filter-item-wrap.loc.locationCountySec:nth-child(3) div.he-filter-control.he-multiselect.js-county-filter div.he-filter-control__field div.he-select-base div.he-select-base__container > span.he-select-base__placeholder")).click();
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.locationSec:nth-child(1) section.filter-item-wrap.loc.locationCountySec:nth-child(3) div.he-filter-control.he-multiselect.js-county-filter div.he-filter-control__field div.he-select-base div.he-popper.he-select-base__dropdown > input.he-select-base__search")).sendKeys("Çankaya");
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.locationSec:nth-child(1) section.filter-item-wrap.loc.locationCountySec:nth-child(3) div.he-filter-control.he-multiselect.js-county-filter div.he-filter-control__field div.he-select-base div.he-popper.he-select-base__dropdown div.ps div.he-select-base__list ul.he-multiselect__list li.he-multiselect__list-item > div.he-checkbox.he-multiselect__checkbox:nth-child(1)")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.roomTypeSec:nth-child(6) section.filter-item-wrap div.filter-item-inner div.custom-select > div.c-title")).click();
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.roomTypeSec:nth-child(6) section.filter-item-wrap div.filter-item-inner div.dropdown-lightbox div.dropdown-wrap div.dropdown-flow ul.dropdown-list li:nth-child(3) label.md-checkbox > span:nth-child(2)")).click();
    jsx.executeScript("window.scrollBy(0,800)", "");
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content section.listing-filter div.listing-filter-inner section.filter-switch.withinSiteSec:nth-child(16) label.md-switch > input.md-switch-input")).click();
    driver.findElement(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.left-content div:nth-child(1) section.listing-filter div.listing-filter-inner section.filter-button-wrapper:nth-child(22) > a.btn.btn-red.btn-large:nth-child(1)")).click();

    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.list-page-master:nth-child(2) div.list-page-wrapper:nth-child(2) div.wrapper.list-wrapper:nth-child(2) div.container.no-flex-wrap div.right-content.content div.list-wrap div.list div.listView div.listing-item.firstItem:nth-child(2) div.listingView.active.type-1000010100 div.list-view-line div.list-view-content div.bottom.sibling div.left div.down div.links > a.card-link")));
        driver.findElement(By.xpath("//a[@href='/ankara-cankaya-ahlatlibel-kiralik/residence/111219-291']")).click();

        driver.findElement(By.cssSelector("section.wrapper.detail-page:nth-child(4) div.container.det-container div.detail-sidebar.cont-block.right div.cont-inner section.det-block div.owner div.owner-phone-numbers button.owner-phone-numbers-button.btn.btn-red.btn-large > span:nth-child(2)")).click();
    String phoneNumber = driver.findElement(By.cssSelector("section.wrapper.detail-page:nth-child(4) div.container.det-container div.detail-sidebar.cont-block.right div.cont-inner section.det-block div.owner div.owner-phone-numbers div.owner-phone-numbers-list-wrapper ul.owner-phone-numbers-list li:nth-child(1) > a:nth-child(2)")).getText();

    }
}
