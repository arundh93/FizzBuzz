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


}