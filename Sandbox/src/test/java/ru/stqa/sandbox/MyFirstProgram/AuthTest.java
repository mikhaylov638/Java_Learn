/*
что надо сделать:
1. Добавить System.set chrome driver  проект.
2. Добавить выход из учетной записи.
3. Попросить убрать на этот номер ограничения по смскам.
4. Добавить скриншот прогруженного экрана
5. Добавить анализ прогруженной страницы на предмет подгрузки контента.

дополнительно: нучиться создавать проекты с подгрузкой java.lang.
                перенести кейсы в отдельный проект.
*/
package ru.stqa.sandbox.MyFirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthTest {

  private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void auth() throws InterruptedException {
        driver.get("https://stage-gorodtroika.rtgsoft.ru");
        driver.manage().window().setSize(new Dimension(1536, 824));
        driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.button-atom.Outlined.css-1ujsas3")).click();
        driver.findElement(By.cssSelector(".sc-dvpmds")).click();
        driver.findElement(By.cssSelector(".sc-dvpmds")).sendKeys("9645821798");
        driver.findElement(By.cssSelector(".sc-dHIava")).click();//нажал далее
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".sc-dvpmds")).click();
        driver.findElement(By.cssSelector(".sc-dvpmds")).sendKeys("0000");
        driver.findElement(By.cssSelector(".sc-dHIava")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".sc-dvpmds")).click();
        driver.findElement(By.cssSelector(".sc-dvpmds")).sendKeys("0000");
        driver.findElement(By.cssSelector(".sc-dHIava")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".sc-jhaWeW")).click();
        driver.findElement(By.cssSelector(".sc-jhaWeW")).sendKeys("0000");
        driver.findElement(By.cssSelector(".sc-dHIava")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".sc-cLQEGU")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".sc-hMFtBS [href='/logout']")).click();
    }
}
