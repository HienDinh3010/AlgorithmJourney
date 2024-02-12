package design.principle.solid.liskov;

public class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 80;
    }

    @Override
    int getCubicCapacity() {
        return 40;
    }
}
