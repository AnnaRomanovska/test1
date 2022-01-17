import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.romanovska\\webdriver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
                driver.get ("https://allo.ua");
        WebElement test1 = driver.findElement(By.cssSelector("#search-form__input"));
             test1.sendKeys("Xiaomi", Keys.ENTER);
        WebElement test4 = driver.findElement(By.xpath("//button[text()='Купити'][1]"));
             test4.click();





        }

    }



