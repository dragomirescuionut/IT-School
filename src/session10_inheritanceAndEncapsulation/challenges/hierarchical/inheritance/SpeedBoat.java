package session10_inheritanceAndEncapsulation.challenges.hierarchical.inheritance;

public class SpeedBoat extends Boat {
    private int maxSpeed;
    private String engineType;

    public void turboBoost() {
        System.out.println("Activating turbo boost!");
    }
}