Feature: verify the adactin login details

  Scenario Outline: verify the adactin loginwith valid credentiles
    Given user is on adactin logi page
    When user enters the valids "<username>" and "<password>"
    And user enter  valids "<location>" "<hotel>" "<roomtype>" "<noofrooms>" "<checkindate>" "<checkoutdate>" "<adultperroom>" "<childperroom>"
    And user click the select hotels
    And user click the scearch buttons
    And user enter THE valids "< firstname >" "<lastname>" "<buildingadress>" "<creditcard>" "<creditcardtype>" "<month>" "<year>" "<cvv>"
    And user click the scearch buttons

    Examples: 
      | username  | password   | location | hotel          | roomtype    | noofrooms | checkindate | checkoutdate | adultperroom | childperroom | firstname | lastname | buildingadress | creditcard         | creditcardtype   | month | year | cvv |
      | praveen05 | praveen@05 | London   | Hotel Sunshine | Standard    | 7 - Seven | 20/01/2021  | 27/01/2021   | 3 - Three    | 3 - Three    | sanjay    | vinod    | Annagar        | 1212 1212 12123	414 | American Express | April |  2021 |  1227   |
