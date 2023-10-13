package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UItest {


    @Test
    public void startbrowser() {
//        WebDriverManager.edgedriver().setup();


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']//descendant::option[@value='7']")).click();
        driver.findElement(By.xpath("//div[@class='react-datepicker__week']//descendant::div[@aria-label='Choose Tuesday, August 1st, 2023']")).click();
       String val= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).getText();

       System.out.println("caleder  +:"+val);
        //driver.quit();


    }

    @Test
    public void clcikondate() {
//        WebDriverManager.edgedriver().setup();
//        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
//        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
//        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']//descendant::option[@value='7']")).click();
//        driver.findElement(By.xpath("//div[@class='react-datepicker__week']//descendant::div[@aria-label='Choose Tuesday, August 1st, 2023']")).click();
//    }
    }
}
