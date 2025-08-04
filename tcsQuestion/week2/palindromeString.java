package tcsQuestion.week2;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word(string) : ");
        String A = scanner.next();
        scanner.close();
        int n = A.length();
        boolean palindrome = false;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == A.charAt(n - i - 1)) {
                palindrome = true;
            } else {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
