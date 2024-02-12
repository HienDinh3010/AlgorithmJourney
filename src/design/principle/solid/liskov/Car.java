package design.principle.solid.liskov;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 50;
    }

    @Override
    int getCubicCapacity() {
        return 4;
    }
}
