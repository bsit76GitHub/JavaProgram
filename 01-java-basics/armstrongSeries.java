// example : 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, and 4679307774.

import java.util.Scanner;

class armstrongSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and Upper limit respectively : ");
        long l = sc.nextLong();
        long u = sc.nextLong();
        System.out.println("Armstrong Number from " + l + " to " + u + " : ");
        int c = 0;
        for (long x = l; x <= u; x++) {
            long n = x;
            long d = 0, r = 0, m = 0;

            while (n > 0) {
                d++;
                n = n / 10;
            }
            long y = x;
            while (y > 0) {
                r = y % 10;
                m = m + (long) Math.pow(r, d);
                y = y / 10;
            }
            if (m == x) {
                System.out.print(m + " ");
                c++;
            }

        }

        if (c == 0) {
            System.out.println("Not Armstrong number found.");
        }
        System.out.println();
        sc.close();
    }
}
