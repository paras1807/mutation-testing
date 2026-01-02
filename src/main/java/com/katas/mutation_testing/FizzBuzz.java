package com.katas.mutation_testing;

public class FizzBuzz {

    public String convert(int number) {
        if (isDivisibleBy(3, number)) {
            return "Fizz";
        }


        if (isDivisibleBy(5, number)) {
            return "Buzz";
        }


        if (isDivisibleBy(15, number)) {
            return "Fizz";
        }


        return String.valueOf(number);
    }


    private boolean isDivisibleBy(int divisor, int number) {
        return number % divisor == 0;
    }
}
