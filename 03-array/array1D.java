
import java.util.Scanner;

public class array1D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array.");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        // // System.out.println("Length of Array is " + array.length);

        // // sum and average of element

        // // int sum = 0;
        // // float avg = 0;
        // // for (int i = 0; i < array.length; i++) {
        // // sum += array[i];
        // // }
        // // avg = (float) sum / array.length;
        // // System.out.println("Sum of element of Array is " + sum);
        // // System.out.println("Average of element of Array is " + avg);

        // // sum of Odd and Even Element

        // // int evenSum = 0, oddSum = 0;
        // // for (int i = 0; i < array.length; i++) {
        // // if (array[i] % 2 == 0) {
        // // evenSum += array[i];
        // // } else {
        // // oddSum += array[i];
        // // }
        // // }
        // // System.out.println("Sum of Even element of Array is " + evenSum);
        // // System.out.println("Sum of Odd Element of Array is " + oddSum);

        // // greatest and 2nd greatest
        // int max = 0, max2nd = 0, lowest = 0, lowest2d = 0;

        // for (int i = 0; i < array.length; i++) {
        // if (max < array[i]) {
        // max = array[i];
        // }
        // }
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] != max) {
        // if (array[i] > max2nd) {
        // max2nd = array[i];
        // System.out.println( max +" " + max2nd);
        // }
        // }
        // }
        // System.out.println("Largest element of Array is " + max);
        // System.out.println("2nd Largest element of Array is " + max2nd);
        // // lowest and 2nd lowest
        // lowest = array[0];
        // lowest2d = array[0];
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] < lowest) {
        // lowest = array[i];
        // }
        // }
        // for (int i = 0; i < array.length; i++) {
        // if (lowest2d > array[i] && array[i] != lowest) {
        // lowest2d = array[i];
        // }
        // }
        // System.out.println("Lowest element of Array is " + lowest);
        // System.out.println("2nd Lowest element of Array is " + lowest2d);

        // search
            
        System.out.println("Enter data for search");
        int k = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                System.out.println(k + " is found");
                break;
            } else if (i == array.length - 1) {
                System.out.println(k + " is not in the Array");
            }
        }
        sc.close();
    }
}
