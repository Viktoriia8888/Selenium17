package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
        WebElement textBox1=driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch17");
        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");
        WebElement textBox3=driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        textBox3.sendKeys("what the color of sun");
        WebElement text=driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(text.getText());
        WebElement text1=driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        text1.sendKeys("abracadabra");
WebElement textEmail=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
textEmail.sendKeys("hello12354@gmail.com");
        WebElement textEmail2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        textEmail2.sendKeys("hello14@gmail.com");
        WebElement textEmail3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        textEmail.sendKeys("hello88888@gmail.com");
        WebElement field=driver.findElement(By.xpath("(//input[@data-detail='one' and @name='customField'])"));
        field.sendKeys("cat");
        WebElement field2=driver.findElement(By.xpath("(//input[@name='customField' and @data-detail='two'])"));
        field2.sendKeys("dog");
        WebElement field3=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        field3.sendKeys("Hello");
        WebElement field4=driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField1']"));
        field4.sendKeys("Buy");
    }
}
