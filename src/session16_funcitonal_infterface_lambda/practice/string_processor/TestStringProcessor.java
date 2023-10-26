package session16_funcitonal_infterface_lambda.practice.string_processor;

public class TestStringProcessor {

    public static void main(String[] args) {

        StringProcessor removeWhiteSpaces = str -> str.trim();
        StringProcessor toUpper = str -> str.toUpperCase();

        StringProcessor result = removeWhiteSpaces.andThen(toUpper);
        System.out.println("Result: " + result.process(" string processor    "));
    }
}
