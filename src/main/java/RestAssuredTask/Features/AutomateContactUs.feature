Feature: Automate Contact us Feature
  Verify to automate contact us page feature

  @AutomateContactUs
  Scenario: Verify the error message displayed for Subject
    Given Launch Test Website <"http://automationpractice.multiformis.com/">
    Then Assert Page Title to verify site launched
    When Navigate to Contact us
    And Enter Data for Email address <"test@gmail.com">
    And Enter Data for Order reference <"661511">
    And Enter Data for Message <"Test Contact Us Message">
    And Click Send
    Then Assert that error is displayed <"Please select a subject from the list provided.">