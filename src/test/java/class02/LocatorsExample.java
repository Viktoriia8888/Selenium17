package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("hgyfbjh8777");
        Thread.sleep(2000);
        userName.clear();
        userName.sendKeys("Admin");
       WebElement password= driver.findElement(By.name("txtPassword"));
password.sendKeys("Hum@nhrm123");
WebElement login=driver.findElement(By.className("button"));
login.click();
WebElement welcomeMsg=driver.findElement(By.linkText("Welcome Admin"));
String msg=welcomeMsg.getText();
System.out.println("the message is: "+ msg);







    }
}
