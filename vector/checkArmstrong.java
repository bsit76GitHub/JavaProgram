
import java.util.Scanner;
import java.util.Vector;

public class checkArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> data = new Vector<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            data.add(num);
        }
        for (Integer element : data) {
            int num = element;
            int num1 = element;
            int digitCount = 0, unitDigit = 0, newNum = 0;
            while (num1 > 0) {
                digitCount++;
                num1 = num1 / 10; // num1 /= 10;
            }
            while (num > 0) {
                unitDigit = num % 10;
                newNum = newNum + (int) Math.pow(unitDigit, digitCount);
                num = num / 10;
            }
            if (element == newNum) {
                System.out.println(element + " is Armstrong");
            } else {
                System.out.println(element + " is Not Armstrong");
            }
            digitCount = 0;
            unitDigit = 0;
            newNum = 0;
        }
        sc.close();
    }
}
