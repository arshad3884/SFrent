package sfrentstaging.TestComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	public WebDriver driver;

	public WebDriver initializeDriver() {
		//Chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// options.addArguments("--user-data-dir=C:\\Users\\hp\\AppData\\Local\\Google\\Chrome\\User
		// Data\\");
		// options.addArguments("--profile-directory=Profile 1");
		options.addArguments("start-maximized"); // open Browser in maximized mode
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		

		/* Firefox
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.manage().window().maximize(); 
		 return driver;
		 */

		// Edge Browser
		// EdgeOptions options = new EdgeOptions();
		// options.addArguments("--remote-allow-origins=*");
		// driver = new EdgeDriver(options);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// return driver;
	}

}
