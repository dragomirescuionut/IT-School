package session16_funcitonal_infterface_lambda.challenges.functional_interfaces_challenges.string_utility;

public class StringUtilityTest {
    public static void main(String[] args) {
        StringUtility stringUtility = (str1, str2) -> str1 + " " + str2;
        System.out.println(stringUtility.joinString("Joined","String"));
    }
}