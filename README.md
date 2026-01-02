# FizzBuzz

The **requirements** of the kata are simple:

* Write a Java program that prints a line for each number from 1 to 100.
  * For multiples of three, print Fizz instead of the number.
  * For multiples of five, print Buzz instead of the number.
  * For numbers that are multiples of both three and five, print FizzBuzz instead of the number.
* Have a look at the FizzBuzz.java and FizzBuzzTest.java.
* execute the below command to run mutation-testing.

```

mvn clean -Ppitest test

```

You will see the test fails with message **"Mutation score of 90 is below threshold of 95"**

##### What's next

1. Open pom.xml and see we have added a configuration of `mutationThreshold` to `95`
2. Open `target/pit-reports/index.html` in browser to check what's wrong.
3. Fix the issue so that the compilation is successful.
