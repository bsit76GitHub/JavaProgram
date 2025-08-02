package tcsQuestion;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0, l = 0;
        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j <= ((n * 4) - 4); j++) {
                if (j % 2 == 0) {
                    if (i == 0 && j <= (((n * 4) - 4) / 2) - f) {
                        System.out.print(k);
                        l = k - 1;
                        k++;
                    } else if (j <= (((n * 4) - 4) / 2) - f) {
                        System.out.print(k);
                        l = k;
                        k++;
                    } else if (j > (((n * 4) - 4) / 2) - f && j < (((n * 4) - 4) / 2) + f) {
                        System.out.print("-");
                    } else if (j >= (((n * 4) - 4) / 2) + f) {
                        System.out.print(l);
                        l--;
                    }
                } else {
                    System.out.print("-");
                }
            }
            f = f + 2;
            System.out.println();
        }
        scanner.close();
    }
}

// n=8
//output:
/* 
1-2-3-4-5-6-7-8-7-6-5-4-3-2-1
1-2-3-4-5-6-7---7-6-5-4-3-2-1
1-2-3-4-5-6-------6-5-4-3-2-1
1-2-3-4-5-----------5-4-3-2-1
1-2-3-4---------------4-3-2-1
1-2-3-------------------3-2-1
1-2-----------------------2-1
1---------------------------1
*/