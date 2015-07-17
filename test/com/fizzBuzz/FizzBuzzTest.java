package com.fizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void outputFizzForNumbersDivisibleby3() {
        FizzBuzz fizzBuzz=new FizzBuzz();

        String output = fizzBuzz.writeOutput(3);

        assertEquals("Fizz",output);

    }
    @Test
    public void outputFizzForNumbersDivisibleby6() {
        FizzBuzz fizzBuzz=new FizzBuzz();

        String output = fizzBuzz.writeOutput(6);

        assertEquals("Fizz",output);

    }

    @Test
    public void outputFizzForNumbersDivisibleby5() {
        FizzBuzz fizzBuzz=new FizzBuzz();

        String output = fizzBuzz.writeOutput(5);

        assertEquals("Buzz",output);

    }

}