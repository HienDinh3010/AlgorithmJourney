package javaquestion.interview.diamond;

public class Person implements IFly, IWalk {
    @Override
    public void refill() {
        IFly.super.refill();
    }
}
