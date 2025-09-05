package dsa.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    // | Method | Time | Space | Notes |
    // | --------- | ------ | ----- | ------------------------------ |
    // | Recursive | O(2^n) | O(n) | Simple but slow |
    // | Memoized | O(n) | O(n) | Fast, still uses recursion |
    // | Iterative | O(n) | O(1) | Fastest & most space-efficient |

    public int fibonnaci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    private Map<Integer, Integer> memo = new HashMap<>(); // the hash map needs to be outside the function otherwise we
                                                          // recreate the map everytime

    public int fibMemoized(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (memo.containsKey(n))
            return memo.get(n);

        int result = fibMemoized(n - 1) + fibMemoized(n - 2);
        memo.put(n, result);
        return result;
    }

    // Bottom-Up Iterative (Tabulation)
    public int fibIterative(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int prev1 = 1;
        int prev2 = 0;

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int resultRecursive = f.fibonnaci(6);
        int resultMemo = f.fibMemoized(6);
        int resultIter = f.fibIterative(6);

        System.out.println("Recursive: " + resultRecursive);
        System.out.println("Memoized: " + resultMemo);
        System.out.println("Iterative: " + resultIter);
    }

}
