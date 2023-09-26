package session4_javaOperatorsAndLoops.practice;

public class StringMemoryReference {
    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greetingOne = "hello.";
        String greetingTwo = "Hello.";

        System.out.println(greetingOne == greetingTwo);
        System.out.println(greetingOne.equals(greetingTwo));

        System.out.println(greeting == greetingOne);
        System.out.println(greeting.equals(greetingOne));

        int number1 = 10;
        double number2 = 10;
        System.out.println(number1 == number2);
    }
}
