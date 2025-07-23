package tcsQuestion;
// crazy no. = armstrong no.
import java.util.*;

public class isCrazyNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no.:");
        long num = scanner.nextInt();
        long countDigit = 0, newNum = 0;

        for (long i = num; i > 0; i = i / 10) {
            countDigit++;
        }
        
        for (long i = num; i > 0; i = i / 10) {
            long digit = i % 10;
            newNum = newNum + (long) (Math.pow(digit, countDigit));
        }

        if (newNum == num) {
            System.out.println("Yes");
        } else {
           System.out.println("No"); 
        }
scanner.close();
    }
}
