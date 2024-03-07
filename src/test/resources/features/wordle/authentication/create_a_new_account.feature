Feature: Create a new account

  Rule: Should be able to create an account from the login page
    Example: The one where Paula wants to create a new account
      Given Paula is not a registered player
      When Paula tries to login but doesn't have an account
      Then she should be able to access the New Account page


