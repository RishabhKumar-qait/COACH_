package Verify_Homepage;

import java.net.MalformedURLException;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyHomePage_Test {

	VerifyHomePageMethod vm = new VerifyHomePageMethod();

	@BeforeClass
	public void start_browser() throws Exception {
		vm.start_chrome();
	}

	@BeforeMethod
	public void launch_url() throws InterruptedException {
		vm.launch_url();
	}

	@Test
	private void coach_001_verify_logo() {
		vm.verify_logo();
	}

	@Test
	private void coach_002_verify_Account() {
		vm.verify_Account();
	}

	@Test
	private void coach_003_verify_wishlist() {
		vm.verify_wishlist();
	}

	@Test
	private void coach_004_verify_New() throws MalformedURLException {
		vm.Verify_Main_menu(1);
	}

	@Test
	private void coach_005_verify_Women() throws MalformedURLException {
		vm.Verify_Main_menu(2);
	}

	@Test
	private void coach_006_verify_Men() throws MalformedURLException {
		vm.Verify_Main_menu(3);
	}

	@Test
	private void coach_007_verify_COACH_1941() throws MalformedURLException {
		vm.Verify_Main_menu(4);
	}

	@Test
	private void coach_008_verify_Personalize() throws MalformedURLException {
		vm.Verify_Main_menu(5);
	}

	@Test
	private void coach_009_verify_Gifts() throws MalformedURLException {
		vm.Verify_Main_menu(6);
	}

	@Test
	private void coach_010_verify_Sale() throws MalformedURLException {
		vm.Verify_Main_menu(7);
	}

	@AfterClass
	void close_browser() {
		vm.close_driver();
	}

}
