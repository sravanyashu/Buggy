Feature: Test feature

  @TestCase1
  Scenario Outline: This is the test scenario

  Given User is on the BuggyCarsRating Website Registration page <actualTitle>
  When he enters all required registration fields <Username>,<Firstname>,<Lastname>,<Password>
  And click on Register button
  Then a BuggyCarsRating login is created <ExpectedMsg>

  Examples:
   |Username|Password  |Firstname|Lastname|ExpectedMsg|actualTitle|
   |asdfghihj|Qwerty@123|testfirst|testlast|Registration is successful|Buggy Cars Rating|

  @TestCase2
  Scenario Outline: Verify Lamborghini models and get their Rank Votes and Comments

    Given User is logged into BuggyCarsRating Website <Username>,<Password>
    And user verifies Lamborghini image on home page under Popular Make category <ExpectedPouplarMake>
    When user clicks on Lamborghini image
    Then Lamborghini Models listed with their Rank Votes and comments

    Examples:
      |Username|Password   |ExpectedPouplarMake|
      |Jhon123 |Welly@12345| Lamborghini       |

  @TestCase3
  Scenario Outline: Verify Lamborghini Diablo Specification and Votes

    Given User is logged into BuggyCarsRating Website <Username>,<Password>
    And Lamborghini Diablo image is on home page under Popular Model category <ExpectedPouplarModel>
    When user clicks on Lamborghini Diablo image
    Then Lamborghini Diablo Model listed with Specification and Votes <ExpectedSpecs>, <ExpectedVotes>

    Examples:
      |Username|Password  |ExpectedPouplarModel|ExpectedSpecs                 |ExpectedVotes|
      |Jhon123 |Welly@12345|Lamborghini Diablo |Engine: 6.0l Max Speed: 25km/h|Votes: 1065  |

  @TestCase4
  Scenario Outline: Verify list of all registered models with overall rating

    Given User is logged into BuggyCarsRating Website <Username>,<Password>
    And Overall Rating category should be displayed <ExpectedRating>
    When user clicks on List of all registered models image
    Then all registered models listed with overall rank Votes Engine Comments

    Examples:
      |Username|Password  |ExpectedRating|
      |Jhon123 |Welly@12345|List of all registered models.|
  @TestCase5
  Scenario Outline: Verify Zonda model under Pagani Make category in overall rating

    Given User is logged into BuggyCarsRating Website <Username>,<Password>
    When user clicks on List of all registered models image
    And user clicks on Zonda model under Pagani Make category
    Then Pagani Zonda Model listed with Specification and Votes <ExpectedSpecs>, <ExpectedVotes>

    Examples:
      |Username|Password  |ExpectedSpecs                  |ExpectedVotes|
      |Jhon123 |Welly@12345|Engine: 6.0l Max Speed: 350km/h|Votes: 796   |


