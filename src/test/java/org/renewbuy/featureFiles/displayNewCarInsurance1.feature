#/***
#* @author verma.piyush
#*/

Feature: New Car Insurance functionality from end to end

  Background:
    Given user open website for "" URL

  @NewCarInsurance
  Scenario: New Car Insurance Scenario
    When user can see heading "D2C INSURANCE BROKING PVT. LTD." on Home Page
    Then user can see logo of renewBuy on Home Page
    Then user Hover over Motor Insurance then Hover over Car Insurance then clicks on New Car Insurance
    Then user can see heading "D2C INSURANCE BROKING PVT. LTD." on New Car Insurance Page
    Then user wait for "5" seconds to get Pop Up Msg
    Then user close the POpUp window
    Then user enters "hyundai santro" in 'Type Your Vehicle Modal' text field then select complete modalname
    Then user select "2019" year as purchasing year
    Then user click on Instant Quote Button
    Then user wait for "15" seconds to page get load
    Then user changes the Vehicle Modal name as "hyundai fluidic verna"
    Then user wait for "10" seconds to page get Vehicle Modal
    Then user changes the Registered RTO as "up13"
    Then user wait for "10" seconds to page get Registered RTO
    Then user Updates the Purchasing Date as "10" Month as "Jan" Year as "2019"
#    Then user Updates the Purchasing Date as "10"
#    Then user Updates the Purchasing Month as "Jan"
#    Then user Updates the Purchasing Year as "2019"
    Then user wait for "10" seconds to page get Purchasing date
