Feature: Retail Account Page

  #Note: for this feature you have to have an account and be logged into account. Repeated steps are
  #under Background keyword
  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'zad123@gmail.com' and password 'Zad@1237514'
    And User click on login button
    Then User should be logged in into Account
    And User click on Account option

  @test-01
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Zara' and Phone '5516761058'
    And User click on Update button
    Then user profile information should be updated 'Personal Information Updated Successfully'

  @test-02
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | perviousPassword | newPassword | confirmPassword |
      | Zad@1237513      | Zad@1237514 | Zad@1237514     |
    And User click on Change Password button
    Then a messgae should be displayed 'Password Updated Successfully'

  @test-03
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567890123451 | Roh        |               9 |           2028 |          175 |
    And User click on Add your card button
    Then message should be displayed 'Payment Method added successfully'

  @test-04
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567890123455 | Ali        |               5 |           2029 |          167 |
    And User click on Update Your Card button
    Then a message should displayed 'Payment Method Updated Successfully'

  @test-05
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @test-06
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city    | state      | zipCode |
      | United States | Zara     |  5516761058 | 120 Washinton |   2 | Hoboken | California |   07307 |
    And User click Add Your Address button
    Then A message should be displayed 'Address Added Successfully'

  @test-07
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User update new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city    | state      | zipCode |
      | United States | Zara     |  5516761059 | 130 Washinton |   4 | Hoboken | California |   08307 |
    And User click update Your Address button
    Then updated message should be displayed 'Address Updated Successfully'

  @test-08
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
