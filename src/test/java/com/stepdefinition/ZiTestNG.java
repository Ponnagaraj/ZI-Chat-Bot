package com.stepdefinition;

import java.awt.AWTException;

import org.testng.annotations.*;

import com.base.PomClass;
import com.base.UtilityClass;

public class ZiTestNG extends UtilityClass {
	PomClass p=new PomClass();
	
	@Test (priority=0)
	private void verify_if_the_chat_bot_displayed_on_the_screen() {
		browserLaunch("chrome");
	    urlLaunch("https://insent-staging10.firebaseapp.com/fe-assignment");
	    implicitWait(10);
	    verifyUrl("assignment");
	    waitUntillPageLoad(10);
	    waitUntillWebelementClickable(p.getCookiesAcceptBtn(), 10);
	    click(p.getCookiesAcceptBtn());
	    waitUntillWebelementVisible(p.getZiChatBox(), 10);
	    click(p.getZiChatBox());
	    String msg1 = getText(p.getZiChatBox());
	    softAssertContains(msg1, "Hi", 
	    		"MisMatch in Welcome Message on ChatBox Panel");
}
	@Test(priority=1)
	private void verify_the_welcome_message_and_click_on_the_bot() {
		click(p.getZiChatBox());
		waitUntillPageLoad(10);
		waitUntillWebelementVisible(p.getMsgWelcome(), 10);
		String msg = getText(p.getMsgWelcome());
		softAssertContains(msg, "Welcome", 
				"Mismatch found in Welcome Message on ChatBox");
	}
	@Test(priority=2)
	private void enter_invalid_email_id_and_verify_error_message() throws AWTException {
		waitUntillWebelementVisible(p.getMailIdTxtBox(), 10);
		sendKeys(p.getMailIdTxtBox(), "hi@hi");
		btnEnter();
		String error = getText(p.getMsgMailIdError());
		softAssertContains(error, "enter a valid", 
				"Error: Mail Id box accepts invalid Mail ID");
	}
	@Test(priority=3)
	private void enter_valid_email_id_and_verify_message() throws AWTException {
		sendKeys(p.getMailIdTxtBox(), "ponnagarajc@gmail.com");
		btnEnter();
		waitUntillWebelementVisible(p.getFirstNameBox(), 10);
	}
	@Test (priority=4)
	private void enter_invalid_first_name_and_verify_the_message() throws AWTException {
		sendKeys(p.getFirstNameBox(), "12345678");
		btnEnter();
		String msg = getText(p.getFirstNameBox());
		softAssertContains(msg, "enter a valid", 
				"Error: First name box accepts invalid First Name");
	}
	@Test (priority=5)
	private void verify_the_restart_conversation_button() {
		waitUntillWebelementClickable(p.getRestartConversationBtn(), 10);
		click(p.getRestartConversationBtn());
		waitUntillWebelementVisible(p.getMsg2Welcome(), 10);
		waitUntillWebelementVisible(p.getMailIdTxtBox2(), 10);
		String text = getText(p.getMailIdTxtBox2());
		softAssertContains(text, "Enter", "Error in restart Conversation");
	}
	@Test (priority=6)
	private void enter_valid_data_in_all_input_fields_and_verify_the_message() throws AWTException {
		sendKeys(p.getMailIdTxtBox2(), "ponnagarajc@gmail.com");
		btnEnter();
		waitUntillWebelementVisible(p.getFirstNameTxtBox2(), 10);
		sendKeys(p.getFirstNameTxtBox2(), "Ponnagaraj");
		waitUntillWebelementClickable(p.getCountryAustraliaBtn(), 10);
		click(p.getCountryAustraliaBtn());
		waitUntillWebelementVisible(p.getMsgFinal(), 10);
	}
	@Test (priority=7)
	private void verify_that_after__valid_inputs_can_continue_the_conversation() {
		String text = getText(p.getMsgFinal());
		softAssertContains(text, "Enter", 
				"Can't Continue the chat after giving all credentials to the ChatBot");
	}
	@Test (priority=8)
	private void verify_the_function_of_close_button() {
		click(p.getCloseBtn());
		waitUntillWebelementClickable(p.getChatBoxIcon(), 10);
		String text = getText(p.getWebsiteSubmitBtn());
		softAssertEquals(text, "Submit", "Closing the chat function not working");
	}
	@Test (priority=9)
	private void verify_the_function_of_open_chat_button(){
		click(p.getChatBoxIcon());
		waitUntillWebelementVisible(p.getMsgFinal(), 10);
		String text = getText(p.getMsgFinal());
		softAssertContains(text, "Thank", 
				"Can't Open Chat bot by Clicking the chatbox icon");
	}
	@Test (priority=10)
	private void verify_back_button_and_greeting_message() {
		click(p.getBackBtn());
		waitUntillWebelementVisible(p.getMsg3Welcome(), 10);
		String text = getText(p.getMsg3Welcome());
		softAssertContains(text, "Zoominfo", 
				"Mismatch in greeting message after clicking back button in chatbox");
	}
	@Test (priority=11)
	private void verify_test_bot_button_to_chat_with_bot_again() {
		click(p.getTestBotBtn());
		waitUntillWebelementVisible(p.getMsgFinal(), 10);
		String text = getText(p.getMsgFinal());
		softAssertContains(text, "Thank", 
				"Can't Open Chat bot by Clicking the chat bot panel");
	}
	@Test (priority=12)
	private void verify_the_function_of_chat_bot_in_multiple_tab() {
		
	}
}
