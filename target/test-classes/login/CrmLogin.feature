@login_functionality
Feature: Test login functionality
  As a user,I wana login to the application

  @loginCRM
  Scenario: login with valid crementals
    Given open the application url
    When enter valid email "wajdi17"
    And enter a valid password "Wajdi.17"
    And click on login button
    Then user should be taken to the account page

  #Login Page Links
  @sigupLink
  Scenario: test SigUp Link
    Given open the application url
    When click on SigUp link
    Then user should be taken to the SigUp page

  @precingLink
  Scenario: test Pircing Link
    Given open the application url
    When click on Pricing link
    Then user should be taken to the Pricing page

  @customerLink
  Scenario: test Customers Link
    Given open the application url
    When click on Customers link
    Then user should be taken to the Customers page

  @contactLink
  Scenario: test contatct Link
    Given open the application url
    When click on Contatct link
    Then user should be taken to the Contatct page

  @loginFailCRM
  Scenario Outline: Login with invalid credentials 
    Given open the application url
    Then entre email <"login">
    And enter password <"password">
    Then login failed error message should be displayed

    Examples: 
      | login   | password |
      | test01  | Azert1   |
      | wajdi17 | Azert2   |
      | test2   | Wajdi.   |
      |         |          |
      |         |          |
