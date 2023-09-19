package session4.challenges;

public class Challenge20 {
    public static void main(String[] args) {
        System.out.println("--- Challenge 19: ---");
        int num1 = 14;
        int num2 = 53;
        int num3 = 23;
        largestNumber(num1, num2, num3);
        System.out.println("--- Challenge 20: ---");
        int myGrade = 45;
        classifyGrate(myGrade);

    }

    public static void largestNumber(int num1, int num2, int num3) {
        int largestNumber = num1 > num2 ? ((num1 > num3) ? num1 : num3) :
                ((num2 > num3) ? num2 : num3);
        System.out.println("The largest number is: " + largestNumber);
    }

    /*
    Write a Java program that takes a double variable score representing a student’s score on a test. Use a ternary operator to
    classify the score into letter grades A, B, C, D, or F according to the following scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59
     */
    public static void classifyGrate(int grade) {
        String convertedGrade = grade >= 90 ? "A" : grade >= 80 ? "B" : grade >= 70 ? "C" : grade >= 60 ? "D" : "F";
        System.out.println("The converted grade is: " + convertedGrade);
    }
}