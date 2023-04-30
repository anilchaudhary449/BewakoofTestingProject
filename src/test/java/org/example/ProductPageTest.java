package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ProductPageTest {
    WebDriver driver;

    @Test
    void setup(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.get("https://www.bewakoof.com/");
        driver.manage().window().maximize();

        ProductPage productPage=new ProductPage(driver);
        productPage.checkProduct();
    }


}
