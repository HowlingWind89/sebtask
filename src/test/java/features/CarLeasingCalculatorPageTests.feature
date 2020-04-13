Feature: Car Leasing Calculator Page

  Background: Open Car leasing calculator page
    Given I open Car leasing calculator page
    And I confirm cookie dialogue
    And I expand Car leasing calculator menu
    And I switch to calculator iframe

    @TEST
    Scenario: Check that monthly payment is changed accordingly
      When I select Operating lease as leasing type
      And I check that monthly payment amount is equal to 0 euros
      And I enter vehicle price amount 1000
      And I enter downpayment amount 10
      And I select downpayment type euros
      And I select contract period to 60 months
      And I enter interest rate amount 1
      And I enter residual value amount 1
      Then I check that monthly payment amount is equal to 16,69 euros

  @TEST
  Scenario: Check that monthly payment is not changed
    When I select Operating lease as leasing type
    And I check that monthly payment amount is equal to 0 euros
    And I enter vehicle price amount 1000
    And I enter downpayment amount 10
    And I select downpayment type euros
    And I select contract period to 60 months
    And I enter interest rate amount 1
    And I enter residual value amount 1
    And I check that monthly payment amount is equal to 16,69 euros
    And I enter downpayment amount 1
    And I select downpayment type %
    Then I check that monthly payment amount is equal to 16,69 euros

  @TEST
  Scenario: Check that months are equal to the payment rows in schedule table
    When I select Operating lease as leasing type
    And I enter vehicle price amount 1000
    And I enter downpayment amount 10
    And I select downpayment type euros
    And I select contract period to 60 months
    And I enter interest rate amount 1
    And I enter residual value amount 1
    And I click schedule button
    Then I check that amount of rows with monthly payments equal to the contract period months