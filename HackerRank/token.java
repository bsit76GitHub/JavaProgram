package HackerRank;
// Note: StringTokenizer is a legacy class, and the split() method is preferred for modern applications.


import java.util.Scanner;
import java.util.StringTokenizer;

public class token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.length());
        // Create a StringTokenizer object
        // with space as the delimiter
        StringTokenizer st = new StringTokenizer(str," ");

        // Tokenize the string and print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        scanner.close();
    }
}
