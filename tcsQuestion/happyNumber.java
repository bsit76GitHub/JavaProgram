package tcsQuestion;
import java.util.HashSet;
import java.util.Scanner;
public class happyNumber {
    
//=======================

    // Function to calculate sum of squares of digits
    public static int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    // Function to check if number is happy
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquareSum(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Happy Number: ");
        int number = sc.nextInt();

        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number!");
        } else {
            System.out.println(number + " is NOT a Happy Number.");
        }

        sc.close();
    }

//=======================
    
}
