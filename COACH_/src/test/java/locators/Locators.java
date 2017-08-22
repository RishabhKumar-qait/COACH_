package locators;

import org.openqa.selenium.By;

public class Locators {
	By logo=By.xpath("//img[@alt='Coach Logo'][1]");
	By account =By.xpath("//a[@id='drop1']");
	By wishlist=By.xpath("//span[@class='icm-icon-like']");
	
	public By logo() {
		return logo;
	}
	
	public By account() {
		return account;
	}
	public By wishlist() {
		return wishlist;
	}

	public By Main_menu(int i) {
		By Main_menu=By.xpath("(//a[@role='menuitem'])[" + i + "]");
		return Main_menu;
	}
}
