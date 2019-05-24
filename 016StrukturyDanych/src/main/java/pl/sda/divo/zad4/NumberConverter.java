package pl.sda.divo.zad4;

import java.util.Arrays;
import java.util.List;

class NumberConverter {
    private static final List<Integer> NUMBER_VALUES = Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
    private static final List<String> NUMBER_LETTERS = Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    public static String toRoman(int num) {
        StringBuilder roman = new StringBuilder(); // Declare a string to hold the numerals
        for (int i = 0; i < NUMBER_VALUES.size(); i++) { // loop through all the values
            while (num >= NUMBER_VALUES.get(i)) { // Check if the number is greater than the current value
                roman.append(NUMBER_LETTERS.get(i)); // Add the letter to the String
                num -= NUMBER_VALUES.get(i); // Subtract the amount from the value
            }
        }
        return roman.toString(); // Return the String
    }
}