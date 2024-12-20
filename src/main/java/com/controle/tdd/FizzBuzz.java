package com.controle.tdd;

public class FizzBuzz {

        public static String de(int n) {
            if (n % 3 == 0 && n % 5 == 0) {
                return "FizzBuzz";
            } else if (n % 3 == 0) {
                return "Fizz";
            } else if (n % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(n);//Si aucune des conditions ci-dessus n'est remplie, la méthode retourne le nombre lui-même, converti en chaîne de caractères avec

            }
        }
    }


