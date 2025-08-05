package tcsQuestion.week2;
// input :

//   2
// aaba aaab
// abcd deba
// output : 
// YES
// NO

import java.util.Scanner;

public class isAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[2*n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i <= str.length / 2; i += 2) {
            String word1 = str[i];
            String word2 = str[i + 1];
            
            boolean b = false;
            for (int j = 0; j < word1.length(); j++) {
                for (int j2 = 0; j2 < word2.length(); j2++) {
                    if (word1.charAt(j) == word2.charAt(j2)) {
                        b = true;
                        break;
                    } else {
                        b = false;
                    }
                }
                if (b == false) {
                    System.out.println("NO");
                    break;
                }
            }
            if (b == true) {
                System.out.println("YES");
            }
        }
    }
}
