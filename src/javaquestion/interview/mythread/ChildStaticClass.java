package javaquestion.interview.mythread;

public class ChildStaticClass extends SupperStaticClass {

    public static void print() {
        System.out.println("Hello World from ChildStaticClass");
    }

    public static void main(String[] args) {
        ChildStaticClass.print();
    }
}
