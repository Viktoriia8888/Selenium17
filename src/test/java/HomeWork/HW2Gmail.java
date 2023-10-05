package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW2Gmail {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=AYZoVhccfq_mCRmf8pmB7Pl5yKMtVtCZl-4Rw5NknaSq0HodbO0IIIqN3x_j2zQ3pZhKAhfiSYnmZw&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S721513490%3A1696468152973409&theme=glif");
        driver.manage().window().maximize();
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement TermBtn=driver.findElement(By.xpath("//a[text()='Terms']"));
        helpBtn.click();
        privacyBtn.click();
        TermBtn.click();
String gmailHend=driver.getWindowHandle();
        Set<String>handles=driver.getWindowHandles();
        for(String x:handles){
            driver.switchTo().window(x);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service - Privacy & Terms - Google"));{
                System.out.println("Terms page title is: "+ title);
                break;
            }
        }
        driver.switchTo().window(gmailHend);
        System.out.println(driver.getTitle());
    }
}
