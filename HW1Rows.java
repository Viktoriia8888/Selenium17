package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import java.util.NoSuchElementException;

import java.util.List;

public class HW1Rows extends CommonMethods {
    public static void main(String[] args) {
        /*goto http://35.175.58.98/table-pagination-demo.php
print all the rows with remarks pass
remember to print rows from all pages of tables*/
        String url="http://35.175.58.98/table-pagination-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        List<WebElement> pageNumber = driver.findElements(By.xpath("//a[contains(@class,'page_link ')]"));
        pageNumber.size();
        for(int i=0;i<pageNumber.size();i++){
            List<WebElement> data = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td[7]"));
            int count=0;
            for(WebElement d:data){
                String status = d.getText();
                if(status.equals("Pass")){
//                    print the row
                    System.out.println("row is"+count);
                    WebElement row = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+(count+1)+"]"));
                    System.out.println(row.getText());
                }
                count++;
            }

            driver.findElement(By.xpath("//a[@class='next_link']")).click();
        }

    }
}
