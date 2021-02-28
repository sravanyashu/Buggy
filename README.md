For this Project I have followed Page Obeject Model Appoarach with BDD using Cucmber, Selenium, Java with Junit framewor
 Download the project from GitHub and save on local. 
 To run this In any IDE(IntelliJ/Eclipse) open this project as Maven Project.
 I have defined all the source code in Buggy/SRC/Test in 'Com.Package.Buggy'
 As i have used POM apporach, defined all page level variables in 'Page class', Senarios in 'Buggy.feature' under Buggy/resources, Steps bindings in Buggy/test/src/com.package.Stepdefinitions/Stepdefinitions'.
 Defined the common methods in Utils.class
 Copied Chromedriver in Resouces.
 Created runner class, which we can intiate run and we can customize the runner class as per our requirement to run specific test cases using 'Tags'.
 By end of each test scenario, Cucumber after class will check if any test scenario failed, and will attach a screenshot if sceanrio failed
 End each run Cucmber will generate a Html report in directory->cucmber-html-reports->index.html, which can be viewed in browser.

