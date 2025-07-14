import java.util.Scanner;

public class binearySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pre-defined array
        int[] array = { 1, 3, 5, 7, 8, 23, 56, 89, 234 };

        System.out.println("Enter the no. to search : ");
        int k = sc.nextInt();
        int m = 0;
        int initialIndex = 0, finalIndex = array.length - 1;

        while (initialIndex <= finalIndex) {
            int mid = (initialIndex + finalIndex) / 2;

            if (k < array[mid]) {
                finalIndex = mid - 1;
            } else if (k > array[mid]) {
                initialIndex = mid + 1;
            } else if (k == array[mid]) {
                System.out.println("Found");
                m++;
                break;
            }

        }
        if (m == 0) {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
