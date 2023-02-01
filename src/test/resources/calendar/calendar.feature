@calendar
Feature: Verify calendar functionality
  As a user, I want to verify that all Conlendar functionality are working correctly,
  So that I can have a positive experience using the application

  Background: login with valid crementals
    Given open the application url
    When enter valid email "wajdi17"
    And enter a valid password "Wajdi.17"
    And click on login button

  @new-event
  Scenario: Verify new event option on the Calendar dropdown menu
    Given put the mouse on Calendar button
    When click on new event option in the dropdown menu
    Then user sould be taken to the new event page

  @view-today
  Scenario: Verify view today option on the Calendar dropdown menu
    Given put the mouse on Calendar button
    When click on View Today option in the dropdown menu
    Then user sould be taken to the VIew Today page

  @week-view
  Scenario: Verify week view  option on the Calendar dropdown menu
    Given put the mouse on Calendar button
    When click on Week View option in the dropdown menu
    Then user sould be taken to the Week View page

  @month-view
  Scenario: Verify Month View option on the Calendar dropdown menu
    Given put the mouse on Calendar button
    When click on Month View option in the dropdown menu
    Then user sould be taken to the Month View page

  @add-new-event
  Scenario: Verify the addition of a new event
    Given put the mouse on Calendar button
    When click on new event option in the dropdown menu
    And enter a title in the title field "Test.Title01"
    And choose a date from the calendar in the FROM filed
    And choose a date from the calendar in the TO field
    And select a category
    And click on ADD to assigne the event
    And select YES to confirm
    And click on SAVE button
    Then all the details of the new event are displayed
    And confirmation email is sent
