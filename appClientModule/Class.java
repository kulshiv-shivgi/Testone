import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {



static WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonika.chaudhary\\Desktop\\shar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://www.google.com");
System.out.println("sonika");
driver.quit();
	}


