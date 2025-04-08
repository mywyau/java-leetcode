package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    // easy
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = roman.get(s.charAt(i));

            // int next = (i + 1 < s.length()) ? roman.get(s.charAt(i + 1)) : 0;
            int next = 0;
            if (i + 1 < s.length()) {
                next = roman.get(s.charAt(i + 1));
            }

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    // medium
    // public String intToRoman(int num) {
    //     int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};  // arrays faster than Map traversal
    //     String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    //     StringBuilder result = new StringBuilder();
    //     for (int i = 0; i < values.length; i++) {
    //         while (num >= values[i]) {
    //             num -= values[i];
    //             result.append(symbols[i]);
    //         }
    //     }
    //     return result.toString();
    // }
    
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }

        }
        return result.toString();
    }

}
