package session10_inheritanceAndEncapsulation.challenges.hierarchical.inheritance;

public class FishingBoat extends Boat {
    private int fishCapacity;
    private String typeOfNet;

    public void castNet() {
        System.out.println("The net was casted! ");
    }
}
