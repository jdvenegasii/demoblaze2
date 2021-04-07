package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import steps.Common_Steps;

public class Common_Actions {

	private WebDriver driver;
	
	Common_Steps common_steps;
	
	public Common_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}
	
	public void goToUrl(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	
	public void quitWebDriver() {
		driver.quit();
	}
	
	public void sendKeys() throws InterruptedException, AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
	}

}
