package Start_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	 

	public WebDriver start_chrome(WebDriver driver) throws Exception {
		String browser = System.getProperty("browser");
		if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("in")) {

			System.setProperty("webdriver.ie.driver", "Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			throw new Exception("Browser is not correct");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
	}

	public WebDriver launch_url(WebDriver driver) throws InterruptedException {
		driver.get("https://storefront:coach123@dwlp2.coach.com/");
		return driver;
	}

	public WebDriver refresh_page(WebDriver driver) {
		driver.get("https://dwlp2.coach.com");
		return driver;
	}


}
