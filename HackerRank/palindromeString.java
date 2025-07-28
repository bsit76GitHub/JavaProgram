package HackerRank;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word(string) : ");
        String A = scanner.next();
        int n = A.length();

        // if (n==1) {
        // System.out.println("Yes");
        // }else{

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
        // }
        scanner.close();
    }
}
