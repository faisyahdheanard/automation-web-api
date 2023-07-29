# API Automation Test Framework using REST Assured and Web Automation Test Framework using Selenium 

This project consists of two test frameworks designed for automated testing of APIs and web applications. The API Automation Test Framework is built using REST Assured, and the Web Automation Test Framework utilizes Selenium. Using Java and Gradle as the programming language and build tool. Web Automation frameworks is integrated with Cucumber, a behavior-driven development (BDD) tool.
API automation task : https://reqres.in/
Web automation task : https://www.saucedemo.com/
## Getting Started

These instructions will guide you on how to set up the project on your local machine for development and testing purposes.
### Prerequisites

Before getting started, ensure that you have the following software installed on your machine:
```
1. Java JDK: download and install the latest version of Java JDK from the official Oracle website.
2. Gradle: Install Gradle by following the official Gradle installation guide.```
```

### Installing

To set up the development environment, follow these steps:
1. Clone this repository to your local machine using Git or download the ZIP file and extract it.
2. Open the project in your preferred Java IDE (e.g., IntelliJ or Eclipse).
3. Build the project and download dependencies using Gradle by running the following command in the terminal:

```
./gradlew build
```

## Running the tests

To execute the automated tests for this system, run the following Gradle task:

```
./gradlew cucumber
```
This will run the Cucumber tests with the specified configuration and generate an HTML test report in the "reports" directory.


## Built With

* Selenium: The web automation library used for interacting with web elements and performing actions on web pages.
* Cucumber: A BDD testing framework that allows tests to be written in a natural language format (Gherkin) and executed using step definitions written in Java.
* Gradle: The build tool used for managing dependencies and building the project.
 
