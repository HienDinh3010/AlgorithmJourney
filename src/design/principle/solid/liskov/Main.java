package design.principle.solid.liskov;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.getSpeed();
        Vehicle bus = new Bus();
        bus.getSpeed();
    }
}
