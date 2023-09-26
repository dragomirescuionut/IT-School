package session5_advancedFlowControl.practice;

public class WhileExercises {
    public static void main(String[] args) {
     printNumbers();
     printSumUntilLimit();
    }

    public static void printNumbers(){
        int number = 1;
        while (number <= 10){
            System.out.println(number);
            number ++;
        }
    }

    public static void printSumUntilLimit(){
        int number = 1;
        int sum = 0;
        while (number < 100){
            sum += number;
            number ++;
        }
        System.out.println("Sum: " + sum);
    }
}
