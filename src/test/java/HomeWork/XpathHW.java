package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
        name.sendKeys("Viktoriia");
        WebElement email=driver.findElement(By.xpath("(//input[@autocomplete='off' and @id='userEmail'])"));
        email.sendKeys("cat123456@gmail.com");
        WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        address.sendKeys("Edmonton,4588 104 St. T6M2Z9");
        WebElement permanent=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanent.sendKeys("Edmonton,4588 104 St. T6M2Z9");
        WebElement submit=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit.click();
    }


}
