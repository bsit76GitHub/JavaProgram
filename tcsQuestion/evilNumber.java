package tcsQuestion;
// An "EVIL NUMBER" is a positive whole number which has even number of 1's in its binary equivalent.
import java.util.Scanner;

public class evilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        // method 1 : using function
        String binaryNum = Integer.toBinaryString(num);
        int count = 0;
        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.print(binaryNum);
            System.out.println(" is an evil number");
        } else {
            System.out.print(binaryNum);
            System.out.println(" is not an evil number");
        }

        // // method 2 : without using pre-defined function
        // int[] binary = new int[32];
        // int digit = 0;
        // for (int i = num; i > 0; i = i / 2) {
        // binary[digit] = i % 2;
        // digit++;
        // }
        // int one = 0;
        // for (int i = 0; i < binary.length; i++) {
        // if (binary[i] == 1) {
        // one++;
        // }
        // }
        // if (one % 2 == 0) {
        // for (int i = digit - 1; i >= 0; i--) {
        // System.out.print(binary[i]);
        // }
        // System.out.println(" is an evil number");
        // } else {
        // for (int i = digit - 1; i >= 0; i--) {
        // System.out.print(binary[i]);
        // }
        // System.out.println(" is not an evil number");
        // }

    }
}
