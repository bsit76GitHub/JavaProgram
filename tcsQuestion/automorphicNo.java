package tcsQuestion;

import java.util.Scanner;

public class automorphicNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sqnum = (int) Math.pow(num, 2);
        if (sqnum % 10 == num) {
            System.out.println(num + " is an automorphic number");
        } else {
            System.out.println(num + " is not an automorphic number");
        }
        scanner.close();
    }
}
