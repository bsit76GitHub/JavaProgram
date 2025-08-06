package tcsQuestion.week2;
// input1 : 131
// 131,311,113,131 all are prime
// output1 : 131 is a circular prime
// input2 : 29
// 29 is prime but 92 is not prime
// output2 : 29 is not a circular prime
import java.util.Scanner;

public class circularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int newNum = num;
        int digit = 0;
        for (int i = num; i > 0; i /= 10) {
            digit++;
        }
        boolean isPrime = false;
        do {
            isPrime = false;
            int f = 0;
            for (int i = 1; i <= newNum; i++) {
                if (newNum % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                isPrime = true;
            } else {
                isPrime = false;
            }
            if (isPrime) {
                int r = newNum % (int) Math.pow(10, digit - 1);
                newNum = (r * 10) + (newNum / (int) Math.pow(10, digit - 1));
            } else {
                System.out.println(num + " is not a circular prime");
                break;
            }
        } while (newNum != num);
        if (isPrime) {
            System.out.println(num + " is a circular prime");
        }
    }
}
