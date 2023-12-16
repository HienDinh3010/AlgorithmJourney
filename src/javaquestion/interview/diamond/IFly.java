package javaquestion.interview.diamond;

public interface IFly {
    default void refill() {
        System.out.println("Refill for Fly");
    }
}
