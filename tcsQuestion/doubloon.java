package tcsQuestion;

// Doubloon word : those word's whose every letter appears twice .

import java.util.Scanner;

public class doubloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        scanner.close();
        for (String string : str) {
            char[] c = string.toCharArray();
            int count;
            boolean doubloon = false;
            for (int i = 0; i < c.length; i++) {
                count = 0;
                char u = c[i];
                for (int j = 0; j < c.length; j++) {
                    if (String.valueOf(u).equalsIgnoreCase(String.valueOf(c[j]))) {
                        count++;
                    }
                }
                if (count == 2) {
                    doubloon = true;
                } else {
                    doubloon = false;
                    break;
                }
            }
            if (doubloon)
                System.out.println(string + " is a doubloon");
            else
                System.out.println(string + " is not a doubloon");
        }
    }
}
