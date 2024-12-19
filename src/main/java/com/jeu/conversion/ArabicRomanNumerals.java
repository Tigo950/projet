package com.jeu.conversion;

public class ArabicRomanNumerals {

        public static String convert(int nbr) {
            if (nbr < 1 || nbr > 50) {
                throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 50.");
            }

            StringBuilder roman = new StringBuilder();
            int[] values = {50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"L", "XL", "X", "IX", "V", "IV", "I"};

            for (int i = 0; i < values.length; i++) {
                while (nbr >= values[i]) {
                    roman.append(symbols[i]);
                    nbr -= values[i];
                }
            }

            return roman.toString();
        }
    }


