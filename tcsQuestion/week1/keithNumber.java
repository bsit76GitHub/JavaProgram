package tcsQuestion.week1;

//An integer "N" with "d" digits is a Keith number if, when a sequence is formed where the first "d" terms are the decimal digits of "N", 
//and each subsequent term is the sum of the preceding "d" terms, the number "N" itself appears as a term in this sequence. 
// ex.: 14,19,28,47,61,75,197,742,......
import java.util.ArrayList;
import java.util.Scanner;

public class keithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int temp = num;
        while (temp > 0) {
            al.add(0, temp % 10);
            temp /= 10;
        }

        ArrayList<Integer> list = new ArrayList<Integer>(al);
        while (true) {
            int nextTerm = 0;
            for (int i = list.size() - al.size(); i < list.size(); i++) {
                nextTerm += list.get(i);
            }
            if (nextTerm == num) {
                System.out.println(num + " is a Keith Nummber");
                return;
            } else if (nextTerm > num) {
                System.out.println(num + " is not a Keith Nummber");
                return;
            }
            list.add(nextTerm);
        }
    }
}
