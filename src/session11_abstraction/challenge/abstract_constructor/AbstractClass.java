package session11_abstraction.challenge.abstract_constructor;

public abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    public void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}