package session6_java_core_apis.practice;

public class StringsMethodsPractice {
    public static void main(String[] args) {
        String name = "John Doe";
        printStringLength("cinci");
        printStringCharAt("Alice", 2);

        printStringIndexAt("Alice", "i");
        printSubstring("Hello world", 5, 11);

        System.out.println(name.substring(5,8));
        System.out.println(name.substring(5));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name + "John Doe contains Doe: " + name.contains("Doe"));

        System.out.println("Replaced 'e' from Hello: " + "Hello".replace('e', 'a'));

        String email = "user@google.com";
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println("The domain name is: " + domain);
    }

    private static void printStringLength(String input) {
        System.out.println("String input length: " + input.length());
    }

    private static void printStringCharAt(String input, int index) {
        System.out.println("The character at index: " + input.charAt(index));
    }

    private static void printStringIndexAt(String input, String target) {
        System.out.println("The index of target is: " + input.indexOf(target));

    }
    private static void printSubstring(String input, int startIndex, int endIndex){
        System.out.println("The substring is: " + input.substring(startIndex, endIndex));
    }

}
