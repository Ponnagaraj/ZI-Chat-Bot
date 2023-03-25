package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends UtilityClass{

	public PomClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="insent-popup-content")
	private WebElement ziChatBox;
	@FindBy(id="hs-eu-confirmation-button")
	private WebElement cookiesAcceptBtn;
	@FindBy(xpath="//div[@id='insent-text-message-message-wrapper']//child::div[contains(text(),'Wel')]")
	private WebElement msgWelcome;
	
	public WebElement getCookiesAcceptBtn() {
		return cookiesAcceptBtn;
	}
	@FindBy(xpath="//div[contains(text(),'Email')]//parent::div//child::div[@id='insent-input-message-input-box-body-input-validate']")
	private WebElement mailIdTxtBox;
	
	@FindBy(xpath="//div[contains(text(),'First')]//parent::div//child::div[@id='insent-input-message-input-box-body-input-validate']")
	private WebElement firstNameBox;
	
	@FindBy(xpath="//div[contains(text(),'India')]")
	private WebElement countryIndiaBtn;
	
	@FindBy(xpath="//div[contains(text(),'Australia')]")
	private WebElement countryAustraliaBtn;
	
	@FindBy(xpath="//div[contains(text(),'United')]")
	private WebElement countryUSABtn;
	
	@FindBy(id="insent-message-input-buttons-wrapper")
	private WebElement restartConversationBtn;

	@FindBy(xpath="(//div[@id='insent-text-message-message-wrapper']//child::div[contains(text(),'Wel')])[2]")
	private WebElement msg2Welcome;

	@FindBy (xpath="//div[@class='sc-kEYyzF faNzMh']")
	private WebElement msgMailIdError;
	
	@FindBy(xpath="//div[contains(text(), 'What')]")
	private WebElement msgFirstNameError;
@FindBy(xpath="//div[contains(text(),'Thank')]")
	private WebElement msgFinal;

@FindBy(xpath="//button[contains(text(),'Submit')][1]")
private WebElement websiteSubmitBtn;
	public WebElement getWebsiteSubmitBtn() {
	return websiteSubmitBtn;
}

	public WebElement getMsgFinal() {
	return msgFinal;
}
	@FindBy(xpath="//img[@class='sc-htpNat gowZFB']")
	private WebElement closeBtn;
	
	@FindBy(id="insent-launcher-icon")
	private WebElement chatBoxIcon;
	
	@FindBy(xpath="//img[@alt='back button']")
	private WebElement backBtn;
	
	@FindBy(xpath="//h4[@class='sc-cHSUfg TcBal']")
	private WebElement msg3Welcome;
	
	@FindBy(id="insent-agent-card-agent-sender")
	private WebElement testBotBtn;
	
	@FindBy(xpath="(//div[contains(text(),'Email')]//parent::div//child::div[@id='insent-input-message-input-box-body-input-validate'])[2]")
	private WebElement mailIdTxtBox2;
	@FindBy (xpath="(//div[contains(text(),'First')]//parent::div//child::div[@id='insent-input-message-input-box-body-input-validate'])[2]")
	private WebElement firstNameTxtBox2;
	
	
	public WebElement getZiChatBox() {
		return ziChatBox;
	}

	public WebElement getMailIdTxtBox2() {
		return mailIdTxtBox2;
	}

	public WebElement getFirstNameTxtBox2() {
		return firstNameTxtBox2;
	}

	public WebElement getMsgWelcome() {
		return msgWelcome;
	}

	public WebElement getMailIdTxtBox() {
		return mailIdTxtBox;
	}

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public WebElement getCountryIndiaBtn() {
		return countryIndiaBtn;
	}

	public WebElement getCountryAustraliaBtn() {
		return countryAustraliaBtn;
	}

	public WebElement getCountryUSABtn() {
		return countryUSABtn;
	}

	public WebElement getRestartConversationBtn() {
		return restartConversationBtn;
	}

	public WebElement getMsg2Welcome() {
		return msg2Welcome;
	}

	public WebElement getMsgMailIdError() {
		return msgMailIdError;
	}

	public WebElement getMsgFirstNameError() {
		return msgFirstNameError;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getChatBoxIcon() {
		return chatBoxIcon;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getMsg3Welcome() {
		return msg3Welcome;
	}

	public WebElement getTestBotBtn() {
		return testBotBtn;
	}
}
