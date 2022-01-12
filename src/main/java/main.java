import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.romanovska\\webdriver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
                driver.get ("https://allo.ua");
        WebElement test1 = driver.findElement(By.xpath("//div[@class='ct-button']"));
                test1.click();
                WebElement test2 = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/div[1]/div[2]/div[2]/div[2]/div/ul/li[1]/a"));
                test2.click();
                WebElement test3 = driver.findElement(By.xpath("//li[@class='portal-card__link-container'][1]"));
                test3.click();
                WebElement test4 = driver.findElement(By.xpath("//button[text()='Купити'][1]"));
                test4.click();





        }

    }



