package tcsQuestion;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
        }
        int x = 0, y = 1, nextTerm;
        System.out.print(x + " " + y);
        for (int i = 3; i <= n; i++) {
            nextTerm = x + y;
            x = y;
            y = nextTerm;
            System.out.print(" "+nextTerm);
        }
        scanner.close();
    }
}
