package tcsQuestion.week2;

import java.util.Scanner;

// anagram : two strings are anagram of each other if they have same character set.
//.         ex. "bacdc" and "dcbac" are anagram.
//. input : cde abc 
//  output : de 
//           ab
//            4
public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        scanner.close();
        int f = 0;
        boolean found = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (found == false) {
                System.out.print(str1.charAt(i));
                f++;
            }
        }
        System.out.println("");
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (found == false) {
                System.out.print(str2.charAt(i));
                f++;
            }
        }
        System.out.println("");
        System.out.println(f);
    }
}
