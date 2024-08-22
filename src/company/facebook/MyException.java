package company.facebook;

public class MyException extends RuntimeException {
    
    final static Object object = null;
    
    public static void main(String[] args) {
        synchronized (MyException.class) {
            
        }
    }

    public static synchronized void method() {

    }
}
