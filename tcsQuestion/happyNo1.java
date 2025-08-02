package tcsQuestion;
// ex.1, 7, 10, 13, 23, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100,etc.
import java.util.Scanner;

public class happyNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int n = num;
        while (n != 1 && n != 4) {
            int sum = 0;
            for (int i = n; i > 0; i = i / 10) {
                int d = i % 10;
                sum = sum + (d * d);
            }
            n = sum;
        }
        if (n == 1)
            System.out.println(num + " is a Happy number.");
        else
            System.out.println(num + " is not a Happy number");
    }
}
