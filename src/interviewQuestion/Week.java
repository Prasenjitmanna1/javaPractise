package interviewQuestion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Week {
    public static void main(String[] args) {
        String inputDate = "20-APR-2024"; // Replace with your desired input date

        // Parse the input date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = dateFormat.parse(inputDate);

            // Create a Calendar instance and set it to the input date
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Calculate the first day of the week (Sunday)
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            Date firstDayOfWeek = calendar.getTime();

            // Calculate the last day of the week (Saturday)
            calendar.add(Calendar.DAY_OF_WEEK, 6);
            Date lastDayOfWeek = calendar.getTime();

            // Print the results
            System.out.println("Input Date: " + inputDate);
            System.out.println("First Day of the Week: " + dateFormat.format(firstDayOfWeek));
            System.out.println("Last Day of the Week: " + dateFormat.format(lastDayOfWeek));
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use the format dd-MMM-yyyy.");
        }
    }
}

//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//public class Week{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        
//        // Ask the user for the starting date
//        System.out.println("Enter the starting date (YYYY-MM-DD): ");
//        String inputDate = scanner.nextLine();
//        
//        // Parse the input date
//        LocalDate startDate = LocalDate.parse(inputDate, formatter);
//        
//        // Create an array to store dates of the week
//        String[] weekDates = new String[7];
//        
//        // Collect dates of the week
//        for (int i = 0; i < 7; i++) {
//            weekDates[i] = startDate.plusDays(i).format(formatter);
//        }
//        
//        // Print the dates stored in the array
//        System.out.println("Dates of the week:");
//        for (String date : weekDates) {
//            System.out.println(date);
//        }
//        
//        scanner.close();
//    }
//}