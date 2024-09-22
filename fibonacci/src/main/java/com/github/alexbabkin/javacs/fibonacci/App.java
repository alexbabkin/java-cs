package com.github.alexbabkin.javacs.fibonacci;

public class App {
    public static void main(String[] args) {
        fib1();
    }

    public static void fib1() {
        System.out.println(Fibonacci.fib1(1));
        System.out.println(Fibonacci.fib1(5));
        System.out.println(Fibonacci.fib1(10));
    }
}
