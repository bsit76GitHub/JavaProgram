// Input no. of product then input product_id and units_sold of each, 
// then print product_id of bestSelling item and leastSelling item.

import java.util.Scanner;

public class tcsQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of product : ");
        int n = sc.nextInt();
        int[] product = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            product[i] = sc.nextInt();
        }
        int bestSelling = product[1], leastSelling = product[1];
        for (int i = 0; i < product.length; i++) {
            if (i % 2 != 0) {
                if (product[i] > bestSelling) {
                    bestSelling = product[i];
                }
                if (product[i] < leastSelling) {
                    leastSelling = product[i];
                }
            }
        }
        int bestSellingId = product[1], leastSellingId = product[1];
        for (int i = 0; i < product.length; i++) {

            if (product[i] == bestSelling) {
                bestSellingId = product[i - 1];
            }
            if (product[i] == leastSelling) {
                leastSellingId = product[i - 1];
            }
        }
        System.out.println(bestSellingId + "," + leastSellingId);

        sc.close();
    }
}
