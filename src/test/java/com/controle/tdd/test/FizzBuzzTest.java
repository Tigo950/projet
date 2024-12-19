package com.controle.tdd.test;

import com.controle.tdd.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

        @Test
        public void testFizzBuzzDe1() {
            assertEquals("1", FizzBuzz.de(1));
        }

        @Test
        public void testFizzBuzzDe3() {
            assertEquals("Fizz", FizzBuzz.de(3));
        }

        @Test
        public void testFizzBuzzDe5() {
            assertEquals("Buzz", FizzBuzz.de(5));
        }

        @Test
        public void testFizzBuzzDe15() {
            assertEquals("FizzBuzz", FizzBuzz.de(15));
        }

        @Test
        public void testFizzBuzzDeMultiples() {
            assertEquals("Fizz", FizzBuzz.de(6));  // Divisible par 3
            assertEquals("Buzz", FizzBuzz.de(10)); // Divisible par 5
            assertEquals("FizzBuzz", FizzBuzz.de(30)); // Divisible par 3 et 5
        }

        @Test
        public void testFizzBuzzDeNonDivisible() {
            assertEquals("2", FizzBuzz.de(2)); // Non divisible par 3 ni 5
            assertEquals("7", FizzBuzz.de(7)); // Non divisible par 3 ni 5
        }
    }


