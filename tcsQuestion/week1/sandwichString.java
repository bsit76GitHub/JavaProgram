package tcsQuestion.week1;

import java.util.Scanner;

// input : breadJamdaerb
// output : Jam
public class sandwichString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int m = 0;
        for (int i = 0; i < str.length() - i; i++) {

            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                m++;
            } else {
                for (int j = m; j < str.length() - m; j++) {
                    System.out.print(str.charAt(j));
                }

            }
        }
    }

}
