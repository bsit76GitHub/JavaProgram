// Java is case sensetive language.

import java.util.Scanner;

class addTwoNo {

    public static void main(String[] arg) {
        // System.out.println("Hello");
        // System.out.println(23+23);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two No. :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);

        sc.close();
    }
}

// The Scanner class in Java, part of the java.util package, is used to obtain input from various sources, including the keyboard, files, and strings. It simplifies the process of parsing different data types from these input sources. 
// Key features:
// Versatile input sources: It can read input from the console (System.in), files, or even strings.
// Methods for different data types: Offers methods like nextInt(), nextDouble(), nextLine(), next(), nextBigInteger(), nextBigDecimal() and more to read different data types.

/*
package
  classes
     method
*/
