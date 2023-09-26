package session6_javaCoreAPIs.challenges;

public class DuplicateCharacterRemover {
    public static void main(String[] args) {
        String input = "ballon";
        String newString = dublicateRemover(input);
        System.out.println("The original string is: " + input + "\nThe new string after removing the duplicates is: " + newString);

    }

    public static String dublicateRemover(String myString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int index = 0; index < myString.length(); index++) {
            char currentCharacter = myString.charAt(index);
            if (stringBuilder.indexOf(String.valueOf(currentCharacter)) == -1) {
                stringBuilder.append(currentCharacter);
            }
        }
        return stringBuilder.toString();
    }
}