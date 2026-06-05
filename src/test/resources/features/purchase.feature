Feature: Complete Purchase Flow

Scenario: Purchase product successfully

Given User is logged into DemoBlaze
When User selects a product
And User adds product to cart
And User opens cart
Then Product should be added successfully
When User clicks place order
And User enters order details
And User clicks purchase button
Then Order should be placed successfully