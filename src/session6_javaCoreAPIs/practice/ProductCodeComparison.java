package session6_javaCoreAPIs.practice;

public class ProductCodeComparison {
    public static void main(String[] args) {
        String fixedCode = "PROD12345";

        String code1 = new String("PROD12345");
        String code2 = "PROD12345";
        String code3 = "PROD" + "12345";

        System.out.println("Using == operator: ");
        System.out.println("fixedCode vs code1: " + (fixedCode == code1));
        System.out.println("fixedCode vs code1: " + (fixedCode == code2));
        System.out.println("fixedCode vs code1: " + (fixedCode == code3));

        System.out.println("Using .equals");
        System.out.println("fixedCode vs code1: " + (fixedCode.equals(code1)));
        System.out.println("fixedCode vs code1: " + (fixedCode.equals(code2)));
        System.out.println("fixedCode vs code1: " + (fixedCode.equals(code3)));
    }
}
