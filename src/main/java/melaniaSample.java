
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class melaniaSample {

    public static void main(String[] args) throws InterruptedException
     {
        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Melania Trump");
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).submit();
    }
}



