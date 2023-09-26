package session7.practice;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time: " + current);

        LocalDateTime newTime = current.plusHours(10).plusMinutes(5);
        System.out.println("After adding 10 hours and 5 minute: " + newTime);

        LocalDate datePart = current.toLocalDate();
        LocalTime timePart = current.toLocalTime();
        System.out.println("Date: " + datePart);
        System.out.println("Time: " + timePart);

        checkBeforeAndAfter();

        String dateTimeValue = "2025-01-01 10:30";
        convertStringToLocalDateTime(dateTimeValue);
    }
    public static void convertStringToLocalDateTime(String dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTimeConverted = LocalDateTime.parse(dateTime, formatter);
        System.out.println("Parsed local date time: " + dateTimeConverted);
    }
    public static void checkBeforeAndAfter() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 1, 10, 30);

        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println(dateTime + " is before current date-time");
        } else {
            System.out.println(dateTime + " is after current date-time");
        }
    }
}