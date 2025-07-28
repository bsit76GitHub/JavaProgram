package String;
// NOTE : String is im-mutable in java. but StringBuilder is muatable.

import java.util.Scanner;

public class methodsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Hello", str2 = "Java";

        // System.out.println(str1 + " " + str2);

        // methods / function :
        // -----------------------------

        // // 1. lenght()
        // System.out.println(str1.length());

        // // 2. concat()
        // System.out.println(str1.concat(str2));
        // System.out.println(str1 + " " + str2);

        // // 3. charAt()
        // System.out.println(str1.charAt(2));

        // // 4. contains()
        // System.out.println(str1.contains("e"));
        // System.out.println(str1.contains("el"));
        // System.out.println(str2.contains("el"));

        // // 5. startsWith()
        // System.out.println(str1.startsWith("h"));
        // System.out.println(str1.startsWith("he"));
        // System.out.println(str1.startsWith("H"));

        // // 6. endsWith()
        // System.out.println(str1.endsWith("lo"));
        // System.out.println(str2.endsWith("lo"));

        // // 7. indexOf()
        // System.out.println(str2.indexOf("a"));
        // System.out.println(str1.indexOf("k"));

        // // 8. lastIndexOf()
        // System.out.println(str2.lastIndexOf("a"));

        // // 9. equals()
        // System.out.println(str1.equals(str2));
        // System.out.println(str2.equals("Java"));

        // // 10. equalsIgnoreCase()
        // System.out.println(str1.equalsIgnoreCase("hello"));
        // System.out.println(str1.equalsIgnoreCase("Hello"));

        // // 11. replace()
        // String str = "hellu";
        // System.out.println(str.replace("u", "o"));

        // 12. split()
        String line = "Hello, my name is Brajendra Sharma .";
        // System.out.println(line);
        // String[] arrLine = line.split(" ");
        // for (String string : arrLine) {
        // System.out.println(string);
        // }

        // System.out.println(line.endsWith("."));

        // 13. subString() : return char/part of string between given indexs.
        // Note : beginIndex is inclusive but endIndex is exclusive.
        // System.out.println(line.substring(4));
        // System.out.println(line.substring(6, 12));

        // 14. toCharArray() : convert string into character array.
        char[] arrChar = line.toCharArray();
        // for (char c : arrChar) {
        //     System.out.print(c + " , ");
        // }

        // //15. toLowerCase : It converts all character in Lower Case.
        // System.out.println(line.toLowerCase());
        // //16. toUpperCase() : It converts all character in Upper Case.
        // System.out.println(line.toUpperCase());

        // 17. trim() : eliminates all leading and trailing space and return string value.
        String x = "Hello    ";
        String y = "    Gental";
        String z = "    man    ";
        String z1 = ".";
        System.out.println(x + y + z + z1);
        System.out.println(x.trim()+z1);
        System.out.println( y.trim()+ z1);
        System.out.println(z.trim() + z1);
        System.out.println(x.trim() + y.trim() + z.trim() + z1);

    }
}
