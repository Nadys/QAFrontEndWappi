Feature: Order without Cupon
  As QA Automation
  I want to enter Wappi
  To validate login functionality

  Background: Login with the correct data
    Given The Nadia join Wappi
    When she enters the credential
      |  user          |      password       |
      | nadiamickey81  |     12345678Nadys@  |
    Then the user should see the name

    Scenario: Order without Cupon
      When she click on the button
      Then it will select the order