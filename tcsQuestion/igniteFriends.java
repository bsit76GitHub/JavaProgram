package tcsQuestion;
// Ignite Friends : A pair of 2-digit numbers said to be Ignite, if same digits appear in the product of two nos.

//   ex. : 15 and 93 => 15*93=1395 => same digit

import java.util.Scanner;

public class igniteFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int product = n * m;
        int igniteFriend = 0;
        int n1 = n, n2 = m;

        // finding digits
        int[] digitsN = new int[2];
        int[] digitsM = new int[2];
        int[] digitsProduct = new int[4];

        for (int i = 0; i < 2; i++) {
            int digit = n % 10;
            digitsN[i] = digit;
            n = n / 10;
        }
        for (int i = 0; i < 2; i++) {
            int digit = m % 10;
            digitsM[i] = digit;
            m = m / 10;
        }
        for (int i = 0; i < 4; i++) {
            int digit = product % 10;
            digitsProduct[i] = digit;
            product = product / 10;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(digitsN[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 2; i++) {
            System.out.println(digitsM[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(digitsProduct[i]);
        }
        System.out.println("\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (digitsN[i] == digitsProduct[j] || digitsM[i] == digitsProduct[j]) {
                    igniteFriend++;
                }
            }
        }
        if (igniteFriend == 4) {
            System.out.println(n1 + " and " + n2 + " are Ignite Friends");
        } else {
            System.out.println(n1 + " and " + n2 + " are Not Ignite Friends");
        }
        scanner.close();
    }
}
