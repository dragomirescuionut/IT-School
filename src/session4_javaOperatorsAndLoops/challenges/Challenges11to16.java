package session4_javaOperatorsAndLoops.challenges;

public class Challenges11to16 {
    public static void main(String[] args) {
        System.out.println("--- Challenge 11: ---");
        additionAndMultiplication();
        System.out.println("--- Challenge 12: ---");
        signChanger();
        System.out.println("--- Challenge 13: ---");
        sunny();
        System.out.println("--- Challenge 14: ---");
        counterIncrementAndDecrement();
        System.out.println("--- Challenge 15: ---");
        int total = 100;
        decreaseBy20(total);
        multiplyBy2(total);
        System.out.println("--- Challenge 16: ---");
        int number = 50;
        performUnaryOperators(number);
    }

    public static void additionAndMultiplication() {
        int a = 10;
        int b = 20;

        int c = 30;
        int d = 40;

        int additionResult = a + b;
        int multiplicationResult = c * d;
        System.out.println("Addition result: " + additionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
    }

    public static void signChanger() {
        int positiveNumber = 25;
        int negativeNumber = -positiveNumber;
        System.out.println(negativeNumber);
    }

    public static void sunny() {
        boolean isRaining = true;
        boolean isSunny = false;
        System.out.println(!isRaining);
        System.out.println(!isSunny);
    }

    public static void counterIncrementAndDecrement() {
        int counter = 0;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);
    }

    public static void decreaseBy20(int total) {
        total -= 20;
        System.out.println("Total after -20:" + total);
    }

    public static void multiplyBy2(int total) {
        total *= 2;
        System.out.println("Total after *2: " + total);
    }

    public static void performUnaryOperators(int number) {
        number = -number;
        System.out.println("Negate the number: " + number);
        number = -number;
        System.out.println("Absolute value: " + number);
        number++;
        System.out.println("Incremented value: " + number);
    }
}