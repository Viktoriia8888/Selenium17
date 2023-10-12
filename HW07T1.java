package HomeWork;

import com.google.common.eventbus.SubscriberExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.awt.*;
import java.time.Duration;

public class HW07T1 extends CommonMethods {
    public static void main(String[] args) {
      /*  hw1:
        http://35.175.58.98/synchronization-explicit-wait.php
        click to open alert and handle it
        click to change text and get the chnaged text
        click to get hidden button click on it
        click to get tge checkbox selected and print if it is selected or not*/
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alertBtn=driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertBtn.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        WebElement changeText=driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeText.click();
        WebElement textElement=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        wait.until(ExpectedConditions.textToBePresentInElement(textElement,"Ssyntaxtechs"));
        String text=textElement.getText();
        System.out.println(text);
        WebElement displayBtn=driver.findElement(By.xpath("//button[@id='display_button']"));
        displayBtn.click();
        WebElement chekbox=driver.findElement(By.xpath("//input[@id='checkbox']"));
chekbox.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='checkbox']"));
        boolean status= checkBox.isSelected();
        if(status){
            System.out.println("Selected");
        }else{
            System.out.println("not selected");
        }
closeBrowser();
    }
}
