Feature: User can able to login the the Simpler trading Application

  @smoketest
  Scenario Outline: Login and Logout Functionality
    Given Users enter invalid "<UserName>" and  invalid "<PassWord>"
    And Users can able to Logout the Applications

Examples:
|UserName| PassWord |
|roomtest1@simplertrading.com | 4IW6i8vINHxWD@1upABBOqxG |