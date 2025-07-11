import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class currencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using a lambda-style approach for prompting input
        
        double payment = scanner.nextDouble();
        scanner.close();

        // Defining a helper method for currency formatting (demonstrates clean and concise code practices)
        String us = formatCurrency(payment, Locale.US);
        String india = formatCurrency(payment, new Locale("en", "IN"));
        String china = formatCurrency(payment, Locale.CHINA);
        String france = formatCurrency(payment, Locale.FRANCE);

        // Output results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    // Java 8 style helper method for currency formatting
    private static String formatCurrency(double amount, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(amount);
    }
}
