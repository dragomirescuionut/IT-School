package session11_abstraction.challenge.percentage_calculator;

public class AverageCalculator {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(100,54,76);
        System.out.println("The percentage for student A is " + studentA.getPercentage() + "%");

        StudentB studentB = new StudentB(89,67,70,50);
        System.out.println("The percentage for student B is " + studentB.getPercentage() + "%");
    }
}