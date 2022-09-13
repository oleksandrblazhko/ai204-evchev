Feature: Sign up and Login functionality of BaseCompetion mobile service.
   Given I am a BaseCompetion user.
   When I enter username or e-mail as username.
     And I enter the password as the password
   Then I should be redirected to the page of to the page that is intended for the type of account I selected during registration
     And I should be able to read the terms of service
