package session7_utility_classes.practice;

import java.sql.Timestamp;

public class TimestampPractice {
    public static void main(String[] args) {
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current timestamp: " + currentTimestamp);

        Timestamp timestamp1 = Timestamp.valueOf("2023-09-20 15:20:30.2343");
        Timestamp timestamp2 = Timestamp.valueOf("2023-09-20 15:21:30.2343");

        long differenceInSeconds = (timestamp2.getTime() - timestamp1.getTime()) / 1000;
        System.out.println("Difference in seconds: " + differenceInSeconds);
    }
}
