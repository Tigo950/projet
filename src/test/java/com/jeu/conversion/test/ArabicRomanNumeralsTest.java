package com.jeu.conversion.test;

import com.jeu.conversion.ArabicRomanNumerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArabicRomanNumeralsTest {


        @Test
        public void testConvert_1() {
            assertEquals("I", ArabicRomanNumerals.convert(1));
        }

        @Test
        public void testConvert_3() {
            assertEquals("III", ArabicRomanNumerals.convert(3));
        }

        @Test
        public void testConvert_4() {
            assertEquals("IV", ArabicRomanNumerals.convert(4));
        }

        @Test
        public void testConvert_10() {
            assertEquals("X", ArabicRomanNumerals.convert(10));
        }

        @Test
        public void testConvert_39() {
            assertEquals("XXXIX", ArabicRomanNumerals.convert(39));
        }

        @Test
        public void testConvert_50() {
            assertEquals("L", ArabicRomanNumerals.convert(50));
        }

        @Test
        public void testConvert_InvalidNumber() {
            assertThrows(IllegalArgumentException.class, () -> ArabicRomanNumerals.convert(0));
            assertThrows(IllegalArgumentException.class, () -> ArabicRomanNumerals.convert(51));
        }
    }


