package session12_polymorphism.practice.object_vs_reference;

public class ObjVsRefApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        Car car2 = (Car) car;

        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        Car car3 = new Car();
        Object casAsObject = car3;

        //carAsObject.fuelType();// compile error
        Car backToCar = (Car) casAsObject;
        backToCar.fuelType();
    }
}