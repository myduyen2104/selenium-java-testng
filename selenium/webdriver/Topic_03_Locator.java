package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
    }

    @Test
    public void TC_01_ID() {
        driver.findElement(By.id("email"));
        driver.findElement(By.id("pass"));
        driver.findElement(By.id("header"));
    }

    @Test
    public void TC_02_Class() {
        driver.findElement(By.className("button"));
        driver.findElement(By.className("block-cart"));
        driver.findElement(By.className("actions"));
        driver.findElement(By.className("benefits"));
    }

    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("q"));
        driver.findElement(By.name("email"));
        driver.findElement(By.name("form_key"));
        driver.findElement(By.name("login[password]"));
    }

    @Test
    public void TC_04_Tagname() {
        int labelNumber = driver.findElements(By.tagName("label")).size();
        System.out.println(labelNumber);

        int addressNumber = driver.findElements(By.tagName("address")).size();
        System.out.println(addressNumber);
    }

    @Test
    public void TC_05_LinkText() {
        driver.findElement(By.linkText("ABOUT US"));
        driver.findElement(By.linkText("CONTACT US"));
    }

    @Test
    public void TC_06_Partial_LinkText() {
        int partialLinkText = driver.findElements(By.partialLinkText("US")).size();
        System.out.println(partialLinkText);

        driver.findElement(By.partialLinkText("PRIVACY"));
    }

    @Test
    public void TC_07_Css() {
        driver.findElement(By.cssSelector("form[method='get']"));
        driver.findElement(By.cssSelector("input[type='search']"));
        driver.findElement(By.cssSelector("button[title='Search']"));
        driver.findElement(By.cssSelector("form[id='newsletter-validate-detail']"));
        driver.findElement(By.cssSelector("input[autocapitalize='none']"));
    }

    @Test
    public void TC_08_XPath() {
        driver.findElement(By.xpath("//input[@title='Password']"));
        driver.findElement(By.xpath("//button[@id='send2']"));
        driver.findElement(By.xpath("//a[@class='f-left']"));
        driver.findElement(By.xpath("//form[@id='search_mini_form']"));
        driver.findElement(By.xpath("//input[@id='search']"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
