package array_02_basics.SortingArray;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input array : 
        System.out.println("Enter lenght of Array");
        int n = sc.nextInt();
        int[] array = new int[n]; 
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
         // static array
        // int[] array = { 12, 5, 45, 34, 6, 3 };

        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    // using 3rd variable
                    // int c = array[i];
                    // array[i] = array[j];
                    // array[j] = c;

                    // Without using 3rd variable
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
