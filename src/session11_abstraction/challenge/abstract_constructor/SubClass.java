package session11_abstraction.challenge.abstract_constructor;

public class SubClass extends AbstractClass {
    @Override
    void a_method() {
        System.out.println("This is abstract method! ");
    }

    @Override
    public void normalMethod() {
        super.normalMethod();
    }
}