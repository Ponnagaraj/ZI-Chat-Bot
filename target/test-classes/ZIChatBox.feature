Feature: Verifying the functionality of ZI chat application

@E2E
Scenario: verify if the chat bot is displayed on the screen
Given The User should be in navigated to given url
When the user should be in given url
Then the chat bot conversation should shown in the page
@E2E @Unit
Scenario: Verify the welcome message and Click on the bot
Given The User Should completed the previous test case
When the user loads the given url and clicks the chat bot
Then the welcome message should shown in chat bot
@E2E
Scenario: Enter invalid Email Id and verify error message
Given The User Should completed the previous test case
When the user enter invalid email id
Then the error message should shown in text box
@E2E
Scenario: Enter valid Email Id  and verify the message
Given The User Should completed the previous test case
When: the user enter valid email id
Then: the chat bot should give reply message as expected
@E2E
Scenario: Enter invalid First name and verify the message
Given The User Should completed the previous test case
When: the user enters invalid First name
Then: the error message should shown
@E2E
Scenario: Verify the Restart the conversation button
Given The User Should completed the previous test case
When: the user click on Restart conversation button
Then: the chat bot should asks email id again
@E2E
Scenario: Enter valid data in all input fields and verify the message
Given The User Should completed the previous test case
When: the user enters valid email id
And: the user enters valid first name
And: the user selects the country name
Then: the chat bot should give reply message
@E2E
Scenario: Verify that after the required valid inputs and can continue the conversation
Given The User Should completed the previous test case
When: the user fills all the input fields
Then: the user can continue conversation
@E2E
Scenario: Verify the function of Close the chat button
Given The User Should completed the previous test case
When: the user click on close button
Then: the chat bot should be closed to its minimal state

@E2E
Scenario: verify the function of open the chat button
Given The User Should completed the previous test case
When: the user click on open button
Then: the chat bot should open
@E2E
Scenario: verify back button on chatbox and verify the greeting message 
Given The User Should completed the previous test case
When: the user click on back button
Then: the greeting message should shown
@E2E
Scenario: verify test bot button to chat with bot again
Given The User Should completed the previous test case
When: the user click on test bot button
Then: the chat bot should open
@E2E
Scenario: verify the function of chat bot in multiple tab
Given The User Should completed the previous test case
When: the user opens new tab
And: enter url and wait
And: return to chat bot page again
Then: the user should able to enter data