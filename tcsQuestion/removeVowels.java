package tcsQuestion;

import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();
        // method: 1 
        // for (int i = 0; i < c.length; i++) {
        //     if (!(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U')) {
        //         System.out.print(c[i]);
        //     }
        // }

        // Method: 2
        for (int i = 0; i < c.length; i++) {
            String ch = String.valueOf(c[i]);
            if (!(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u"))) {
                System.out.print(c[i]);
            }
        }
        scanner.close();
    }
}
