package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.base.PomClass;
import com.base.UtilityClass;

import io.cucumber.java.en.*;

public class StepDefinition extends UtilityClass {
	PomClass p=new PomClass();
	@Given("The User should be in navigated to given url")
	public void the_User_should_be_in_navigated_to_given_url() {
	    browserLaunch("chrome");
	    urlLaunch("https://insent-staging10.firebaseapp.com/fe-assignment");
	}

	@When("the user should be in given url")
	public void the_user_should_be_in_given_url() {
	    verifyUrl("assignment");
	}

	@Then("the chat bot conversation should shown in the page")
	public void the_chat_bot_conversation_should_shown_in_the_page() {
	    waitUntillWebelementVisible(p.getZiChatBox(), 10);
	}
	
	@Given("The User Should completed the previous test case")
	public void the_User_Should_completed_the_previous_test_case() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@When("the user loads the given url")
	public void the_user_loads_the_given_url_and_clicks_the_chat_bot() {
	    verifyUrl("assignment");
	    click(p.getZiChatBox());
	    String msg1 = getText(p.getMsgWelcome());
	    softAssertContains(msg1, "Welcome", "MisMatch in WelCome Message");
	}

	@Then("the welcome message should shown in chat bot")
	public void the_welcome_message_should_shown_in_chat_bot() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("the user enter invalid email id")
	public void the_user_enter_invalid_email_id() throws AWTException {
	    sendKeys(p.getMailIdTxtBox(), "hi@hi");
	    btnEnter();
 
	}

	@Then("the error message should shown in text box")
	public void the_error_message_should_shown_in_text_box() {
		String mailIdError = getText(p.getMsgMailIdError());
	    softAssertContains(mailIdError, "enter a valid email", 
	    		"Chat Bot accepts Invalid email Id");
	}
}
