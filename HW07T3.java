package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HW07T3 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/table-search-filter-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        List<WebElement>status=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td[4]"));
        int i=0;
        for(WebElement sta: status){
            String statusText=sta.getText();
            if(statusText.equalsIgnoreCase("in progress")){
                System.out.println("the row has status is "+i);
                WebElement row=driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+(i+1)+"]"));
                System.out.println(row.getText());
            }
            i=i+1;
        }

    }
}
