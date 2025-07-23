import java.util.*;
public class tcsQVector {
    static Scanner sc = new Scanner(System.in);
    int product_id, units_sold, bestSelling = 0, leastSelling;

    void inputProduct() {
        product_id = sc.nextInt();
        units_sold = sc.nextInt();
    }

    void findProduct() {

        if (units_sold > bestSelling) {
            bestSelling = units_sold;
        } else if (units_sold < leastSelling) {
            leastSelling = units_sold;
        }
    }

    void printProduct() {

        System.out.println(bestSelling + "\t" + leastSelling);
        // System.out.println(product_id + "\t" + units_sold);
    }

    public static void main(String[] args) {
        System.out.println("Enter no. of product : ");
        int n = sc.nextInt();
        Vector<Integer> vector = new Vector<Integer>();
        // for (int i = 0; i < n; i++) {
        //     tcsQVector product = new tcsQVector();
        //     product.inputProduct();
        //     vector.add(product);
        // }
        // for (int i = 0; i < n; i++) {
        //     tcsQVector product1 =  (tcsQVector)(vector.elementAt(i));
        //     product1.findProduct();
        // }

        // for (int i = 0; i < n; i++) {
        //     tcsQVector product1 =  (tcsQVector)(vector.elementAt(i));
        //     product1.printProduct();
        // }
        System.out.println("Still not solved");
    }
}
