package tcsQuestion.week1;

import java.util.Scanner;

public class absoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 21) {
            System.out.println(Math.abs((21 - n)));
        } else {
            System.out.println("8");
        }
        scanner.close();
    }
}
