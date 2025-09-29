package dsa.two_pointers;

//  LeetCode 125. Valid Palindrome

//  Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring case.

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            // Compare ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {

        String sentence = "A man, a plan, a canal: Panama";
        String sentence2 = "race a car";

        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println("Is sentence: " + sentence);
        System.out.println("Considering only alphanumeric & ignoring case, is it a palindrome? - isPalindrome: " + validPalindrome.isPalindrome(sentence)); // true

        System.out.println("Is sentence: " + sentence2);
        System.out.println("Considering only alphanumeric & ignoring case, is it a palindrome? - isPalindrome: " + validPalindrome.isPalindrome(sentence2)); //false
    }

}
