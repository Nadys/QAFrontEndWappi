Feature: Login
  As QA Automation
  I want to enter Wappi
  To validate login functionality

  Scenario: Login with the correct data
    Given The Nadia join Wappi
    When she enters the credential
      |  user          |      password       |
      | nadiamickey81  |     12345678Nadys@  |
    Then the user should see the name