package tcsQuestion.week1;

import java.util.Scanner;

public class containsIgniteSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = 0, y = 1, z = 1, nextTerm;
        boolean found = false;
        if (num == x || num == y || num == z) {
            System.out.println("Yes");
        } else {
            while (z <= num) {
                nextTerm = y + x;
                x = y;
                y = z;
                z = nextTerm;
                if (nextTerm == num) {
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}
