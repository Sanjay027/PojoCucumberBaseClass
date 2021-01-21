Feature: verify the adactin logins details

  Scenario Outline: verify the adactin logwith valid credentiles
    Given user is on adactin logi pages
    When user enters the valid "<username>" and "<password>"
    And user enter  valid "<location>" "<hotel>" "<roomtype>" "<noofrooms>" "<checkindate>" "<checkoutdate>" "<adultperroom>" "<childperroom>"
    And user click the select hotel
    And user click the scearch button
    And user enter THE valid "< firstname >" "<lastname>" "<buildingadress>" "<creditcard>" "<creditcardtype>" "<month>" "<year>" "<cvv>"
    And user click the scearch button

    Examples: 
      | username  | password   | location | hotel          | roomtype    | noofrooms | checkindate | checkoutdate | adultperroom | childperroom | firstname | lastname | buildingadress | creditcard         | creditcardtype   | month | year | cvv |
      | praveen05 | praveen@05 | London   | Hotel Sunshine | Standard    | 7 - Seven | 20/01/2021  | 27/01/2021   | 3 - Three    | 3 - Three    | sanjay    | vinod    | Annagar        | 1212 1212 12123	414 | American Express | April |  2021 |  1227   |
