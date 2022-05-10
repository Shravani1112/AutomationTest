# AutomationTest

Tools Used:

1. IDE - STS (Spring Tool Suite)
2. Driver - Chrome diver 
3. Browser - Chrome
4. Dependiences
   - TestNG 7.4.0 V
   - Selenium 3.141.59 V
5. Language - JAVA
6. Git repository
7. Framework - Hybrid (POM + TestNG)
----------------------------------------------------------------------------------------------------------
Automation strategy:

1. Creating base class to launch browser
2. Creating POM(Page Object model) Pages - For writing xpath and action methods.
    - IMDB Page
    - Wiki Page
3. Creating Test class - using annotaions of TestNG - Writing actual validations of testcases
------------------------------------------------------------------------------------------------------------
Test Execution:

1. Go to Test class - Execute or RUN as TestNG Test.
------------------------------------------------------------------------------------------------------------
Output:

1. PASSED: TestCase2
2. FAILED: TestCase1
java.lang.AssertionError: expected [17 December 2021] but found [January 7, 2022 (United States)]
