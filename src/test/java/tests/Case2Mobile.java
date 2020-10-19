package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.BasePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Case2Mobile{

    RemoteWebDriver driver;
    DesiredCapabilities desiredCapabilities;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException

    {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //chrome browser set to phone mode
        HashMap<String, String> mobileEmulation  = new HashMap<>();
        String deviceName = "Galaxy S5";	//iPhone X/Galaxy S5
        mobileEmulation.put("deviceName",deviceName);
        Map<String, Object> chromeOptions = new HashMap<>();
        chromeOptions.put("mobileEmulation",mobileEmulation);
        capabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        //new a chromedriver
        //ChromeDriver driver = new ChromeDriver(capabilities);
        // Set the timeout

        URL url = new URL("http://localhost:4444/wd/hub ");
        driver = new RemoteWebDriver(url,capabilities);
        driver.get("https://www.hurriyetemlak.com");

    }

    @Test
    public void  test1() throws InterruptedException {

        driver.findElement(By.cssSelector("button[class=\"btn btn-red btn-large\"]")).click();
        driver.findElement(By.cssSelector("div:nth-child(2) div.view div.wrapper:nth-child(2) div.link-sliding > div.link:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.header-wrapper div:nth-child(2) div.wrapper.basetap > button.btn.btn-white:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) div.city:nth-child(2) select:nth-child(1) > option:nth-child(3)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.wrapper section.location:nth-child(3) section.select-content:nth-child(3) > div.custom-select")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) section.select-content:nth-child(3) div.dropdown-lightbox div.dropdown-wrap div.district-list-dialog li:nth-child(7) label.md-checkbox > input.label-to-bold-if-checked:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.location:nth-child(3) section.select-content:nth-child(3) div.dropdown-lightbox > button.btn.btn-red.filter-close")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.wrapper section.room-type:nth-child(8) section.select-content > div.custom-select")).click();
        driver.findElement(By.cssSelector("body.fixed:nth-child(2) div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.room-type:nth-child(8) section.select-content div.dropdown-lightbox div.dropdown-wrap ul.list li:nth-child(3) label.md-checkbox > input.label-to-bold-if-checked:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body.fixed:nth-child(2) div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div.wrapper section.room-type:nth-child(8) section.select-content div.dropdown-lightbox > button.btn.btn-red.filter-close")).click();
        Thread.sleep(2000);
        jsx.executeScript("window.scrollBy(0,1000)", "");
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.wrapper section.within-site.d-flex:nth-child(19) label.md-checkbox-detail > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper.filter-wrapper:nth-child(2) div:nth-child(1) div.filter-button > button.btn.btn-red.cardShadow3.get-result:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.listing-main-wrapper:nth-child(2) div.listing:nth-child(2) div.listing-wrapper div.reality-list div.reality-single-card:nth-child(1) div.inner a.card-link div.img-inner div.slide-wrap div:nth-child(1) div.swiper-container.swiper-container-initialized.swiper-container-horizontal div.swiper-wrapper.listing div.swiper-slide.swiper-slide-active:nth-child(2) > img.swiper-lazy.recommended.swiper-lazy-loaded")).click();
        Thread.sleep(2000);
        jsx.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        jsx.executeScript("window.scrollBy(0,1000)", "");
        driver.findElement(By.cssSelector("div.detail-page div:nth-child(2) div.owner-card:nth-child(5) div.card div.contact > button.btn.btn-red.btn-large")).click();
        driver.findElement(By.cssSelector("div.detail-page div.owner-card:nth-child(5) div.card div.contact div.phone-wrap div.phone-numbers div.phone-number:nth-child(1) > a:nth-child(4)")).click();

    }
}
