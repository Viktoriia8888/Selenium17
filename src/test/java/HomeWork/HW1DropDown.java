package HomeWork;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']")).click();
        List<WebElement>country=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
for(WebElement countryTyp:country){
    if(countryTyp.getText().equals("Greece")){
        countryTyp.click();
    }
}
    }
}
