package javaquestion.interview.diamond;

public interface IWalk {
    default void refill() {
        System.out.println("Refill for Walk");
    }
}
