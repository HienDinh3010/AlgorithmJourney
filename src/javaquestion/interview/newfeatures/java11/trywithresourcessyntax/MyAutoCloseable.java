package javaquestion.interview.newfeatures.java11.trywithresourcessyntax;

public class MyAutoCloseable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close the auto-closeable resource");
    }
}
