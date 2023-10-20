package session6_java_core_apis.practice;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String string = "";
        for (int index = 0; index < 10; index++) {
            string += "word" + index + " ";
        }
        System.out.println(string);

        //using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("word").append(index).append(" ");
        }
        System.out.println("Final stringBuilder using StringBuilder: " + stringBuilder);

        String name = "John";
        String newName = name.replace('o', 'a');
        System.out.println(newName);


    }
}
