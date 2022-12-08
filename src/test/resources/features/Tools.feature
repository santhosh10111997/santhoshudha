Feature: user buy a product
Scenario: User go to the product select page
Given user launch the url
When user click to go for the products page
And user search for the particular product
Then user select the product

Scenario: User go to the add to card page
Given user chose the product color
And user chose the product size
And click the add to card button
Then user click the view cart button

Scenario: User go to check out page
Given user click the checkout button
And user fill the firstname lastname and companyname
And user fill the address and town
And user select the state
And user enter the pincode and phone number
And user enter the e-mail id
Then user click the place order button




