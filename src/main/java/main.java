import org.openqa.selenium.chrome.ChromeDriver;



public class main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.romanovska\\webdriver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
                driver.get ("https://www.google.com");
                    }

    }

