package tcsQuestion.week1;

import java.util.Scanner;

public class automorphicNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tempnum = num, digit=0;
        while (tempnum >0) {
            digit++;
            tempnum=tempnum/10;
        }
        int sqnum = (int) Math.pow(num, 2);
        if (sqnum % ((int)Math.pow(10, digit)) == num) {
            System.out.println(num + " is an automorphic number");
        } else {
            System.out.println(num + " is not an automorphic number");
        }
        scanner.close();
    }
}
