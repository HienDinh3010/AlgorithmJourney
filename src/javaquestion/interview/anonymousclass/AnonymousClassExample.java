package javaquestion.interview.anonymousclass;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hi I am from Vietnam");
            }

            @Override
            public void sing() {
                System.out.println("Hi I can sing");
            }
        };

        greeting.greet();
        greeting.sing();
    }
}
