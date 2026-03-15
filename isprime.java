package week2day3;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        if (num <= 1)
            isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}