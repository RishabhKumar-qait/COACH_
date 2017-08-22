package Verify_Homepage;

import static com.jayway.restassured.RestAssured.authentication;
import static com.jayway.restassured.RestAssured.basic;
import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Start_Browser.Browser;
import locators.Locators;

public class VerifyHomePageMethod {
	WebDriver driver = null;
	Browser browser = new Browser();
	Locators loc = new Locators();

	public void verify_logo() {
		WebElement element = driver.findElement(loc.logo());
		assertEquals(true, element.isDisplayed());

	}

	public void verify_Account() {
		WebElement str = driver.findElement(loc.account());
		assertEquals(true, str.isDisplayed());
	}

	public void verify_wishlist() {
		WebElement str = driver.findElement(loc.wishlist());
		assertEquals(true, str.isDisplayed());
	}

	public void close_driver() {
		driver.close();
	}

	public WebDriver start_chrome() throws Exception {
		driver = this.browser.start_chrome(driver);
		return driver;

	}

	public WebDriver launch_url() throws InterruptedException {
		driver = this.browser.launch_url(driver);
		driver = this.browser.refresh_page(driver);
		return driver;

	}

	public void Verify_Main_menu(int i) {
		String element = driver.findElement(loc.Main_menu(i)).getAttribute("href");
		authentication = basic("storefront", "coach123");
		given().expect().statusCode(200).when().get(element);

	}

}
