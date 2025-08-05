
// input : abcdefgykkddfghie
// output : 2

package tcsQuestion.week2;

import java.util.ArrayList;
import java.util.Scanner;

class vowelessSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        ArrayList<String> string = new ArrayList<String>();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')) {
                str2 = str2 + str.charAt(i);
            } else {
                if (!str2.isEmpty()) {
                    string.add(str2);
                    str2 = "";
                }
            }
        }
        if (!str2.isEmpty()) {
            string.add(str2);
            str2 = "";
        }
        System.out.println(string.size());

    }
}