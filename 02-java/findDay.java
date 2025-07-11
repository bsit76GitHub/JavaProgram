import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class findDay {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Parse the input date string into a LocalDate object
            LocalDate date = LocalDate.parse(dateString, formatter);

            // Get the day of the week
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            String dayName = dayOfWeek.toString(); // Convert enum to string

            // Print the result
            System.out.println("The day of the week is: " + dayName);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}

