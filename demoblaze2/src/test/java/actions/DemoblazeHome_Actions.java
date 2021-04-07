package actions;

import static org.junit.Assert.fail;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.Action;

import elements.DemoblazeHome_Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Common_Steps;

public class DemoblazeHome_Actions {

	private WebDriver driver;
	DemoblazeHome_Elements demoblazehome_elements;

	public DemoblazeHome_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		demoblazehome_elements = new DemoblazeHome_Elements(driver);
	}

	public void clickOnLinkByText(String text) throws InterruptedException {
		driver.findElement(By.linkText(text)).click();
		Thread.sleep(3000);
	}
	
	public void clickOnButtonByText(String text) throws InterruptedException {
		if (text.equals(">")) {
			demoblazehome_elements.nextIcon.click();
		} else if (text.equals("<")) {
			demoblazehome_elements.prevIcon.click();
		} else if (text.equals("_(1)")) {
			demoblazehome_elements.oneIcon.click();
		} else if (text.equals("_(2)")) {
			demoblazehome_elements.twoIcon.click();
		} else {
			demoblazehome_elements.threeIcon.click();
		}
		Thread.sleep(1000);
	}
	
	public WebElement imageVerify(String text) {
		if (text.equals("1st")) {
			return demoblazehome_elements.firstImage;
		} else if (text.equals("2nd")) {
			return demoblazehome_elements.secondImage;
		} else {
			return demoblazehome_elements.thirdImage;
		}
	}
	
	public void clickOnHomeLink() throws InterruptedException {
		demoblazehome_elements.homeLink.click();
		Thread.sleep(2000);
	}

	public void clickOnNextLink() throws InterruptedException {
		demoblazehome_elements.nextLink.click();
		Thread.sleep(2000);
	}

	public void clickOnPreviousLink() throws InterruptedException {
		demoblazehome_elements.previousLink.click();
		Thread.sleep(2000);
	}

	public void clickOnItem() throws InterruptedException {
		demoblazehome_elements.item.click();
		Thread.sleep(5000);
	}

	public void clickOnAddToCart() throws InterruptedException {
		demoblazehome_elements.addToCartButton.click();
		Thread.sleep(2000);
	}

	public void clickOnLogoLink() throws InterruptedException {
		demoblazehome_elements.logoLink.click();
		Thread.sleep(2000);
	}

	public WebElement contactBox() {
		WebElement boxTitle = demoblazehome_elements.contactBox;
		return boxTitle;
	}

	public WebElement aboutUsBox() {
		WebElement boxTitle = demoblazehome_elements.aboutUsBox;
		return boxTitle;
	}

	public WebElement loginBox() {
		WebElement boxTitle = demoblazehome_elements.loginBox;
		return boxTitle;
	}

	public WebElement signUpBox() {
		WebElement boxTitle = demoblazehome_elements.signUpBox;
		return boxTitle;
	}

	public WebElement galaxyS6() {
		WebElement boxTitle = demoblazehome_elements.galaxyS6;
		return boxTitle;
	}

	public WebElement htcM9() {
		WebElement boxTitle = demoblazehome_elements.htcM9;
		return boxTitle;
	}

	public WebElement sonyi5() {
		WebElement boxTitle = demoblazehome_elements.sonyi5;
		return boxTitle;
	}

	public WebElement macPro() {
		WebElement boxTitle = demoblazehome_elements.macPro;
		return boxTitle;
	}

	public WebElement apple24() {
		WebElement boxTitle = demoblazehome_elements.apple24;
		return boxTitle;
	}

	public WebElement asusHD() {
		WebElement boxTitle = demoblazehome_elements.asusHD;
		return boxTitle;
	}

	public WebElement nokia1520() {
		WebElement boxTitle = demoblazehome_elements.nokia1520;
		return boxTitle;
	}

	public WebElement itemDesc() {
		WebElement boxTitle = demoblazehome_elements.itemDesc;
		return boxTitle;
	}

	public WebElement aboutUsBox2() {
		WebElement boxTitle = demoblazehome_elements.aboutUsBox2;
		return boxTitle;
	}

	public void usernameLogin(String username) {
		demoblazehome_elements.usernameLogin.sendKeys(username);
	}

	public void passwordLogin(String password) {
		demoblazehome_elements.passwordLogin.sendKeys(password);
	}

	public void clickOnLoginButton() throws InterruptedException {
		demoblazehome_elements.loginButton.click();
		Thread.sleep(2000);
	}

	public WebElement logoutButton() {
		WebElement buttonTitle = demoblazehome_elements.logoutButton;
		return buttonTitle;
	}

	public WebElement welcomeMessage(String message) {
		WebElement msg = demoblazehome_elements.welcomeMessage;
		return msg;
	}

	public void clickOnPlaceOrderButton() throws InterruptedException {
		demoblazehome_elements.placeOrderButton.click();
		Thread.sleep(2000);
	}

	public void nameField(String country) {
		demoblazehome_elements.nameField.sendKeys(country);
	}

	public void countryField(String country) {
		demoblazehome_elements.countryField.sendKeys(country);
	}

	public void cityField(String city) {
		demoblazehome_elements.cityField.sendKeys(city);
	}

	public void creditCardField(String cc) {
		demoblazehome_elements.creditCardField.sendKeys(cc);
	}

	public void monthField(String month) {
		demoblazehome_elements.monthField.sendKeys(month);
	}

	public void yearField(String year) {
		demoblazehome_elements.yearField.sendKeys(year);
	}

	public void clickOnPurchaseButton() throws InterruptedException {
		demoblazehome_elements.purchaseButton.click();
		Thread.sleep(3000);
	}

	public WebElement thankYouMessage() {
		WebElement msgTitle = demoblazehome_elements.thankYouMessage;
		return msgTitle;
	}

	public WebElement okButton() {
		WebElement buttonTitle = demoblazehome_elements.okButton;
		return buttonTitle;
	}

	public void clickOnXButton() {
		demoblazehome_elements.xButton.click();
	}

	public void clickOnCloseButton() {
		demoblazehome_elements.closeButton.click();
	}

	public void clickOnPlayButton() throws InterruptedException {
		demoblazehome_elements.playButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnPlayButtonAgain() throws InterruptedException {
		demoblazehome_elements.playButtonAgain.click();
		Thread.sleep(3000);
	}
	
	public void clickOnPauseButton() throws InterruptedException {
		demoblazehome_elements.pauseButton.click();
		Thread.sleep(3000);
	}
	
	public WebElement playButton() {
		WebElement playButton = demoblazehome_elements.playButton;
		return playButton;
	}

	public WebElement controlBar() {
		return demoblazehome_elements.controlBar;
	}
	
	public void adjustVolumeSlider() {
		//actions.moveToElement(demoblazehome_elements.volumeSlider);
		demoblazehome_elements.volumeSlider.click();
	}
	
	public void clickOnMuteButton() throws InterruptedException {
		demoblazehome_elements.muteButton.click();
		Thread.sleep(2000);
	}
	
	public void clickOnUnmuteButton() throws InterruptedException {
		demoblazehome_elements.unmuteButton.click();
		Thread.sleep(2000);
	}
	
	public void skipAheadInVideo() throws InterruptedException {
		demoblazehome_elements.playbackSlider.click();
		Thread.sleep(2000);
	}
	
	public void clickOnPipButton() throws InterruptedException {
		demoblazehome_elements.pipButton.click();
		Thread.sleep(2000);
	}
	
	public void clickOnPipPlayButton() throws InterruptedException {
		demoblazehome_elements.pipPlayButton.click();
		Thread.sleep(2000);
	}
	
	public void clickOnMaximizeButton() throws InterruptedException {
		demoblazehome_elements.maximizeButton.click();
		Thread.sleep(2000);
	}
	
	public void clickOnMinimizeButton() throws InterruptedException {
		demoblazehome_elements.minimizeButton.click();
		Thread.sleep(2000);
	}
	
	public WebElement placeOrderBox() {
		WebElement boxTitle = demoblazehome_elements.placeOrderBox;
		return boxTitle;
	}
	
	public void emailField(String email) {
		demoblazehome_elements.emailField.sendKeys(email);
	}

	public void contactNameField(String contactName) {
		demoblazehome_elements.contactNameField.sendKeys(contactName);
	}

	public void messageField(String message) {
		demoblazehome_elements.messageField.sendKeys(message);
	}
	
	public void clickOnContactBoxCloseButton() {
		demoblazehome_elements.contactBoxCloseButton.click();
	}

	public void clickOnContactBoxXButton() {
		demoblazehome_elements.contactBoxXButton.click();
	}
	
	public void clickOnSendMessageButton() throws InterruptedException {
		demoblazehome_elements.sendMessageButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnAboutUsBoxCloseButton() {
		demoblazehome_elements.aboutUsBoxCloseButton.click();
	}

	public void clickOnAboutUsBoxXButton() {
		demoblazehome_elements.aboutUsBoxXButton.click();
	}
	
	public void clickOnSignUpBoxCloseButton() {
		demoblazehome_elements.signUpBoxCloseButton.click();
	}

	public void clickOnSignUpBoxXButton() {
		demoblazehome_elements.signUpBoxXButton.click();
	}
	
	public String randomstring() {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return(generatedString1);
    }
	
	public void signUpUsernameField() {
		demoblazehome_elements.signUpUsernameField.sendKeys(randomstring());
	}

	public void signUpPasswordField() {
		demoblazehome_elements.signUpPasswordField.sendKeys(randomstring());
	}
	
	public void clickOnSignUpButton() throws InterruptedException {
		demoblazehome_elements.signUpButton.click();
		Thread.sleep(1000);
	}
	
	public void clickOnLogInBoxCloseButton() {
		demoblazehome_elements.logInBoxCloseButton.click();
	}

	public void clickOnLogInBoxXButton() {
		demoblazehome_elements.logInBoxXButton.click();
	}
}
