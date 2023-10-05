package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
//        maximize the window
        driver.manage().window().maximize();
        WebElement multDrop=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(multDrop);
        sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        Thread.sleep(3000);
        sel.deselectByVisibleText("Texas");
        System.out.println(sel.isMultiple());

    }

}
