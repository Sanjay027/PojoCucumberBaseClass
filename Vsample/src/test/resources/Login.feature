Feature: verify the facebook login details

  Scenario Outline: verify the facebook loginwith valid credentiles
    Given user is on face book logi page
    When user enters the valid "<user name>" and "<password>"

    Examples: 
      | user name | password |
      | sanjay    | vinod    |
      | vind      | sanjay   |
      | qweerr    | asdf     |
      | mnbvc     | kjhgff   |
