package String;

import java.security.Key;
import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String str = "Hello Java";
        // String str1 = "";
        // String str2 = " ";

        // 1. isEmpty(): This method returns true if the given String length is zero.

        // System.out.println(str.isEmpty());
        // System.out.println(str1.isEmpty());
        // System.out.println(str2.isEmpty());

        // 2. isBlank(): This method returns true if the string is empty or contains
        // only white space otherwise false.

        // System.out.println(str.isBlank());
        // System.out.println(str1.isBlank());
        // System.out.println(str2.isBlank());

        // 3. codePointAt(int index): This method returns the ASCII value of the
        // character which is available in String at provided index.
        // System.out.println(str.codePointAt(1));

        // 4. valueOf(datatype x): Returns the string representation of the argument.
        int num = 123;
        String strNum = String.valueOf(num); // Converts int to String
        System.out.println("String representation of int: " + strNum);

        // 5. compareTo(String anotherString): Compares two strings lexicographically
        // and returns integer value.
        // 6. compareToIgnoreCase(String str): Compares two strings lexicographically
        // ignoring case and returns integer value.

        // String s1 = "H";
        // String s2 = "h";
        // System.out.println(s1.compareTo("H"));
        // System.out.println(s1.compareTo("I"));
        // System.out.println(s1.compareTo("i"));
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.compareToIgnoreCase(s2));
        // System.out.println(s1.compareToIgnoreCase("j"));

        // 7. startsWith(String prefix, int toffset): Tests if this string starts with
        // the specified prefix from the given index or not.
        // String str = "Hello Brajendra";
        // System.out.println(str.startsWith("B",6)); // true
        // System.out.println(str.startsWith("B",5)); // false

        // 8. substring(int beginIndex): Returns a string that is a substring of this
        // string. The substring begins with the character at the specified index and
        // extends to the end of this string.
        // substring(int beginIndex, int endIndex):

        // String s = "I am a student";
        // System.out.println(s);
        // System.out.println(s.substring(5));
        // System.out.println(s.substring(5,9));

        // System.out.println(s.subSequence(2,10));

        // 9. replace(CharSequence target, CharSequence replacement): Replaces each
        // substring of this string that matches the literal target sequence with the
        // specified literal replacement sequence.
        // Syntax: replaceAll(String regex, String replacement).

        // String s = "I am a student of Bachelor of Science in Information Technology";
        // String s1 = s.replace("o", "#");
        // System.out.println("s : " + s);
        // System.out.println("s1 : " + s1);

        // replaceFirst(String regex, String replacement): Replaces the first substring
        // of this string that matches the given regular expression.

        // String s2 = s.replaceFirst("a", "&");
        // System.out.println("s2 : " + s2);

        // String regex = "[a,e,i,o,u]";
        // String s3 = s.replaceAll(regex, "\\&");
        // System.out.println("s3 : " + s3);
        // //String s4 = s.replaceAll(regex, "&"); // give error
        // String s4 = s.replaceAll(regex, "\\&");
        // System.out.println("s4 : " + s4);

        // String originalString = "123.456.789";
        // String newString = originalString.replaceAll("\\.", "-"); // Escaping the dot
        // as it's a regex special character
        // System.out.println(newString); // Output: 123-456-789

        // Key Difference between replace() and replaceAll():
        // * replace() performs a literal replacement of characters or substrings.
        // * replaceAll() uses regular expressions for pattern matching, which allows
        // for more complex replacement scenarios involving special characters and
        // patterns.
        // If the regex in replaceAll() contains special characters (like ., *, +, ?,
        // [], {}, (), \`, ^, $), they need to be escaped with a backslash (\`) if they
        // are to be treated literally.

        // 10. stripLeading(): Returns a string whose value is this string, with all
        // leading white space removed.

        // String s1 = "       Student        ";
        // System.out.println("!" + s1 + "!");
        // System.out.println("!" + s1.strip() + "!");
        // System.out.println("!" + s1.stripLeading() + "!");
        // System.out.println("!" + s1.stripTrailing() + "!");
        // String s2 = "    abc     \n    def   \n  ghi     ";
        // System.out.println("!" + s2 + "!");
        // System.out.println("!" + s2.stripIndent() + "!");

        // 11. stripTrailing(): Returns a string whose value is this string, with all
        // trailing white space removed.

        // 12. getBytes(): It return byte[] for every characters of String
    }
}
