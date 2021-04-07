package steps;

import static org.junit.Assert.fail;

import java.awt.AWTException;

import actions.Common_Actions;
import actions.DemoblazeHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class DemoblazeHome_Steps {
	Common_Actions common_actions;
	DemoblazeHome_Actions demoblazehome_actions;

	public DemoblazeHome_Steps(Common_Actions common_actions, DemoblazeHome_Actions demoblazehome_actions) {
		this.common_actions = common_actions;
		this.demoblazehome_actions = demoblazehome_actions;
	}

	@Given("I am on Demoblaze Home Page")
	public void i_am_on_Demoblaze_Home_Page() throws InterruptedException {
		common_actions.goToUrl("https://www.demoblaze.com/");
	}

	// Verify contact link

	@When("I click on {string} Link")
	public void i_click_on_Contact_Link(String str1) throws InterruptedException {
		if (!str1.equals("Home")) {
			demoblazehome_actions.clickOnLinkByText(str1);
		} else {
			demoblazehome_actions.clickOnHomeLink();
		}
	}

	@Then("I navigate to Contact Box")
	public void i_navigate_to_Contact_Box() {
		if (demoblazehome_actions.contactBox().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify About us link

	@Then("I navigate to About us Box")
	public void i_navigate_to_About_us_Box() {
		if (demoblazehome_actions.aboutUsBox().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Cart link

	@Then("I navigate to Cart Page")
	public void i_navigate_to_Cart_Page() {
		String expUrl = "https://www.demoblaze.com/cart.html";
		String actUrl = common_actions.getCurrentPageUrl();
		if (!expUrl.equals(actUrl)) {
			fail("Link does not navigate to expected page");
		} else {
			System.out.println("Link navigates successfully");
		}
	}

	// Verify Log in link

	@Then("I navigate to Log in Box")
	public void i_navigate_to_Log_in_Box() {
		if (demoblazehome_actions.loginBox().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Sign up link

	@Then("I navigate to Sign up Box")
	public void i_navigate_to_Sign_up_Box() {
		if (demoblazehome_actions.signUpBox().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}
	
	//Verify Image Carousel
	
	@Then("I click {string} button")
	public void i_click_button(String string) throws InterruptedException {
		demoblazehome_actions.clickOnButtonByText(string);		
	}

	@Then("I verify {string} image")
	public void i_verify_image(String string) {
		if (demoblazehome_actions.imageVerify(string).isDisplayed()) {
			System.out.println("Button navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Phones link

	@Then("I navigate to Phones Page")
	public void i_navigate_to_Phones_Page() {
		if (demoblazehome_actions.galaxyS6().isDisplayed() && demoblazehome_actions.htcM9().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Laptops link

	@Then("I navigate to Laptops Page")
	public void i_navigate_to_Laptops_Page() {
		if (demoblazehome_actions.sonyi5().isDisplayed() && demoblazehome_actions.macPro().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Monitors link

	@Then("I navigate to Monitors Page")
	public void i_navigate_to_Monitors_Page() {
		if (demoblazehome_actions.apple24().isDisplayed() && demoblazehome_actions.asusHD().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Next link

	@When("I click on Next Link")
	public void i_click_on_Next_Link() throws InterruptedException {
		demoblazehome_actions.clickOnNextLink();
	}

	@Then("I navigate to Next Page")
	public void i_navigate_to_Next_Page() {
		if (demoblazehome_actions.apple24().isDisplayed() && demoblazehome_actions.macPro().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Verify Previous link

	@When("I click on Previous Link")
	public void i_click_on_Previous_Link() throws InterruptedException {
		demoblazehome_actions.clickOnPreviousLink();
	}

	@Then("I navigate to Previous Page")
	public void i_navigate_to_Previous_Page() {
		if (demoblazehome_actions.nokia1520().isDisplayed() && demoblazehome_actions.apple24().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Select item

	@When("I click on an item")
	public void i_click_on_an_item() throws InterruptedException {
		demoblazehome_actions.clickOnItem();
	}

	@Then("I navigate to item description")
	public void i_navigate_to_item_description() {
		if (demoblazehome_actions.itemDesc().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Add item to cart

	@Then("I add item to cart")
	public void i_add_item_to_cart() throws InterruptedException {
		demoblazehome_actions.clickOnAddToCart();
	}

	// Verify Logo Link

	@Then("I click on Logo Link")
	public void i_click_on_Logo_Link() throws InterruptedException {
		demoblazehome_actions.clickOnLogoLink();
	}

	@Then("I navigate to Home Page")
	public void i_navigate_to_Home_Page() {
		String expUrl = "https://www.demoblaze.com/index.html";
		String actUrl = common_actions.getCurrentPageUrl();
		if (!expUrl.equals(actUrl)) {
			fail("Link does not navigate to expected page");
		} else {
			System.out.println("Link navigates successfully");
		}
	}

	// Verify About us Link

	@Then("I nav to About us Box")
	public void i_nav_to_About_us_Box() {
		if (demoblazehome_actions.aboutUsBox2().isDisplayed()) {
			System.out.println("Link navigates successfully");
		} else {
			System.out.println("Link does not navigate as expected");
		}
	}

	// Login with valid credentials

	@Then("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		demoblazehome_actions.usernameLogin(string);
		demoblazehome_actions.passwordLogin(string2);
	}

	@Then("Click on Login")
	public void click_on_Login() throws InterruptedException {
		demoblazehome_actions.clickOnLoginButton();
	}

	@Then("the NavBar should contain Logout Button and contain message {string}")
	public void the_NavBar_should_contain_Logout_Button(String message) {
		if (demoblazehome_actions.logoutButton().isDisplayed()
				&& demoblazehome_actions.welcomeMessage(message).isDisplayed()) {
			System.out.println("Login was successful");
		} else {
			System.out.println("Login failed");
		}
	}

	// Purchase Order scenarios

	@Then("I hit return on the keyboard")
	public void i_hit_return_on_the_keyboard() throws InterruptedException, AWTException {
		common_actions.sendKeys();
	}

	@When("I click on the Place Order Button")
	public void i_click_on_the_Place_Order_Button() throws InterruptedException {
		demoblazehome_actions.clickOnPlaceOrderButton();
	}

	@Then("I fill in all the information {string} {string} {string} {string} {string} {string}")
	public void i_fill_in_all_the_information(String string1, String string2, String string3, String string4,
			String string5, String string6) {
		demoblazehome_actions.nameField(string1);
		demoblazehome_actions.countryField(string2);
		demoblazehome_actions.cityField(string3);
		demoblazehome_actions.creditCardField(string4);
		demoblazehome_actions.monthField(string5);
		demoblazehome_actions.yearField(string6);
	}

	@Then("Click Purchase Button")
	public void click_Purchase_Button() throws InterruptedException {
		demoblazehome_actions.clickOnPurchaseButton();
		if (demoblazehome_actions.thankYouMessage().isDisplayed() && demoblazehome_actions.okButton().isDisplayed()) {
			System.out.println("Purchase was successful");
		} else {
			System.out.println("Purchase failed");
		}
	}

	@Then("I click on X button")
	public void i_click_on_X_button() {
		demoblazehome_actions.clickOnXButton();
	}

	@Then("I navigate to same Cart Page")
	public void i_navigate_to_same_Cart_Page() {
		String expUrl = "https://www.demoblaze.com/cart.html#";
		String actUrl = common_actions.getCurrentPageUrl();
		if (!expUrl.equals(actUrl)) {
			fail("Link does not navigate to expected page");
		} else {
			System.out.println("Link navigates successfully");
		}
	}

	@Then("I click on Close button")
	public void i_click_on_Close_button() {
		demoblazehome_actions.clickOnCloseButton();
	}

	@Then("Click On Purchase Button")
	public void click_On_Purchase_Button() throws InterruptedException {
		demoblazehome_actions.clickOnPurchaseButton();
	}

	@Then("I see error message")
	public void i_see_error_message() throws InterruptedException, AWTException {
		common_actions.sendKeys();
	}

	@Then("I return to Place order box")
	public void i_return_to_Place_order_box() {
		if (demoblazehome_actions.placeOrderBox().isDisplayed()) {
			System.out.println("Attempt to place order with incomplete information failed as expected");
		} else {
			System.out.println("Failure: Order was placed without complete information");
		}
	}

	// Contact Box-Sending message

	@Then("I fill in all the information {string} {string} {string}")
	public void i_fill_in_all_the_information(String string, String string2, String string3) {
		demoblazehome_actions.emailField(string);
		demoblazehome_actions.contactNameField(string2);
		demoblazehome_actions.messageField(string3);
	}

	@Then("I click on Send message button")
	public void i_click_on_Send_message_button() throws InterruptedException {
		demoblazehome_actions.clickOnSendMessageButton();
	}

	@Then("I see Thanks for the message!")
	public void i_see_Thanks_for_the_message() throws InterruptedException, AWTException {
		common_actions.sendKeys();
	}

	@Then("I navigate to {string} Page")
	public void i_navigate_to_Page(String string) {
		String expUrl = string;
		String actUrl = common_actions.getCurrentPageUrl();
		if (!expUrl.equals(actUrl)) {
			fail("Actual page does not match expected page");
		} else {
			System.out.println("Navigated to " + string + " successfully");
		}
	}

	@Then("I fill in some of the information {string} {string}")
	public void i_fill_in_some_of_the_information(String string, String string2) {
		demoblazehome_actions.emailField(string);
		demoblazehome_actions.contactNameField(string2);
	}

	@Then("I return to Contact box")
	public void i_return_to_Contact_box() {
		if (demoblazehome_actions.contactBox().isDisplayed()) {
			System.out.println("Attempt to send message with incomplete information failed as expected");
		} else {
			fail("Failure: Message was sent without complete information");

		}
	}

	@Then("I click on Contact box Close button")
	public void i_click_on_Contact_Box_Close_button() {
		demoblazehome_actions.clickOnContactBoxCloseButton();
	}

	@Then("I click on Contact box X button")
	public void i_click_on_Contact_Box_X_button() {
		demoblazehome_actions.clickOnContactBoxXButton();
	}

	// Playing the video in the About us Box

	@Then("I click on Play button")
	public void i_click_on_Play_button() throws InterruptedException {
		demoblazehome_actions.clickOnPlayButton();
	}

	@Then("Verify that video is playing")
	public void verify_that_video_is_playing() {
		if (demoblazehome_actions.controlBar().isEnabled()) {
			System.out.println("Video playback successful");
		} else {
			fail("Video playback failed");
		}
	}

	@Then("I click on About us Close button")
	public void i_click_on_About_us_Close_button() {
		demoblazehome_actions.clickOnAboutUsBoxCloseButton();
	}

	@Then("I click on About us X button")
	public void i_click_on_About_us_X_button() {
		demoblazehome_actions.clickOnAboutUsBoxXButton();
	}

	@Then("I click on Pause button")
	public void i_click_on_Pause_button() throws InterruptedException {
		demoblazehome_actions.clickOnPauseButton();
	}

	@Then("I click on Play button again")
	public void i_click_on_Play_button_again() throws InterruptedException {
		demoblazehome_actions.clickOnPlayButtonAgain();
	}

	@Then("Verify that video is paused")
	public void verify_that_video_is_paused() {
		if (demoblazehome_actions.playButton().isEnabled()) {
			System.out.println("Video paused successfully");
		} else {
			fail("Video pause failed");
		}
	}

	@When("I adjust volume by using slider")
	public void i_adjust_volume_by_using_slider() {
		demoblazehome_actions.adjustVolumeSlider();
	}

	@Then("I click on Mute")
	public void i_click_on_Mute() throws InterruptedException {
		demoblazehome_actions.clickOnMuteButton();
	}

	@Then("I click on Unmute")
	public void i_click_on_Unmute() throws InterruptedException {
		demoblazehome_actions.clickOnUnmuteButton();
	}

	@When("I skip ahead in video")
	public void i_skip_ahead_in_video() throws InterruptedException {
		demoblazehome_actions.skipAheadInVideo();
	}
	
	@Then("I click on Picture in Picture Button")
	public void i_click_on_Picture_in_Picture_Button() throws InterruptedException {
		demoblazehome_actions.clickOnPipButton();
	}

	@Then("I close the main About us Window")
	public void i_close_the_main_About_us_Window() {
		demoblazehome_actions.clickOnAboutUsBoxCloseButton();
	}

	@Then("I press play on the Picture in Picture Window")
	public void i_press_play_on_the_Picture_in_Picture_Window() throws InterruptedException {
		demoblazehome_actions.clickOnPipPlayButton();
	}
	
	@Then("I click on Maximize button")
	public void i_click_on_Maximize_button() throws InterruptedException {
		demoblazehome_actions.clickOnMaximizeButton();
	}

	@Then("I click on Minimize button")
	public void i_click_on_Minimize_button() throws InterruptedException {
		demoblazehome_actions.clickOnMinimizeButton();;
	}

	@Then("I click on Sign up Close button")
	public void i_click_on_Sign_up_Close_button() {
		demoblazehome_actions.clickOnSignUpBoxCloseButton();
	}

	@Then("I click on Sign up X button")
	public void i_click_on_Sign_up_X_button() {
		demoblazehome_actions.clickOnSignUpBoxXButton();
	}

	//@Then("I fill in the information {string} {string}")
	//public void i_fill_in_the_information(String string, String string2) {
	//	demoblazehome_actions.signUpUsernameField(string);
	//	demoblazehome_actions.signUpPasswordField(string2);
	//}
	
	@Then("I fill in the username and password")
	public void i_fill_in_the_username_and_password() {
		demoblazehome_actions.signUpUsernameField();
		demoblazehome_actions.signUpPasswordField();
	}

	@Then("I fill in the password")
	public void i_fill_in_the_password() {
		demoblazehome_actions.signUpPasswordField();
	}

	@Then("I fill in the username")
	public void i_fill_in_the_username() {
		demoblazehome_actions.signUpUsernameField();
	}

	@Then("I click on Sign up button")
	public void i_click_on_Sign_up_button() throws InterruptedException {
		demoblazehome_actions.clickOnSignUpButton();
	}

	@Then("I see Sign up successful. Message")
	public void i_see_Sign_up_successful_Message() throws InterruptedException, AWTException {
		common_actions.sendKeys();
	}
	
	@Then("I see Please fill out Username and Password. Message")
	public void i_see_Please_fill_out_Username_and_Password_Message() throws InterruptedException, AWTException {
		common_actions.sendKeys();
	}
	
	@Then("I see failed order message")
	public void i_see_failed_order_message() throws InterruptedException, AWTException {
		if (demoblazehome_actions.thankYouMessage().isDisplayed() && demoblazehome_actions.okButton().isDisplayed()) {
			fail("Purchase was successful but should have failed");
		} else {
			System.out.println("Failed order message");
		}
	}
	
	@Then("I am returned to Place order box")
	public void i_am_returned_to_Place_order_box() {
		if (demoblazehome_actions.placeOrderBox().isDisplayed()) {
			System.out.println("Attempt to place order with incomplete information failed as expected");
		} else {
			fail("Failure: Order was placed without complete information");
		}
	}

	@Then("I click on Log in Close button")
	public void i_click_on_Login_in_Close_button() {
		demoblazehome_actions.clickOnLogInBoxCloseButton();
	}

	@Then("I click on Log in X button")
	public void i_click_on_Login_in_X_button() {
		demoblazehome_actions.clickOnLogInBoxXButton();
	}



}
