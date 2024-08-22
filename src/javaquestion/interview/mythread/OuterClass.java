package javaquestion.interview.mythread;
public class OuterClass {
    private String outerField = "Outer Field";

    void outerMethod() {
        System.out.println("Outer method called");
    }

    // Member inner class
    class InnerClass {
        void display() {
            System.out.println("Inside InnerClass: " + outerField);
            outerMethod(); // Accessing outer class method
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        //OuterClass outerInstance = new OuterClass();

        // Use the outer class instance to create an instance of the inner class
        InnerClass innerInstance = new OuterClass().new InnerClass();

        // Call a method on the inner class instance
        innerInstance.display();
    }
}
