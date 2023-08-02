Feature: Test the UserRegistrationForm

  Scenario: Test the RegisterPage
    Given User open the URL in "chrome" browser and user on RegisterPage
    When User enter firstname and lastname and EmailAddress and BusinessName
      | Vibha | Date | vibha@gmail.com | school |
    And User enter JobTitle and username and Password and CPassword
      | teacher | Vibhadate | Vrisha123 | Vrisha123 |
    And User also enter StreetAddress and Address2 and city and State and PostalCode and  Country
      | Shirur | Wagholi | Pune | Maharastra | 234321 | India |
    Then User click on submit buttonS
