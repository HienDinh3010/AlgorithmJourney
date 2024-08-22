package company.facebook;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class MyThrowable {
    public int divide(int dividend, int divisor) throws FileNotFoundException {
/*        if (divisor == 0) {
            throw new IllegalArgumentException();
        }*/

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("abc"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
            e.toString();
        }

        //System.out.println("helo");
        try {
            Class<?> clazz = Class.forName("com.example.MyClass");
            Object instance = clazz.getDeclaredConstructor().newInstance();
            // Use reflection to interact with the instance
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }


        return dividend / divisor;
    }
}
