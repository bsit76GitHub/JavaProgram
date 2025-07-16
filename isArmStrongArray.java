import java.util.Scanner;

public class isArmStrongArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int num1 = array[i];
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
            if (array[i] == newNum) {
                System.out.println(array[i] + " is Armstrong");
            } else {
                System.out.println(array[i] + " is Not Armstrong");
            }
            digitCount = 0;
            unitDigit = 0;
            newNum = 0;
        }
        sc.close();
        
    }
}
