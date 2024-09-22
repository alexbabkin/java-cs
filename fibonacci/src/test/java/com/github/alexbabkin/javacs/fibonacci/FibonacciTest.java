package com.github.alexbabkin.javacs.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void fib1Test() {
        System.out.println("=== Tests for fib1 ===");

        long startTime = System.currentTimeMillis();
        int res0 = Fibonacci.fib1(0);
        long stopTime = System.currentTimeMillis();
        assertEquals(0, res0);
        System.out.println("time for fib1(0) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res1 = Fibonacci.fib1(1);
        stopTime = System.currentTimeMillis();
        assertEquals(1, res1);
        System.out.println("time for fib1(1) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res2 = Fibonacci.fib1(2);
        stopTime = System.currentTimeMillis();
        assertEquals(1, res2);
        System.out.println("time for fib1(2) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res5 = Fibonacci.fib1(5);
        stopTime = System.currentTimeMillis();
        assertEquals(5, res5);
        System.out.println("time for fib1(5) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res10 = Fibonacci.fib1(10);
        stopTime = System.currentTimeMillis();
        assertEquals(55, res10);
        System.out.println("time for fib1(10) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res40 = Fibonacci.fib1(40);
        stopTime = System.currentTimeMillis();
        assertEquals(102334155, res40);
        System.out.println("time for fib1(40) = " + (stopTime - startTime));
    }

    @Test
    public void fib2Test() {
        System.out.println("=== Tests for fib2 ===");

        long startTime = System.currentTimeMillis();
        int res0 = Fibonacci.fib2(0);
        long stopTime = System.currentTimeMillis();
        assertEquals(0, res0);
        System.out.println("time for fib2(0) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res1 = Fibonacci.fib2(1);
        stopTime = System.currentTimeMillis();
        assertEquals(1, res1);
        System.out.println("time for fib2(1) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res2 = Fibonacci.fib2(2);
        stopTime = System.currentTimeMillis();
        assertEquals(1, res2);
        System.out.println("time for fib2(2) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res5 = Fibonacci.fib2(5);
        stopTime = System.currentTimeMillis();
        assertEquals(5, res5);
        System.out.println("time for fib2(5) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res10 = Fibonacci.fib2(10);
        stopTime = System.currentTimeMillis();
        assertEquals(55, res10);
        System.out.println("time for fib2(10) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res40 = Fibonacci.fib2(40);
        stopTime = System.currentTimeMillis();
        assertEquals(102334155, res40);
        System.out.println("time for fib2(40) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res70 = Fibonacci.fib2(70);
        stopTime = System.currentTimeMillis();
        assertEquals(885444751, res70);
        System.out.println("time for fib2(70) = " + (stopTime - startTime));
    }

    @Test
    public void fib3Test() {
        System.out.println("=== Tests for fib3 ===");

        long startTime = System.currentTimeMillis();
        int res0 = Fibonacci.fib3(0);
        long stopTime = System.currentTimeMillis();
        assertEquals(0, res0);
        System.out.println("time for fib3(0) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res1 = Fibonacci.fib3(1);
        stopTime = System.currentTimeMillis();
        assertEquals(1, res1);
        System.out.println("time for fib3(1) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res2 = Fibonacci.fib3(2);
        stopTime = System.currentTimeMillis();
        assertEquals(1, res2);
        System.out.println("time for fib3(2) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res5 = Fibonacci.fib3(5);
        stopTime = System.currentTimeMillis();
        assertEquals(5, res5);
        System.out.println("time for fib3(5) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res10 = Fibonacci.fib3(10);
        stopTime = System.currentTimeMillis();
        assertEquals(55, res10);
        System.out.println("time for fib3(10) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res40 = Fibonacci.fib3(40);
        stopTime = System.currentTimeMillis();
        assertEquals(102334155, res40);
        System.out.println("time for fib3(40) = " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        int res70 = Fibonacci.fib3(70);
        stopTime = System.currentTimeMillis();
        assertEquals(885444751, res70);
        System.out.println("time for fib3(70) = " + (stopTime - startTime));
    }
}
