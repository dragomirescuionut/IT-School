package session7_utility_classes.challenges;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Challenge6to8 {
    public static void main(String[] args) {
        System.out.println("--- Getting Current Time: ---");
        displayCurrentTime();
        System.out.println("--- Date Arithmetic: ---");
        int addedWeeks = 8;
        System.out.println("Adding " + addedWeeks + "to todays date: " + addWeeksToToday(addedWeeks));
        System.out.println("--- Weekday Identifier: ---");
        String inputDate = "2023-02-12";
        String dayOfTheWeek = findDayOfWeek(inputDate);
        if (dayOfTheWeek == null) {
            System.out.println("Please enter a valid date! ");
        } else {
            System.out.println("The day of the week for " + inputDate + " is: " + dayOfTheWeek);
        }
    }

    public static void displayCurrentTime() {
        SimpleDateFormat simpleFormat = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date();

        String formatedTime = simpleFormat.format(currentTime);
        System.out.println("The current time is: " + formatedTime);
    }

    public static LocalDate addWeeksToToday(int weeksToAdd) {
        LocalDate today = LocalDate.now();
        return today.plusWeeks(weeksToAdd);
    }

    public static String findDayOfWeek(String inputDate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, dateFormatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}