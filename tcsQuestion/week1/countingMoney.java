package tcsQuestion.week1;

import java.util.Scanner;

public class countingMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1, c2, c5, n10, n20, n50, n100, n1000;
        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        c5 = scanner.nextInt();
        n10 = scanner.nextInt();
        n20 = scanner.nextInt();
        n50 = scanner.nextInt();
        n100 = scanner.nextInt();
        n1000 = scanner.nextInt();
        int totalCoins = (c1 * 1) + (c2 * 2) + (c5 * 5);
        int totalNotes = (n10 * 10) + (n20 * 20) + (n50 * 50) + (n100 * 100) + (n1000 * 1000);
        int totalMoney = totalCoins + totalNotes;
        System.out.println("Rs. " + totalCoins + " in coins, " + "Rs. " + totalNotes + " in notes, " + "Rs. "
                + totalMoney + " in total");
                
        scanner.close();
    }
}
