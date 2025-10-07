package dsa.fast_and_slow_pointers;

// Write an algorithm to determine if a number n is a happy number.

// A happy number is defined by the following process:

// Start with any positive integer.
// Replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Numbers for which this process ends in 1 are happy numbers.
// Return true if n is a happy number, and false if not.

// Input: n = 19
// Output: true
// Explanation:
// 1² + 9² = 82
// 8² + 2² = 68
// 6² + 8² = 100
// 1² + 0² + 0² = 1

public class HappyNumber202 {

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        
        return fast == 1;
    }

    public static void main(String[] args) {

        HappyNumber202 solver = new HappyNumber202();

        int[] testNumbers = {19, 2, 7, 20};

        for (int n : testNumbers) {
            boolean result = solver.isHappy(n);
            System.out.println("Is " + n + " a happy number? " + result);
        }
    }
}
