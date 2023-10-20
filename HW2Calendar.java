package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW2Calendar extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement simple=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(simple);
        WebElement calendar = driver.findElement(By.xpath("//input[@id='datepicker']"));
        calendar.click();
        WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(table));
        //sleect the date from calander "5th Dec 1998"

        String aMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
        String aYear=driver.findElement(By.className("ui-datepicker-year")).getText();
        while (!(aMonth.equals("December")&& aYear.equals("1998"))){
            driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
            aMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
            aYear=driver.findElement(By.className("ui-datepicker-year")).getText();
        }
driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='5']")).click();

    }

}
