package tcsQuestion.week1;

// Abecedarian word : those word whose letters appear in alphabetical order.
// like "mnop" is Abecedarian word but "adsc" is not Abecedarian word.
import java.util.Scanner;

public class abecedarianWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        scanner.close();
        for (String str : strings) {
            char[] ch = str.toCharArray();
            boolean b = false;
            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] < ch[i + 1]) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(1 + ",");
            } else {
                System.out.print(0 + ",");
            }
        }
    }
}
