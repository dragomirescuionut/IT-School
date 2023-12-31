package session3_java_operators.practice;

public class BinaryAritmeticOperators {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        System.out.println("Arithmetic operators with int: ");
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        System.out.println(number2 / number1);

        double double1 = 10.5;
        double double2 = 4.5;
        System.out.println("Arithmetic operations with double: ");
        System.out.println(double1 + double2);
        System.out.println(double1 - double2);
        System.out.println(double1 * double2);
        System.out.println(double1 % double2);
        System.out.println(double2 / double1);

        short myByte1 = 3;
        short myByte2 = 5;

        //byte result = myByte2 * myByte1; -> this leads to compile errors due to numeric promotion
    }
}
