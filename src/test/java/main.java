import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class main{

        public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anna.romanovska\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://allo.ua");
        WebElement inputplace = driver.findElement(By.cssSelector("input#search-form__input"));
        inputplace.sendKeys("Apple"+ Keys.ENTER);
        WebElement phone = driver.findElement(By.xpath("//*[@data-product-id='4956273']"));
            String phoneattribute = phone.getAttribute("offsetWidth");
            System.out.println(phoneattribute);
            String phoneText = phone.getText();
            System.out.println(phoneText);
        phone.click();
        WebElement buy = driver.findElement(By.id("product-buy-button"));
        buy.click();
        WebElement total = driver.findElement(By.cssSelector(".order-now"));
        total.click();
        WebElement name = driver.findElement(By.id("onepage-customer-name"));
        name.sendKeys("testuser1" + Keys.TAB + "0634876325"+ Keys.TAB + "testuser@mail");
        Thread.sleep(5000);
        driver.quit();

    }

    }



