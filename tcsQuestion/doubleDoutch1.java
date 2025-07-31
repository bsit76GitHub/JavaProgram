package tcsQuestion;

import java.util.Scanner;

public class doubleDoutch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(1) + arr[i].charAt(0) + "ay";
        }
    }
}
