package tcsQuestion.week1;

// NOTE : Change according to required output formate. Here start game form 10 to n.

import java.util.Scanner;

public class busBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 10; i <= n; i++) {

            // checking visiblity of 7 in n
            boolean visible = false;
            for (int j = i; j > 0; j = j / 10) {
                int digit = j % 10;
                if (digit == 7) {
                    visible = true;
                }
            }

            if (i % 10 == 7 && visible == true) {
                System.out.println("BusBus");
            } else if (i % 7 == 0 || i % 10 == 7) {
                System.out.println("Bus");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
