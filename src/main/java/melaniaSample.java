
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class melaniaSample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Melania Trump");
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).submit();
    }
}



