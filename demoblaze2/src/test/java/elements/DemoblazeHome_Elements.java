package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoblazeHome_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='navbarExample']/ul//a[@href='index.html']") public WebElement homeLink;
	@FindBy(css = "h5#exampleModalLabel") public WebElement contactBox;
	@FindBy(css = "h5#videoModalLabel") public WebElement aboutUsBox;
	@FindBy(css = "h5#logInModalLabel") public WebElement loginBox;
	@FindBy(css = "a#signin2") public WebElement signUpBox;
	@FindBy(css = ".carousel-control-next-icon") public WebElement nextIcon;
	@FindBy(css = ".carousel-control-prev-icon") public WebElement prevIcon;
	@FindBy(css = ".carousel-indicators [data-target='\\#carouselExampleIndicators']:nth-of-type(1)") public WebElement oneIcon;
	@FindBy(css = ".carousel-indicators [data-target='\\#carouselExampleIndicators']:nth-of-type(2)") public WebElement twoIcon;
	@FindBy(css = ".carousel-indicators [data-target='\\#carouselExampleIndicators']:nth-of-type(3)") public WebElement threeIcon;
	@FindBy(css = "img[alt='First slide']") public WebElement firstImage;
	@FindBy(css = "img[alt='Second slide']") public WebElement secondImage;
	@FindBy(css = "img[alt='Third slide']") public WebElement thirdImage;
	@FindBy(linkText = "Samsung galaxy s6") public WebElement galaxyS6;
	@FindBy(linkText = "HTC One M9") public WebElement htcM9;
	@FindBy(linkText = "Sony vaio i5") public WebElement sonyi5;
	@FindBy(linkText = "MacBook Pro") public WebElement macPro;
	@FindBy(linkText = "Apple monitor 24") public WebElement apple24;
	@FindBy(linkText = "ASUS Full HD") public WebElement asusHD;
	@FindBy(css = "#next2") public WebElement nextLink;
	@FindBy(css = "#prev2") public WebElement previousLink;
	@FindBy(linkText = "Nokia lumia 1520") public WebElement nokia1520;
	@FindBy(css = "div#tbodyid > div:nth-of-type(2) img") public WebElement item;
	@FindBy(css = "div#more-information > strong") public WebElement itemDesc;
	@FindBy(css = ".btn.btn-lg.btn-success") public WebElement addToCartButton;
	@FindBy(css = "a#nava") public WebElement logoLink;
	@FindBy(css = "div#videoModal > div[role='document'] h5#logInModalLabel") public WebElement aboutUsBox2;
	@FindBy(xpath = "/html//input[@id='loginusername']") public WebElement usernameLogin;
	@FindBy(xpath = "/html//input[@id='loginpassword']") public WebElement passwordLogin;
	@FindBy(xpath = "//div[@id='logInModal']/div[@role='document']//div[@class='modal-footer']/button[2]") public WebElement loginButton;
	@FindBy(xpath = "/html//a[@id='logout2']") public WebElement logoutButton;
	@FindBy(linkText = "Welcome jvenegas") public WebElement welcomeMessage;
	@FindBy(css = ".btn.btn-success") public WebElement placeOrderButton;
	@FindBy(css = "div#orderModal > div[role='document'] .btn.btn-primary") public WebElement purchaseButton;
	@FindBy(xpath = "/html//input[@id='name']") public WebElement nameField;
	@FindBy(xpath = "/html//input[@id='country']") public WebElement countryField;
	@FindBy(xpath = "/html//input[@id='city']") public WebElement cityField;
	@FindBy(xpath = "/html//input[@id='card']") public WebElement creditCardField;
	@FindBy(xpath = "/html//input[@id='month']") public WebElement monthField;
	@FindBy(xpath = "/html//input[@id='year']") public WebElement yearField;
	@FindBy(css = ".showSweetAlert.sweet-alert.visible > h2") public WebElement thankYouMessage;
	@FindBy(css = ".btn.btn-lg.btn-primary.confirm") public WebElement okButton;
	@FindBy(xpath = "/html//tbody[@id='tbodyid']//a[@href='#']") public WebElement deleteLink;
	@FindBy(xpath = "//div[@id='orderModal']/div[@role='document']//div[@class='modal-header']/button[@type='button']/span[.='×']") public WebElement xButton;
	@FindBy(xpath = "//div[@id='orderModal']/div[@role='document']//div[@class='modal-footer']/button[1]") public WebElement closeButton;
	@FindBy(xpath = "//div[@id='example-video']/button/span[@class='vjs-icon-placeholder']") public WebElement playButton;
	@FindBy(xpath = "//div[@id='example-video']//button[@title='Play']/span[@class='vjs-icon-placeholder']") public WebElement playButtonAgain;
	@FindBy(xpath = "//div[@id='example-video']//button[@title='Pause']/span[@class='vjs-icon-placeholder']") public WebElement pauseButton;
	@FindBy(css = ".vjs-control.vjs-progress-control") public WebElement controlBar;
	@FindBy(xpath = "//div[@id='example-video']/div[@class='vjs-control-bar']/div[1]/div/div[@role='slider']/div[@class='vjs-volume-level']") public WebElement volumeSlider;
	@FindBy(xpath = "//div[@id='example-video']//button[@title='Mute']/span[@class='vjs-icon-placeholder']") public WebElement muteButton;
	@FindBy(xpath = "//div[@id='example-video']//button[@title='Unmute']/span[@class='vjs-icon-placeholder']") public WebElement unmuteButton;
	@FindBy(xpath = "//div[@id='example-video']/div[@class='vjs-control-bar']/div[5]") public WebElement playbackSlider;
	@FindBy(css = "button[title='Picture-in-Picture'] > .vjs-icon-placeholder") public WebElement pipButton;
	@FindBy(css = ".vjs-big-play-button") public WebElement pipPlayButton;
	@FindBy(css = "button[title='Fullscreen'] > .vjs-icon-placeholder") public WebElement maximizeButton;
	@FindBy(css = "button[title='Non-Fullscreen'] > .vjs-icon-placeholder") public WebElement minimizeButton;
	@FindBy(css = "h5#orderModalLabel") public WebElement placeOrderBox;
	@FindBy(xpath = "/html//input[@id='recipient-email']") public WebElement emailField;
	@FindBy(xpath = "/html//input[@id='recipient-name']") public WebElement contactNameField;
	@FindBy(xpath = "/html//textarea[@id='message-text']") public WebElement messageField;
	@FindBy(css = "div#exampleModal > div[role='document'] .btn.btn-primary") public WebElement sendMessageButton;
	@FindBy(xpath = "//div[@id='exampleModal']/div[@role='document']//div[@class='modal-footer']/button[1]") public WebElement contactBoxCloseButton;
	@FindBy(xpath = "//div[@id='exampleModal']/div[@role='document']//div[@class='modal-header']/button[@type='button']/span[.='×']") public WebElement contactBoxXButton;
	@FindBy(xpath = "/html//div[@id='videoModal']//div[@class='modal-footer']/button[@type='button']") public WebElement aboutUsBoxCloseButton;
	@FindBy(xpath = "/html//div[@id='videoModal']//div[@class='modal-header']/button[@type='button']/span[.='×']") public WebElement aboutUsBoxXButton;
	@FindBy(xpath = "//div[@id='signInModal']/div[@role='document']//div[@class='modal-footer']/button[1]") public WebElement signUpBoxCloseButton;
	@FindBy(xpath = "//div[@id='signInModal']/div[@role='document']//div[@class='modal-header']/button[@type='button']/span[.='×']") public WebElement signUpBoxXButton;
	@FindBy(xpath = "/html//input[@id='sign-username']") public WebElement signUpUsernameField;
	@FindBy(xpath = "/html//input[@id='sign-password']") public WebElement signUpPasswordField;
	@FindBy(xpath = "//div[@id='signInModal']/div[@role='document']//div[@class='modal-footer']/button[2]") public WebElement signUpButton;
	@FindBy(xpath = "//div[@id='logInModal']/div[@role='document']//div[@class='modal-footer']/button[1]") public WebElement logInBoxCloseButton;
	@FindBy(xpath = "//div[@id='logInModal']/div[@role='document']//div[@class='modal-header']/button[@type='button']/span[.='×']") public WebElement logInBoxXButton;
	
	public DemoblazeHome_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}


