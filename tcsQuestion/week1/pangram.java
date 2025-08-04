package tcsQuestion.week1;

import java.util.Scanner;

class pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String str1 = str.toLowerCase(null);
        for (char i = 'a'; i <= 'z'; i++) {
            if (str1.indexOf(i) == -1) {
                System.out.println(str + " is not a Pangram");
                return;
            }
        }
        System.out.println(str + " is a Pangram");
    }
}