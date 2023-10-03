package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW4 {
    /*HW2:
Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php.");
        driver.manage().window().maximize();

  WebElement checkBox=driver.findElement(By.xpath("//input[@value='gender-female']"));
        if(checkBox.isDisplayed()){
            System.out.println("Female Radio button is displayed");
        }else{
            System.out.println("Female Radio button is not displayed");
        }
WebElement showButton=driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        showButton.click();
        Thread.sleep(2000);
if(checkBox.isDisplayed()){
    System.out.println("Female Radio button is displayed");
}else{
    System.out.println("Female Radio button is not displayed");
}
    }
}
