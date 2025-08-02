package tcsQuestion;

import java.util.Scanner;

public class letterCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        int count = 0;
        char c = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(c + " occurs " + count + " times");
    }
}
