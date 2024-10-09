Feature:
To validate login funtionality of facebook application
@Sanity
Scenario:
To Validate login with valid username and invalid password
Given To open the chrome and launch the fb url
When To Enter valid username in email field
|email1|java@gmail.com|
|email2|selenium@gmail.com|
|email3|cucumber@gmail.com|
|email4|sql@gmail.com|

And To Enter invalid password in password field
|password1|password2|password3|
|java     |selenium |sql      |
|123      |456      |789      |
|abc      |efg      |xyz       |

And To click the login button
Then To close the browser

@Smoke @Regression
Scenario Outline:

To Validate login with invalid username and invalid password


Given To open the chrome and launch the fb url

When To Pass the invalid username "<email>"in email field

And To Pass the invalid password "<password>"in password field

And  To click the home page login button

Then To close the chrome browser

Examples:

|email             |password|
|java@gmail.com    |java    |
|selenium@gmail.com|selenium|
|cucumber@gmail.com|cucumber|
|sql@gmail.com     |sql     |