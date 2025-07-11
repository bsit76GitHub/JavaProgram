
import java.util.Scanner;

/* An Armstrong number (also known as a narcissistic number or pluperfect digital invariant) is a number that equals the sum of its own digits raised to the power of the number of digits. For example, 153 is an Armstrong number because 1³ + 5³ + 3³ = 153.
example : 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, and 4679307774.
// power fun in java
    Math.pow(base, exponent); ==> it return double datatype value
// method to convert double into int 
double data = 567.45;
int intdata = (int) data ;
 */
class isArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = n;
        long d = 0, r = 0, m = 0;
        while (x > 0) {
            d++;
            x = x / 10;
        }
        long y = n;
        while (y > 0) {
            r = y % 10;
            m = m + (long) Math.pow(r, d);
            y = y / 10;
        }
        if (m == n) {
            System.out.println(n + " is a Armstrong No.");
        } else {
            System.out.println(n + " is a Not Armstrong No.");
        }

        sc.close();
    }
}
