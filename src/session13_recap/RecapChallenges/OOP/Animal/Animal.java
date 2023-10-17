package session13_recap.RecapChallenges.OOP.Animal;

public class Animal {
    private String name;
    private String type;
    private String sound;

    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void makeSound() {
        System.out.println("Animal makes sound: " + sound);
    }

    public void displayDetails() {
        System.out.println("Animal name: " + name + "\nAnimal type: " + type);
    }
}