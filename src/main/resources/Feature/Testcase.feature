
@DemoBlaze_Feature
Feature: DemoBlaze Website
@tc01_demoblazeloginwithvaliddetails
Scenario:
Login in to demo blaze steps

Given the user launched Browser
When the user open the Demoblaze Application in chromebrowser
Then user clicks on login button
Then the user enters the username and password clicks on login button

@tc02_ClickingonLaptops
Scenario:
Given  user opens the demoblazesite
When the user clicks the Laptops under catagories
Then the user select the particular Laptop 

@tc03_Navigatetonextpage
Scenario:
Given  user opens the demoblazeApplication in browser
When the user clicks on nextpage
Then the user selects any product in the nextpage

@tc04_Addtocart
Scenario:
Given  user launched Demoblazewebsite
When the user selects  the product
Then the user clicks on the AddtoCart button

@tc05_deletefromcart
Scenario:
Given  user launched Demoblaze
When user selects  the product and addtocart
And the user clicks on Cart button
And the user remove the cart




