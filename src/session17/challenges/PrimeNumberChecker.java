package session17.challenges;

public class PrimeNumberChecker {
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int index =2; index <= number/2;index++){
            if((number % index) == 0)
                return false;
        }
        return true;
    }
}