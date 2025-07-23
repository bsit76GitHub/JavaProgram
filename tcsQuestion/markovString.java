// package tcsQuestion;

// import java.util.Scanner;

// public class markovString {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str = scanner.nextLine();
//         System.out.println(str);
//         boolean m = true;
//         if (!str.endsWith(".") || !str.endsWith("?")) {
//             System.out.println("error");
//         }
//         String[] strArr = str.split(" ");
//         for (int i = 0; i < strArr.length - 1; i++) {
//             if (strArr[i].length() > strArr[i + 1].length()) {
//                 System.out.println("Not Markov Srting.");
//                 m = false;
//                 break;
//             }
//         }
//         if (m) {
//             System.out.println("Markov String");
//         }

//         scanner.close();
//     }
// }
