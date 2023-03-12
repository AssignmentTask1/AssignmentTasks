Feature: Rest Assured feature
  Verify Rest Assured assignment task

  Scenario: Verify Get Random Joke of Rest Assured Scenario
    Given Set Rest Assured base URI
    When Get Random Joke <"random_joke">
    Then Print setup and punchline for a Random Joke

  Scenario: Verify Get Random Ten Jokes and print setup & punchline for the first array element
    Given Set Rest Assured base URI
    When Get Random Ten Jokes <"random_ten">
    Then Print setup and punchline for the first array element

  Scenario: Verify Get Ten Jokes and print setup & punchline for the 2nd last array element
    Given Set Rest Assured base URI
    When Get Ten Jokes <"jokes/ten">
    Then Print setup and punchline for the 2nd last array element