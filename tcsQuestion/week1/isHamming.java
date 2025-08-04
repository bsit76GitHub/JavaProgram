package tcsQuestion.week1;

import java.util.Scanner;

public class isHamming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean b = true;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                if (i != 2 && i != 3 && i != 5) {
                    System.out.println("Not Hamming Number");
                    b = false;
                    break;
                }
                n = n / i;
            } else {
                i++;
            }
        }
        if (b == true) {
            System.out.println("Hamming number.");
        }
        scanner.close();
    }
}
