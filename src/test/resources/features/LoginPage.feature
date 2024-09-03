Feature: Find Homestays and Villa

  Scenario: Search Result
  Given User is on homepage
  When User clicks on City textbox
  And enters "Thane" City
  Then User should be able to click on search result


#Feature: Search Homestays and Villas on MakeMyTrip
#
#  Scenario: Search for homestays and villas in Thane city
#    Given the user is on the MakeMyTrip homepage
#    When the user searches for "Thane"
#    And the user selects "Thane West" from the search results
#    Then the homestays and villas in Thane West should be displayed
