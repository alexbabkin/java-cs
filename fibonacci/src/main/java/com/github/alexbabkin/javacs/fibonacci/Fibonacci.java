package com.github.alexbabkin.javacs.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int fib1(int n) {
        if (n < 2) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    public static int fib2(int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, fib2(n - 1) + fib2(n - 2));
        }
        return memo.get(n);
    }

    public static int fib3(int n) {
        int last = 0, next = 1;
        for (int i = 0; i < n; i++) {
            int prevLast = last;
            last = next;
            next = prevLast + next;
        }
        return last;
    }
}
