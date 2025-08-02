package tcsQuestion;

import java.util.Scanner;

// input : I worrrk att Ignnnnnitttttte.
// output : I wo3rk a2t Ig5ni6te.
public class wrapItUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] words = string.split(" ");
        String finalWord = "";
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            finalWord = "";
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                count = 0;
                char currentChar = word.charAt(i);
                count++;
                while (i + 1 < word.length() && currentChar == word.charAt(i + 1)) {
                    count++;
                    i++;
                }
                if (count > 1) {
                    sb.append(count).append(currentChar);
                } else {
                    sb.append(currentChar);
                }
            }
            finalWord = sb.toString();
            System.out.print(finalWord + " ");
        }
        scanner.close();
    }
}
