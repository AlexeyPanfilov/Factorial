package org.example;

public class Main {

    static int factorial (int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * (factorial(x - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(factorial(5));
    }
}