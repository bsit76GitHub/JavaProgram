package String;
 // NOTE : String is im-mutable in java. but StringBuilder is muatable.

import java.util.Scanner;

public class methodsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Hello", str2 = "Java";
        System.out.println(str1 + " " + str2);
        // methods / function : 
        // 1. lenght()
        System.out.println(str1.length());

        // 2. concat()
        System.out.println(str1.concat(str2));
        System.out.println(str1+" " +str2);

        // 3. charAt()
        System.out.println(str1.charAt(2));

        // 4. contains()
        System.out.println(str1.contains("e"));
        System.out.println(str1.contains("el"));
        System.out.println(str2.contains("el"));

        //5. startsWith()
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.startsWith("H"));

        //6. endsWith()
        System.out.println(str1.endsWith("lo"));
        System.out.println(str2.endsWith("lo"));

        //7. indexOf()
        System.out.println(str2.indexOf("a"));
        System.out.println(str1.indexOf("k"));

        //8. lastIndexOf()
        System.out.println(str2.lastIndexOf("a"));

        //9. equals()
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals("Java"));

        // 10. equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase("hello"));
        System.out.println(str1.equalsIgnoreCase("Hello"));

        // 11. replace()
        String str = "hellu";
        System.out.println(str.replace("u", "o"));

        // 12. split()
        

    }
}
