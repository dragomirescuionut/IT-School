package session16_funcitonal_infterface_lambda.practice.functional_interface;

public class GreetingServiceApp {

    public static void main(String[] args) {
        //anonymous class
        GreetingService anonGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anonGreetingService.greet("Bob");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello " + message);
        lambdaGreetingService.greet("Alice");

    }
}