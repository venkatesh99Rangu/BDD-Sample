Feature: Login

  Scenario: Successful login with valid credentials

    Given User Lunch Chrome Browser
    When User Opens URL "https://oci-devaljjcs.aljcdc.com:9074/WMS/index.html#/"
    And User enters loginid as "National.admin1@alji.com" and Password as "Correct@1"
    And Click on Login Button
    And Close the Browser