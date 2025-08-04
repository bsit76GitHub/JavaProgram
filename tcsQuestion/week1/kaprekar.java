package tcsQuestion.week1;

import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sqNum = num * num;
        int m = num, digit = 0;
        while (m > 0) {
            digit++;
            m = m / 10;
        }
        m = sqNum;
        int num1 = m % (int) (Math.pow(10, digit));
        int num2 = m / (int) (Math.pow(10, digit));
        if (num == (num1 + num2))
            System.out.println(num + " is a kaprekar number.");
        else
            System.out.println(num + " is not a kaprekar number.");
        scanner.close();
    }
}
