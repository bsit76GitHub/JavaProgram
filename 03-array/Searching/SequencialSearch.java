import java.util.Scanner;

public class SequencialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array :
        System.out.println("Enter the lenght of array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // pre-defined array
        // int[] array = { 23, 44, 1, 3, 17, 356, 9, 14 };

        System.out.println("Enter the no. to search : ");
        int k = sc.nextInt();
        int m = 0;
       for (int element : array) {
            // for all occurence :
            // if (element == k) {
            // System.out.println(k + " is Found at index of " + m + " in Array.");
            // }

            // for only first occurence :
            if (element == k) {
                System.out.println(k + " is Found at index of " + m + " in Array.");
                break;
            }
            m++;
        }
        if (m == array.length) {
            System.out.println(k + " is not preesnt in array.");
        }


        sc.close();
    }
}
