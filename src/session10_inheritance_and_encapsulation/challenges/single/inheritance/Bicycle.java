package session10_inheritance_and_encapsulation.challenges.single.inheritance;

public class Bicycle {
    public double speed;
    public int gear;

    public void changeGear() {
        System.out.println("The gear has changed!");
    }

    public void speedUp(int amount) {
        if (amount > 0) {
            speed += amount;
            System.out.println("The speed has incresed by: " + amount);
        } else {
            System.out.println("Invalid amound! ");
        }
    }

    public void applyBreak() {
        System.out.println("Break!");
    }
}