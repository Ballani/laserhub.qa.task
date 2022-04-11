# Laserhub Automation Task

This repository contains a collection of selenium project and libraries that demonstrate how to use the tool and execute automation script using the Cucumber BDD framework with Java as programming language.


## Tech Stack
    Selenium WebDriver
    Cucumber
    TestNG
    Maven
## Installation (pre-requisites)
    JDK 1.8+
    Maven
    Eclipse IDE
    Eclipse Plugins for
        Maven
        Cucumber
        TestNG
## About Framework
 Its a Page Object Model design pattern with BDD approach using cucumber. All dependancies for project is stored in pom.xml, On buliding project all maven dependancies will be added to buildpath. 


 All the objects within the test code are maintained as follows.
        
        Pages in src/test/java -> com.laserhub.pages -> ***Page.java.
        Step definitions in src/test/java -> com.laserhub.stepdefinitions -> ***Steps.java.
        Test Runner in src/test/java -> com.laserhub.testrunner -> ***Runner.java

 Cucumber feature files are maintained as follows
        
        features are maintained under project path  "rootfolder/feature/**.feature".

 All dependancies are maintained as follows 
        
        Maven POM file is under project path ".rootfolder/pom.xml"
        TestNg file is under project path ".rootfolder/testng.xml"
        TestNg emailable report is under project path ".rootfolder/test-output/emailable-report.html"

  


## How to execute tests
 Download project to local
 
    Install dependancies as per pre-requisites
    
    To Run tests in IDE:
        Navigate to "src/test/java/"
        Inside Package "com.laserhub.testRunner -> TestRunner.java"
        Right click on class to run tests, select "TestNG" as a run configuration

    To Run tests in Command line:
        Navigate to folder address where repository is stored. 
            execute command to change directory "cd folder_address" 
            enter command "mvn test" to run test cases 