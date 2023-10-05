package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=AYZoVhccfq_mCRmf8pmB7Pl5yKMtVtCZl-4Rw5NknaSq0HodbO0IIIqN3x_j2zQ3pZhKAhfiSYnmZw&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S721513490%3A1696468152973409&theme=glif");
        driver.manage().window().maximize();
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
                helpBtn.click();
                privacyBtn.click();
                String gmailHandle=driver.getWindowHandle();
                System.out.println(gmailHandle);
        Set<String> allHandles=driver.getWindowHandles();
        for(String handles:allHandles){
            driver.switchTo().window(handles);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy - Privacy & Terms - Google")){
                break;

            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
