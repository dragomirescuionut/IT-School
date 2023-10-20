package session3_java_operators.challenges;

public class Challenge5 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 2;
        number1 += number2;
        System.out.println("Addition and assignment: " + number1);
        number1 -= number2;
        System.out.println("Substraction and assignment: " + number1);
        number1 *= number2;
        System.out.println("Multiplication and assignment: " + number1);
        number1 /= number2;
        System.out.println("Division and assignment: " + number1);
        number1 %= number2;
        System.out.println("Modulus and assignment: " + number1);
    }
}
