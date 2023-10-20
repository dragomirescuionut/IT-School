package session4_java_operators_and_loops.challenges;

public class Challenge19 {
    public static void main(String[] args) {
        int age = 23;
        classifyByAge(age);

    }

    public static void classifyByAge(int myAge) {
        if (myAge == 0) {
            System.out.println("Please enter a valid age!");
        } else if (myAge < 12) {
            System.out.println("Child. ");
        } else if (myAge > 12 && myAge < 17) {
            System.out.println("Teenager");
        } else if (myAge >= 18 && myAge <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}