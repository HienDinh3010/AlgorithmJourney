package company.facebook;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractClass {
    void print() {
        System.out.println("hello");
    }

    abstract void print2();

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("company.facebook.AbstractClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
