@call
Feature: Verify Contacts functionality
  As a user, I want to verify that all Call functionality are working correctly,
  So that I can have a positive experience using the application

  Background: login with valid crementals
    Given open the application url
    When enter valid email "wajdi17"
    And enter a valid password "Wajdi.17"
    And click on login button

  @call1
  Scenario: Title of your scenario
    When click on New Call button
    And click on Lookup button
    And enter the deal Id "10001" in the search field 
    And click on Search 
    And click on the deal01
    And click on save button
    Then user sould be taken to the deal details
    
    
      | 
