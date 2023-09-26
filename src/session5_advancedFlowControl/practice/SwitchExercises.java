package session5_advancedFlowControl.practice;

public class SwitchExercises {

    public static void main(String[] args) {
        char grade = 'B';
        printGradeInformation(grade);
        printGradeInformationWithEnhancedSwitch(grade);
        printSeason("Winter");
    }

    private static void printGradeInformation(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Execellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recongnized. ");
        }
    }


    private static void printGradeInformationWithEnhancedSwitch(char grade) {
        switch (grade) {
            case 'A' -> System.out.println("Execellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            default -> System.out.println("Grade not recognized");
        }
    }

    private static void printSeason(String season) {
        switch (season) {
            case "Winter" -> System.out.println("It's cold");
            case "Spring" -> System.out.println("Flowers bloom");
            case "Summer" -> System.out.println("It's hot");
            default -> System.out.println("Season not found");
        }
    }
}
