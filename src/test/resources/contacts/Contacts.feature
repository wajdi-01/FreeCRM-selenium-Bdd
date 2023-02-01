@contacts
Feature: Verify Contacts functionality
  As a user, I want to verify that all Contacts functionality are working correctly,
  So that I can have a positive experience using the application

  Background: login with valid crementals
    Given open the application url
    When enter valid email "wajdi17"
    And enter a valid password "Wajdi.17"
    And click on login button

  @new-contact
  Scenario: Verify new contact option on the Contact dropdown menu
    Given put the mouse on Contact button
    When click on new contact option in the dropdown menu
    Then user sould be taken to the new contact page

  @combined-form
  Scenario: Verify combined form option on the Contact dropdown menu
    Given put the mouse on Contact button
    When click on new combined form option in the dropdown menu
    Then user sould be taken combined form page

  @full-search-form
  Scenario: Verify full search form option on the Contact dropdown menu
    Given put the mouse on Contact button
    When click on full search form option in the dropdown menu
    Then user sould be taken to full search from  page
