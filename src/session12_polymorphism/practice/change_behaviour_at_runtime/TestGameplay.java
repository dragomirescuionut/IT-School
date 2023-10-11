package session12_polymorphism.practice.change_behaviour_at_runtime;

public class TestGameplay {
    public static void main(String[] args) {
        GameCharacter warrior = new GameCharacter(new Sword());

        warrior.attack();

        warrior.setWeapon(new Bow());
        warrior.attack();
    }
}