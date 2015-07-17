package com.fizzBuzz;

public class FizzBuzz {
    public String writeOutput(int number){
        if(number%3==0)
            return "Fizz";
        else
        if(number%5==0)
            return "Buzz";
        else
            return null;
    }
}
