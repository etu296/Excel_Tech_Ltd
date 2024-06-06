import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;
@BeforeTest
    public void driverSetUp() throws Exception {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origin=*");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ibos\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.get("https://www.excelbd.com/");

    }
}
