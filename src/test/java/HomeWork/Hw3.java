package HomeWork;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
//        Check the if Checkbox1 is enabled
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for(WebElement checkBox:checkBoxes){
            String option = checkBox.getAttribute("value");
            if(option.equals("Checkbox-2")){
                boolean state = checkBox.isEnabled();
                System.out.println(state);
//                If Checkbox1 is disabled:
                if(!state){
                    //                Click on the "enable checkboxes" button.
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    enableBtn.click();
//                    Verify that Checkbox1 is now enabled.
                    boolean status2 = checkBox.isEnabled();
                    if(status2){
//                    Click on Checkbox1.
                        checkBox.click();
//                        Confirm that Checkbox1 is selected.
                        boolean isSelectedStatus = checkBox.isSelected();
                        System.out.println(isSelectedStatus);
                    }
                }
            }
        }
    }
}
