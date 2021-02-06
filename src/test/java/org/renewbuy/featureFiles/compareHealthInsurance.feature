#/***
#* @author verma.piyush
#*/
Feature: Compare Health Insurance functionality from end to end

  Background:
    Given user open website for "" URL CHI

  @CompareHealthInsurance
  Scenario: Compare Health Insurance Scenario
    When user can see heading "D2C INSURANCE BROKING PVT. LTD." on Home Page CHI
    Then user can see logo of renewBuy on Home Page CHI
    Then user Hover over Health Insurance then clicks on Compare Health Insurance CHI
