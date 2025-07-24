package tcsQuestion;
// Sumo number : A number which is less then sum of itself proper divisor.

// ex.: 12 => 1+2+3+4+6=16:: 16>12

import java.util.Scanner;

public class sumoNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumDivisor = 0;
        for (int i = 1; i <= n; i++) {
            sumDivisor = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumDivisor += j;
                }
            }
            if (sumDivisor > i) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
