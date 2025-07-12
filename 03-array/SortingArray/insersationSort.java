import java.util.Scanner;

public class insersationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input array
        System.out.println("Enter lenght of Array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // int array[] = { 56, 34, 10, 6, 38, 1 };

        // sorting

        int j;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
