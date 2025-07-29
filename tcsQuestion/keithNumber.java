package tcsQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class keithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = 0;
        for (int i = num; i > 0; i = i / 10) {
            digit++;
        }
        int a = 1, b = 9, c = 7, newnum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(9);
        al.add(7);
        for (int i = 0; al.get(i) <= num; i++) {
            if (digit == 1) {
                if (num ==1||num==9||num==7) {
                    System.out.println(num + " is a Keith number");
                    break;
                }else {
                    if (digit == 2) {
                        
                    }
                }
            }
        }
        System.out.println("pending...");
        
    }
}
