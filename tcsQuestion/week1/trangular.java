package tcsQuestion.week1;

import java.util.Scanner;

public class trangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        boolean b = true;
        for (int i = 0; i < n; i++) {
            sum += i;
            if (sum == n) {
                System.out.println(n + " is Trangular Number");
                b = true;
                break;
            } else {
                b = false;
            }
        }
        if (b == false) {
            System.out.println(n + " is Not a Trangular Number");
        }
        scanner.close();
    }
}
