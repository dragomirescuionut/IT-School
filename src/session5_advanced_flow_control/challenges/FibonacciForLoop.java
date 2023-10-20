package session5_advanced_flow_control.challenges;

public class FibonacciForLoop {
    public static void main(String[] args) {
        fibonacciFor();
    }

    public static void fibonacciFor() {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print("The first 10 Fibonnaci numbers are: ");
        for (int index = 0; index < 10; index++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}