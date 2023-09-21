package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExamp {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("hjgfhhdjfbv347895@gmail.com");
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("hjdgiuyer");
        WebElement logIn=driver.findElement(By.name("login"));
        logIn.click();

    }
}
