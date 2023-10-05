package class5;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        WebElement firstBot=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        firstBot.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        WebElement alerm3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alerm3.click();
        //driver.switchTo().alert();
        alert.sendKeys("I am human");
        alert.accept();

        WebElement alerm2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alerm2.click();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
