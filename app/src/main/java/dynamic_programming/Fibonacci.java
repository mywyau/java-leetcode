package dynamic_programming;

import java.util.*;

public class Fibonacci {

    private final Map<Integer, Long> memo = new HashMap<>();

    public long fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long res = fib(n - 1) + fib(n - 2);
        memo.put(n, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(50)); // fast!
    }
}