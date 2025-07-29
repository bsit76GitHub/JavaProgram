package tcsQuestion;

import java.util.Scanner;

public class doubleDoutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] words = str.split(" ");
        for (String word : words) {
            char currentChar = word.charAt(0);
            StringBuilder sb = new StringBuilder();
            String doutchWord = "";
            int i = 0;
            while (i < word.length()) {
                if (i > 0) {
                    sb.append(word.charAt(i));
                }
                i++;
            }
            sb.append(currentChar).append("ay");
            doutchWord = sb.toString();
            System.out.print(doutchWord + " ");
        }

    }
}
