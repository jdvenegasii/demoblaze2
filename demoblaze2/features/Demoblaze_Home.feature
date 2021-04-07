Feature: Demoblaze Home Page Scenarios

  @DB-01
  Scenario: Verify Contact Link
    Given I am on Demoblaze Home Page
    When I click on "Contact" Link
    Then I navigate to Contact Box

  @DB-02
  Scenario: Verify About us Link
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box

  @DB-03
  Scenario: Verify Cart Link
    Given I am on Demoblaze Home Page
    When I click on "Cart" Link
    Then I navigate to Cart Page

  @DB-04
  Scenario: Verify Log in Link
    Given I am on Demoblaze Home Page
    When I click on "Log in" Link
    Then I navigate to Log in Box

  @DB-05
  Scenario: Verify Sign up Link
    Given I am on Demoblaze Home Page
    When I click on "Sign up" Link
    Then I navigate to Sign up Box

  @DB-06
  Scenario: Verify Image Carousel
    Given I am on Demoblaze Home Page
    Then I click ">" button
    And I verify "2nd" image
    Then I click ">" button
    And I verify "3rd" image
    Then I click "<" button
    And I verify "2nd" image
    Then I click "<" button
    And I verify "1st" image
    Then I click "_(2)" button
    And I verify "2nd" image
    Then I click "_(3)" button
    And I verify "3rd" image
    Then I click "_(1)" button
    And I verify "1st" image

  @DB-07
  Scenario: Verify Phones Link
    Given I am on Demoblaze Home Page
    When I click on "Phones" Link
    Then I navigate to Phones Page

  @DB-08
  Scenario: Verify Laptops Link
    Given I am on Demoblaze Home Page
    When I click on "Laptops" Link
    Then I navigate to Laptops Page

  @DB-09
  Scenario: Verify Monitors Link
    Given I am on Demoblaze Home Page
    When I click on "Monitors" Link
    Then I navigate to Monitors Page

  @DB-10
  Scenario: Verify Next Link
    Given I am on Demoblaze Home Page
    When I click on Next Link
    Then I navigate to Next Page

  @DB-11
  Scenario: Verify Previous Link
    Given I am on Demoblaze Home Page
    When I click on Previous Link
    Then I navigate to Previous Page

  @DB-12
  Scenario: Select Item
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description

  @DB-13
  Scenario: Add Selected item to Cart
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description
    And I add item to cart

  @DB-14
  Scenario: Verify Logo Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on Logo Link
    And I navigate to Home Page

  @DB-15
  Scenario: Verify Home Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on "Home" Link
    And I navigate to Home Page

  @DB-16
  Scenario: Verify Contact Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on "Contact" Link
    And I navigate to Contact Box

  @DB-17
  Scenario: Verify About us Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on "About us" Link
    And I nav to About us Box

  @DB-18
  Scenario: Verify Cart Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on "Cart" Link
    And I navigate to Cart Page

  @DB-19
  Scenario: Verify Log in Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on "Log in" Link
    And I navigate to Log in Box

  @DB-20
  Scenario: Verify Sign up Link from Selected Item Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I click on "Sign up" Link
    And I navigate to Sign up Box

  @DB-21
  Scenario: Delete Item from cart
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description
    And I add item to cart
    And I hit return on the keyboard
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "Delete" Link

  @DB-22
  Scenario: Verify Sign up Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "Sign up" Link
    And I navigate to Sign up Box

  @DB-23
  Scenario: Verify Logo Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on Logo Link
    And I navigate to Home Page

  @DB-24
  Scenario: Verify Home Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "Home" Link
    And I navigate to Home Page

  @DB-25
  Scenario: Verify Contact Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "Contact" Link
    And I navigate to Contact Box

  @DB-26
  Scenario: Verify About us Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "About us" Link
    And I nav to About us Box

  @DB-27
  Scenario: Verify Cart Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "Cart" Link
    And I navigate to same Cart Page

  @DB-28
  Scenario: Verify Login Link from Cart Page
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    Then I click on "Log in" Link
    And I navigate to Log in Box

  @DB-29
  Scenario: Verify Place order button on Cart Page
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description
    And I add item to cart
    And I hit return on the keyboard
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I click on X button

  @DB-30
  Scenario: Verify Close button on Place Order Box
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I click on Close button
    And I navigate to "https://www.demoblaze.com/cart.html" Page

  @DB-31
  Scenario: Verify X button on Place Order Box
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I click on X button
    And I navigate to "https://www.demoblaze.com/cart.html" Page

  @DB-32
  Scenario: Purchase Order with complete info
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description
    And I add item to cart
    And I hit return on the keyboard
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I fill in all the information "J Roy" "USA" "NY" "3211" "02" "2023"
    And Click Purchase Button

  @DB-33
  Scenario: Purchase Order with no credit card info
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description
    And I add item to cart
    And I hit return on the keyboard
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I fill in all the information "J Roy" "USA" "NY" "" "02" "2023"
    And Click On Purchase Button
    Then I see error message
    Then I return to Place order box

  @DB-34
  Scenario: Verify Close button on Contact Box
    Given I am on Demoblaze Home Page
    Then I click on "Contact" Link
    And I navigate to Contact Box
    Then I click on Contact box Close button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-35
  Scenario: Verify X button on Contact Box
    Given I am on Demoblaze Home Page
    Then I click on "Contact" Link
    And I navigate to Contact Box
    Then I click on Contact box X button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-36
  Scenario: Send message with complete info
    Given I am on Demoblaze Home Page
    Then I click on "Contact" Link
    And I navigate to Contact Box
    Then I fill in all the information "jv@gmail.com" "Julian" "Hello, nice webpage"
    Then I click on Send message button
    Then I see Thanks for the message!
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-37
  Scenario: Send blank message
    Given I am on Demoblaze Home Page
    Then I click on "Contact" Link
    And I navigate to Contact Box
    Then I fill in some of the information "jv@gmail.com" "Julian"
    Then I click on Send message button
    Then I see error message
    Then I return to Contact box

  @DB-38
  Scenario: Verify Close button on About us Box
    Given I am on Demoblaze Home Page
    Then I click on "About us" Link
    And I navigate to About us Box
    Then I click on About us Close button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-39
  Scenario: Verify X button on About us Box
    Given I am on Demoblaze Home Page
    Then I click on "About us" Link
    And I navigate to About us Box
    Then I click on About us X button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-40
  Scenario: Play Video in About us Box
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box
    And I click on Play button
    Then Verify that video is playing

  @DB-41
  Scenario: Pause Video in About us Box
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box
    And I click on Play button
    Then Verify that video is playing
    And I click on Pause button
    Then Verify that video is paused
    And I click on Play button again
    Then Verify that video is playing

  @DB-42
  Scenario: Adjust Volume of Video
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box
    And I click on Play button
    Then Verify that video is playing
    Then I click on Mute
    And I click on Unmute

  @DB-43
  Scenario: Skip Ahead in video
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box
    And I click on Play button
    Then Verify that video is playing
    When I skip ahead in video

  @DB-44
  Scenario: Verify Picture in Picture functionality
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box
    And I click on Play button
    Then Verify that video is playing
    And I click on Picture in Picture Button
    Then I close the main About us Window
    And I press play on the Picture in Picture Window

  @DB-45
  Scenario: Verify Maximize video functionality
    Given I am on Demoblaze Home Page
    When I click on "About us" Link
    Then I navigate to About us Box
    And I click on Play button
    Then Verify that video is playing
    And I click on Maximize button
    Then I click on Minimize button

  @DB-46
  Scenario: Verify Close button on Log in Box
    Given I am on Demoblaze Home Page
    Then I click on "Log in" Link
    And I navigate to Log in Box
    Then I click on Log in Close button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-47
  Scenario: Verify X button on Log in Box
    Given I am on Demoblaze Home Page
    Then I click on "Log in" Link
    And I navigate to Log in Box
    Then I click on Log in X button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-48
  Scenario: Log in with valid credentials
    Given I am on Demoblaze Home Page
    When I click on "Log in" Link
    Then I navigate to Log in Box
    And I enter "jvenegas" and "pw123"
    Then Click on Login
    Then the NavBar should contain Logout Button and contain message "Welcome jvenegas"

  @DB-49
  Scenario: Log in with invalid password
    Given I am on Demoblaze Home Page
    When I click on "Log in" Link
    Then I navigate to Log in Box
    And I enter "jvenegas" and "pw124"
    Then Click on Login
    Then I see error message
    Then I navigate to Log in Box

  @DB-50
  Scenario: Log in with invalid username
    Given I am on Demoblaze Home Page
    When I click on "Log in" Link
    Then I navigate to Log in Box
    And I enter "jvenega" and "pw123"
    Then Click on Login
    Then I see error message
    Then I navigate to Log in Box

  @DB-51
  Scenario: Verify Close button on Sign up Box
    Given I am on Demoblaze Home Page
    Then I click on "Sign up" Link
    And I navigate to Sign up Box
    Then I click on Sign up Close button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-52
  Scenario: Verify X button on Sign up Box
    Given I am on Demoblaze Home Page
    Then I click on "Sign up" Link
    And I navigate to Sign up Box
    Then I click on Sign up X button
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-53
  Scenario: Sign Up with complete info
    Given I am on Demoblaze Home Page
    Then I click on "Sign up" Link
    And I navigate to Sign up Box
    Then I fill in the username and password
    Then I click on Sign up button
    Then I see Sign up successful. Message
    And I navigate to "https://www.demoblaze.com/" Page

  @DB-54
  Scenario: Sign Up with no user name
    Given I am on Demoblaze Home Page
    Then I click on "Sign up" Link
    And I navigate to Sign up Box
    Then I fill in the password
    Then I click on Sign up button
    Then I see Please fill out Username and Password. Message
    And I navigate to Sign up Box

  @DB-55
  Scenario: Sign Up with no password
    Given I am on Demoblaze Home Page
    Then I click on "Sign up" Link
    And I navigate to Sign up Box
    Then I fill in the username
    Then I click on Sign up button
    Then I see Please fill out Username and Password. Message
    And I navigate to Sign up Box

  @DB-56
  Scenario: Purchase Order with only Name and Credit card info
    Given I am on Demoblaze Home Page
    When I click on an item
    Then I navigate to item description
    And I add item to cart
    And I hit return on the keyboard
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I fill in all the information "J Roy" "" "" "2222" "" ""
    And Click On Purchase Button
    Then I see failed order message
    Then I am returned to Place order box

  @DB-57
  Scenario: Purchase Order with empty cart
    Given I am on Demoblaze Home Page
    Then I click on "Cart" Link
    And I navigate to Cart Page
    When I click on the Place Order Button
    Then I fill in all the information "J Roy" "Mex" "Guadalajara" "2222" "05" "23"
    And Click On Purchase Button
    Then I see failed order message
    Then I am returned to Place order box
