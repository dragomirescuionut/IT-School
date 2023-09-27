package session7_utilityClasses.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Challenge1to5 {
    public static void main(String[] args) {
        System.out.println("--- Displaying todays date: ---");
        displayDate();
        System.out.println("--- Date Decomposition: ---");
        Date currentDate = new Date();
        dateDecomposition(currentDate);
        System.out.println("--- Create specific date: ---");
        LocalDate specificDate = createSpecificDate();
        System.out.println(specificDate);
        System.out.println("--- Comparing User-Entered Dates: ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first date as a string (YYYY-MM-DD)");
        String firstDate = scanner.nextLine();
        System.out.println("Please enter the second date as a string (YYYY-MM-DD)");
        String secondDate = scanner.nextLine();
        System.out.println("The two dates are equal: " + compareTwoDates(firstDate, secondDate));
        scanner.close();
        System.out.println("--- Is Today a Specific Date?: ---");
        String specificDate2 = "10th December 2019";
        System.out.println("Is today a specific date? : " + isTodaySpecificDate(specificDate2));

    }

    public static void displayDate() {
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDateTime = dateNow.format(format);
        System.out.println("Local date now: " + formatDateTime);
    }

    public static void dateDecomposition(Date newDate) {
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");
        String yearString = year.format(newDate);
        String monthString = month.format(newDate);
        String dayString = day.format(newDate);
        System.out.println("Year: " + yearString + "\nMonth" + monthString + "\nDay: " + dayString);

    }

    public static LocalDate createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025, 8, 19);
        return specificDate;
    }
    public static boolean compareTwoDates(String date1, String date2){
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String firstDateFormatted = firstDate.format(format);
        String secondDateFormatted = secondDate.format(format);

        return firstDateFormatted.equals(secondDateFormatted);
    }
    public static boolean isTodaySpecificDate(String specificDate){
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy");
        return dateNow.equals(LocalDate.parse(specificDate,format));
    }
}