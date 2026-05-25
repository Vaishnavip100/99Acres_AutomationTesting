# 99acres Automation Testing Project

## Project Overview

This project automates property search functionality of the 99acres website using Selenium WebDriver, Java, TestNG, and Maven.
The framework follows the Page Object Model (POM) design pattern for better maintainability and reusability.

Website URL: https://www.99acres.com/
---

# Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports

---

# Framework Design

The framework is designed using:

- Page Object Model (POM)
- Reusable Base Classes
- Utility Classes
- TestNG Listeners
- Explicit Waits

---

# Project Structure

```
99acres Automation Project
│
├── src
│   │
│   ├── main/java
│   │   │
│   │   ├── base
│   │   │   └── BasePage.java
│   │   │
│   │   ├── pages
│   │   │   ├── HomePage.java
│   │   │   ├── SearchResultsPage.java
│   │   │   └── PropertyDetailPage.java
│   │   │
│   │   └── utils
│   │       ├── ConfigReader.java
│   │       ├── ScreenshotUtil.java
│   │       └── ExtentManager.java
│   │
│   ├── test/java
│   │   │
│   │   ├── base
│   │   │   └── BaseTest.java
│   │   │
│   │   ├── listeners
│   │   │   └── TestListener.java
│   │   │
│   │   └── tests
│   │       └── PropertySearchTest.java
│   │
│   └── test/resources
│       └── config.properties
│
├── reports
│
├── screenshots
│
├── pom.xml
│
└── testng.xml

```

---
# Tests Covered

1. Valid Property Search Test
   - Search property using city
   - Apply BHK filter
   - Validate title, price, and location

2. Empty Search Test
   - Click search without entering data
   - Validate error/default behavior

---
# How to Run Project

## Run using TestNG

Right click on:

testng.xml

Select:

Run As → TestNG Suite



## Run using Maven

Run all tests:

```bash
mvn test
```

---
# Conclusion

This project successfully automated the property search functionality of the 99acres website using Selenium WebDriver and TestNG.  
It helped in understanding real-time automation framework design, validation, reporting, and reusable testing concepts.
