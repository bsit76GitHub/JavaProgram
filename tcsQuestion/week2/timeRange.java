package tcsQuestion.week2;

import java.util.Scanner;

// input :
// 12 15 30
//  8 25 40
//  2
// output : (multiply to 2nd line by 3rd line. After that convert into valid formate of time like hour minute and second,then add result into first line, result will be our output )
// 05 06 50
// Hint : use String.format("%02d",result) to return result as a string with leading zero, if value is less than 10.

public class timeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        sc.close();
        int o = 0;
        for (int i = arr.length - 1; i >= 3; i--) {
            int m = (arr[i] * n) + o;
            if (i % 3 == 0) {
                if (m >= 24) {
                    arr[i] = m % 24;
                } else
                    arr[i] = m;
                break;
            }
            if (m >= 60) {
                o = m / 60;
                arr[i] = m % 60;
            } else
                arr[i] = m;
        }
        o = 0;
        for (int i = 2; i >= 0; i--) {
            int m = arr[i] + arr[i + 3];

            if (i % 3 == 0) {
                if (m >= 24)
                    arr[i] = m % 24;
                else
                    arr[i] = m;
                break;

            }
            if (m >= 60) {
                o = m / 60;
                arr[i] = m % 60;
            } else
                arr[i] = m;
            o = 0;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(String.format("%02d", arr[i])+" ");
        }
    }
}
