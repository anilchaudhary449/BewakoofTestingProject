package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PriceSortingTest {
    WebDriver driver;
    PriceSorting priceSorting;

    @Test
    void setup() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.get("https://www.bewakoof.com/");
        driver.manage().window().maximize();

        priceSorting=new PriceSorting(driver);
        priceSorting.priceSorting();
        Thread.sleep(5000);
        driver.quit();
    }
}
