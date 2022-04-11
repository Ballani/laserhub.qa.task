Feature: Laserhub Login Feature

  Scenario Outline: Verify user login on laserhub application
    Given I open "<url>" on browser
    When I enter username "<username>" and password "<password>"
    Then I click on login and verify login is successful
    Then I click on logout

    Examples: 
      | url                            | username                                  | password     |
      | https://app.laserhub.com/login | e.ioannidis+testing_worktask@laserhub.com | l0vet3sting@ |

  