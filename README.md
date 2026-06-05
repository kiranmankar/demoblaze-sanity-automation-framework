# DemoBlaze Sanity Automation Framework

## Project Overview

This project automates the DemoBlaze e-commerce application using Selenium WebDriver, TestNG, Cucumber BDD, Maven, and Page Factory Design Pattern.

The framework was developed to automate sanity testing scenarios such as Login, Add Product to Cart, Cart Validation, and Product Purchase.

## Tech Stack

* Java 21
* Selenium WebDriver 4
* TestNG
* Cucumber BDD
* Maven
* Page Factory
* Apache POI
* Extent Reports
* WebDriverManager

## Framework Features

* Page Object Model using Page Factory
* Cucumber Feature Files
* Scenario Outline Implementation
* Explicit Waits
* Alert Handling
* Screenshot Utility
* Excel Data Reader using Apache POI
* Extent Reporting
* Cross Browser Support
* Git Version Control

## Test Scenarios

### Login Scenario

* Launch Application
* Open Login Popup
* Enter Username and Password
* Verify Successful Login

### Purchase Scenario

* Select Product
* Add Product to Cart
* Verify Product in Cart
* Place Order
* Enter Customer Details
* Complete Purchase
* Verify Purchase Confirmation

## Project Structure

src/test/java

* base
* pages
* stepdefinitions
* hooks
* utils
* listeners
* runner

src/test/resources

* features
* config
* testdata

## Execution

Run using TestNG Runner:

runner.TestRunner

## Author

Kiran Mankar
