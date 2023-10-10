package session10_inheritanceAndEncapsulation.practice.inheritance;

public class MultiLevelInheritance {
}

class Grandparent{
    void dance(){
        System.out.println("Grandpa should not dance");
    }
}
class Parent extends Grandparent {
    @Override
    void dance() {
        System.out.println("Parent can dance");
    }
}
class Child extends Parent{
    @Override
    void dance() {
        System.out.println("The child can dance too!");
    }
}