package tcsQuestion;

import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        // // method : 1 using charAt() function of string
        // for (int i = 0; i < str.length(); i++) {
        // if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
        // str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
        // str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
        // str.charAt(i) == 'U')) {
        // System.out.print(str.charAt(i));
        // }
        // }

        // using toCharArray :
        // char[] c = str.toCharArray();

        // method: 2

        // for (int i = 0; i < c.length; i++) {
        // if (!(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'
        // || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U'))
        // {
        // System.out.print(c[i]);
        // }
        // }

        // Method: 3
        // for (int i = 0; i < c.length; i++) {
        // String ch = String.valueOf(c[i]);
        // if (!(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") ||
        // ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||
        // ch.equalsIgnoreCase("u"))) {
        // System.out.print(c[i]);
        // }
        // }

        // method : 4 : using replace(oldChar,newChar)
        String regex = "[a,e,i,o,u,A,E,I,O,U]";
        System.out.println(str.replaceAll(regex, ""));

        // methods : 5 
        String str2 = str.toLowerCase();
        String regex2 = "[a,e,i,o,u]";
        System.out.println(str.replaceAll(regex2, ""));
    }
}
