package venkat.talk.amazingfeatures.mordern.java;

public class Sample {

    public static String process(int input) {
        return switch(input) {
            case 1 -> "one";
            default -> "whatever";
        };
    }

    public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process(2));
        System.out.println(process(3));
        System.out.println(process(4));
        System.out.println(process(5));
        System.out.println(process(6));
    }
}
