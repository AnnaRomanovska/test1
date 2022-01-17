import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.romanovska\\webdriver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
                driver.get ("https://allo.ua");
        WebElement test2 = driver.findElement(By.cssSelector("#search-form__input"));
             test2.sendKeys("Xiaomi", Keys.ENTER);
        WebElement test3 = driver.findElement(By.xpath("//button[text()='Купити'][1]"));
             test3.click();





        }

    }



