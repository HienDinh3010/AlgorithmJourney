package javaquestion.interview.newfeatures.java11.trywithresourcessyntax;

public class Main {
    public static void main(String[] args) {
        MyAutoCloseable closeable = new MyAutoCloseable();
        try (closeable) {
            System.out.println("I am using closeable inside try-with-resources " + closeable);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("How about using closeable outside try-with-resources " + closeable);
    }
}
