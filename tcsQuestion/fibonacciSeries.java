package tcsQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Invalid input");
        }
        int x = 0, y = 1, nextTerm;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                list.add(0);
            } else if (i == 2) {
                list.add(1);
            } else {
                nextTerm = x + y;
                list.add(nextTerm);
                x = y;
                y = nextTerm;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        scanner.close();
    }
}
