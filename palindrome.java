package week2day3;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int p = sc.nextInt();
        int original = p;
        int reverse = 0;
        while (p > 0) {
            reverse = reverse * 10 + p % 10;
            p /= 10;
        }
        System.out.println(original == reverse ? "Palindrome" : "Not Palindrome");

    }
}
