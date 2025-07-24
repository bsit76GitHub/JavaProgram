package tcsQuestion;

// map the letter of input string as ABC(1),DEF(2),GHI(3),JKL(4),MNO(5),PQRS(7),TUV(8),WXYZ(9)
import java.util.Scanner;

public class mobilekeypad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str.toUpperCase();
        char[] c = str.toCharArray();
        for (char ch : c) {
            if (ch == 'A' || ch == 'B' || ch == 'c') {
                System.out.print(2);
            } else if (ch == 'D' || ch == 'E' || ch == 'F') {
                System.out.print(3);
            } else if (ch == 'G' || ch == 'H' || ch == 'I') {
                System.out.print(4);
            } else if (ch == 'J' || ch == 'K' || ch == 'L') {
                System.out.print(5);
            } else if (ch == 'M' || ch == 'N' || ch == 'O') {
                System.out.print(6);
            } else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
                System.out.print(7);
            } else if (ch == 'T' || ch == 'U' || ch == 'V') {
                System.out.print(8);
            } else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
                System.out.print(9);
            }
        }
        scanner.close();
    }
}
