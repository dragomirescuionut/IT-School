package session6_java_core_apis.challenges;

public class CamelCaseToSnakeCaseConverter {
    public static void main(String[] args) {
        String camelCase = "thisIsASaudiCamelCase";
        String snakeCase = camelToSnakeConverter(camelCase);
        System.out.println("Camel case: " + camelCase);
        System.out.println("Snake case: " + snakeCase);
    }

    public static String camelToSnakeConverter(String camelString) {
        StringBuilder snakeString = new StringBuilder();
        for (int index = 0; index < camelString.length(); index++) {
            char character = camelString.charAt(index);

            if (Character.isUpperCase(character)) {
                if (index > 0) {
                    snakeString.append('_');
                }
                snakeString.append((Character.toLowerCase(character)));
            } else {
                snakeString.append(character);
            }
        }
        return snakeString.toString();
    }
}