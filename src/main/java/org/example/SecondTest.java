package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SecondTest {

    String MOBILE_SERVICE_URL = "https://next.privat24.ua/payments/dashboard";

    By QUERY1 = By.xpath("//input[@data-qa-node='query']");
    By button = By.xpath("//*[@id='app']/div[2]/section/div/div/div[2]/div[2]/div/div[2]/a/div/button");
    By FIO = By.xpath("//textarea[@data-qa-node='FIO']");
    By CUSTOM_COMPANY = By.xpath("//textarea[@data-qa-node='CUSTOM_COMPANY']");
    By CUSTOM_OKPO = By.xpath("//textarea[@data-qa-node='CUSTOM_OKPO']");
    By DEST = By.xpath("//textarea[@data-qa-node='DEST']");
    By SUM = By.xpath("//input[@data-qa-node='SUM']");
    By numberdebitSource = By.xpath("//input[@data-qa-node='numberdebitSource']");
    By expiredebitSource = By.xpath("//input[@data-qa-node='expiredebitSource']");
    By CVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    By button2 = By.xpath("//*[@id='app']/div[2]/section/div/div/div[3]/div/form/div[9]/div[2]/button");
    By button3 = By.xpath("//*[@id='app']/div[2]/section/div/div/div[2]/div/div[8]/div[2]/button");

    @Test
    public void checkPaymentSum() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,250)", "");

        driver.get(MOBILE_SERVICE_URL);
        driver.findElement(QUERY1).sendKeys("UA333510050000026005325079000");
        driver.findElement(button).click();
        driver.findElement(FIO).sendKeys("Бойко Олександра");
        driver.findElement(CUSTOM_COMPANY).sendKeys("NEXT");
        driver.findElement(CUSTOM_OKPO).sendKeys("12345678");
        driver.findElement(DEST).sendKeys("світло");
        driver.findElement(SUM).sendKeys("100");
        driver.findElement(numberdebitSource).sendKeys("4552331448138217");
        driver.findElement(expiredebitSource).sendKeys("12/25");
        driver.findElement(CVV).sendKeys("123");
        driver.findElement(firstName).sendKeys("TEST");
        driver.findElement(lastName).sendKeys("TESTOVICH");
        driver.findElement(button2).click();
        driver.findElement(button3).click();
    }
}