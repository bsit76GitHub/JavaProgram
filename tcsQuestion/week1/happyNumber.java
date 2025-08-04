package tcsQuestion.week1;

// HAPPY NUMBER : a number in which the eventual sum of the square of the digits of the number is equal to 1.
// ex.1, 7, 10, 13, 23, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100,etc.

// import java.util.HashSet;
import java.util.Scanner;

public class happyNumber {
    // ===== Method : 1 ================
    public static int sumOfSquare(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            int d = i % 10;
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int n = num;
        while (true) {
            if (n == 1) {
                System.out.println(num + " is a Happy number.");
                break;
            } else if (n == 4) {
                System.out.println(num + " is not a Happy number.");
                break;
            }
            n = sumOfSquare(n);
        }

        // // ======METHOD : 2=================
        // // Function to calculate sum of squares of digits
        // public static int getSquareSum(int n) {
        // int sum = 0;
        // while (n > 0) {
        // int digit = n % 10;
        // sum += digit * digit;
        // n = n / 10;
        // }
        // return sum;
        // }

        // // Function to check if number is happy
        // public static boolean isHappy(int n) {
        // HashSet<Integer> seen = new HashSet<>();
        // while (n != 1 && !seen.contains(n)) {
        // seen.add(n);
        // n = getSquareSum(n);
        // }
        // return n == 1;
        // }

        // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to check if it's a Happy Number: ");
        // int number = sc.nextInt();

        // if (isHappy(number)) {
        // System.out.println(number + " is a Happy Number!");
        // } else {
        // System.out.println(number + " is NOT a Happy Number.");
        // }
        // sc.close();
        // }
        // // =======================
    }
}
