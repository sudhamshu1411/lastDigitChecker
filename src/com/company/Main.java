package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(19, 39, 43));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c < 1000)) {
            if ((a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10) || ((a % 10 == b % 10) && (b % 10 == c % 10))) {
                return true;
            }
            return false;
        }
        return false;

    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
