package session16_funcitonal_infterface_lambda.practice.conditional_printer;

public class ConditionalPrinterApp {
    public static void main(String[] args) {
        ConditionalPrinter printer = (str, cond) -> printIfTrue(str, cond);

        printer.printIfTrue("Hello world", true);
        printer.printIfTrue("Another Hello world", false);
    }

    private static void printIfTrue(String str, boolean condition) {
        if (condition) {
            System.out.println(str);
        }
    }
}
