package session11_abstraction.challenge.abstract_parent;

public class ParentApp {
    public static void main(String[] args) {
        SubclassOne subclassOne = new SubclassOne();
        SubclassTwo subclassTwo = new SubclassTwo();

        subclassOne.message();
        subclassTwo.message();
    }
}