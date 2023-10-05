package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1Iframe {
    /*goto  http://35.175.58.98/handle-iframe.php
click the checkbox
then select the  babycat
then enter topic name
all of this must be done in the same order*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();
        driver.switchTo().frame("textfield-iframe");
        driver.switchTo().frame("checkboxIframe");
        WebElement checkBox=driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement dropDown=driver.findElement(By.cssSelector("select[id='animals']"));
        Select sel=new Select(dropDown);
        sel.selectByVisibleText("Baby Cat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        WebElement textBox=driver.findElement(By.cssSelector("input[name='Topic']"));
        textBox.sendKeys("Selenium");
        Thread.sleep(3000);
        driver.quit();
    }
}
