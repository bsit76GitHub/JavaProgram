package tcsQuestion.week2;

import java.util.Scanner;

public class numWord {

    // Java program to convert number into words by Mapping Key Numeric
    // Values with English Words

    // Method to convert number into words recursively
    static String convertToWordsRec(int n, int[] values, String[] words) {
        String res = "";

        // Iterating over all key Numeric values
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String word = words[i];

            // If the number is greater than or equal to current numeric value
            if (n >= value) {

                // Append the quotient part
                // If the number is greater than or equal to 100
                // then only we need to handle that
                if (n >= 100)
                    res += convertToWordsRec(n / value, values, words) + " ";

                // Append the word for numeric value
                res += word;

                // Append the remainder part
                if (n % value > 0)
                    res += " " + convertToWordsRec(n % value, values, words);

                return res;
            }
        }

        return res;
    }

    static String convertToWords(int n) {
        if (n == 0)
            return "Zero";

        // Key Numeric values and their corresponding English words
        int[] values = {
                1000000000, 1000000, 1000, 100, 90, 80, 70,
                60, 50, 40, 30, 20, 19, 18, 17, 16, 15, 14,
                13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        };

        String[] words = {
                "Billion", "Million", "Thousand", "Hundred",
                "Ninety", "Eighty", "Seventy", "Sixty", "Fifty",
                "Forty", "Thirty", "Twenty", "Nineteen",
                "Eighteen", "Seventeen", "Sixteen", "Fifteen",
                "Fourteen", "Thirteen", "Twelve", "Eleven",
                "Ten", "Nine", "Eight", "Seven", "Six", "Five",
                "Four", "Three", "Two", "One"
        };

        return convertToWordsRec(n, values, words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(convertToWords(n));
    }
}
