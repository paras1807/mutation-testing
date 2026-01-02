# Calculator

##### What's next

* Have a look at CalculatorTest.
* Now run the test with coverage.

You will see the coverage is 100% (both line and branch) but is the method correctly tested?

###### Let's find out

* execute the below command to run mutation-testing. We are using https://pitest.org/quickstart/ for it.

```

mvn clean -Ppitest test

```

* Open `target/pit-reports/index.html` in browser.

##### Final Step: Let's fix it

Fix the test and find out what's changed in mutation-testing report
