package session16_funcitonal_infterface_lambda.practice.string_processor;

public interface StringProcessor {
    String process(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}